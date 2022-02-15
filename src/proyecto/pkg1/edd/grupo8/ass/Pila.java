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
public class Pila<T> {
    Nodo<T> cima;
    int size;

    public Pila() {
        this.cima = null;
        this.size = 0;
    }

    public Nodo<T> getCima() {
        return cima;
    }

    public void setCima(Nodo<T> cima) {
        this.cima = cima;
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
    
    public void Apilar(int vertice){
        Nodo<T> nuevo_nodo= new Nodo<>();
        nuevo_nodo.setVertice(vertice);
        nuevo_nodo.setSiguiente(cima);
        cima= nuevo_nodo;
        size++;
    }
    
    public void Desapilar(){
        cima= cima.getSiguiente();
        size--;
    }
    
    
}


