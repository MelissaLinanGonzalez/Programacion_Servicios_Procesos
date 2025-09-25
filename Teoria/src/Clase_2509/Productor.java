package Clase_2509;

public class Productor extends Thread{
    private Compartido recurso;

    public Productor(Compartido recurso){
        this.recurso = recurso;
    }

    @Override
    public void run(){
        for (int i = 1; i <= 5; i++) {
            recurso.setValor(i);
            System.out.println("Productor escribió: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e){
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
