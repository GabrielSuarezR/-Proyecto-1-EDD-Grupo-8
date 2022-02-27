/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1.edd.grupo8.ass;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.text.html.StyleSheet;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.view.Viewer;

/**
 * Clase grafo 
 * tiene las funciones para cargar el grafo, iterar sobre
 * el mismo y realizar modificaciones
 * @author johnd
 * @author gabriel
 * @author sebas
 */
public class GrafoMatriz {
    private int num_vertices;
    private int [][] matriz;
    private ListaUsuarios lista_usuarios;
    private ListaRelaciones lista_relaciones;
    private ListaAristas lista_aristas;
    
    /**
     * Constructor con 5 parametros
     * @param num_vertices numero de vertices 
     * @param matriz matriz de adyacencia
     * @param lista_usuarios lista de usuarios
     * @param lista_relaciones lista de relaciones
     * @param lista_aristas lista de aristas
     */
    public GrafoMatriz() {
        this.num_vertices = num_vertices;
        this.matriz = new int[num_vertices][num_vertices];
        this.lista_relaciones= lista_relaciones; //Aristas
        this.lista_usuarios= lista_usuarios; //Vértices
        this.lista_aristas = lista_aristas;
    }

    
    /**
     * getNum_vertices
     * obtiene el numero de vertices de la matriz
     * @return 
     * int: cantidad de vertices de la matriz
     */
    public int getNum_vertices() {
        return num_vertices;
    }

    /**
     * setNum_vertices
     * establece el numero de vertices de la matriz
     * @param num_vertices numero de vertices de la matriz
     * @return 
     */
    public void setNum_vertices(int num_vertices) {
        this.num_vertices = num_vertices;
    }

    /**
     * getMatriz
     * obtiene la matriz de adyacencia
     * @return 
     * int[][]: matriz de adyacencia
     */
    public int[][] getMatriz() {
        return matriz;
    }

