/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cambioColor;

import static com.cambioColor.CambiarColor.bmp;
import java.awt.Color;

/**
 *
 * @author PERSONAL
 */
public class RGBimagen extends CambiarColores{
    public RGBimagen(String filename) {
        super(filename);
        
    }
    @Override
    public void repintarR(int i, int j, Color color) {
        int red = color.getRed(); // Obtener el valor de rojo del color
        Color newColor = new Color(red, 0, 0); // Crear un nuevo color con solo la componente roja
        bmp.setRGB(i, j, newColor.getRGB()); // Establecer el nuevo color en el píxel correspondiente
    }


}
