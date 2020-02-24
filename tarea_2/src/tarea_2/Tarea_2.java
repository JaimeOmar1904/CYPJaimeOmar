/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_2;

import ico.fes.componentes.Puerta;
import ico.fes.componentes.Sillon;
import ico.fes.vivienda.Casa;

/**
 *
 * @author celia
 */
public class Tarea_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Casa casa1=new Casa();
        casa1.setPuerta(new Puerta());
        System.out.println(casa1.toString());
       
       
    }
    
}
