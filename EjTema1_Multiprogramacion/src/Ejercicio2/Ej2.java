package Ejercicio2;

public class Ej2 {
    public static void main(String[] args) {
        DescargarDatos hiloA = new DescargarDatos();
        Procesar hiloB = new Procesar();
        Guardar hiloC = new Guardar();

        // Arrancamos los 3 hilos
        try {
            hiloA.start();
            hiloB.start();
            hiloC.start();

            // Esperamos a que todos los hilos terminen
            hiloA.join();
            hiloB.join();
            hiloC.join();

            System.out.println("Todas las tareas finalizadas");
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
