/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1.edd.grupo8.ass;

/**
 *Clase NodoArista
 * crea el nodo de una arista
 * @author gabriel
 */
public class NodoArista {
    private int inicio;
    private int fin;
    private NodoArista siguiente;
/**
 * NodoArista
 * constructor de la clase con 2 parametros
 * @param inicio primera posicion
 * @param fin segunda posicion
 */
    public NodoArista(int inicio, int fin) {
        this.inicio = inicio;
        this.fin = fin;
        this.siguiente = null;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    public NodoArista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoArista siguiente) {
        this.siguiente = siguiente;
    }
     
    
}
