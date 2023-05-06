/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cambioColor;


import Handlers.ImageHandler;
import static com.cambioColor.CambiarColor.bmp;
import static com.editor.editor.nombreImg;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author PERSONAL
 */
public class jpgabmp extends ImageHandler{
     BufferedImage jpg;
    public static BufferedImage bmp;
    File tmp;
    String nombre;

    public jpgabmp(String filename) {
        super(filename);
        this.jpg = null;
        this.bmp = null;
        this.tmp = new File(getFileName());
        this.nombre = filename;
        
    }

    @Override
    public void readFile() throws Exception {
        File file = new File(getFileName());
        jpg = ImageIO.read(file);
        tmp = new File("./Temp/btmTemp.bmp");
        ImageIO.write(jpg, "bmp", tmp);
        bmp = ImageIO.read(tmp);
    }

    @Override
    public void generateFiles() throws Exception {
        ImageIO.write(bmp, "bmp", new File("C:\\Users\\PERSONAL\\OneDrive\\Desktop\\IPC1_S12023_Proyecto2_202206560\\Imagen\\"+nombreImg+".bmp"));
    }
}
