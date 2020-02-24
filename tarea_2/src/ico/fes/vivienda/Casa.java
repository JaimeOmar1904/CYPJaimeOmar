/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.vivienda;

import ico.fes.componentes.Cama;
import ico.fes.componentes.Piso;
import ico.fes.componentes.Puerta;
import ico.fes.componentes.Sillon;
import ico.fes.componentes.Ventana;

/**
 *
 * @author celia
 */
public class Casa {

    private int numeroCuartos;
    private int numeroBaños;
    private Puerta puerta;
    private Ventana ventana;
    private Piso piso;
    private Sillon sillon;
    private Cama cama;

    public Casa() {
    }

    public Casa(int numeroCuartos, int numeroBaños, Puerta puerta, Ventana ventana, Piso piso, Sillon sillon, Cama cama) {
        this.numeroCuartos = numeroCuartos;
        this.numeroBaños = numeroBaños;
        this.puerta = puerta;
        this.ventana = ventana;
        this.piso = piso;
        this.sillon = sillon;
        this.cama = cama;
    }

    public int getNumeroCuartos() {
        return numeroCuartos;
    }

    public void setNumeroCuartos(int numeroCuartos) {
        this.numeroCuartos = numeroCuartos;
    }

    public int getNumeroBaños() {
        return numeroBaños;
    }

    public void setNumeroBaños(int numeroBaños) {
        this.numeroBaños = numeroBaños;
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }

    public Ventana getVentana() {
        return ventana;
    }

    public void setVentana(Ventana ventana) {
        this.ventana = ventana;
    }

    public Piso getPiso() {
        return piso;
    }

    public void setPiso(Piso piso) {
        this.piso = piso;
    }

    public Sillon getSillon() {
        return sillon;
    }

    public void setSillon(Sillon sillon) {
        this.sillon = sillon;
    }

    public Cama getCama() {
        return cama;
    }

    public void setCama(Cama cama) {
        this.cama = cama;
    }

    public void refugio() {
        System.out.println("La casa es protección");
    }

    @Override
    public String toString(){
        String data = "Cama:"+ cama;
        data = data + "\nVentana:"+ ventana;
        data = data + "\nPuerta:" + puerta.getMarca();
        return data;
    }

}
