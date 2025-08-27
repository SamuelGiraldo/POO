public class PracticaCondicionales {

public static void main(String[] args) {
/*
* Ejercicio 4.1.A)
*Requerimiento:Si un ángulo es igual a 90 grados, imprimir el
*mensaje "El ángulo es un ángulo recto"
*sino imprimir el mensaje "El ángulo no es
*un ángulo recto".
*Entrada: ángulo
*Proceso: Validar si el angulo es igual a 90 grados
*Salida: Obtener el mensaje si es o no es angulo recto
*/
  
double angulo =90;
if (angulo == 90){
  System.out.println("El angulo es un angulo recto");
} 
else {
  System.out.println("El angulo no es un angulo recto");
}
//-----------------------------------------------------------------//
  /*B)
  *Si la temperatura es superior a 100 grados, visualizar el 
  *mensaje “por encima del punto de ebullición del agua” sino
  *visualizar el mensaje “por debajo del punto de ebullición del agua”.
  *
  *Entrada:Temperatura
  *Proceso:Validar que la temperatura sea superior a 100 grados
  *Salida:Si alcanza o no el punto de ebullición
*/

double Temperatura = 30.0;
if (Temperatura > 100){
  System.out.println("Por encima del punto de ebullición del agua");
}
else{
  System.out.println("Por debajo del punto de ebullición del agua");
}

//-----------------------------------------------------------//
/*C)
*Si el número es positivo, sumar el número a total
*de positivos, sino sumar al total de negativos.
 * 
 *Entrada;Número
 *Proceso:Validar si el numero es positivo o negativo
 Salida:Validar el total de positivos y negativos 
 */

double numero=-3;
double totalPositivos=0;
double totalNegativos=0;  

if (numero > 0){
totalPositivos = totalPositivos += numero;
System.out.println("El total de positivos es:" + totalPositivos);
}
else{

  totalNegativos = totalNegativos += numero;
  System.out.println("El total de negativos es :" + totalNegativos);


}
}
   }
