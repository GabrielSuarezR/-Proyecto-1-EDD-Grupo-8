/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1.edd.grupo8.ass;

/**
 *Clase NodoRelaciones
 * Nodo que guarda la relación entre dos usuarios
 * @author gabriel
 */
public class NodoGeneral {
    private int inicio;
    private int fin;
    private int tiempo;
    private int vertice;
    private int ID;
    private String nombreDeUsuario;
    private int posicion;
    private NodoGeneral siguiente;
/**
 * NodoRelaciones
 * constructor de la clase con 3 parametros
 * @param inicio primer id de la realcion
 * @param fin segundo id de la relacion
 * @param tiempo tiempo de la relacion
 */
   
    
    public NodoGeneral(int inicio, int fin, int tiempo) {
        this.inicio = inicio;
        this.fin = fin;
        this.tiempo = tiempo;
        this.siguiente = siguiente;
    }

    public NodoGeneral(int ID, String nombreDeUsuario, int posicion) {
        this.ID = ID;
        this.nombreDeUsuario = nombreDeUsuario;
        this.posicion = posicion;
        this.siguiente=null;
    }

    public NodoGeneral() {
        this.vertice = vertice;
        this.siguiente = siguiente;
    }

    public NodoGeneral(int inicio, int fin) {
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

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public NodoGeneral getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoGeneral siguiente) {
        this.siguiente = siguiente;
    }

    public int getVertice() {
        return vertice;
    }

    public void setVertice(int vertice) {
        this.vertice = vertice;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }

    public void setNombreDeUsuario(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    
    

}
