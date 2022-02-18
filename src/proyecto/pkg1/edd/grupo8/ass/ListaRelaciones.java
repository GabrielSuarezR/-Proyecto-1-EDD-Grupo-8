/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1.edd.grupo8.ass;

import javax.swing.JTextArea;

/**
 *
 * @author johnd
 */
public class ListaRelaciones {
    private NodoRelaciones pfirst;
    private NodoRelaciones plast;
    private int size;

    public ListaRelaciones() {
        this.pfirst = null;
        this.plast = null;
        this.size = 0;
    }
    
    public boolean estaVacia(){
        return getPfirst()==null;
    }
    
    public void agregarAlFinal(NodoRelaciones nodo){
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
    public void ImprimirLista(JTextArea texto){
        texto.append("Relaciones"+"\n");
        NodoRelaciones aux = pfirst;
        while (aux!=null) {
            texto.append(aux.getInicio()+","+aux.getFin()+","+aux.getTiempo()+"\n");
            aux = aux.getSiguiente();
        }
    }
  
    /**
     * @return the pfirst
     */
    public NodoRelaciones getPfirst(){
        return pfirst;
    }

    /**
     * @param pfirst the pfirst to set
     */
    public void setPfirst(NodoRelaciones pfirst){
        this.pfirst = pfirst;
    }

    /**
     * @return the plast
     */
    public NodoRelaciones getPlast(){
        return plast;
    }

    /**
     * @param plast the plast to set
     */
    public void setPlast(NodoRelaciones plast){
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
