/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1.edd.grupo8.ass;

/**
 * Clase Nodo
 * descripcion
 * @author johnd
 */
public class Nodo<T> {
    int vertice;
    Nodo<T> siguiente;
    /**
     * Constructor con 2 parametros
     * @param vertice nodo vertice
     * @param siguiente nodo siguiente 
     * 
     */
    public Nodo() {
        this.vertice = vertice;
        this.siguiente = siguiente;
    }

    public int getVertice() {
        return vertice;
    }

    public void setVertice(int vertice) {
        this.vertice = vertice;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    
    
    
    
}
