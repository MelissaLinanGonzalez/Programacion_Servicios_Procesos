package Clase_2509;

public class Ejecucion {
    public static void main(String[] args) {
        // Ejemplo Runnable
        //ejemplo_runnable();
        //ejemploComunicacionBasico();
        ejemploSinc();
    }

    public static void ejemplo_runnable(){
        HiloR tarea1 = new HiloR("Hilo A");
        HiloR tarea2 = new HiloR("Hilo B");

        // Creamos los hilos pasándole las tareas
        Thread h1 = new Thread(tarea1);
        Thread h2 = new Thread(tarea2);

        // Iniciamos los hilos
        h1.start();
        h2.start();

        System.out.println("El hilo principal sigue ejecutándose...");
    }

    public static void ejemploComunicacionBasico(){
        Compartido recurso = new Compartido();

        Productor p = new Productor(recurso);
        Consumidor c = new Consumidor(recurso);

        p.start();
        c.start();
    }

    public static void ejemploSinc(){
        Recurso recurso = new Recurso();
        new ProductorCom(recurso).start();
        new ConsumidorCom(recurso).start();
    }
}
