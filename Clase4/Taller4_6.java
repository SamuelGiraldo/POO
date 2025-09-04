import java.util.Scanner;
public class Taller4_6{
    public static void main(String[] args) {
        /*4.3)
         *Requerimiento:Determinar el precio de un billete de ida y vuelta en ferrocarril, 
         *conociendo la distancia a recorrer  y sabiendo que si el número de días de estancia es superior a siete y la
         *distancia superior a 800 kilómetros el billete tiene una reducción del 30 por 100. 
         *El precio por kilometro es de 2,5 pesetas
         *
         * Entrada: Distancia, dias
         * Proceso: Calcular el precio total
         * Salida: Precio total
         */

          double  precioPorKilometro = 2.5;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la distancia a recorrer (en km): ");
        double  distancia = sc.nextDouble ();

        System.out.print("Ingrese el número de días de estancia: ");
        double  dias = sc.nextInt();

        double  precioTotal = distancia * precioPorKilometro * 2; // Ida y vuelta
        if (dias > 7 && distancia > 800) {
            precioTotal *= 0.7; //Aplicar descuento del 30%
        }
        System.out.println("El precio total del billete es: " + precioTotal + " pesetas");
    }
}