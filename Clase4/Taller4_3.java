import java.util.Scanner;
public class Taller4_3 {
    public static void main(String[] args) {
        /*4.3)
         *Requerimiento:Despues de que el usuario introduzca tres números,
         *deducir cual es el numero central
         * 
         * Entrada: Tres números
         * Proceso: Validar cual de los tres números es el central
         * Salida: Imprimir el número central
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        double num2 = sc.nextInt();

         System.out.print("Ingrese el tercer número: ");
        double num3 = sc.nextInt();
        if ((num1 >= num2 && num1 <= num3) || (num1 <= num2 && num1 >= num3)) {
            System.out.println("El número central es: " + num1);
        } else if ((num2 >= num1 && num2 <= num3) || (num2 <= num1 && num2 >= num3)) {
            System.out.println("El número central es: " + num2);
        } else {
            System.out.println("El número central es: " + num3);
        }
    }
}