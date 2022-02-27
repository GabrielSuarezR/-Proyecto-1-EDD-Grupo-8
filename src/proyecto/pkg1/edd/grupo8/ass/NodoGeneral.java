/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1.edd.grupo8.ass;

/**
 *Clase NodoGeneral
 * Nodo general que guarda informacion del usuario
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
    * NodoGeneral 
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
    /**
    * NodoGeneral 
    * constructor de la clase con 3 parametros
    * @param ID id del usuario
    * @param nombreDeUsuario nombre del usuario
    * @param posicion posicion del nodo
    */
    public NodoGeneral(int ID, String nombreDeUsuario, int posicion) {
        this.ID = ID;
        this.nombreDeUsuario = nombreDeUsuario;
        this.posicion = posicion;
        this.siguiente=null;
    }
    /**
    * NodoGeneral 
    * constructor de la clase con 1 parametro
    * @param vertice 
    */
    public NodoGeneral() {
        this.vertice = vertice;
        this.siguiente = siguiente;
    }
    /**
    * NodoGeneral 
    * constructor de la clase con 2 parametros
    * @param inicio 
    * @param fin 
    */
    public NodoGeneral(int inicio, int fin) {
        this.inicio = inicio;
        this.fin = fin;
        this.siguiente = null;
    }
    
    /**
     * getInicio
     * obtiene la posicion del usuario donde empieza una relacion
     * @return 
     * int inicio:nodo donde empieza una relacion
     */
    public int getInicio() {
        return inicio;
    }
    /**
     * setInicio
     *  establece la posicion del usuario donde empieza una relacion
     * @return 
     */
    public void setInicio(int inicio) {
        this.inicio = inicio;
    }
    /**
     * getFin
     * obtiene la posicion del usuario donde finaliza una relación
     * @return 
     * int fin: nodo donde termina una relacion
     */
    public int getFin() {
        return fin;
    }
    /**
     * setFin
     * establace la posicion del usuario donde finaliza una relación
     * @param fin nodo donde termina una relacion
     * @return 
     * int fin: nodo donde termina una relacion
     */
    public void setFin(int fin) {
        this.fin = fin;
    }
    /**
     * getTiempo
     * obtiene el tiempo de relacion entre dos usuarios
     * @return 
     * int tiempo: tiempo de relacion entre dos usuarios
     */
    public int getTiempo() {
        return tiempo;
    }
    /**
     * setTiempo
     * establece el tiempo de relacion entre dos usuarios
     * @param tiempo tiempo de relacion entre dos usuarios
     * @return 
     */
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    /**
     * getSiguiente
     * retorna el siguiente nodo
     * @return 
     * NodoGeneral siguiente: siguiente nodo
     */
    public NodoGeneral getSiguiente() {
        return siguiente;
    }
    /**
     * setSiguiente
     * establece el apuntador al siguiente nodo
     * @param siguiente nodo siguiente
     * @return 
     * NodoGeneral siguiente: siguiente nodo
     */
    public void setSiguiente(NodoGeneral siguiente) {
        this.siguiente = siguiente;
    }
    /**
     * getVertice
     * retorna el vertice del grafo
     * @return 
     * int vertice: vertice del grafo
     */
    public int getVertice() {
        return vertice;
    }
    /**
     * setVertice
     * establece el vertice del grafo
     * @param vertice vertice del grafo
     * @return 
     */
    public void setVertice(int vertice) {
        this.vertice = vertice;
    }
    /**
     * getID
     * retorna el id del usuario
     * @return 
     * int ID: id del usuario
     */
    public int getID() {
        return ID;
    }
    /**
     * setID
     * establece el id del usuario
     * @param ID id del usuario
     * @return  
     */
    public void setID(int ID) {
        this.ID = ID;
    }
     /**
     * getNombreDeUsuario
     * retorna el nombre del usuario
     * @return  
     * int nombreDeUsuario: nombre del usuario
     */
    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }
    /**
     * setNombreDeUsuario
     * retorna el nombre del usuario
     * @param nombreDeUsuario: nombre del usuario
     * @return  
     */
    public void setNombreDeUsuario(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }
    /**
     * getPosicion
     * retorna la posicion del nodo en la lista de usuarios
     * @return
     * int posicion: posicion del nodo en la pila o la cola
     */
    public int getPosicion() {
        return posicion;
    }
    /**
     * setPosicion
     * establece la posicion del nodo en la lista de usuarios
     * @param posicion posicion del nodo en la pila o la cola
     * @return
     */
    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    
    

}
