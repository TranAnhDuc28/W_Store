/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.utilities;

import com.toedter.calendar.JDateChooser;
import com.wstore.domainmodels.NhanVien;
//import duanmau.model.NhanVien;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author ducan
 */
public class Helper {

    public static Image ICON_APP;
    public static SimpleDateFormat sdfNgayThangThoiGian = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
    public static SimpleDateFormat sdfNgayThangNam = new SimpleDateFormat("dd/MM/yyyy");
    public static SimpleDateFormat sdfNgayThangNamSQL = new SimpleDateFormat("yyyy-MM-dd");
    public static DecimalFormat dfTien = new DecimalFormat("###,###.##");
    public static Dimension dimensionJFileChooser = new Dimension(800, 500);
    public static NhanVien USER_LOGIN = null;

    public static Image getIconApp() {
        String fileName = "src\\com\\wstore\\icons\\logo.png";
        ICON_APP = new ImageIcon(fileName).getImage();
        return ICON_APP;
    }

    // đăng xuẩt
    public static void logout() {
        Helper.USER_LOGIN = null;
    }

    // dialog thông báo
    public static void alert(Component component, String message) {
        JOptionPane.showMessageDialog(component, message,
                "W-Store", JOptionPane.INFORMATION_MESSAGE);
    }

    // dialog xác nhận
    public static boolean comfirm(Component component, String message) {
        int result = JOptionPane.showConfirmDialog(component, message,
                "W-Store", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        return result == JOptionPane.YES_OPTION;
    }

    public static String chonAnh(String dicrectoryPath, JLabel lblHienThi) {
        String imgName = null;
        JFileChooser jfc = new JFileChooser(new File(dicrectoryPath));
        jfc.setPreferredSize(Helper.dimensionJFileChooser);
        if (jfc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            try {
                File file = jfc.getSelectedFile().getAbsoluteFile();
                BufferedImage img = ImageIO.read(file);
                imgName = file.getName();
                ImageIcon imageIcon = new ImageIcon(img.getScaledInstance(
                        lblHienThi.getWidth(), lblHienThi.getHeight(), Image.SCALE_SMOOTH));
                lblHienThi.setText("");
                lblHienThi.setIcon(imageIcon);
            } catch (IOException e) {
                return null;
            }
        }
        return imgName;
    }

    public static void showHinhAnh(String dicrectoryPath, JLabel lblHienThi, String hinhHienThi) {
        if (hinhHienThi == null || hinhHienThi.equalsIgnoreCase("No image")) {
            lblHienThi.setIcon(null);
            lblHienThi.setText("No image");
        } else {
            Image img = null;
            try {
                img = ImageIO.read(new File(dicrectoryPath + "/" + hinhHienThi));
            } catch (IOException ex) {
                alert(null, ex.getMessage());
            }
            if (img != null) {
                ImageIcon imageIcon = new ImageIcon(img.getScaledInstance(
                        lblHienThi.getWidth(), lblHienThi.getHeight(), Image.SCALE_SMOOTH));
                lblHienThi.setText("");
                lblHienThi.setIcon(imageIcon);
            } else {
                lblHienThi.setIcon(null);
            }
        }
    }

    public static boolean checkRongTextField(Component component, JTextField txt, String message) {
        if (txt.getText().trim().isEmpty()) {
            alert(component, message);
            txt.requestFocus();
            return true;
        }
        return false;
    }

    public static boolean checkRongTextArea(Component component, JTextArea txt, String message) {
        if (txt.getText().trim().isEmpty()) {
            alert(component, message);
            txt.requestFocus();
            return true;
        }
        return false;
    }

    public static boolean checkRongPasswordField(Component component, JPasswordField jpf, String message) {
        if (String.valueOf(jpf.getPassword()).trim().isEmpty()) {
            alert(component, message);
            jpf.requestFocus();
            return true;
        }
        return false;
    }

    public static boolean checkHoTen(Component component, JTextField txt, String message) {
        Pattern pattern = Pattern.compile("^[\\p{L}\\s]+$");
        Matcher matcher = pattern.matcher(txt.getText().trim());
        if (!matcher.matches()) {
            alert(component, message);
            txt.requestFocus();
            return true;
        }
        return false;
    }

    public static boolean checkSDT(Component component, JTextField txt, String message) {
        Pattern pattern = Pattern.compile("^09\\d{8}$");
        Matcher matcher = pattern.matcher(txt.getText().trim());
        if (!matcher.matches()) {
            alert(component, message);
            txt.requestFocus();
            return true;
        }
        return false;
    }

    public static boolean checkDinhDangSo(Component component, JTextField txt, String message) {
        try {
            Double so = Double.valueOf(txt.getText().trim());
        } catch (Exception e) {
            txt.requestFocus();
            alert(component, message);
            return true;
        }
        return false;
    }

    public static boolean checkSoKhongDuocAm(Component component, JTextField txt, String message) {
        Double so = Double.valueOf(txt.getText().trim());
        if (so < 0) {
            txt.requestFocus();
            alert(component, message);
            return true;
        }
        return false;
    }

    public static boolean checkCCCD(Component component, JTextField txt, String message) {
        Pattern pattern = Pattern.compile("^\\d{12}$");
        Matcher matcher = pattern.matcher(txt.getText().trim());
        if (!matcher.matches()) {
            alert(component, message);
            txt.requestFocus();
            return true;
        }
        return false;
    }

    public static boolean checkEmail(Component component, JTextField txt, String message) {
        Pattern pattern = Pattern.compile("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+){1,3}$");
        Matcher matcher = pattern.matcher(txt.getText().trim());
        if (!matcher.matches()) {
            alert(component, message);
            txt.requestFocus();
            return true;
        }
        return false;
    }

    public static boolean checkHinhAnh(Component component, JLabel jLabel, String message) {
        if (jLabel.getIcon() == null) {
            alert(component, message);
            return true;
        }
        return false;
    }

    public static boolean checkRongJDateChooser(Component component, JDateChooser jdc, String message) {
        if (jdc.getDate() == null) {
            alert(component, message);
            jdc.requestFocus();
            return true;
        }
        return false;
    }

    public static String removeDauNgoacVuong(String str) {
        return str.replaceAll("\\[|\\]", "");
    }

    public static String removeDauPhay(String str) {
        return str.replaceAll(",", "");
    }

    public static boolean isValidNumber(String text) {
        if (text == null) {
            return false;
        }
        try {
            Integer.valueOf(text);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isValidDecimal(String text) {
        try {
            Double.valueOf(text);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static ImageIcon scaledImage(ImageIcon image, int width, int height) {
        return new ImageIcon(image.getImage()
                .getScaledInstance(width, height, Image.SCALE_SMOOTH));
    }
}
