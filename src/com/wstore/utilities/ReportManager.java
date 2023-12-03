/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.utilities;

import com.wstore.viewmodels.HoaDonViewModel;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ducan
 */
public class ReportManager {

    private static ReportManager instance;

    private JasperReport reportPay;
    private List<String> fields = new ArrayList<>();

    public static ReportManager getInstance() {
        if (instance == null) {
            instance = new ReportManager();
        }
        return instance;
    }

    public ReportManager() {
    }

    public void compileReport() throws JRException {
        reportPay = JasperCompileManager.compileReport("src/com/wstore/utilities/InHoaDonReport.jrxml");
    }

    public void printHoaDon(HoaDonViewModel data) throws JRException {
        Hashtable param = new Hashtable();
        param.put("maHoaDon", data.getMaHoaDon());
        Connection con = DBConnect.getConnection();
        JasperPrint print = JasperFillManager.fillReport(reportPay, param, con);
        view(print);
    }
    
    private void view(JasperPrint print) {
        JasperViewer.viewReport(print, false);
    }
}
