package Ejer2;

public class Consumidor extends Thread{
    private Almacenamiento buffer;

    public Consumidor(Almacenamiento buffer){
        this.buffer = buffer;
    }

    @Override
    public void run(){
        for (int i = 1; i <= 10; i++) {
            buffer.consumir();
            try {
                Thread.sleep(1000);
            } catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
