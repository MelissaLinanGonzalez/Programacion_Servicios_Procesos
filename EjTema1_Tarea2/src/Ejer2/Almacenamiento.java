package Ejer2;

public class Almacenamiento {
    private int[] buffer = new int[3];
    private int contador = 0;

    public synchronized void producir(int valor){
        while (contador == buffer.length){
            try {
                wait();
            } catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }
        buffer[contador] = valor;
        contador++;
        System.out.println("Productor produjo: " + valor);
        notifyAll();
    }

    public synchronized void consumir(){
        while (contador == 0){
            try {
                wait();
            } catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("Consumidor consumió: " + buffer[contador - 1]);
        contador--;
        notifyAll();
    }
}
