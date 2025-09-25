package Clase_2509;

public class Recurso {
    private int valor;
    private boolean disponible = false;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Metodo para que el Productor escriba un valor
    public synchronized void producir(int nuevoValor){
        while (disponible){ // Si ya hay dato esperando, el productor espera
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        valor = nuevoValor;
        disponible = true;
        System.out.println("Productor produjo: " + valor);
        notify(); // Avisa al consumidor
    }

    /*
    * synchronized significa que solo puede usar este metodo un solo hilo a la vez,
    * hasta que uno no termine el otro no puede entrar, ya que se esta compartiendo el
    * mismo recurso*/

    // Metodo para que el Consumidor lea un valor
    public synchronized int consumir(){
        while (!disponible){ // Si no hay dato aún, el consumidor espera
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        disponible = false;
        System.out.println("Consumidor consumió: " + valor);
        notify(); // Avisa al productor
        return valor; // En este caso no haría falta devolver el valor, pero normalmente este valor se usa posteriormente
    }
}
