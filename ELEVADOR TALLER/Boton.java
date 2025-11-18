// Interfaz para polimorfismo (botones "presionables")
interface Pressable {
    void press();
    boolean isLit();
}

// Clase base Button con encapsulación
public abstract class Boton implements Pressable {
    protected boolean lit; // Encapsulado
    protected String sound;

    public Boton() {
        this.lit = false;
        this.sound = "beep";
    }

    @Override
    public void press() {
        lit = true;
        System.out.println(sound + " - Botón presionado");
        // Simular apagado después de uso
        new Thread(() -> {
            try {
                Thread.sleep(2000); // 2 segundos
                lit = false;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    @Override
    public boolean isLit() {
        return lit;
    }

    // Método abstracto para polimorfismo
    public abstract void action();
}

// Subclase FloorButton (herencia)
class FloorButton extends Boton {
    private String direction; // "up" o "down"

    public FloorButton(String direction) {
        super();
        this.direction = direction;
    }

    @Override
    public void action() {
        System.out.println("Solicitando ascensor para " + direction + " desde piso.");
        // Integrar con ControlSystem (ver abajo)
    }
}

// Subclase ElevatorButton (herencia)
class ElevatorButton extends Boton {
    private int targetFloor;

    public ElevatorButton(int targetFloor) {
        super();
        this.targetFloor = targetFloor;
    }

    @Override
    public void action() {
        System.out.println("Seleccionando piso " + targetFloor + " dentro del ascensor.");
        // Integrar con Elevator
    }
}