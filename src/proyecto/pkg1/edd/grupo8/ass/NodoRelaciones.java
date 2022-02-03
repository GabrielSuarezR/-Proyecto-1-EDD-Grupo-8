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
public class NodoRelaciones {
    private int Id1;
    private int Id2;
    private int tiempo;

    public NodoRelaciones(int Id1, int Id2, int tiempo) {
        this.Id1 = Id1;
        this.Id2 = Id2;
        this.tiempo = tiempo;
    }

    public int getId1() {
        return Id1;
    }

    public void setId1(int Id1) {
        this.Id1 = Id1;
    }

    public int getId2() {
        return Id2;
    }

    public void setId2(int Id2) {
        this.Id2 = Id2;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
    
    
}
