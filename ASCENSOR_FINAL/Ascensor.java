package ASCENSOR_FINAL;

import java.util.*;

public class Ascensor {

    private int pisoActual;
    private String direccion;  // "subiendo", "bajando", "quieto"
    private Puerta puerta;
    private PriorityQueue<Integer> solicitudes;
    private Notificador notificador;

    public Ascensor(int pisoInicial, Notificador notificador) {
        this.pisoActual = pisoInicial;
        this.direccion = "quieto";
        this.puerta = new Puerta();
        this.notificador = notificador;
        this.solicitudes = new PriorityQueue<>();
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public void agregarSolicitud(int piso) {
        solicitudes.add(piso);
        notificador.registrarActividad("Solicitud agregada al piso " + piso);
    }

    public void mover() {
        if (solicitudes.isEmpty()) {
            direccion = "quieto";
            return;
        }

        int destino = solicitudes.peek();

        if (destino > pisoActual) {
            direccion = "subiendo";
            pisoActual++;
        } else if (destino < pisoActual) {
            direccion = "bajando";
            pisoActual--;
        } else {
            llegada(destino);
            return;
        }

        System.out.println("Ascensor " + direccion + " al piso " + pisoActual);
        notificador.registrarActividad("Movimiento hacia piso " + pisoActual);
    }

    private void llegada(int destino) {
        solicitudes.poll();
        direccion = "quieto";

        System.out.println("Ascensor llegó al piso " + destino);
        puerta.abrir();
        puerta.cerrar();
    }
}