//Clase padre
public class Elevador {
    protected int pisoActual;
    protected String tipo;

    public Elevador(String tipo){
        this.pisoActual = 0;
        this.tipo = tipo;
    }

    public void mover(int piso){
        System.out.println("El elevador se mueve al piso " + piso);
        pisoActual = piso;
    }

    public void informacion(){
        System.out.println("Tipo de elevador: " + tipo + " | Piso actual: " + pisoActual);
    }
}