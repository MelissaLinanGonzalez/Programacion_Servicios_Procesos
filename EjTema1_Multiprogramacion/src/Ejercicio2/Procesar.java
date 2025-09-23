package Ejercicio2;

public class Procesar extends Thread{
    @Override
    public void run(){
        for (int i = 1; i <= 2; i++) {
            System.out.println("Procesando..." + i);
            try {
                Thread.sleep(3000);
            }catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
