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
            System.out.println("La puerta se esta abriéndo");
        }
    }

     public void cerrar() {
        if (abierta) {
            abierta = false;
            System.out.println("La puerta se esta cerrando");

        }
    }

    public boolean estaAbierta() {
        return abierta;
    }
}