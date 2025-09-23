package Ejercicio3;

import java.io.BufferedReader;
import java.io.FileReader;

public class ContarWarn extends Thread{
    @Override
    public void run(){
        try {
            BufferedReader lector = new BufferedReader(new FileReader("EjTema1_Multiprogramacion/src/Ejercicio3/entrada.txt"));
            String linea;
            int warn = 0;
            while ((linea = lector.readLine()) != null){
                if (linea.contains("WARN")) {
                    warn++;
                }
            }
            System.out.println("WARN: " + warn);
            lector.close();
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
