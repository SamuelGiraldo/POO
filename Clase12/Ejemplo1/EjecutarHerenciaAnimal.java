package Ejemplo1;

public class EjecutarHerenciaAnimal {
    public static void main(String[] args) {
        Animal Roko = new Perro();
        Animal Pecas = new Gato();
        
        Roko.hacerSonido();
        Pecas.hacerSonido();
    }
    
}