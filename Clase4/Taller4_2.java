import java.util.Scanner;
public class Taller4_2 {
    public static void main(String[] args) {
        /*4.2)
         *Requerimiento:Si el primer número introducido es mayor que el segundo número, 
         *el programa debe imprimir el mensaje "El primer número es el mayor", 
         *en caso contrario el programa debe imprimir el mensaje "El primer número es el más pequeño",
         *Considere el caso de que ambos números sean iguales e imprima el correspondiente mensaje.
         * 
         * Entrada: Dos números
         * Proceso: Validar cual de los dos números es mayor, menor o si son iguales
         * Salida: Imprimir el mensaje
         */
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double  num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        double  num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("El primer número es el mayor.");
        } else if (num1 < num2) {
            System.out.println("El primer número es el más pequeño.");
        } else {
            System.out.println("Los dos números son iguales.");
        }
    }
}