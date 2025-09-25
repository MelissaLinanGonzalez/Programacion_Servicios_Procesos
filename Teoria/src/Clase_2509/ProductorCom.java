package Clase_2509;

public class ProductorCom extends Thread{
    private Recurso recurso;

    public ProductorCom(Recurso recurso){
        this.recurso = recurso;
    }

    @Override
    public void run(){
        for (int i = 1; i <= 5; i++) {
            recurso.producir(i); // Produce un número
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
