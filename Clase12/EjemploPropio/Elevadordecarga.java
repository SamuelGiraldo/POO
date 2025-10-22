public class Elevadordecarga extends Elevador {

    public Elevadordecarga(){
        super("Elevador de Carga");
    }

    @Override
    public void mover(int piso){
        System.out.println("El elevador de carga se mueve lentamente al piso " + piso + " con peso de más");
        pisoActual = piso;
    }
}