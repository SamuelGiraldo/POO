import java.util.Scanner;
public class Taller4_4{
    public static void main(String[] args) {
        /*4.3)
         *Requerimiento:Despues de que el usuario introduzca un numero,
         *deducir la raiz cuadrada
         * 
         * Entrada: Un número
         * Proceso: Calcular la raiz cuadrada del número
         * Salida: Imprimir la raiz cuadrada
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");

        double  num = sc.nextDouble ();
        double  raizCuadrada = Math.sqrt(num);
        
        System.out.println("La raiz cuadrada de " + num + " es: " + raizCuadrada);
    }
}
