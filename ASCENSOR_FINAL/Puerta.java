package ASCENSOR_FINAL;

public class Puerta {
    private boolean abierta;
    private boolean sensorObstaculo;

    public Puerta() {
        abierta = false;
        sensorObstaculo = false;
    }

    public void activarSensor() {
        sensorObstaculo = true;
        System.out.println("Sensor detecta obstáculo. Puerta no puede cerrar.");
    }

    public void desactivarSensor() {
        sensorObstaculo = false;
    }

    public void abrir() {
        abierta = true;
        System.out.println("Puerta abierta.");
    }

    public void cerrar() {
        if (sensorObstaculo) {
            System.out.println("No se puede cerrar por obstáculo.");
            return;
        }
        abierta = false;
        System.out.println("Puerta cerrada.");
    }

    public boolean estaAbierta() {
        return abierta;
    }
}