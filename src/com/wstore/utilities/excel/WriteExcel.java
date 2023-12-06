/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.utilities.excel;

import com.wstore.utilities.Helper;
import com.wstore.viewmodels.KhachHangViewModel;
import com.wstore.viewmodels.NhanVienViewModel;
import com.wstore.viewmodels.QLsanpham.SanPhamViewModel;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.AreaReference;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFTable;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTable;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleInfo;

/**
 *
 * @author ducan
 */
public class WriteExcel {

    private static CellStyle cellStyleFormatNumber = null;
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    private static int countColumn;
    public static int rowIndex = 0;
    public static XSSFSheet sheet;

    public static <T> void writeExcel(JTable table, List<T> listData, String excelFilePath) throws IOException {
        int columnCount = table.getColumnCount();
        int rowCount = table.getRowCount();
        List<String> listNameColumn = new ArrayList<>();
        for (int i = 0; i < columnCount; i++) {
            if (table.getColumnName(i) != null
                    && !(table.getColumnName(i).trim().isEmpty())) {
                listNameColumn.add(table.getColumnName(i));
            }
        }
//        List<Object[]> listData = new ArrayList<>();
//        Object[] rowData;
//        for (int rowNum = 0; rowNum < rowCount; rowNum++) {
//            rowData = new Object[columnCount];
//            for (int colNum = 0; colNum < columnCount; colNum++) {
//                rowData[colNum] = String.valueOf(table.getValueAt(rowNum, colNum));
//            }
//            listData.add(rowData);
//        }

        // Create Workbook
        Workbook workbook = getWorkbook(excelFilePath);

        // Create sheet
        sheet = (XSSFSheet) workbook.createSheet();

        int sizeListData = listData.size();
        int sizeListNameCol = listNameColumn.size();
        initExcel(sheet, sizeListData, sizeListNameCol);

        // Write header
        // create CellStyle
        CellStyle cellStyle = createStyleForHeader(workbook);
        // Create row
        Row row = sheet.createRow(rowIndex); // tạo row đầu tiên dành cho header
        // Create cells, thêm tên các cột vào các cell trên row header
        for (int i = 0; i < countColumn; i++) {
            Cell cell = row.createCell(i);
            cell.setCellStyle(cellStyle);
            cell.setCellValue(listNameColumn.get(i));
        }

        // Write data
        rowIndex++;
        if (listData.isEmpty()) {
            return;
        }
        T obj = listData.get(0);
        if (obj.getClass() == SanPhamViewModel.class) {
            for (T o : listData) {
                // Create row
                row = sheet.createRow(rowIndex);
                // Write data on row
                SanPhamViewModel sp = (SanPhamViewModel) o;
                write(sp, row);
                rowIndex++;
            }
        } else if (obj.getClass() == NhanVienViewModel.class) {
            for (T o : listData) {
                // Create row
                row = sheet.createRow(rowIndex);
                // Write data on row
                NhanVienViewModel nv = (NhanVienViewModel) o;
                write(nv, row);
                rowIndex++;
            }
        } else if (obj.getClass() == KhachHangViewModel.class) {
            for (T o : listData) {
                // Create row
                row = sheet.createRow(rowIndex);
                // Write data on row
                KhachHangViewModel kh = (KhachHangViewModel) o;
                write(kh, row);
                rowIndex++;
            }
        }

        rowIndex = 0;
        // Auto resize column witdth
        int numberOfColumn = sheet.getRow(0).getPhysicalNumberOfCells();
        autosizeColumn(sheet, numberOfColumn);

        // Create file excel
        createOutputFile(workbook, excelFilePath);
        System.out.println("Done!!!");
    }

    private static void initExcel(XSSFSheet sheet, int sizeListData, int sizeListNameCol) {
        // xác định khu vực để format table và filter
        int positionRow = 5000;  // vị trí hàng
        if (sizeListData > 5000) {
            positionRow = sizeListData;
        }
        countColumn = sizeListNameCol; // vị trí cột (số cột hay thuộc tính của đối tượng xuất hiện trong bảng)
        // tạo đối tượng khu vực
        AreaReference myDataRange = new AreaReference(
                new CellReference(0, 0), // tọa độ bắt đầu
                new CellReference(positionRow, countColumn - 1), // tọa độ kết thúc
                SpreadsheetVersion.EXCEL2007);

        XSSFTable myTable = sheet.createTable(myDataRange);

        CTTable cTTable = myTable.getCTTable();

        // Insert format style
        CTTableStyleInfo tableStyle = cTTable.addNewTableStyleInfo();
        tableStyle.setName("TableStyleMedium2");
        tableStyle.setShowColumnStripes(false);
        tableStyle.setShowRowStripes(true);

        // Đặt phạm vi cho bảng
        cTTable.setRef(myDataRange.formatAsString());
        cTTable.setDisplayName("MYTABLE");
        cTTable.setName("Test");
        cTTable.setId(1L);

        // Tạo Filter cho bảng
        CTAutoFilter autoFilter = cTTable.addNewAutoFilter();
        autoFilter.setRef(myDataRange.formatAsString());

    }

    // Create workbook
    private static Workbook getWorkbook(String excelFilePath) throws IOException {
        Workbook workbook = null;
        if (excelFilePath.endsWith("xlsx")) {
            workbook = new XSSFWorkbook();
        } else {
            throw new IllegalArgumentException("The specified file is not Excel file");
        }

        return workbook;
    }

