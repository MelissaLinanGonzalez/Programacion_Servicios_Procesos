package Ejercicio3;

import java.io.BufferedReader;
import java.io.FileReader;

public class ContarError extends Thread{
    @Override
    public void run(){
        try {
            BufferedReader lector = new BufferedReader(new FileReader("EjTema1_Multiprogramacion/src/Ejercicio3/entrada.txt"));
            String linea;
            int error = 0;
            while ((linea = lector.readLine()) != null){
                if (linea.contains("ERROR")) {
                    error++;
                }
            }
            System.out.println("ERROR: " + error);
            lector.close();
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
