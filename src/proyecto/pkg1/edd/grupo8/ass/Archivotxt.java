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

    public void lectorString(String txt){
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
                                NodoUsuario usuario = new NodoUsuario(Integer.parseInt(SplitUsuario[0]),SplitUsuario[1]);
                            }
                            if (divisor.equals("Relaciones")){
                                String [] RelacionesSplit = txtSplit[i].split(",");
                                NodoRelaciones relacion = new NodoRelaciones(Integer.parseInt(RelacionesSplit[0]), Integer.parseInt(RelacionesSplit[1]), Integer.parseInt(RelacionesSplit[2]));                              

                        
                            }
                            
                        }
                        }
        }
    }
}
    