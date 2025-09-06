import java.util.Scanner;
public class Taller4_9{
    public static void main(String[] args) {
        /*4.9) Algoritmo que averigue dados 2 numeros introducidos,
         *uno es divisor del otro.
         * 
         * Entrada: 2 numeros 
         * Proceso: Averiguar si uno es divisor del otro
         * Salida:  Decir si uno es divisor del otro
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        double num1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        double num2 = sc.nextInt();

        if (num1 % num2 == 0) {
            System.out.println(num2 + " Es divisor de " + num1);
        } else if (num2 % num1 == 0) {
            System.out.println(num1 + " Es divisor de " + num2);
        } else {
            System.out.println("Ninguno es divisor del otro");
        }
    }
}
