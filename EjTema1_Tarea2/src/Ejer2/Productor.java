package Ejer2;

public class Productor extends Thread{
    private Almacenamiento buffer;
    public Productor(Almacenamiento buffer){
        this.buffer = buffer;
    }

    @Override
    public void run(){
        for (int i = 1; i <= 10; i++) {
            buffer.producir(i);
            try {
                Thread.sleep(500);
            } catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
