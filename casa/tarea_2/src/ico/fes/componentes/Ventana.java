/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.componentes;

/**
 *
 * @author celia
 */
public class Ventana {
    private String modelo;
    private String marca;
    private String color;
    private double precio;
    private int numeroDeSerie;

    public Ventana() {
    }

    public Ventana(String modelo, String marca, String color, double precio, int numeroDeSerie) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.precio = precio;
        this.numeroDeSerie = numeroDeSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(int numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }
    
    public void cerrar(){
        System.out.println("Cerrar la ventana");
    }
    
    public void seguridad(){
        System.out.println("la ventana tiene candado");
    }
}
