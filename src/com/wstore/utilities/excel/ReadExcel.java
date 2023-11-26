/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.utilities.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author ducan
 */
public class ReadExcel {

//    public static List<KhachHang> readExcel(String excelFilePath) throws IOException {
//        List<KhachHang> lists = new ArrayList<>();
//
//        // Get file
//        InputStream inputStream = new FileInputStream(new File(excelFilePath));
//
//        // Get workbook
//        Workbook workbook = getWorkbook(inputStream, excelFilePath);
//
//        // Get sheet
//        Sheet sheet = workbook.getSheetAt(0);
//
//        // Get all rows
//        Iterator<Row> iterator = sheet.iterator();
//        while (iterator.hasNext()) {
//            Row nextRow = iterator.next();
//            if (nextRow.getRowNum() == 0) {
//                // Ignore header
//                continue;
//            }
//
//            // Get all cells
//            Iterator<Cell> cellIterator = nextRow.cellIterator();

            // Read cells and set value for book object
//            KhachHang kh = new KhachHang();
//            while (cellIterator.hasNext()) {
//                //Read cell
//                Cell cell = cellIterator.next();
//                Object cellValue = getCellValue(cell);
//                if (cellValue == null || cellValue.toString().isEmpty()) {
//                    continue;
//                }
//                // Set value for book object
//                int columnIndex = cell.getColumnIndex();
//                switch (columnIndex) {
//                    case 0:
////                        kh.setId(new BigDecimal((double) cellValue).intValue());
//                        kh.setId((String) getCellValue(cell));
//                        break;
//                    case 1:
//                        kh.setTenKH((String) getCellValue(cell));
//                        break;
//                    case 2:
//                        kh.setLoaiKH((String) getCellValue(cell));
//                        break;
//                    case 3:
//                        kh.setNamSinh(((Double) getCellValue(cell)).intValue());
//                        break;
//                    case 4:
//                        kh.setGioiTinh((Boolean) getCellValue(cell));
//                        break;
//                    default:
//                        break;
//                }
//            }
//            lists.add(kh);
//        }

//        workbook.close();
//        inputStream.close();
//
//        return lists;
//    }

    // Get Workbook
//    private static Workbook getWorkbook(InputStream inputStream, String excelFilePath) throws IOException {
//        Workbook workbook = null;
//        if (excelFilePath.endsWith("xlsx")) {
//            workbook = new XSSFWorkbook(inputStream);
//        } else if (excelFilePath.endsWith("xls")) {
//            workbook = new HSSFWorkbook(inputStream);
//        } else {
//            throw new IllegalArgumentException("The specified file is not Excel file");
//        }
//
//        return workbook;
//    }

    // Get cell value
//    private static Object getCellValue(Cell cell) {
//        CellType cellType = cell.getCellType();
//        Object cellValue = null;
//        switch (cellType) {
//            case BOOLEAN:
//                cellValue = cell.getBooleanCellValue();
//                break;
//            case FORMULA:
//                Workbook workbook = cell.getSheet().getWorkbook();
//                FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();
//                cellValue = evaluator.evaluate(cell).getNumberValue();
//                break;
//            case NUMERIC:
//                cellValue = cell.getNumericCellValue();
//                break;
//            case STRING:
//                cellValue = cell.getStringCellValue();
//                break;
//            case _NONE:
//            case BLANK:
//            case ERROR:
//                break;
//            default:
//                break;
//        }
//
//        return cellValue;
//    }
}
