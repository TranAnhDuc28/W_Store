/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.swing.table;

import java.awt.Color;
import java.awt.Component;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author ducan
 */
public class TableImageCellRender extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if (value == null) {
            //  No Image
            JLabel label = new JLabel("No Image");
            label.setHorizontalAlignment(JLabel.CENTER);
            label.setOpaque(isSelected);
            label.setBackground(com.getBackground());
            return label;
        } else {
            if (value instanceof Icon) {
                //  Has Image
                Icon image = (ImageIcon) value;
                JLabel label = new JLabel(image);
                label.setHorizontalAlignment(JLabel.CENTER);
                label.setOpaque(isSelected);
                label.setBackground(com.getBackground());
                return label;
            } else {
                //  Image updating
                JLabel label = new JLabel("Updating ...");
                label.setHorizontalAlignment(JLabel.CENTER);
                label.setOpaque(isSelected);
                label.setBackground(com.getBackground());
                return label;
            }
        }
    }
}
