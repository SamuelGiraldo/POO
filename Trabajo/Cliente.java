import java.util.Date;

public class Cliente {
    private String cedula;
    private String nombre;

    public Cliente(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cliente [Cédula=" + cedula + ", Nombre=" + nombre + "]";
    }
}


abstract class Producto {
    protected int numero;

    public Producto(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Producto [Número=" + numero + "]";
    }
}

class Impresion extends Producto {
    private String color;
    private Foto[] fotos;

    public Impresion(int numero, String color, Foto[] fotos) {
        super(numero);
        this.color = color;
        this.fotos = fotos;
    }

    public String getColor() {
        return color;
    }

    public Foto[] getFotos() {
        return fotos;
    }

    @Override
    public String toString() {
        return "Impresión [Número=" + numero + ", Color=" + color + ", Fotos=" + fotos.length + "]";
    }
}

class Camara extends Producto {
    private String marca;
    private String modelo;

    public Camara(int numero, String marca, String modelo) {
        super(numero);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Cámara [Número=" + numero + ", Marca=" + marca + ", Modelo=" + modelo + "]";
    }
}

class Foto {
    private String fichero;

    public Foto(String fichero) {
        this.fichero = fichero;
    }

    public String getFichero() {
        return fichero;
    }

    public void print() {
        System.out.println("Imprimiendo foto: " + fichero);
    }

    @Override
    public String toString() {
        return "Foto [Fichero=" + fichero + "]";
    }
}

// ========================
// Clase Pedido
// ========================
class Pedido {
    private Cliente cliente;
    private Producto[] productos;
    private Date fecha;
    private int numeroTarjetaCredito;

    public Pedido(Cliente cliente, Producto[] productos, Date fecha, int numeroTarjetaCredito) {
        this.cliente = cliente;
        this.productos = productos;
        this.fecha = fecha;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    public void mostrarPedido() {
        System.out.println("=== Pedido ===");
        System.out.println("Cliente: " + cliente);
        System.out.println("Fecha: " + fecha);
        System.out.println("Tarjeta: " + numeroTarjetaCredito);
        System.out.println("Productos:");
        for (Producto p : productos) {
            System.out.println("  - " + p);
        }
    }
}
