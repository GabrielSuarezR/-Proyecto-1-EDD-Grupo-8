/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1.edd.grupo8.ass;

/**
 *Clase NodoUsuarios
 * crea el nodo de un usuario
 * @author gabriel
 */
public class NodoUsuario {
    private int ID;
    private String nombreDeUsuario;
    private int posicion;
    private NodoUsuario siguiente;
/**
 * NodoUsuario
 * constructor de la clase con 3 parametros
 * @param ID id del usuario
 * @param nombreDeUsuario nombre del usuario
 * @param posicion posicion del usuario
 */
    public NodoUsuario(int ID, String nombreDeUsuario, int posicion) {
        this.ID = ID;
        this.nombreDeUsuario = nombreDeUsuario;
        this.posicion= posicion;
        this.siguiente=null;
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

    public NodoUsuario getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoUsuario siguiente) {
        this.siguiente = siguiente;
    }

    
}
