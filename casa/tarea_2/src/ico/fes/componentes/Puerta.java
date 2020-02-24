
package ico.fes.componentes;

/**
 *
 * @author celia
 */
public class Puerta {
    private  String modelo;
    private  String marca;
    private  String color;
    private  int numeroDeSerie;

    public Puerta() {
    }

    public Puerta(String modelo, String marca, String color, int numeroDeSerie) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
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

    public int getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(int numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }
    
    public void abrir(){
        System.out.println("Puedes entrar a casa");
    }
    
    public void cerrar(){
        System.out.println("Puedes estar seguro");
    }
}
