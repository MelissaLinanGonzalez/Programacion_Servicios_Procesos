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
            
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
