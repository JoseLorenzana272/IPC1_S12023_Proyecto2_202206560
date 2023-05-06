/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cambioColor;

import static com.cambioColor.CambiarColores.bmp;
import java.awt.Color;

/**
 *
 * @author PERSONAL
 */
public class AzulImagen extends CambiarColorAzul{
    public AzulImagen(String filename) {
        super(filename);
        
    }
    

    @Override
    public void repintarB(int i, int j, Color color) {
        int blue = color.getBlue(); // Obtener el valor de rojo del color
        Color newColor = new Color(0, 0, blue); // Crear un nuevo color con solo la componente roja
        bmp.setRGB(i, j, newColor.getRGB()); // Establecer el nuevo color en el píxel correspondiente
    }

}
