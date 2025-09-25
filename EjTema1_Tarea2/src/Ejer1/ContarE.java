package Ejer1;

import java.io.*;

public class ContarE extends Thread{
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
                    if (c == 'e' || c == 'E'){
                        cantidad ++;
                    }
                }
            }

            escritor.write(cantidad + ";e\n");
            escritor.close();
            System.out.println("Cantidad de letras E escritas en el nuevo archivo");

        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
