/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1.edd.grupo8.ass;

/**
 *
 * @author gabriel
 */
public class ListaAristas {
    private NodoArista pfirst;
    private NodoArista plast;
    private int size;

    public ListaAristas() {
        this.pfirst = null;
        this.plast = null;
        this.size = 0;
    }

    public NodoArista getPfirst() {
        return pfirst;
    }

    public void setPfirst(NodoArista pfirst) {
        this.pfirst = pfirst;
    }

    public NodoArista getPlast() {
        return plast;
    }

    public void setPlast(NodoArista plast) {
        this.plast = plast;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public boolean estaVacia(){
        return getPfirst()==null;
    }
    
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
    
}
