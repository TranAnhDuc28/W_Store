/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.utilities;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.krysalis.barcode4j.impl.code128.Code128Bean;
import org.krysalis.barcode4j.output.bitmap.BitmapCanvasProvider;

/**
 *
 * @author ducan
 */
public class InMaBarcode {

    private Icon getMaBarCode(String strBarcode) {
        String nameFile = null;
        Icon imgBarcode = null;
        try {
            if (strBarcode.trim().isEmpty()) {
                return null;
            }
            nameFile = strBarcode.trim();
            Code128Bean code128 = new Code128Bean();
            code128.setHeight(17);
            code128.setModuleWidth(0.2);
            code128.setQuietZone(5); // kích thước khu vực yên tĩnh hay trái và phải nơi không có vạch mã
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            BitmapCanvasProvider canvas = new BitmapCanvasProvider(
                    baos, "image/x-png", 300,
                    BufferedImage.TYPE_BYTE_BINARY, false, 0);
            code128.generateBarcode(canvas, nameFile);
            canvas.finish();

            FileOutputStream fos = new FileOutputStream("images\\images_barcode_san-pham\\" + nameFile + ".png");
            fos.write(baos.toByteArray());
            fos.flush();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        imgBarcode = new ImageIcon("images\\images_barcode_1\\" + nameFile + ".png");
        return imgBarcode;
    }
}
