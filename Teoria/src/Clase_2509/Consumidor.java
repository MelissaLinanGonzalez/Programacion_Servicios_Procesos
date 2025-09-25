package Clase_2509;

public class Consumidor extends Thread{
    private Compartido recurso;

    public Consumidor(Compartido recurso){
        this.recurso = recurso;
    }

    @Override
    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("Consumidor leyó: " + recurso.getValor());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
