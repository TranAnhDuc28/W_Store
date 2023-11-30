/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.wstore.utilities.status;

/**
 *
 * @author ducan
 */
public enum StatusHoaDon {
    CHO_THANH_TOAN("Chờ thanh toán", 0),
    DA_THANH_TOAN("Đã thanh toán", 1),
    DA_HUY("Hủy", 2),
    CHO_GIAO_HANG("Chờ giao hàng", 3),
    DANG_GIAO_HANG("Đang giao hàng", 4),
    GIAO_HANG_THANH_CONG("Giao hàng thành công", 5);

    private String name;
    private int value;

    private StatusHoaDon() {
    }

    private StatusHoaDon(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static int getValueByName(String name) {
        for (StatusHoaDon os : values()) {
            if (os.name.equalsIgnoreCase(name)) {
                return os.value;
            }
        }
        return CHO_THANH_TOAN.value;
    }
    
    public static String getNameByValue(int value) {
        for (StatusHoaDon os : values()) {
            if (os.value == value) {
                return os.name;
            }
        }
        return CHO_THANH_TOAN.name;
    }

    @Override
    public String toString() {
        return name;
    }
}
