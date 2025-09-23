package Ejercicio3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ContarRegistros extends Thread{
    @Override
    public void run(){
        try {
            BufferedReader lector = new BufferedReader(new FileReader("EjTema1_Multiprogramacion/src/Ejercicio3/entrada.txt"));
            String linea;
            int contador = 0;
            while ((linea = lector.readLine()) != null){
                contador ++;
            }
            System.out.println("Número total de registros: " + contador);
            lector.close();
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
