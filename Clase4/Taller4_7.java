import java.util.Scanner;
public class Taller4_7{
    public static void main(String[] args) {
        /*4.7)
         *Requerimiento:Despues de que el usuario introduzca una fecha con
         *el formato dd/mm/aaaa se  obtenga la fecha del dia siguiente
         *
         * Entrada: Una fecha en formato dd/mm/aaaa
         * Proceso: Validar la fecha y calcular el dia siguiente
         * Salida: La fecha del dia siguiente en formato dd/mm/aaaa
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una fecha (dd/mm/aaaa): ");
        String fecha = sc.nextLine();   

        String[] partes = fecha.split("/");
        double dia = Integer.parseInt(partes[0]);
        double mes = Integer.parseInt(partes[1]);
        double año = Integer.parseInt(partes[2]);

        if (mes < 1 || mes > 12 || dia < 1 || dia > 31 || año < 1) {
            System.out.println("Fecha invalida");
            return;
        }
        dia++;
        if (dia > 31) {
            dia = 1;
            mes++;
        }
        if (mes > 12) {
            mes = 1;
            año++;
        }

        System.out.printf("La fecha del dia siguiente es: %02d/%02d/%04d", dia, mes, año);
    }
}