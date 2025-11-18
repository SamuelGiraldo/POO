public class puertas {
    private boolean open;
    private boolean obstacleDetected;

    public puertas() {
        this.open = false;
        this.obstacleDetected = false;
    }

    public void open() {
        if (!obstacleDetected) {
            open = true;
            System.out.println("Puertas abiertas.");
        } else {
            System.out.println("Obstáculo detectado: puertas no se abren.");
        }
    }

    public void close() {
        if (!obstacleDetected) {
            open = false;
            System.out.println("Puertas cerradas.");
        }
    }

    public void keepOpen() {
        // Botón para mantener abiertas
        System.out.println("Manteniendo puertas abiertas por 10 segundos.");
        new Thread(() -> {
            try {
                Thread.sleep(10000);
                close();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    public void setObstacle(boolean detected) {
        this.obstacleDetected = detected;
    }

    public boolean isOpen() {
        return open;
    }
}