/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1.edd.grupo8.ass;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author johnd
 */
public class ListaUsuarios {
    private NodoUsuario pfirst;
    private NodoUsuario plast;
    private int size;

    public ListaUsuarios() {
        this.pfirst = null;
        this.plast = null;
        this.size = 0;
    }

    
    public boolean estaVacia(){
        return getPfirst()==null;
    }
    
    public void agregarAlFinal(NodoUsuario nodo){
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
    
    public int BuscarPosicion(int id){
        NodoUsuario aux= getPfirst();
        while ( aux.getID()!=id ) {            
            aux= aux.getSiguiente();
        }
        return aux.getPosicion();
    }
    
    public boolean Buscar_ID(int id){
        NodoUsuario aux= getPfirst();
        while ( aux.getID()!=id ) {            
            aux= aux.getSiguiente();
            if (aux==null) {
                return false;
            }
        }
        if (aux.getID()==id) {
            return true;
        }
        return false;
    }
    
    public void ImprimirLista(JTextArea texto){
        texto.append("Usuarios"+"\n");
        NodoUsuario aux = pfirst;
        while (aux!=null) {
            texto.append(aux.getID()+","+aux.getNombreDeUsuario()+"\n");
            aux = aux.getSiguiente();
            
        }
    }
    /**
     * @return the pfirst
     */
    public NodoUsuario getPfirst() {
        return pfirst;
    }

    /**
     * @param pfirst the pfirst to set
     */
    public void setPfirst(NodoUsuario pfirst) {
        this.pfirst = pfirst;
    }

    /**
     * @return the plast
     */
    public NodoUsuario getPlast() {
        return plast;
    }

    /**
     * @param plast the plast to set
     */
    public void setPlast(NodoUsuario plast) {
        this.plast = plast;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    
}