    // Create CellStyle for header
    private static CellStyle createStyleForHeader(Workbook workbook) {
        // Create font
        XSSFFont font = (XSSFFont) workbook.createFont();
        font.setFontName("Calibri");
        font.setBold(true);
        font.setFontHeightInPoints((short) 11);

        XSSFCellStyle cellStyle = (XSSFCellStyle) workbook.createCellStyle();
        cellStyle.setFont(font);
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        return cellStyle;
    }

    // Auto resize column width
    private static void autosizeColumn(Sheet sheet, int lastColumn) {
        for (int columnIndex = 0; columnIndex < lastColumn; columnIndex++) {
            sheet.autoSizeColumn(columnIndex);
        }
    }

    // Create output file
    private static void createOutputFile(Workbook workbook, String excelFilePath) throws IOException {
        try (OutputStream os = new FileOutputStream(excelFilePath)) {
            workbook.write(os);
        }
    }

    // Write data
    public static void write(SanPhamViewModel sp, Row row) {
        Cell cell = row.createCell(0);;
        cell.setCellValue(sp.getMaSanPham());
        cell = row.createCell(1);
        cell.setCellValue(sp.getThuongHieu().toString());
        cell = row.createCell(2);
        cell.setCellValue(sp.getMaHangHoa());
        cell = row.createCell(3);
        cell.setCellValue(Helper.dfTien.format(sp.getGiaNhap()));
        cell = row.createCell(4);
        cell.setCellValue(Helper.dfTien.format(sp.getDonGia()));
        cell = row.createCell(5);
        cell.setCellValue(sp.getSoLuongTon());
        cell = row.createCell(6);
        cell.setCellValue(sp.getDoiTuongSuDung());
        cell = row.createCell(7);
        cell.setCellValue(sp.getDongSanPham());
        cell = row.createCell(8);
        cell.setCellValue(sp.getDongMay().toString());
        cell = row.createCell(9);
        cell.setCellValue(sp.getChatLieuDay().toString());
        cell = row.createCell(10);
        cell.setCellValue(sp.getChatLieuKinh().toString());
        cell = row.createCell(11);
        cell.setCellValue(sp.getKhangNuoc().toString());
        cell = row.createCell(12);
        cell.setCellValue(sp.getKhoangTruCot().toString());
        cell = row.createCell(13);
        cell.setCellValue(sp.getSizeMat().toString());
        cell = row.createCell(14);
        cell.setCellValue(sp.getXuatXu().toString());
        cell = row.createCell(15);
        cell.setCellValue(sp.getChatLieuVo().toString());
        cell = row.createCell(16);
        cell.setCellValue(sp.getHinhDang());
        cell = row.createCell(17);
        cell.setCellValue(sp.getMauVo().toString());
        cell = row.createCell(18);
        cell.setCellValue(sp.getTinhNang());
        cell = row.createCell(19);
        cell.setCellValue(sp.getDoDay().toString());
        cell = row.createCell(20);
        cell.setCellValue(sp.getMauMat().toString());
        cell = row.createCell(21);
        cell.setCellValue(sp.getHinhAnh());
        cell = row.createCell(22);
        cell.setCellValue(sp.getTrangThai() == 0 ? "Đang kinh doanh" : "Ngừng kinh doanh");
    }

    public static void write(NhanVienViewModel nv, Row row) {
        Cell cell = row.createCell(0);;
        cell.setCellValue(nv.getMaNhanVien());
        cell = row.createCell(1);
        cell.setCellValue(nv.getHoTen());
        cell = row.createCell(2);
        cell.setCellValue(nv.getGioiTinh());
        cell = row.createCell(3);
        cell.setCellValue(nv.getNgaySinh());
        cell = row.createCell(4);
        cell.setCellValue(nv.getSoDienThoai());
        cell = row.createCell(5);
        cell.setCellValue(nv.getEmail());
        cell = row.createCell(6);
        cell.setCellValue(nv.getCanCuocCongDan());
        cell = row.createCell(7);
        cell.setCellValue(nv.getDiaChi());
        cell = row.createCell(8);
        cell.setCellValue(nv.getVaiTro());
        cell = row.createCell(9);
        cell.setCellValue(nv.getNgayTao());
        cell = row.createCell(10);
        cell.setCellValue(nv.getTrangThai());
    }
    
        public static void write(KhachHangViewModel nv, Row row){
         Cell cell = row.createCell(0);;
         cell.setCellValue(nv.getMaKhachHang());
         cell = row.createCell(1);
         cell.setCellValue(nv.getHoTen());
         cell = row.createCell(2);
         cell.setCellValue(nv.getGioiTinh() ?"Nam" :"Nữ");
         cell = row.createCell(3);
         cell.setCellValue(nv.getNgaySinh());
         cell = row.createCell(4);
         cell.setCellValue(nv.getSoDienThoai());
         cell = row.createCell(5);
         cell.setCellValue(nv.getEmail());
         cell = row.createCell(6);
         cell.setCellValue(nv.getDiaChi());
         cell = row.createCell(7);
         cell.setCellValue(nv.getHinhAnh());
         cell = row.createCell(8);
         cell.setCellValue(nv.getNgayTao());
         cell = row.createCell(9);
         cell.setCellValue(nv.getGhiChu());
     }
}
