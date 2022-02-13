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
public class GrafoMatriz {
    private int num_vertices;
    private int [][] matriz;
    ListaUsuarios lista_usuarios;
    ListaRelaciones lista_relaciones;

    public GrafoMatriz() {
        this.num_vertices = num_vertices;
        this.matriz = new int[num_vertices][num_vertices];
        this.lista_relaciones= lista_relaciones; //Aristas
        this.lista_usuarios= lista_usuarios; //Vértices
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
    
    public void CantidadIslasBFS(){
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
            System.out.println("Vértice " + valor + "visitado");
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
            System.out.println("Vértice " + valor + "visitado");
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
        
        
        
        
    }
    

