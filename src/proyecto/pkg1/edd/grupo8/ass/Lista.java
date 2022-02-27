/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1.edd.grupo8.ass;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * Clase Lista
 * crea la lista con los nombres de los usuarios, sus id, relaciones
 * @author johnd
 */
public class Lista {
    private NodoGeneral pfirst;
    private NodoGeneral plast;
    private int size;
/**
 * Contructor con 3 parametros
 * @param pfirst primer elemento de la lista
 * @param plast ultimo elemento de la lista
 * @param size tamaño de la lista
 */
    public Lista() {
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
     * recibe como parametro un id y busca cual es la proxima posicion en la 
     * lista de usuarios para el id
     * @param id id del nuevo usuario
     * @return 
     * int: retorna la posicion del nuevo usuario en la lista
     */
    public int BuscarPosicion(int id){
        NodoGeneral aux= getPfirst();
        while ( aux.getID()!=id ) { 
            aux= aux.getSiguiente();
        }
        return aux.getPosicion();
    }
     /**
     * BuscarNombreUsuario
     * recibe como parametro una posicion y busca cual es el nombre del usuario 
     * para esa posicion 
     * @param pos posicion en la cola
     * @return 
     * NodoGeneral: retorna el nombre de usuario para una posicion
     */
    public NodoGeneral BuscarNombreUsuario(int pos){
        NodoGeneral aux= getPfirst();
        while ( aux.getPosicion()!=pos ) { 
            aux= aux.getSiguiente();
        }
        return aux;
    }
     /**
     * Validar_Usuario
     * valida que no puedan haber dos usuarios iguales
     * @param usuario nombre del usuario
     * @return 
     * boolean: retorna true o false si el usuario existe
     */
    public boolean Validar_Usuario(String usuario){
        NodoGeneral aux= getPfirst();
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
        NodoGeneral aux= getPfirst();
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
        NodoGeneral aux = pfirst;
        while (aux!=null) {
            texto.append(aux.getID()+","+aux.getNombreDeUsuario()+"\n");
            aux = aux.getSiguiente();
            
        }
    }
     /**
     * ImprimirListaRelaciones
     * itera sobre cada nodo de la lista de relaciones y los va imprimiendo en un area de 
     * texto que es pasada como parametro
     * @param texto area de texto donde se imprime la lista
     */
    public void ImprimirListaRelaciones(JTextArea texto){
        texto.append("Relaciones"+"\n");
        NodoGeneral aux = pfirst;
        while (aux!=null) {
            texto.append(aux.getInicio()+","+aux.getFin()+","+aux.getTiempo()+"\n");
            aux = aux.getSiguiente();
            
        }
    }
    /**
     * getPfirst
     * retorna el primer elemento de la lista
     * @return 
     * NodoGeneral pfirst: primer elemento de la lista
     */
    public NodoGeneral getPfirst() {
        return pfirst;
    }
    /**
     * setPfirst
     * establece el primer elemento de la lista
     * @param pfirst primer elemento de la lista
     * @return 
     */
    public void setPfirst(NodoGeneral pfirst) {
        this.pfirst = pfirst;
    }
    /**
     * getPlast
     * retorna el ultimo elemento de la lista
     * @return 
     * NodoGeneral plast: ultimo elemento de la lista
     */
    public NodoGeneral getPlast() {
        return plast;
    }
    /**
     * setPlast
     * establece el ultimo elemento de la lista
     * @param plast: ultimo elemento de la lista
     * @return 
     */
    public void setPlast(NodoGeneral plast) {
        this.plast = plast;
    }
    /**
     * getSize
     * retorna el tamaño de la lista
     * @return 
     * int size: tamaño de la lista
     */
    public int getSize() {
        return size;
    }
    /**
     * setSize
     * establece el tamaño de la lista
     * @param size tamaño de la lista
     * @return 
     */
    public void setSize(int size) {
        this.size = size;
    }
    

   
    
    

    
    
    
}
