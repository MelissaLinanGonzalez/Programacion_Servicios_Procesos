package Ejercicio2;

public class DescargarDatos extends Thread{
    @Override
    public void run(){
        for (int i = 1; i <= 3; i++) {
            System.out.println("Descargando datos..." + i);
            try {
                Thread.sleep(2000);
            }catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
