/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1.edd.grupo8.ass;

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

    public void lectorString(String txt, ListaUsuarios lista_usuarios,ListaRelaciones lista_relaciones){
        if (!"".equals(txt) && !txt.isEmpty()){
                    String[] txtSplit = txt.split("\n");
                    int corte =0;
                    String divisor ="";
                    for (int i = 0; i < txtSplit.length; i++){
                        if(!txtSplit[i].contains(",") && !txtSplit[i].isEmpty()){
                            divisor = txtSplit[i];
                        }else{
                            if (divisor.equals("Usuarios")){
                                String [] SplitUsuario = txtSplit[i].split(",");
                                NodoUsuario usuario = new NodoUsuario(Integer.parseInt(SplitUsuario[0]),SplitUsuario[1], numero_posicion++);
                                lista_usuarios.agregarAlFinal(usuario);
                            }
                            if (divisor.equals("Relaciones")){
                                String [] RelacionesSplit = txtSplit[i].split(",");
                                RelacionesSplit[1]= RelacionesSplit[1].replace(" ", "");
                                RelacionesSplit[2]= RelacionesSplit[2].replace(" ", "");
                                NodoRelaciones relacion = new NodoRelaciones(Integer.parseInt(RelacionesSplit[0]),Integer.parseInt(RelacionesSplit[1]), Integer.parseInt(RelacionesSplit[2])); 
                                lista_relaciones.agregarAlFinal(relacion);

                            }
                            
                        }
                        }
        }
    }
    public void mostrarMatrizGrafo(ListaUsuarios lista_usuarios,ListaRelaciones lista_relaciones){
        GrafoMatriz grafo= new GrafoMatriz(lista_usuarios.getSize());
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
    }
    public void guardarArchivo(JTextArea area){
        try
        {
         String nombre= "";
         JFileChooser file=new JFileChooser();
         file.showSaveDialog(null);
         File guarda =file.getSelectedFile();
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
         catch(IOException ex)
         {
          JOptionPane.showMessageDialog(null,
               "Su archivo no se ha guardado",
                  "Advertencia",JOptionPane.WARNING_MESSAGE);
         }
        
    }
}
