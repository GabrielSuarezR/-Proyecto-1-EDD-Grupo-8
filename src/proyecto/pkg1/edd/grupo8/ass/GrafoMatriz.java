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
public class GrafoMatriz {
    private int num_vertices;
    private int [][] matriz;
    ListaUsuarios lista_usuarios;
    ListaRelaciones lista_relaciones;
    ListaAristas lista_aristas;

    public GrafoMatriz() {
        this.num_vertices = num_vertices;
        this.matriz = new int[num_vertices][num_vertices];
        this.lista_relaciones= lista_relaciones; //Aristas
        this.lista_usuarios= lista_usuarios; //Vértices
        this.lista_aristas = lista_aristas;
    }

    /**
     * @return the num_vertices
     */
    public int getNum_vertices() {
        return num_vertices;
    }

    /**
     * @param num_vertices the num_vertices to set
     */
    public void setNum_vertices(int num_vertices) {
        this.num_vertices = num_vertices;
    }

    /**
     * @return the matriz
     */
    public int[][] getMatriz() {
        return matriz;
    }

    /**
     * @param matriz the matriz to set
     */
    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }
    
    public void agregar_arista(int inicio, int fin, int tiempo){
        matriz[inicio][fin]=tiempo;
        matriz[fin][inicio]=tiempo;
    }
    
    
    public void ImprimirGrafo() {
        System.out.println("Grafo: Matriz");
        for (int i = 0; i < num_vertices; i++) {
            for (int j = 0; j < num_vertices; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public ListaUsuarios getLista_usuarios() {
        return lista_usuarios;
    }

    public void setLista_usuarios(ListaUsuarios lista_usuarios) {
        this.lista_usuarios = lista_usuarios;
    }

    public ListaRelaciones getLista_relaciones() {
        return lista_relaciones;
    }

    public void setLista_relaciones(ListaRelaciones lista_relaciones) {
        this.lista_relaciones = lista_relaciones;
    }
    public ListaAristas getLista_aristas() {
        return lista_aristas;
    }

    public void setLista_aristas(ListaAristas lista_aristas) {
        this.lista_aristas = lista_aristas;
    }
    public int CantidadIslasBFS(){
        boolean array_visitado []=new boolean[num_vertices];
        boolean array_marcado[]= new boolean[num_vertices];
        int cantidad_islas=1;
        boolean flag=true;
        Cola cola= new  Cola();
        int primer_vertice=lista_usuarios.getPfirst().getPosicion();
        array_visitado[primer_vertice]=true;
        array_marcado[primer_vertice]=true;
        cola.Encolar(primer_vertice);
        
        while (flag==true) {            
            while (!cola.esta_vacia()) {            
            int valor= cola.Leer_cabeza();
            cola.Desencolar();
            array_visitado[valor]=true;
            for (int i = 0; i < num_vertices; i++) {
                if ((matriz[valor][i]>0) && (array_visitado[i]==false)) {
                    if (array_marcado[i]==false) {
                        cola.Encolar(i);
                        array_marcado[i]=true;
                    }
                    
                }
            }
        }
        if ((cola.esta_vacia()) && (Vertices_por_visitar(array_visitado))) {
            cantidad_islas=cantidad_islas+1;
            for (int i = 0; i < array_visitado.length; i++) {
                if (array_visitado[i]==false) {
                    cola.Encolar(i);
                    break;
            }
            }
        }
        else{
            flag=false;
        }
        
        }
        System.out.println("La cantidad de islas es: " + cantidad_islas);
        return cantidad_islas;
    }
    
    public boolean Vertices_por_visitar(boolean array_visitado[]){
        for (int i = 0; i < array_visitado.length; i++) {
            if (array_visitado[i]==false) {
                return true;
            }
        }
        return false;
    }
    
    public void CantidadIslasDFS(){
        
        boolean array_visitado []=new boolean[num_vertices];
        boolean array_marcado[]= new boolean[num_vertices];
        int cantidad_islas=1;
        boolean flag=true;
        Pila pila= new Pila();
        int primer_vertice=lista_usuarios.getPfirst().getPosicion();
        array_visitado[primer_vertice]=true;
        array_marcado[primer_vertice]=true;
        pila.Apilar(primer_vertice);
        
        while (flag==true) {            
            while (!pila.esta_vacia()) {            
            int valor= pila.getCima().getVertice();
            pila.Desapilar();
            array_visitado[valor]=true;
            for (int i = 0; i < num_vertices; i++) {
                if ((matriz[valor][i]>0) && (array_visitado[i]==false)) {
                    if (array_marcado[i]==false) {
                        pila.Apilar(i);
                        array_marcado[i]=true;
                    }
                    
                }
            }
        }
        if ((pila.esta_vacia()) && (Vertices_por_visitar(array_visitado))) {
            cantidad_islas=cantidad_islas+1;
            for (int i = 0; i < array_visitado.length; i++) {
                if (array_visitado[i]==false) {
                    pila.Apilar(i);
                    break;
            }
            }
        }
        else{
            flag=false;
        }
        
        }
        System.out.println("La cantidad de islas es: " + cantidad_islas);
        
    }
        
     public void buscadorExtremos(ListaUsuarios lista){
         NodoUsuario nodo = lista_usuarios.getPfirst();
         for (int i = 0; i < lista_usuarios.getSize(); i++) {
            int contador = 0;
            int id = nodo.getID();
            NodoUsuario nodo2 = nodo;
                if (nodo.getSiguiente()!=null) {
                  nodo = nodo.getSiguiente();
               }
            NodoRelaciones nodop = lista_relaciones.getPfirst();
            for (int k = 0; k < lista_relaciones.getSize(); k++) {
                int pos1 = nodop.getInicio();
                int pos2 = nodop.getFin();
                if (nodop.getSiguiente()!=null) {
                     nodop = nodop.getSiguiente();
                }
               
                if (id==pos1) {
                    contador+=1;
                }
                if(id==pos2){
                     contador+=1;
                }
               
                 }
            if (contador==1) {
                lista.agregarAlFinal(nodo2);


            
            }
            
            }
     }
            
     
    public void IdentificadorPuentes(JTextArea area){
        NodoUsuario persona = lista_usuarios.getPfirst();
        ListaUsuarios listapuente = new ListaUsuarios();
        for (int i = lista_usuarios.getPfirst().getPosicion(); i < lista_usuarios.getSize(); i++) {   
            if (CantidadIslasBFS()< CantidadIslasBFS2(i)) {
                NodoUsuario nodo = new NodoUsuario(persona.getID(), persona.getNombreDeUsuario(), i);
                listapuente.agregarAlFinal(nodo);
                persona = persona.getSiguiente();
                
            }else{
                if (persona.getSiguiente()!=null) {
                persona = persona.getSiguiente();
                }
            }

    }
        int contador=0;
        buscadorExtremos(listapuente);
        NodoUsuario personap = listapuente.getPfirst();
        for (int i = 0; i < listapuente.getSize(); i++) {
            String nombre1 = personap.getNombreDeUsuario();
            int id1 = personap.getID();
            NodoUsuario personap2 = listapuente.getPfirst();
            for (int j = 0; j < listapuente.getSize(); j++) {
            String nombre2 = personap2.getNombreDeUsuario();
            int id2 = personap2.getID();
                if (personap2.getSiguiente()!=null) {
                    personap2 = personap2.getSiguiente();
                }
            NodoRelaciones nodop = lista_relaciones.getPfirst();
            for (int k = 0; k < lista_relaciones.getSize(); k++) {
                int pos1 = nodop.getInicio();
                int pos2 = nodop.getFin();
                nodop = nodop.getSiguiente();
                if (pos1 == id1 & pos2==id2) {
                    contador +=1;
                    area.append(nombre1+" ----- "+nombre2+"\n");
                }
            }
            

                }
            if (personap.getSiguiente() !=null) {
            personap = personap.getSiguiente();
            }
        }
        String puentes = area.getText();
        area.setText("Hay " + contador+" Puentes:"+"\n");
        area.append(puentes);
 {
            
        }
}
     public int CantidadIslasBFS2(int j){
        boolean array_visitado []=new boolean[num_vertices];
        boolean array_marcado[]= new boolean[num_vertices];
        int cantidad_islas=1;
        boolean flag=true;
        Cola cola= new  Cola();
        int primer_vertice=0;
         if (lista_usuarios.getPfirst().getPosicion() == j) {
             primer_vertice=lista_usuarios.getPfirst().getSiguiente().getPosicion();
         }else{
            primer_vertice=lista_usuarios.getPfirst().getPosicion(); 
         }
        array_visitado[primer_vertice]=true;
        array_marcado[primer_vertice]=true;
        array_visitado[j]=true;
        array_marcado[j]=true;
        cola.Encolar(primer_vertice);
             
>>>>>>> 57966b04bfc00ec59c68eed8758ab82e2b505b79
        
        while (flag==true) {            
            while (!cola.esta_vacia()) {            
            int valor= cola.Leer_cabeza();
            cola.Desencolar();
            array_visitado[valor]=true;
            for (int i = 0; i < num_vertices; i++) {
                if ((matriz[valor][i]>0) && (array_visitado[i]==false)) {
                    if (array_marcado[i]==false) {
                        cola.Encolar(i);
                        array_marcado[i]=true;
                    }
                    
                }
            }
        }
        if ((cola.esta_vacia()) && (Vertices_por_visitar(array_visitado))) {
            cantidad_islas=cantidad_islas+1;
            for (int i = 0; i < array_visitado.length; i++) {
                if (array_visitado[i]==false) {
                    cola.Encolar(i);
                    break;
            }
            }
        }
        else{
            flag=false;
        }
        }
        return cantidad_islas;
    }
    
    

}
        


    

