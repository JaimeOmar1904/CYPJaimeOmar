/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion_5;

import ico.fes.componentes.Procesador;
import ico.fes.equipo.Computadora;

/**
 *
 * @author usuario-08
 */
public class Sesion_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Computadora compu1=new Computadora();
        compu1.setCpu(new Procesador("i9", 6.3f));
        System.out.println(compu1.toString());
    }
    
}
