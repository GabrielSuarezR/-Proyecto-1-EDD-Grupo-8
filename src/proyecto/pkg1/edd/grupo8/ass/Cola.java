/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1.edd.grupo8.ass;

/**
 * Clase cola
 * descripcion
 * @author johnd
 */
public class Cola<T> {
   private NodoGeneral pfirst;
   private NodoGeneral plast;
   int size;
    /**
     * Constructor con 3 parametros
     * @param pfirst primer elemento de la cola
     * @param plast ultimo elemento de la cola
     * @param size tamaño de la cola
     */  
    public Cola() {
        this.pfirst = null;
        this.plast = null;
        this.size = 0;
    }
    
    /**
     * getPfirst
     * obtiene el primer elemento de la cola
     * @return 
     * Nodo<T> pfirst: primer elemento de la cola
     */
    public NodoGeneral getPfirst() {
        return pfirst;
    }
    /**
     * setPfirst
     * establece el primer elemento de la cola
     * @param pfirst
     * @return 
     */
    public void setPfirst(NodoGeneral pfirst) {
        this.pfirst = pfirst;
    }
    /**
     * getPlast
     * obtiene el ultimo elemento de la cola
     * @return 
     * Nodo<T> plast: ultimo elemento de la cola
     */
    public NodoGeneral getPlast() {
        return plast;
    }
    /**
     * setPlast
     * establece el ultimo elemento de la cola
     * @param plast
     * @return 
     */
    public void setPlast(NodoGeneral plast) {
        this.plast = plast;
    }
    
    /**
     * getSize
     * obtiene el tamaño de la cola
     * @return 
     * int size: tamaño de la cola
     */
    public int getSize() {
        return size;
    }
    
    /**
     * setSize
     * establece el tamaño de la cola
     * @param size
     * @return 
     */
    public void setSize(int size) {
        this.size = size;
    }

    
   /**
     * esta_vacia
     * verifica si la cola esta vacia
     * @return 
     * boolean true: la cola esta vacia
     * boolean false: la cola no esta vacia
     */
   public boolean esta_vacia(){
       return size==0;
   }
   /**
     * Leer_cabeza
     * obtiene el valor de la cabeza de la cola
     * @return 
     * int: valor de la cabeza de la cola
     */
   public int Leer_cabeza(){
       return pfirst.getVertice();
   }
   /**
     * Encolar
     * (descripcion)
     * @param vertice
     * @return 
     */
   public void Encolar(int vertice){
       NodoGeneral nuevo_nodo= new NodoGeneral();
       nuevo_nodo.setVertice(vertice);
       
       if (pfirst==null) {
           pfirst=nuevo_nodo;
       }
       else{
           plast.setSiguiente(nuevo_nodo);
       }
       plast= nuevo_nodo;
       size++;
   }
   /**
     * Desencolar
     * (descripcion)
     * @return 
     */
   public void Desencolar(){
       pfirst=pfirst.getSiguiente();
       size--;
       if (pfirst==null) {
           plast=null;
       }
       
       
   }
   /**
     * imprimirCola
     * imprime la cola
     * @return 
     * String: imprime la cola en forma de cadena
     */
   public String imprimirCola(){
       String cadena="";
       NodoGeneral aux= pfirst;
           while (aux!=null) {            
            cadena= cadena + aux.getVertice()+ ", ";
               aux= aux.getSiguiente();
        }
           return cadena;
   }
}
