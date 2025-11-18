package h;
public class Elevador {

    private int pisoActual;
    private boolean puertaAbierta;
    private final int pisoMin;
    private final int pisoMax;

    public Elevador(int pisoMin, int pisoMax) {
        this.pisoMin = pisoMin;
        this.pisoMax = pisoMax;
        this.pisoActual = pisoMin;
        this.puertaAbierta = false;
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public void abrirPuerta() {
        if (!puertaAbierta) {
            puertaAbierta = true;
            System.out.println("Puerta abierta.");
        } else {
            System.out.println("La puerta ya está abierta.");
        }
    }

    public void cerrarPuerta() {
        if (puertaAbierta) {
            puertaAbierta = false;
            System.out.println("Puerta cerrada.");
        } else {
            System.out.println("La puerta ya está cerrada.");
        }
    }

    public void irA(int pisoDestino) {
        if (pisoDestino < pisoMin || pisoDestino > pisoMax) {
            System.out.println("❌ Piso inválido.");
            return;
        }

        if (puertaAbierta) {
            System.out.println("Cerrando puerta para mover el elevador...");
            cerrarPuerta();
        }

        System.out.println("Moviendo elevador...");
        while (pisoActual != pisoDestino) {
            if (pisoActual < pisoDestino) {
                subir();
            } else {
                bajar();
            }
        }

        System.out.println("Llegaste al piso " + pisoActual + ".");
        abrirPuerta();
    }

    private void subir() {
        if (pisoActual < pisoMax) {
            pisoActual++;
            System.out.println("Subiendo... Piso: " + pisoActual);
        }
    }

    private void bajar() {
        if (pisoActual > pisoMin) {
            pisoActual--;
            System.out.println("Bajando... Piso: " + pisoActual);
        }
    }
}