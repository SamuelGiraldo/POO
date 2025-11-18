package h;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Elevador elevador = new Elevador(0, 10);
        Scanner scan = new Scanner(System.in);

        System.out.println("=== SISTEMA DE ELEVADOR ===");

        while (true) {
            System.out.println("\nPiso actual: " + elevador.getPisoActual());
            System.out.println("1. Ir a un piso");
            System.out.println("2. Abrir puerta");
            System.out.println("3. Cerrar puerta");
            System.out.println("4. Salir");
            System.out.print("Opción: ");

            int opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese piso destino: ");
                    int destino = scan.nextInt();
                    elevador.irA(destino);
                    break;

                case 2:
                    elevador.abrirPuerta();
                    break;

                case 3:
                    elevador.cerrarPuerta();
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    return;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}