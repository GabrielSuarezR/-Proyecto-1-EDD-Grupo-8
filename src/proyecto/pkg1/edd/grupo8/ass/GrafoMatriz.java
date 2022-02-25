/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1.edd.grupo8.ass;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.view.Viewer;

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
    
    public void CantidadIslasDFS(JTextArea area){
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
        
        area.append("La cantidad de islas por DFS es: " + cantidad_islas+"\n");
        
    }
 
    public void IdentificadorPuentes(JTextArea area){
        area.setText("");
        NodoArista arista = lista_aristas.getPfirst();
        int contador = 0;
        for (int i = 0; i < lista_aristas.getSize(); i++) {
            int pos1 = arista.getInicio();
            int pos2 = arista.getFin();
            arista = arista.getSiguiente();
            if (CantidadIslasBFS()< CantidadIslasBFS2(pos1,pos2)) {
                NodoUsuario persona = lista_usuarios.getPfirst();
                 String persona1="";
                 String persona2="";
                 contador +=1;
                for (int j = 0; j < lista_usuarios.getSize(); j++) {
                    if (pos1==j) {
                        persona1 = persona.getNombreDeUsuario();
                    }
                    if (pos2==j) {
                        persona2 = persona.getNombreDeUsuario();
                        persona=persona.getSiguiente();
                    }else{
                    persona = persona.getSiguiente();
                }
                }
                area.append(persona1+"-----"+persona2+"\n");
           
            }
                
        }
        String texto = area.getText();
        area.setText("Hay "+contador+" Puentes:"+"\n");
        area.append(texto);
}
     public int CantidadIslasBFS2(int pos1, int pos2){
        boolean array_visitado []=new boolean[num_vertices];
        boolean array_marcado[]= new boolean[num_vertices];
        int cantidad_islas=1;
        boolean flag=true;
        Cola cola= new  Cola();
        int primer_vertice=0;
        primer_vertice=lista_usuarios.getPfirst().getPosicion(); 
        array_visitado[primer_vertice]=true;
        array_marcado[primer_vertice]=true;
        cola.Encolar(primer_vertice);

             


        int tiempoaux = matriz[pos1][pos2];
        matriz[pos1][pos2]=0;
        matriz[pos2][pos1]=0;     

        
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
        matriz[pos1][pos2]=tiempoaux;
        matriz[pos2][pos1]=tiempoaux;
        return cantidad_islas;
    }
    
    
    
 public void eliminarNodo(int id){
     if (lista_usuarios.estaVacia()) {
         JOptionPane.showMessageDialog(null, "No se puede eliminar ya que el grafo ya se encuentra vacío ");
         return;
     }
     NodoUsuario elimusuario = lista_usuarios.getPfirst();
     NodoUsuario anterior = lista_usuarios.getPfirst();
     boolean eliminado = false;
     boolean encontrado = false;
        for (int i = 0; i < lista_usuarios.getSize(); i++) {
            if (elimusuario.getID() == id) {
                encontrado = true;
                NodoUsuario aux =elimusuario.getSiguiente();
                if (i==0) {
                    lista_usuarios.setPfirst(aux);
                    lista_usuarios.setSize(lista_usuarios.getSize()-1);
                    eliminado=true;
                }else{
                    if (aux == null) {
                        anterior.setSiguiente(null);
                        lista_usuarios.setSize(lista_usuarios.getSize()-1);
                        eliminado=true;
                    }else{
                    anterior.setSiguiente(aux);
                    lista_usuarios.setSize(lista_usuarios.getSize()-1);
                        eliminado=true;
                    }
                }
            }
            elimusuario = elimusuario.getSiguiente();
            if (eliminado==true) {
                if (lista_usuarios.getSize()!=0) {
                    elimusuario.setPosicion(elimusuario.getPosicion()-1);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Se ha eliminado al último usuario del grafo");
                   
                }
                
            }
            if (i>0) {
                anterior = anterior.getSiguiente();
            }
     }
        NodoRelaciones elimrelacion = lista_relaciones.getPfirst();
        NodoRelaciones ant = lista_relaciones.getPfirst();
        lista_aristas.setPfirst(null);
        lista_aristas.setPlast(null);
        lista_aristas.vaciar();
        int nodoelim =0;
        for (int i = 0; i < lista_relaciones.getSize(); i++) {
            int si = 0;
          if (elimrelacion.getInicio() == id | elimrelacion.getFin() == id) {
                NodoRelaciones aux =elimrelacion.getSiguiente();
                if (elimrelacion == lista_relaciones.getPfirst()) {
                    lista_relaciones.setPfirst(aux);
                    elimrelacion = lista_relaciones.getPfirst();
                    ant = lista_relaciones.getPfirst();
                    nodoelim +=1;
                    si +=1;
                }else{
                    if (aux == null) {
                        ant.setSiguiente(null);
                        nodoelim +=1;
                    }else{
                    ant.setSiguiente(aux);
                    si+=1;
                    elimrelacion = elimrelacion.getSiguiente(); 
                    nodoelim +=1;
                }
                }
            }
            if (si == 0) {
                
            if (elimrelacion!=null) {
                NodoRelaciones comp = lista_relaciones.getPfirst();
            if (elimrelacion != comp) {
                ant = ant.getSiguiente();
            }
            elimrelacion = elimrelacion.getSiguiente(); 

            }
            }
     }
        lista_relaciones.setSize(lista_relaciones.getSize()-nodoelim);
        NodoRelaciones rela = lista_relaciones.getPfirst();
        for (int i = 0; i < lista_relaciones.getSize(); i++) {
         NodoArista arista = new NodoArista(lista_usuarios.BuscarPosicion(rela.getInicio()), lista_usuarios.BuscarPosicion(rela.getFin()));
         lista_aristas.agregarAlFinal(arista);
         rela = rela.getSiguiente();
     }
        if (encontrado==false) {
              JOptionPane.showMessageDialog(null, "El ID indicado no existe");
     }else{
            JOptionPane.showMessageDialog(null, "eliminado exitosamente");
        }
    }
 
    public void mostrarGrafo(){
        System.setProperty("org.graphstream.ui", "swing");
        Graph graph = new SingleGraph("Grafo");
        
        NodoUsuario auxUsuario = lista_usuarios.getPfirst();
        NodoRelaciones auxRelaciones = lista_relaciones.getPfirst();
        
        for (int i = 0; i < lista_usuarios.getSize(); i++) {
            String usuarioId = Integer.toString(auxUsuario.getID());
            String usuarioName = auxUsuario.getNombreDeUsuario();
            Node addNode = graph.addNode(usuarioId);
            addNode.setAttribute("ui.label", usuarioName);
            auxUsuario = auxUsuario.getSiguiente();
            

        }
         
        for (int i = 0; i < lista_relaciones.getSize(); i++) {
            String tiempo = Integer.toString(auxRelaciones.getTiempo());
            String usuario1 = Integer.toString(auxRelaciones.getInicio());
            String usuario2 = Integer.toString(auxRelaciones.getFin());
            Edge addEdge = graph.addEdge(tiempo+usuario1+usuario2,usuario1 ,usuario2 );
            addEdge.setAttribute("ui.label", tiempo);
            auxRelaciones = auxRelaciones.getSiguiente();

        }
        
        Viewer viewer = graph.display();
        viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);
        
        
    }
    }

        


    

