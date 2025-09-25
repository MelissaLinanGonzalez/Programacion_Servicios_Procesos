package Clase_2509;

public class HiloR implements Runnable{
    private String nombre;

    public HiloR(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(nombre + " ejecuta paso " + i);
            try {
                Thread.sleep(1000); //pausa de un segundo
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(nombre + " ha terminado");
        }
    }
}
