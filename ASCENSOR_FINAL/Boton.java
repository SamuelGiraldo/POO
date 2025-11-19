package ASCENSOR_FINAL;

public abstract class Boton {
    protected boolean iluminado;

    public void presionar() {
        iluminado = true;
        System.out.println("Botón presionado. Indicador luminoso activo.");
    }

    public void apagar() {
        iluminado = false;
        System.out.println("Indicador luminoso apagado.");
    }

    public boolean estaIluminado() {
        return iluminado;
    }
}