public class Taller4_10{
    public static void main(String[] args) {
        /*4.10)  /*
         * Ejercicio 4.10)
         * Un ángulo se considera agudo si es menor de 90 grados, obtuso
         * si es mayor de 90 grados y recto si es igual a 90 grados.
         * Utilizando esta información, escribir un algoritmo que acepte
         * un ángulo en grados y visualice el tipo de ángulo correspondiente
         * a los grados introducidos
         * 
         * Entrada: angulo 
         * Proceso: validar si el angulo está entre los siguientes 
         * angulo menor que 90, angulo mayor que 90, angulo igual a 90
         * Salida: mostrar si es un angulo agudo, obtuso o recto.
         */

        double a = 90;
        if (a < 90) {
            System.out.println("Ángulo Agudo");
        } else {
            if (a > 90) {
                System.out.println("Ángulo Obtuso");
            } else {
                System.out.println("Ángulo Recto");
            }
        }
    }
}
        
    
    
