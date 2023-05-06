/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cambioColor;

import static com.cambioColor.CambiarColorAzul.bmp;
import java.awt.Color;

/**
 *
 * @author PERSONAL
 */
public class VerdeImagen extends CambiarColorVerde{
    public VerdeImagen(String filename) {
        super(filename);
        
    }
    

    @Override
    public void repintarG(int i, int j, Color color) {
        int verde = color.getGreen(); // Obtener el valor de rojo del color
        Color newColor = new Color(0, verde, 0); // Crear un nuevo color con solo la componente roja
        bmp.setRGB(i, j, newColor.getRGB()); // Establecer el nuevo color en el píxel correspondiente
    }
}
