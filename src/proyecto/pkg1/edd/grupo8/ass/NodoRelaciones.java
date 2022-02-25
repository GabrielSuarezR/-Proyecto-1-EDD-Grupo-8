/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1.edd.grupo8.ass;

/**
 *Clase NodoRelaciones
 * crea el nodo de una relacion
 * @author gabriel
 */
public class NodoRelaciones {
    private int inicio;
    private int fin;
    private int tiempo;
    private NodoRelaciones siguiente;
/**
 * NodoRelaciones
 * constructor de la clase con 3 parametros
 * @param inicio primer id de la realcion
 * @param fin segundo id de la relacion
 * @param tiempo tiempo de la relacion
 */
    public NodoRelaciones(int inicio, int fin, int tiempo) {
        this.inicio = inicio;
        this.fin = fin;
        this.tiempo = tiempo;
        this.siguiente=null;
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

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public NodoRelaciones getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoRelaciones siguiente) {
        this.siguiente = siguiente;
    }


}
