package ASCENSOR_FINAL;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        SistemaControl sistema = new SistemaControl();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== ASCENSOR ===");
            System.out.println("1. Llamar ascensor a un piso");
            System.out.println("2. Seleccionar piso desde ascensor");
            System.out.println("3. Ejecutar ciclo");
            System.out.println("4. Salir");

            int op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("En que piso se encuentra: ");
                    sistema.presionarBotonPiso(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Ingrese piso al que desea ir: ");
                    sistema.presionarBotonAscensor(sc.nextInt());
                    break;

                case 3:
                   sistema.ciclo();
                    break;
                case 4:
                    return;

                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}