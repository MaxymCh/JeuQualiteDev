/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package urbanmarginal;

import controleur.Controle;

/**
 *
 * @author Administrateur
 */
public class UrbanMarginal {

    /**
     * @param args the command line arguments
     */
    private static Controle ctrl;
    
    public static void main(String[] args) {
        
        ctrl = new Controle();
    }

    public static Controle getCtrl() {
        return ctrl;
    }

    public static void setCtrl(Controle ctrl) {
        UrbanMarginal.ctrl = ctrl;
    }
}
