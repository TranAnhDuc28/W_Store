package com.wstore.utilities;

import com.wstore.viewmodels.HoaDonViewModel;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class ReportManager {

    private static ReportManager instance;

    private JasperReport reportPay;

    public static ReportManager getInstance() {
        if (instance == null) {
            instance = new ReportManager();
        }
        return instance;
    }

    private ReportManager() {
    }

    public void compileReport() throws JRException {
        reportPay = JasperCompileManager.compileReport("src/com/wstore/utilities/InHoaDonTaiQuay.jrxml");
    }

    public void printReportPayment(HoaDonViewModel hd) throws JRException {
        String maHD = hd.getMaHoaDon();
        Map para = new HashMap();
        para.put("maHoaDon", maHD);
        Connection con = DBConnect.getConnection();
        JasperPrint jasperPrint = JasperFillManager.fillReport(reportPay, para, con);
        view(jasperPrint);
    }

    private void view(JasperPrint jasperPrint) throws JRException {
        JasperViewer.viewReport(jasperPrint, false);
    }
}
