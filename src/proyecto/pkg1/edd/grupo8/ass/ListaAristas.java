/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1.edd.grupo8.ass;

/**
 *Clase ListaAristas
 * crea la lista de aristas
 * @author gabriel
 */
public class ListaAristas {
    private NodoArista pfirst;
    private NodoArista plast;
    private int size;
/**
 * ListaAristas 
 * constructor de la clase 
 */
    public ListaAristas() {
        this.pfirst = null;
        this.plast = null;
        this.size = 0;
    }
/**
 * 
 * @return 
 * NodoArista: retorna el primer nodo de la lista
 */
    public NodoArista getPfirst() {
        return pfirst;
    }
/**
 * 
 * @param pfirst 
 */
    public void setPfirst(NodoArista pfirst) {
        this.pfirst = pfirst;
    }
/**
 * 
 * @return 
 * NodoArista: retorna el ultimo nodo de la arista
 */
    public NodoArista getPlast() {
        return plast;
    }
/**
 * 
 * @param plast 
 */
    public void setPlast(NodoArista plast) {
        this.plast = plast;
    }
/**
 * 
 * @return 
 * int: retorna el tamaño de la lista
 */
    public int getSize() {
        return size;
    }
/**
 * 
 * @param size 
 */
    public void setSize(int size) {
        this.size = size;
    }
    /**
     * estaVacia 
     * verifica el estado de la lista
     * @return 
     * boolean: si pFirst apunta a null la lista esta vacia
     */
    public boolean estaVacia(){
        return getPfirst()==null;
    }
    /**
     * agregarAlFinal 
     * busca si la lista esta vacia y agrega al inicio o al final
     * dependiendo del estado de la lista
     * @param nodo el nodo que se quiere agregar
     */
    public void agregarAlFinal(NodoArista nodo){
        if (estaVacia()) {
            setPfirst(nodo);
            setPlast(nodo);
        }
        else{
            plast.setSiguiente(nodo);
            plast=nodo;
            nodo.setSiguiente(null);
        }
        size++;
    }
    /**
     * vaciar
     * vacia la lista
     */
    public void vaciar(){
        this.pfirst=null;
        this.plast=null;
        this.size=0;
    }
    
}
