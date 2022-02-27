/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1.edd.grupo8.ass;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

/**
 * Clase Funciones
 * contiene diversas funciones usadas en el programa
 * @author johnd
 */
public class Funciones {
    /**
     * Constructor
     */
    public Funciones() {
    }
    
    /**
     * Validar_Nombre_Usuario
     * verifica si el nombre de usuario introducido es valido
     * @param usuario
     * @return 
     * boolean true: el nombre de usuario introducido es valido
     * booolean false: el nombre de usuario introducido es invalido
     */
    public boolean Validar_Nombre_Usuario(String usuario){
        
            if ((usuario.contains("@")) || (usuario.contains(",")) || (usuario.isBlank()) || (usuario.isEmpty())) {
                JOptionPane.showMessageDialog(null, "El usuario no puede contener arrobas (@) ni comas (,) o estar vacío");
                return false;
            }
            return true;
        
    }
    
    /**
     * Validar_ID
     * verifica si el id del usuario introducido es valido
     * @param id
     * @return 
     * boolean true: el id del usuario introducido es valido
     * booolean false: el id del usuario introducido es invalido
     */
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
    /**
     * Validar_tiempo
     * verifica si el tiempo de relacion introducido es valido
     * @param tiempo
     * @return 
     * boolean true: el tiempo de relacion introducido es valido
     * booolean false: el tiempo de relacion introducido es invalido
     */    
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
    
    /**
     * validarArchivo
     * verifica si archivo Txt cargado al programa es valido
     * @param divisor
     * @return 
     * boolean true: el archivo Txt cargado al programa es valido
     * booolean false: el archivo Txt cargado al programa es invalido
     */  
    public boolean validarArchivo(String divisor){
        try {
            if(divisor!= "Usuarios" || divisor!="Relaciones"){
            JOptionPane.showMessageDialog(null,"el archivo no puede ser cargado \n asegurese que es el archivo correcto o que los datos esten ordenados");
            return false;
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"el archivo no puede ser cargado \n asegurese que es el archivo correcto o que los datos esten ordenados");
            return false;
        }
        return true;
    }
}
