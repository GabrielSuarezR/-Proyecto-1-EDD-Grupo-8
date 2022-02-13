/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1.edd.grupo8.ass;

/**
 *
 * @author johnd
 */
public class Cola {
   NodoCola pfirst;
   NodoCola plast;
   int size;

    public Cola() {
        this.pfirst = null;
        this.plast = null;
        this.size = 0;
    }

    public NodoCola getPfirst() {
        return pfirst;
    }

    public void setPfirst(NodoCola pfirst) {
        this.pfirst = pfirst;
    }

    public NodoCola getPlast() {
        return plast;
    }

    public void setPlast(NodoCola plast) {
        this.plast = plast;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
   
   public boolean esta_vacia(){
       return size==0;
   }
   
   public int Leer_cabeza(){
       return pfirst.getVertice();
   }
   
   public void Encolar(int vertice){
       NodoCola nuevo_nodo= new NodoCola();
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
   
   public void Desencolar(){
       pfirst=pfirst.getSiguiente();
       size--;
       if (pfirst==null) {
           plast=null;
       }
       
       
   }
   
   public String imprimirCola(){
       String cadena="";
       NodoCola aux= pfirst;
           while (aux!=null) {            
            cadena= cadena + aux.getVertice()+ ", ";
               aux= aux.getSiguiente();
        }
           return cadena;
   }
}
