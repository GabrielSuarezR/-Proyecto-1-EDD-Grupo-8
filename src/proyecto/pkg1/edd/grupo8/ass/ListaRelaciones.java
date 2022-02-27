/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1.edd.grupo8.ass;

import javax.swing.JTextArea;

/**
 *Clase Lista relaciones
 * crea  la lista de relaciones
 * @author johnd
 */
public class ListaRelaciones {
    private NodoGeneral pfirst;
    private NodoGeneral plast;
    private int size;
/**
 * ListaRelaciones
 * constructor de la clase
 */
    public ListaRelaciones() {
        this.pfirst = null;
        this.plast = null;
        this.size = 0;
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
    public void agregarAlFinal(NodoGeneral nodo){
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
     * ImprimirLista
     * itera sobre cada nodo de la lista y los va imprimiendo en un area de 
     * texto que es pasada como parametro
     * @param texto area de texto donde se imprime la lista
     */
    public void ImprimirLista(JTextArea texto){
        texto.append("Relaciones"+"\n");
        NodoGeneral aux = pfirst;
        while (aux!=null) {
            texto.append(aux.getInicio()+","+aux.getFin()+","+aux.getTiempo()+"\n");
            aux = aux.getSiguiente();
        }
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
    /**
     * @return the pfirst
     */
    public NodoGeneral getPfirst(){
        return pfirst;
    }

    /**
     * @param pfirst the pfirst to set
     */
    public void setPfirst(NodoGeneral pfirst){
        this.pfirst = pfirst;
    }

    /**
     * @return the plast
     */
    public NodoGeneral getPlast(){
        return plast;
    }

    /**
     * @param plast the plast to set
     */
    public void setPlast(NodoGeneral plast){
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
