public class Contador extends Thread{
    private String nombre;

    public Contador(String nombre){
        this.nombre = nombre;
    }

    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println(nombre + " cuenta: " + 1);
            try {
                Thread.sleep(1000);  // Simula un trabajo de 1 segundo
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(nombre + " Ha terminado.");
        }
    }
}
