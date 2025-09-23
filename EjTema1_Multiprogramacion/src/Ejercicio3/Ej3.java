package Ejercicio3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ej3 {
    public static void main(String[] args) {
        File archivo = new File("EjTema1_Multiprogramacion/src/Ejercicio3/entrada.txt");
        int total = 0;
        int info = 0;
        int warn = 0;
        int error = 0;

        try {
            BufferedReader lector = new BufferedReader(new FileReader(archivo));
            System.out.println("*** SECUENCIAL ***");
            long inicioSec = System.currentTimeMillis();

            String linea;
            while ((linea = lector.readLine()) != null){
                total ++;
                if (linea.contains("INFO")){
                    info ++;
                } else if (linea.contains("WARN")){
                    warn ++;
                } else if (linea.contains("ERROR")){
                    error ++;
                }
            }

            System.out.println("Número total de registros: " + total);
            System.out.println("INFO: " + info);
            System.out.println("WARN: " + warn);
            System.out.println("ERROR: " + error);

            long finSec = System.currentTimeMillis();
            System.out.println("Tiempo total secuencial: " + (finSec - inicioSec) / 1000.0 + " segundos/n");
            lector.close();

            System.out.println("*** CONCURRENTE ***");
            long inioCon = System.currentTimeMillis();
            ContarRegistros h1 = new ContarRegistros();
            ContarInfo h2 = new ContarInfo();
            ContarWarn h3 = new ContarWarn();
            ContarError h4 = new ContarError();

            // Se lanzan los hilos
            h1.start();
            h2.start();
            h3.start();
            h4.start();

            // Se espera a que todos los hilos terminen
            h1.join();
            h2.join();
            h3.join();
            h4.join();

            long finCon = System.currentTimeMillis();
            System.out.println("Tiempo total concurrente: " + (finCon - inioCon) / 1000.0 + " segundos/n");

        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
