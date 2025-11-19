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
        if (!abierta) {
            abierta = true;
            System.out.println("Puerta abriéndose...");
        }
    }

     public void cerrar() {
        if (abierta) {
            abierta = false;
            System.out.println("Puerta cerrándose...");

        }
    }

    public boolean estaAbierta() {
        return abierta;
    }
}