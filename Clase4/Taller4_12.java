import java.util.Scanner;
public class Taller4_12{
    public static void main(String[] args) {

/*Requerimientos:Programa que seleccione la operación aritmética a ejecutar entre dos números
*
* Entrada: Dos números
* Proceso: Seleccionar la operación aritmética a ejecutar entre dos números
* Salida: Imprimir el resultado de la operación aritmetica
 */

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");

        double num1 = sc.nextDouble();
        System.out.print("Ingrese el segundo numero: ");

        double num2 = sc.nextDouble();
        System.out.println("Seleccione la operación a realizar:");

        System.out.println("1. Suma");

        System.out.println("2. Resta");

        System.out.println("3. Multiplicación");

        System.out.println("4. División");

        int opcion = sc.nextInt();
        double resultado;
        
        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                System.out.println("El resultado de la suma es: " + resultado);
               
            case 2:
                resultado = num1 - num2;
                System.out.println("El resultado de la resta es: " + resultado);
                
            case 3:
                resultado = num1 * num2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
              
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("El resultado de la división es: " + resultado);
                
                }
               
        }

      }
}
