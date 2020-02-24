
package ico.fes.componentes;

/**
 *
 * @author celia
 */
public class Sillon {
    private String modelo;
    private String marca;
    private String color;
    private double precio;

    public Sillon() {
    }

    public Sillon(String modelo, String marca, String color, double precio) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.precio = precio;
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
    
    public void sentarse(){
        System.out.println("Sentarse despues de trabajar");
    }
    
    public void descansar(){
        System.out.println("Recuperar energias");
    }
}
