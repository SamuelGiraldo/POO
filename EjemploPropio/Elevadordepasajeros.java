//Clase hija
public class Elevadordepasajeros extends Elevador {

    public Elevadordepasajeros(){
        super("Elevador de Pasajeros");
    }

    @Override
    public void mover(int piso){
        System.out.println("El elevador de pasajeros se mueve suavemente al piso " + piso);
        pisoActual = piso;
    }
}