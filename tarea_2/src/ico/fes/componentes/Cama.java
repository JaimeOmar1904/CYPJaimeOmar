
package ico.fes.componentes;

/**
 *
 * @author celia
 */
public class Cama {
    private  String modelo;
    private  String marca;
    private  double precio;
    private int numeroDeAlmohadas;
    private int numeroResortes;

    public Cama() {
    }

    public Cama(String modelo, String marca, double precio, int numeroDeAlmohadas, int numeroResortes) {
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
        this.numeroDeAlmohadas = numeroDeAlmohadas;
        this.numeroResortes = numeroResortes;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumeroDeAlmohadas() {
        return numeroDeAlmohadas;
    }

    public void setNumeroDeAlmohadas(int numeroDeAlmohadas) {
        this.numeroDeAlmohadas = numeroDeAlmohadas;
    }

    public int getNumeroResortes() {
        return numeroResortes;
    }

    public void setNumeroResortes(int numeroResortes) {
        this.numeroResortes = numeroResortes;
    }
    
    public void dormir(){
        System.out.println("Durmiendo en la casa");
    }
    
    
    
}
