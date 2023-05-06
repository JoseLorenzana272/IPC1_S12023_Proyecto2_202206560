
package com.listasSimples;



public class NodoUsuario {
   Categorias valor;
   NodoUsuario siguiente;
   public NodoUsuario(Categorias valor, NodoUsuario siguiente){
       this.valor = valor;
       this.siguiente = siguiente;
   }

    public Categorias getValor() {
        return valor;
    }

    public void setValor(Categorias valor) {
        this.valor = valor;
    }

    public NodoUsuario getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoUsuario siguiente) {
        this.siguiente = siguiente;
    }
   
  
}
