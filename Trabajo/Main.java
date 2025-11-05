import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("1105371292", "Samuel Giraldo");

        Foto[] fotos = { new Foto("foto1.jpg"), new Foto("foto2.jpg") };
        Producto imp = new Impresion(1, "Color", fotos);
        Producto cam = new Camara(2, "Sony", "(A7 III");

        Producto[] lista = { imp, cam };

        Pedido pedido = new Pedido(c1, lista, new Date(), 20746925);
        pedido.mostrarPedido();
    }
}