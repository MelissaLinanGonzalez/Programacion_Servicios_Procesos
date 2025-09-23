package Ejercicio2;

public class Guardar extends Thread{
    @Override
    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("Guardando..." + i);
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
