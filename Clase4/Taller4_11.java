import java.util.Scanner;
public class Taller4_11{
    public static void main(String[] args) {
        /*4.11)
         *Requerimiento:Algoritmo que acepte una calificación numérica del estudiante (0-100), 
         * convierta esta calíficación a su equivalente en letra y 
         * visualice la calificación correspondiente en letra
         *
         * Entrada: calificación numérica (0-100)
         * Proceso: convertir la calificación numérica a letra
         * Salida: calificación en letra
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la calificación del estudiante : ");
        int calificacion = sc.nextInt();
        String letra;

        if (calificacion >= 90) {
            letra = "A";
        } else if (calificacion >= 80 && calificacion < 90) {
            letra = "B";
        } else if (calificacion >= 70 && calificacion < 80) {
            letra = "C";
        } else if (calificacion >= 60 && calificacion < 70) {
            letra = "D";
        } else {
            letra = "F";
        }

        System.out.println("La calificación en letra es: " + letra);
    }
}