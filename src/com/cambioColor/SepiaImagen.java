/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cambioColor;

import static com.cambioColor.CambiarColorVerde.bmp;
import java.awt.Color;

/**
 *
 * @author PERSONAL
 */
public class SepiaImagen extends CambiarColorSepia{

     public SepiaImagen(String filename) {
        super(filename);
        
    }
    

    @Override
    public void repintarSepia(int i, int j, Color color) {
        int red = color.getRed(); // Obtener el valor de rojo del color
        int green = color.getGreen(); // Obtener el valor de verde del color
        int blue = color.getBlue(); // Obtener el valor de azul del color
        int newRGB = ((int)(0.393 * red + 0.769 * green + 0.189 * blue) << 16) |
                 ((int)(0.349 * red + 0.686 * green + 0.168 * blue) << 8) |
                 (int)(0.272 * red + 0.534 * green + 0.131 * blue);
        Color sepia = new Color(newRGB);

        bmp.setRGB(i, j, sepia.getRGB());

    }
    
}
