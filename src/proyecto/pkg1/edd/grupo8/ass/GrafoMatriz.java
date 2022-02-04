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

    public GrafoMatriz(int num_vertices) {
        this.num_vertices = num_vertices;
        this.matriz = new int[num_vertices][num_vertices];
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
    
    
    
}