    /**
     * setMatriz
     * establece la matriz de adyacencia
     * @param matriz matriz de adyacencia
     * @return 
     */
    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }
    /**
     * agregar_arista
     * agrega las aristas de la matriz de adyacencia
     * @param inicio primera arista de la matriz
     * @param fin ultima arista de la matriz
     * @param tiempo valor de la arista
     * @return 
     */
    public void agregar_arista(int inicio, int fin, int tiempo){
        matriz[inicio][fin]=tiempo;
        matriz[fin][inicio]=tiempo;
    }
    
    /**
     * ImprimirGrafo
     * imprime el grafo 
     * @return 
     */
    public void ImprimirGrafo() {
        System.out.println("Grafo: Matriz");
        for (int i = 0; i < num_vertices; i++) {
            for (int j = 0; j < num_vertices; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    /**
     * getLista_usuarios
     * obtiene lista que contiene a los usuarios
     * @return 
     * ListaUsuarios: lista de usuarios
     */
    public ListaUsuarios getLista_usuarios() {
        return lista_usuarios;
    }
    /**
     * setLista_usuarios
     * establece la lista que contiene a los usuarios 
     * @param lista_usuarios lista de usuarios
     * @return 
     */
    public void setLista_usuarios(ListaUsuarios lista_usuarios) {
        this.lista_usuarios = lista_usuarios;
    }
    /**
     * getLista_relaciones
     * obtiene lista que contiene las relaciones
     * @return 
     * ListaRelaciones: lista de relaciones
     */
    public ListaRelaciones getLista_relaciones() {
        return lista_relaciones;
    }
    
    /**
     * setLista_relaciones
     * establece la lista que contiene las relaciones 
     * @param lista_relaciones lista de relaciones
     * @return 
     */
    public void setLista_relaciones(ListaRelaciones lista_relaciones) {
        this.lista_relaciones = lista_relaciones;
    }
    /**
     * getLista_aristas
     * obtiene lista que contiene las aristas
     * @return 
     * ListaAristas: lista de aristas
     */
    public ListaAristas getLista_aristas() {
        return lista_aristas;
    }
    /**
     * setLista_aristas
     * establece la lista que contiene las aristas 
     * @param lista_aristas lista de aristas
     * @return 
     */
    public void setLista_aristas(ListaAristas lista_aristas) {
        this.lista_aristas = lista_aristas;
    }
    /**
     * CantidadIslasBFS 
     * Hace un recorrido de los puentes entre los nodos del 
     * grafo, para determinar a cantidad de islas que hay por un recorrido BFS
     * @return 
     * int: retorna la cantidad de islas por BFS
     */
    public Object[] CantidadIslasBFS(){
        boolean array_visitado []=new boolean[num_vertices];
        boolean array_marcado[]= new boolean[num_vertices];
        Object[] array_object = new Object[2];
        int cantidad_islas=1;
        boolean flag=true;
        Cola cola= new  Cola();
        int primer_vertice=lista_usuarios.getPfirst().getPosicion();
        array_visitado[primer_vertice]=true;
        array_marcado[primer_vertice]=true;
        cola.Encolar(primer_vertice);
        String recorrido ="Isla " + cantidad_islas + ": Usuarios " ;
        while (flag==true) {            
            while (!cola.esta_vacia()) {            
            int valor= cola.Leer_cabeza();
            cola.Desencolar();
            array_visitado[valor]=true;
            recorrido = recorrido + "--> " + lista_usuarios.BuscarNombreUsuario(valor).getNombreDeUsuario();
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
                    recorrido = recorrido + "\nIsla " + cantidad_islas + ": Usuarios ";
                    break;
            }
            }
        }
        else{
            flag=false;
        }
        
        }
        array_object[0] = cantidad_islas;
        array_object[1] = recorrido;
        return array_object;
    }
     /**
     * Vertices_por_visitar
     * descripcion
     * @param array_visitado
     * @return 
     * boolean true:
     * boolean false:
     */
    public boolean Vertices_por_visitar(boolean array_visitado[]){
        for (int i = 0; i < array_visitado.length; i++) {
            if (array_visitado[i]==false) {
                return true;
            }
        }
        return false;
    }
     /**
     * CantidadIslasDFS 
     * Hace un recorrido de los puentes entre los nodos del 
     * grafo, para determinar a cantidad de islas que hay por un recorrido DFS
     * @param area area de texto de la interfaz donde se imprime el resultado
     * * @return 
     * int: retorna la cantidad de islas por DFS
     */
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
        String recorrido ="Isla " + cantidad_islas + ": Usuarios " ;
        
        while (flag==true) {            
            while (!pila.esta_vacia()) {            
            int valor= pila.getCima().getVertice();
            pila.Desapilar();
            array_visitado[valor]=true;
            recorrido = recorrido + "--> " + lista_usuarios.BuscarNombreUsuario(valor).getNombreDeUsuario();
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
            area.append(recorrido);
            cantidad_islas=cantidad_islas+1;
           
            for (int i = 0; i < array_visitado.length; i++) {
                
                if (array_visitado[i]==false) {
                    pila.Apilar(i);
                    recorrido = "\nIsla " + cantidad_islas + ": Usuarios ";
                    break;
            }
            }
        }
        else{
            flag=false;
        }
        
        }
        
        area.append(recorrido + "\n" + "La cantidad de islas por DFS es: " + cantidad_islas+"\n");
        
    }
    /**
     * IndentificadorPuentes 
     * itera sobre la lista de aristas en la matriz, 
     * buscando las relaciones entre usuarios, y llama nuevamente a una funcion
     * de recorrido por BFS para determinar que usuarios son puentes.
     * @param area area de texto de la interfaz donde se imprime el resultado
     * @return 
     */
    public void IdentificadorPuentes(JTextArea area){
        area.setText("");
        NodoGeneral arista = lista_aristas.getPfirst();
        int contador = 0;
        for (int i = 0; i < lista_aristas.getSize(); i++) {
            int pos1 = arista.getInicio();
            int pos2 = arista.getFin();
            arista = arista.getSiguiente();
            if ((int) CantidadIslasBFS()[0]< CantidadIslasBFS2(pos1,pos2)) {
                NodoGeneral persona = lista_usuarios.getPfirst();
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
    /**
     * CantidadIslasBFS2 
     * es la misma funcion que el recorrido BFS pero se le
     * pasan 2 parametros de posicion de aristas, los cuales indicaran, que 
     * puente no recorrer, y si al no recorrer dicho puente se forma una isla de 
     * mas, quiere decir que dichas relacion es un puente.
     * @param pos1 primera posicion de la relacion
     * @param pos2 segunda posicion de la relacion
     * @return 
     * int: retorna un entero con la cantidad de islas
     */
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
    
    
    /**
     * EliminarNodo 
     * utiliza un id para iterar sobre las listas de usuarios y 
     * relaciones, buscando que exista dicho usuario e eliminando su informacion
     * y sus todas sus relaciones con los demas ususarios
     * @param id un numero de id introducido por el susuario para eliminar
     * @return 
     */
 public void eliminarNodo(int id){
     if (lista_usuarios.estaVacia()) {
         JOptionPane.showMessageDialog(null, "No se puede eliminar ya que el grafo ya se encuentra vacío ");
         return;
     }
     NodoGeneral elimusuario = lista_usuarios.getPfirst();
     NodoGeneral anterior = lista_usuarios.getPfirst();
     boolean eliminado = false;
     boolean encontrado = false;
        for (int i = 0; i < lista_usuarios.getSize(); i++) {
            if (elimusuario.getID() == id) {
                encontrado = true;
                NodoGeneral aux =elimusuario.getSiguiente();
                if (i==0) {
                    lista_usuarios.setPfirst(aux);
                    lista_usuarios.setSize(lista_usuarios.getSize()-1);
                    eliminado=true;
                }
                else{
                    if (aux == null) {
                        anterior.setSiguiente(null);
                        lista_usuarios.setPlast(anterior);
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
            if (eliminado==true & elimusuario!=null) {
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
        NodoGeneral elimrelacion = lista_relaciones.getPfirst();
        NodoGeneral ant = lista_relaciones.getPfirst();
        lista_aristas.setPfirst(null);
        lista_aristas.setPlast(null);
        lista_aristas.vaciar();
        int nodoelim =0;
        for (int i = 0; i < lista_relaciones.getSize(); i++) {
            int si = 0;
          if (elimrelacion.getInicio() == id | elimrelacion.getFin() == id) {
                NodoGeneral aux =elimrelacion.getSiguiente();
                if (elimrelacion == lista_relaciones.getPfirst()) {
                    lista_relaciones.setPfirst(aux);
                    elimrelacion = lista_relaciones.getPfirst();
                    ant = lista_relaciones.getPfirst();
                    nodoelim +=1;
                    si +=1;
                }else{
                    if (aux == null) {
                        ant.setSiguiente(null);
                        lista_relaciones.setPlast(ant);
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
                NodoGeneral comp = lista_relaciones.getPfirst();
            if (elimrelacion != comp) {
                ant = ant.getSiguiente();
            }
            elimrelacion = elimrelacion.getSiguiente(); 

            }
            }
     }
        lista_relaciones.setSize(lista_relaciones.getSize()-nodoelim);
        NodoGeneral rela = lista_relaciones.getPfirst();
        for (int i = 0; i < lista_relaciones.getSize(); i++) {
         NodoGeneral arista = new NodoGeneral(lista_usuarios.BuscarPosicion(rela.getInicio()), lista_usuarios.BuscarPosicion(rela.getFin()));
         lista_aristas.agregarAlFinal(arista);
         rela = rela.getSiguiente();
     }
        if (encontrado==false) {
              JOptionPane.showMessageDialog(null, "El ID indicado no existe");
     }else{
            JOptionPane.showMessageDialog(null, "Eliminado exitosamente");
        }
    }
    /**
     * mostrarGrafo 
     * muestra una representacion grafica del grafo
     * @return 
     */
    public void mostrarGrafo(){
        System.setProperty("org.graphstream.ui", "swing");
        Graph graph = new SingleGraph("Grafo");
        
        NodoGeneral auxUsuario = lista_usuarios.getPfirst();
        NodoGeneral auxRelaciones = lista_relaciones.getPfirst();
        
        for (int i = 0; i < lista_usuarios.getSize(); i++) {
            String usuarioId = Integer.toString(auxUsuario.getID());
            String usuarioName = auxUsuario.getNombreDeUsuario();
            Node addNode = graph.addNode(usuarioId);
            addNode.setAttribute("ui.label", usuarioName);
            auxUsuario = auxUsuario.getSiguiente();

        }
        try {
            for (int i = 0; i < lista_relaciones.getSize(); i++) {
            String tiempo = Integer.toString(auxRelaciones.getTiempo());
            String usuario1 = Integer.toString(auxRelaciones.getInicio());
            String usuario2 = Integer.toString(auxRelaciones.getFin());
            Edge addEdge = graph.addEdge(tiempo+usuario1+usuario2,usuario1 ,usuario2 );
            addEdge.setAttribute("ui.label", tiempo);
            auxRelaciones = auxRelaciones.getSiguiente();
        }
        graph.setAttribute("ui.stylesheet", "graph { fill-color: orange; }");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El grafo no es representable debido a la sobrescripción de una arista");
            return;
        }
 
        
          
        Viewer viewer = graph.display();
        viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);
        
        
    }
       
    }

        


    

