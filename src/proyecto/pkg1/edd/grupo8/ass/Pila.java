/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1.edd.grupo8.ass;

/**
 * Clase Pila
 * descripcion
 * @author johnd
 */
public class Pila<T> {
    private NodoGeneral cima;
    private int size;
    /**
     * Constructor con 2 parametros
     * @param  cima cima de la pila
     * @param  size tamaño de la pila
     */
    public Pila() {
        this.cima = null;
        this.size = 0;
    }
     /**
     * getCima
     * obtiene la cima de la pila
     * @return 
     * Nodo<T> cima: cima de la pila
     */
    public NodoGeneral getCima() {
        return cima;
    }
    /**
     * setCima
     * establece la cima de la pila
     * @param cima cima de la pila
     * @return 
     */
    public void setCima(NodoGeneral cima) {
        this.cima = cima;
    }
    /**
     * getSize
     * obtiene el tamaño de la pila
     * @return 
     * int size: tamaño de la pila
     */
    public int getSize() {
        return size;
    }
    /**
     * setSize
     * establece el tamaño de la pila
     * @param size tamaño de la pila
     * @return 
     */
    public void setSize(int size) {
        this.size = size;
    }
    /**
     * esta_vacia
     * determina si la pila esta vacia
     * @return 
     * boolean true: la pila esta vacia
     * boolean false: la pila no esta vacia
     */
    public boolean esta_vacia(){
        return size==0;
    }
    /**
     * Apilar
     * apila los elementos de la pila 
     * @param vertice elemento de la pila
     * @return 
     */
    public void Apilar(int vertice){
        NodoGeneral nuevo_nodo= new NodoGeneral();
        nuevo_nodo.setVertice(vertice);
        nuevo_nodo.setSiguiente(cima);
        cima= nuevo_nodo;
        size++;
    }
     /**
     * Desapilar
     * desapila los elementos de la pila 
     * @return 
     */
    public void Desapilar(){
        cima= cima.getSiguiente();
        size--;
    }
    
    
}


