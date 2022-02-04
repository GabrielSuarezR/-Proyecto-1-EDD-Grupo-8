/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1.edd.grupo8.ass;

import javax.swing.JOptionPane;

/**
 *
 * @author johnderek
 */
public class Lista {
    private Nodo primero;
    private Nodo ultimo;
    private int tamanio;

    public Lista() {
        this.primero = null;
        this.ultimo = null;
        this.tamanio = 0;
    }
     public void vaciar(){
        setPrimero(null);
        setUltimo(null);
        setTamanio(0);
    }
    public boolean estaVacia(){
        return getPrimero()==null;
    }
    public void agregarAlInicio(Nodo nodo){
        if(estaVacia()){
            setPrimero(nodo);
            setUltimo(nodo);
        }else{
            nodo.setSiguiente(getPrimero());
            setPrimero(nodo);
        }
        setTamanio(getTamanio()+1);
    }
    public void agregarAlFinal(Nodo nodo){
        if(estaVacia()){
            agregarAlInicio(nodo);
        }else{
            getUltimo().setSiguiente(nodo);
            setUltimo(nodo);
            setTamanio(getTamanio()+1);
        }
    }
    
//    public int BuscarPosicion(int id){
//        Nodo aux= getPrimero();
////        if (!estaVacia()) {
////            while () {                
////                
////            }
////        }
//        
//    }
    /**
     * @return the primero
     */
    public Nodo getPrimero() {
        return primero;
    }

    /**
     * @param primero the primero to set
     */
    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    /**
     * @return the ultimo
     */
    public Nodo getUltimo() {
        return ultimo;
    }

    /**
     * @param ultimo the ultimo to set
     */
    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    /**
     * @return the tamanio
     */
    public int getTamanio() {
        return tamanio;
    }

    /**
     * @param tamanio the tamanio to set
     */
    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
    
   
    
}
