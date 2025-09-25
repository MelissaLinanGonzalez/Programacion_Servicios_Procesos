package Ejer1;

import java.io.*;

public class ContarU extends Thread{
    @Override
    public void run(){
        File archivo = new File("EjTema1_Tarea2/src/Ejer1/TextoFacil.txt");
        File archivoNuevo = new File("EjTema1_Tarea2/src/Ejer1/SumaVocales.txt");
        int cantidad = 0;
        try {
            BufferedReader lector = new BufferedReader(new FileReader(archivo));
            BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoNuevo,true));

            String linea;
            while ((linea = lector.readLine()) != null){
                for (char c : linea.toCharArray()){
                    if (c == 'u' || c == 'U'){
                        cantidad ++;
                    }
                }
            }

            escritor.write(cantidad + ";u\n");
            escritor.close();
            System.out.println("Cantidad de letras U escritas en el nuevo archivo");

        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
