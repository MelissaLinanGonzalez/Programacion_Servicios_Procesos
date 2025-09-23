package Ejercicio3;

import java.io.BufferedReader;
import java.io.FileReader;

public class ContarInfo extends Thread{
    @Override
    public void run(){
        try {
            BufferedReader lector = new BufferedReader(new FileReader("EjTema1_Multiprogramacion/src/Ejercicio3/entrada.txt"));
            String linea;
            int info = 0;
            while ((linea = lector.readLine()) != null){
                if (linea.contains("INFO")) {
                    info++;
                }
            }
            System.out.println("INFO: " + info);
            lector.close();
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
