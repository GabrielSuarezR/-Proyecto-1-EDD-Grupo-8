/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1.edd.grupo8.ass;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *Clase ListaUsuarios
 * crea la lista de usuarios
 * @author johnd
 */
public class ListaUsuarios {
    private NodoUsuario pfirst;
    private NodoUsuario plast;
    private int size;
/**
 * ListaUsuarios
 * constructor de la clase
 */
    public ListaUsuarios() {
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
     * BuscarPosicion
     * recibe como parametro un id y buscar cual es la proxima posicion en la 
     * lista de usuarios para el id
     * @param id id del nuevo usuario
     * @return 
     * int: retorna la posicion del nuevo usuario en la lista
     */
    public int BuscarPosicion(int id){
        NodoUsuario aux= getPfirst();
        while ( aux.getID()!=id ) { 
            aux= aux.getSiguiente();
        }
        return aux.getPosicion();
    }
    
    public NodoUsuario BuscarNombreUsuario(int pos){
        NodoUsuario aux= getPfirst();
        while ( aux.getPosicion()!=pos ) { 
            aux= aux.getSiguiente();
        }
        return aux;
    }
    
    public boolean Validar_Usuario(String usuario){
        NodoUsuario aux= getPfirst();
        while (aux!=null) {            
            if (aux.getNombreDeUsuario().equals(usuario)) {
                return true;
            }
            aux= aux.getSiguiente();
        }
        return false;
    }
    /**
     * Buscar_ID
     * recibe un id por parametro y busca que el id no sea un id ya ocupado
     * por otro usuario
     * @param id id del nuevo usuarios
     * @return 
     * boolean: retorna true o false si existe el id
     */
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
   /**
     * ImprimirLista
     * itera sobre cada nodo de la lista y los va imprimiendo en un area de 
     * texto que es pasada como parametro
     * @param texto area de texto donde se imprime la lista
     */
    public void ImprimirLista(JTextArea texto){
        texto.append("Usuarios"+"\n");
        NodoUsuario aux = pfirst;
        while (aux!=null) {
            texto.append(aux.getID()+","+aux.getNombreDeUsuario()+"\n");
            aux = aux.getSiguiente();
            
        }
    }
    
    
    public void ImprimirLista_2(){
        NodoUsuario aux = pfirst;
        while (aux!=null) {
            System.out.println(aux.getID());
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
