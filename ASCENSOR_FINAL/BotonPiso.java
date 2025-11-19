package ASCENSOR_FINAL;

public class BotonPiso extends Boton {
    private int piso;
    private boolean subir;

    public BotonPiso(int piso, boolean subir) {
        this.piso = piso;
        this.subir = subir;
    }

    public int getPiso() {
        return piso;
    }

    public boolean esSubir() {
        return subir;
    }
}