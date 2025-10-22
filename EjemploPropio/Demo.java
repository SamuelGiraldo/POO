public class Demo {
    public static void main(String[] args) {

        Elevador e1 = new Elevadordepasajeros();
        Elevador e2 = new Elevadordecarga();

        e1.mover(3);
        e2.mover(1);

        System.out.println("\nEstado de los elevadores:");
        e1.informacion();
        e2.informacion();
    }
}