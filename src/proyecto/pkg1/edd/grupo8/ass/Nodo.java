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
public class Nodo {
    
    private Object elemento;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo(Object elemento) {
        this.elemento = elemento;
        this.siguiente = null;
        this.anterior = null;
    }

    /**
     * @return the elemento
     */
    public Object getElemento() {
        return elemento;
    }

    /**
     * @param elemento the elemento to set
     */
    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    /**
     * @return the siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public Nodo getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the previo to set
     */
    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    
     public Nodo eliminar (Nodo nodoelim, String dato) {
          Nodo resul = nodoelim;
         if(nodoelim != null){
            JOptionPane.showMessageDialog(null, nodoelim.getElemento() + dato);
            if (nodoelim!= null){
                if (nodoelim.getElemento() != dato){
                    nodoelim.siguiente = eliminar (nodoelim.siguiente, dato);
                }
                else {resul = nodoelim.siguiente;}
            }
     }else{
             resul = null;
         }
          return resul;
    
}
}
