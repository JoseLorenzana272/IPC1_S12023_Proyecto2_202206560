/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.listasSimples;

/**
 *
 * @author PERSONAL
 */
public class Categorias {
    String usuario, categoria;
    
    public Categorias(String usuario, String categoria) {
        this.usuario = usuario;
        this.categoria = categoria;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + this.usuario + ", Tipo: " + this.categoria;
    }
}
