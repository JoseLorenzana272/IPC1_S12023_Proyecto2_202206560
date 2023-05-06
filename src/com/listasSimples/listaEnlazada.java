
package com.listasSimples;


public class listaEnlazada extends EstructuraDeDatos1{
   
   NodoUsuario inicio;
   NodoUsuario fin;
   public static int contador;
   
    public listaEnlazada(){
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
    
    @Override
    public void insertar(Categorias usuCat){
        NodoUsuario actual;
        
        if(estaVacia()){
           actual = new NodoUsuario(usuCat, null);
           inicio = actual;
           fin = actual;
        }else{
            actual = new NodoUsuario(usuCat, null);
            fin.setSiguiente(actual);
            fin = actual;
        }
    }
    
    @Override
    public String Mostrar(String usuario) {
        NodoUsuario temporal = inicio;
        StringBuilder sb = new StringBuilder();
        contador = 0;
        while (temporal != null) {
            if(usuario.equals(temporal.valor.getUsuario().toString())){
                sb.append(temporal.valor.getCategoria().toString()).append("\n");
                contador++;
            }
            temporal = temporal.getSiguiente();
        }
        System.out.println(contador);
        return sb.toString();
    }
    
    public void Mostrar2(String usuario) {
        NodoUsuario temporal = inicio;
        
        while (temporal != null) {
            System.out.println(temporal.valor.getUsuario());
            System.out.println(temporal.valor.getCategoria());
            temporal = temporal.getSiguiente();
        }
        
    }
 
    public boolean existencia(String usuario){
        NodoUsuario temporal = inicio;
        boolean acceso = false;
        while(temporal != null){
            if(usuario.equals(temporal.valor.getUsuario().toString())){
                return true;
                
            }else{
               acceso = false; 
            }
            temporal = temporal.getSiguiente();
                
        }
        
        return acceso;
    }
    
    @Override
    public String eliminar(String usuario, String categoria){
        NodoUsuario temporal3 = inicio;
        NodoUsuario anterior = null;
        while(temporal3 != null){
            if(usuario.equals(temporal3.valor.getUsuario()) && categoria.equals(temporal3.valor.getCategoria())){
                if(temporal3 == inicio){
                    inicio = inicio.getSiguiente();
                    
                }else if(temporal3 == fin){
                    anterior.siguiente = null;
                    fin = anterior;
                }
                
                else{
                    anterior.setSiguiente(temporal3.getSiguiente());
                    
                }
            }
            anterior = temporal3;
            temporal3 = temporal3.getSiguiente();
        }
        return "";
    }  
    
}
