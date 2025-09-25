package Ejer2;

public class Ejecucion {
    public static void main(String[] args) {
        ejecutarEjercicio();
    }

    public static void ejecutarEjercicio(){
        Almacenamiento buffer = new Almacenamiento();
        new Productor(buffer).start();
        new Consumidor(buffer).start();
        new Productor(buffer).start();
        new Consumidor(buffer).start();
    }
}
