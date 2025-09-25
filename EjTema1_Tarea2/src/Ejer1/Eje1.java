package Ejer1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Eje1 {
    public static void main(String[] args) {
        File archivo = new File("EjTema1_Tarea2/src/Ejer1/SumaVocales.txt");
        // Creamos los hilos
        ContarA hiloA = new ContarA();
        ContarE hiloE = new ContarE();
        ContarI hiloI = new ContarI();
        ContarO hiloO = new ContarO();
        ContarU hiloU = new ContarU();

        // Contador del total de vocales
        int totalVocales = 0;
        try {
            // Lanzamos los hilos
            hiloA.start();
            hiloE.start();
            hiloI.start();
            hiloO.start();
            hiloU.start();

            // Esperamos a que todos los hilos hayan terminado para poder leer los resultados
            hiloA.join();
            hiloE.join();
            hiloI.join();
            hiloO.join();
            hiloU.join();

            // Leemos el archivo en el que los hilos han volcado sus resultados
            BufferedReader lector = new BufferedReader(new FileReader(archivo));
            String linea;
            while ((linea = lector.readLine()) != null){
                String[] lista = linea.split(";");
                totalVocales += Integer.parseInt(lista[0]);
            }

            System.out.println(" ");
            System.out.println("El total de vocales en el archivo es de : " + totalVocales);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
