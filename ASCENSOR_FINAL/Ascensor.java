package ASCENSOR_FINAL;

import java.util.*;

public class Ascensor {


    private int pisoActual;
    private String direccion;  // "subiendo", "bajando", "quieto"
    private Puerta puerta;
    private PriorityQueue<Integer> solicitudes;
    private Notificador notificador;
    // Estado adicional para gestionar ´personas dentro del ascensor y destinos seleccionados
    private boolean usuarioDentro = false;
    private Queue<Integer> destinos = new LinkedList<>();

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
        }
    
        private void llegada(int destino) {
            solicitudes.poll();
    
            System.out.println("Ascensor llegó al piso " + destino);
    
            try {
                Thread.sleep(700);
                puerta.abrir();
    
                if (!usuarioDentro) {
                    System.out.println("Persona entrando al ascensor ");
                    usuarioDentro = true;
                    Thread.sleep(700);
                    puerta.cerrar();
                    mostrarMenu();
                } else {
                    
                    if (destinos.isEmpty()) {
                        System.out.println("Persona saliendo del ascensor ");
                        usuarioDentro = false;
                        Thread.sleep(700);
                        puerta.cerrar();
                        notificador.registrarActividad("Llegada al piso " + destino);
                        return;
                    } else {
                        System.out.println("Persona llegando al piso " + pisoActual);
                    }
    
                    Thread.sleep(700);
                    puerta.cerrar();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
    
            notificador.registrarActividad("Llegada al piso " + destino);
        }
    
        // Método auxiliar mínimo para compilar; implementar la lógica de menú según sea necesario.
        private void mostrarMenu() {
            // Placeholder: aquí se pueden solicitar destinos y agregarlos a 'destinos' o a 'solicitudes'.
        }
    }
