/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1.edd.grupo8.ass;

import java.awt.geom.Area;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author gabriel
 */

public class Archivotxt {
    int numero_posicion=0;
    ListaUsuarios lista_usuarios= new ListaUsuarios();
    ListaRelaciones lista_relaciones= new ListaRelaciones();
    ListaAristas aristas = new ListaAristas();
     public String abrirArchivo(){
        String aux="";   
        String texto="";
        try
        {

         JFileChooser file=new JFileChooser();
         file.showOpenDialog(null);

         File abre=file.getSelectedFile();


         if(abre!=null)
         {     
            FileReader archivos=new FileReader(abre);
            BufferedReader lee=new BufferedReader(archivos);
            while((aux=lee.readLine())!=null)
            {
               texto+= aux+ "\n";
            }

            if (!"".equals(texto) && !texto.isEmpty()){

                String[] txt_split= texto.split("\n");
                for (int i = 0; i < txt_split.length; i++) {
                    if(!txt_split[i].contains(",") && !txt_split[i].isEmpty()){

                    }

                }  
            } 
               lee.close();      
          }
         }
         catch(IOException ex)
         {
           JOptionPane.showMessageDialog(null,ex+"" +
                 "\nNo se ha encontrado el archivo",
                       "ADVERTENCIA!!!",JOptionPane.WARNING_MESSAGE);
          } 
        return texto;
        
        }  

    public void lectorString(String txt, ListaUsuarios lista_usuarios,ListaRelaciones lista_relaciones,ListaAristas aristas){
        try {
        if (!"".equals(txt) && !txt.isEmpty()){
                    String error1 = "Error";
                    String[] txtSplit = txt.split("\n");
                    String divisor ="";
                    for (int i = 0; i < txtSplit.length; i++){
                        String error0 = "Error";
                        if(!txtSplit[i].contains(",") && !txtSplit[i].isEmpty()){
                            divisor = txtSplit[i];
                        }else{
                            if (divisor.equals("Usuarios")){
                                String [] SplitUsuario = txtSplit[i].split(",");
                                SplitUsuario[1]=SplitUsuario[1].replace(" ", "");
                                NodoUsuario usuario = new NodoUsuario(Integer.parseInt(SplitUsuario[0]),SplitUsuario[1], numero_posicion++);
                                lista_usuarios.agregarAlFinal(usuario);
                                error1 = "1";
                                error0 = "0";
                            }
                            if (divisor.equals("Relaciones")){
                                String [] RelacionesSplit = txtSplit[i].split(",");
                                RelacionesSplit[1]= RelacionesSplit[1].replace(" ", "");
                                RelacionesSplit[2]= RelacionesSplit[2].replace(" ", "");
                                NodoRelaciones relacion = new NodoRelaciones(Integer.parseInt(RelacionesSplit[0]),Integer.parseInt(RelacionesSplit[1]), Integer.parseInt(RelacionesSplit[2])); 
                                lista_relaciones.agregarAlFinal(relacion);
                                NodoArista nodoa = new NodoArista(lista_usuarios.BuscarPosicion(Integer.parseInt(RelacionesSplit[0])),lista_usuarios.BuscarPosicion(Integer.parseInt(RelacionesSplit[1])));
                                aristas.agregarAlFinal(nodoa);
                                error1 = "2";
                                error0 = "0";

                            }else{
                                int comprobante0 = Integer.parseInt(error0);
                               
                            }

                            
                        }
                        }
                    int comprobante1 = Integer.parseInt(error1);
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "el archivo de texto no es valido");
        }
         
    }
    public GrafoMatriz cargarMatrizGrafo(ListaUsuarios lista_usuarios,ListaRelaciones lista_relaciones, ListaAristas aristas){
        GrafoMatriz grafo= new GrafoMatriz();
        grafo.setNum_vertices(lista_usuarios.getSize());
        int matriz [][]= new int[lista_usuarios.getSize()][lista_usuarios.getSize()];
        grafo.setMatriz(matriz);
        grafo.setLista_usuarios(lista_usuarios);
        grafo.setLista_relaciones(lista_relaciones);
        grafo.setLista_aristas(aristas);
      NodoRelaciones aux= lista_relaciones.getPfirst();
        for (int i = 0; i < lista_relaciones.getSize(); i++) {
            int posicion_1=0;
            int posicion_2=0;
            System.out.println(aux.getInicio());
            posicion_1= lista_usuarios.BuscarPosicion(aux.getInicio());
            posicion_2= lista_usuarios.BuscarPosicion(aux.getFin());
            grafo.agregar_arista(posicion_1, posicion_2, aux.getTiempo());
            aux=aux.getSiguiente();
        }
       grafo.ImprimirGrafo();
        return grafo;
    }
    public void guardarArchivo(JTextArea area){
        try
        {
         String nombre= "";
         JFileChooser file=new JFileChooser();
         file.showSaveDialog(null);
         File guarda =file.getSelectedFile();
            if (guarda!=null) {
         nombre = guarda.getName();
         String [] identificador = nombre.split("\\.(?=[^\\.]+$)");
         if (identificador.length == 1){
            if(guarda !=null){
               FileWriter  save=new FileWriter(guarda+".txt");
               save.write(area.getText());
               save.close();
               JOptionPane.showMessageDialog(null,
                    "El archivo se a guardado Exitosamente",
                        "Información",JOptionPane.INFORMATION_MESSAGE);
            }
                 }else if (guarda !=null){
              FileWriter  save=new FileWriter(guarda);
            save.write(area.getText());
            save.close();
            JOptionPane.showMessageDialog(null,
                 "El archivo se a guardado Exitosamente",
                     "Información",JOptionPane.INFORMATION_MESSAGE);
            
         
         }
            }
        }
         catch(IOException ex)
         {
          JOptionPane.showMessageDialog(null,
               "Su archivo no se ha guardado",
                  "Advertencia",JOptionPane.WARNING_MESSAGE);
         }
        
    }
}
