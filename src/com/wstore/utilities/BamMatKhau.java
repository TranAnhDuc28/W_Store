/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.utilities;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author ducan
 */
public class BamMatKhau {

    public static void main(String[] args) {

        System.out.println("Password lưu trong CSDL:");
        Scanner sc = new Scanner(System.in);
        String password1 = sc.nextLine(); // Mật khẩu từ người dùng

        String hashedPassword = null;
        hashedPassword = hashPassword(password1);
        System.out.println("Mật khẩu đã băm: " + hashedPassword);

        System.out.println("Pass nhập vào:");
        String password2 = sc.nextLine(); // Mật khẩu từ người dùng
        String passwordEnterHash = null;
        try {
            passwordEnterHash = hashPassword(password2);
            System.out.println("Mật khẩu đã băm: " + passwordEnterHash);

            if (Objects.equals(passwordEnterHash, hashedPassword)) {
                System.out.println("Mật khẩu đúng");
            } else {
                System.out.println("Mật khẩu sai");
            }
        } catch (Exception e) {
        }
    }

    public static String hashPassword(String password) {
        StringBuilder sb = new StringBuilder();
        try {
            MessageDigest md3 = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = md3.digest(password.getBytes());
            for (byte b : hashedBytes) {
                sb.append(String.format("%02x", b));
            }
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
        return sb.toString();
    }
}
