/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1.edd.grupo8.ass;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

/**
 *
 * @author johnd
 */
public class Funciones {

    public Funciones() {
    }
    
    public boolean Validar_Nombre_Usuario(String usuario){
        
            if ((usuario.contains("@")) || (usuario.contains(",")) || (usuario.isBlank()) || (usuario.isEmpty()) ) {
                JOptionPane.showMessageDialog(null, "El usuario no puede contener arrobas (@) ni comas (,) o estar vacío");
                return false;
            }
            return true;
        
    }
    
    public boolean Validar_ID(String id){
        try {
            int valor= Integer.parseInt(id);
            if (id.length()!=3  || id.isBlank() || id.isEmpty()) {
                JOptionPane.showMessageDialog(null, "El ID del usuario no puede contener letras, distinto a 3 digitos o estar vacío");
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El ID del usuario no puede contener letras, distinto a 3 digitos o estar vacío");
            return false;
        }
        return true;
    }
    
    public boolean Validar_tiempo(String tiempo){
        try {
            int valor= Integer.parseInt(tiempo);
            if (valor <= 0 || tiempo.isBlank() || tiempo.isEmpty()) {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    public boolean validarArchivo(String divisor){
        try {
            if(divisor!= "Usuarios" || divisor!="Relaciones"){
            JOptionPane.showMessageDialog(null,"el archivo no pede ser cargado \n asgurese que es el archivo correcto o que los datos esten ordenados");
            return false;
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"el archivo no pede ser cargado \n asgurese que es el archivo correcto o que los datos esten ordenados");
            return false;
        }
        return true;
    }
}
