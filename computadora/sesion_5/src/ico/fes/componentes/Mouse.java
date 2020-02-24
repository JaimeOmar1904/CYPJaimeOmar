
package ico.fes.componentes;

/**
 *
 * @author usuario-08
 */
public class Mouse {
    private String marca;
    private int numero;

    public Mouse() {
    }

    public Mouse(String marca, int numero) {
        this.marca = marca;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void seleccionar(int x , int y){
        System.out.println("Click en:"+ x + "," + y);
    }
}
