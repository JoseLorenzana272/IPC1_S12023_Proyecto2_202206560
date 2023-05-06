/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.listasSimples;

/**
 *
 * @author PERSONAL
 */
public class NodoImagen {
    Imagenes valor;
    NodoImagen anterior, siguiente;

    public NodoImagen(Imagenes valor, NodoImagen anterior, NodoImagen siguiente) {
        this.valor = valor;
        this.anterior = anterior;
        this.siguiente = siguiente;
    }

    public Imagenes getValor() {
        return valor;
    }

    public void setValor(Imagenes valor) {
        this.valor = valor;
    }

    public NodoImagen getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoImagen anterior) {
        this.anterior = anterior;
    }

    public NodoImagen getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoImagen siguiente) {
        this.siguiente = siguiente;
    }
    
    
        
}
