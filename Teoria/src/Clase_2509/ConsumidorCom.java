package Clase_2509;

public class ConsumidorCom extends Thread{
    private Recurso recurso;

    public ConsumidorCom(Recurso recurso){
        this.recurso = recurso;
    }

    @Override
    public void run(){
        for (int i = 1; i <= 5; i++) {
            recurso.consumir(); // Consume un número
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
