/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1.edd.grupo8.ass;

/**
 *
 * @author gabriel
 */
public class NodoUsuario {
    private int ID;
    private Object nombreDeUsuario;

    public NodoUsuario(int ID, Object nombreDeUsuario) {
        this.ID = ID;
        this.nombreDeUsuario = nombreDeUsuario;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Object getNombreDeUsuario() {
        return nombreDeUsuario;
    }

    public void setNombreDeUsuario(Object nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }
    
    
    
}
