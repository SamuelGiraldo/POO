package ASCENSOR_FINAL;

public class SistemaControl {

    private Ascensor ascensor;
    private Notificador notificador;

    public SistemaControl() {
        notificador = new Notificador();
        ascensor = new Ascensor(0, notificador);
    }

    public void presionarBotonPiso(int piso) {
        ascensor.agregarSolicitud(piso);
    }

    public void presionarBotonAscensor(int piso) {
        ascensor.agregarSolicitud(piso);
    }

    public void ciclo() {
        ascensor.mover();
    }

        public void activarEmergencia() {
        System.out.println("EMERGENCIA: la función aún no está implementada en la nueva clase Elevador");
    }
}