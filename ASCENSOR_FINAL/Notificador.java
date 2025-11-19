package ASCENSOR_FINAL;

public class Notificador {

    public void alerta(String mensaje) {
        System.out.println("⚠ ALERTA DEL SISTEMA: " + mensaje);
    }

    public void registrarActividad(String actividad) {
        System.out.println("Registro: " + actividad);
    }
}