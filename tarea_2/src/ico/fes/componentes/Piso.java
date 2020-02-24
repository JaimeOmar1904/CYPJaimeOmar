
package ico.fes.componentes;

/**
 *
 * @author celia
 */
public class Piso {
   private String modelo;
   private String marca;
   private String color;
   private String material;
   private double precio;

    public Piso() {
    }

    public Piso(String modelo, String marca, String color, String material, double precio) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.material = material;
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void limpieza(){
        System.out.println("Piso trapiado");
    }
}
