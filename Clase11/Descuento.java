public class Descuento {
    public static void main(String[] args) {
        Producto p = new Producto("A123", "Camiseta", 2, 30000);
        p.aplicarDescuento(10);
        p.incrementarCantidad(1);

        System.out.println(p.toString());
        System.out.println("Subtotal final: " + p.calcularSubtotal());
    }
}