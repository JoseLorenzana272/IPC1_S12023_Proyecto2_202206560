/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.listasSimples;

/**
 *
 * @author PERSONAL
 */
public class listaDoble {
    NodoImagen inicio, fin, control;
    public static int contador1 = 0;
    
    public listaDoble(){
        inicio = null;
        fin = null;
        
    }
    
    public boolean estaVacia(){
        if(inicio == null){
            return true;
        }else{
            return false;
        }
    }
    
    public void insertarFin(Imagenes imagen){
        NodoImagen actual;
        
        if(estaVacia()){
           actual = new NodoImagen(imagen, null, null);
           fin = actual;
           inicio = actual;
        }else{
            actual = new NodoImagen(imagen, inicio, null);
            fin.setSiguiente(actual);
            fin = actual;
        }
    }
    
    public String MostrarAdelante(String user, String category, String image){
        NodoImagen temporal = inicio;
        String ruta = "";
        while(temporal != null){
            if(temporal.valor.getUsuario().toString().equals(user) && temporal.valor.getCategoria().toString().equals(category) && temporal.valor.getImagen().toString().equals(image)){
                ruta = temporal.valor.getImagen().toString();
                control = temporal;
                temporal = temporal.getSiguiente();
                
            }
            
            
        }
        return ruta;
    }
    
     public String actComboBox(String user, String category){
         NodoImagen temporal = inicio;
         
         StringBuilder sb = new StringBuilder();
         contador1 = 0;
         while (temporal != null) {
             if (temporal.valor.getUsuario().toString().equals(user) && temporal.valor.getCategoria().toString().equals(category)) {
                 sb.append(temporal.valor.getName().toString()).append("\n");
                 contador1++;
             }
             temporal = temporal.getSiguiente();
         }
         System.out.println(contador1);
         return sb.toString();
     }
     
     public String MostrarCombo(String user, String category, String name){
        NodoImagen temporal = inicio;
        String ruta = "";
        while(temporal != null){
            if(temporal.valor.getUsuario().toString().equals(user) && temporal.valor.getCategoria().toString().equals(category) && temporal.valor.getName().toString().equals(name)){
                ruta = temporal.valor.getImagen().toString();

            }
            temporal = temporal.getSiguiente();
            
        }
        return ruta;
    }
     
    public void Eliminar(String usuario, String categoria, String name){
        NodoImagen actual = inicio;
        NodoImagen anterior = null;
        while (actual != null) {
            if (actual.valor.getUsuario().toString().equals(usuario) && actual.valor.getCategoria().toString().equals(categoria) && actual.valor.getName().toString().equals(name)) {
                if (anterior == null) {
                    // Caso especial: el nodo a eliminar es el primer nodo
                    inicio = actual.getSiguiente();
                } else {
                    // Enlazar el nodo anterior con el siguiente del nodo a eliminar
                    anterior.setSiguiente(actual.getSiguiente());
                }
                // Liberar memoria del nodo a eliminar
                actual = null;
                return;
            }
            // Avanzar a los siguientes nodos
            anterior = actual;
            actual = actual.getSiguiente();
        }
        
    }
    
    public void Eliminar2(String usuario, String categoria){
        NodoImagen actual = inicio;
        NodoImagen anterior = null;
        while (actual != null) {
            if (actual.valor.getUsuario().toString().equals(usuario) && actual.valor.getCategoria().toString().equals(categoria)) {
                if (anterior == null) {
                    // Caso especial: el nodo a eliminar es el primer nodo
                    inicio = actual.getSiguiente();
                } else {
                    // Enlazar el nodo anterior con el siguiente del nodo a eliminar
                    anterior.setSiguiente(actual.getSiguiente());
                }
                // Liberar memoria del nodo a eliminar
                actual = null;
                return;
            }
            // Avanzar a los siguientes nodos
            anterior = actual;
            actual = actual.getSiguiente();
        }
        
    }
    
}
