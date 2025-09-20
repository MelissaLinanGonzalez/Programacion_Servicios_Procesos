public class EjecutarProceso {
    public static void main(String[] args){
        // Procesos
        //ejemplo1();
        ejemplo2();
    }

    // Aquí se lanza el proceso de abrir la terminal
    public static void ejemplo1(){
        try {
            ProcessBuilder pb = new ProcessBuilder("x-terminal-emulator");
            Process proceso = pb.start();
            System.out.println("Se ha lanzado la terminal");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    // Lanza el proceso de abrir GoogleChrome y espera que se haya finalizado dicho proceso
    public static void ejemplo2(){
        try {
            ProcessBuilder pb = new ProcessBuilder("firefox");
            Process proceso = pb.start();
            System.out.println("Firefox se ha lanzado. Esperando a que se cierre para continuar...");

            // Espera que se cierre el proceso
            // Si la aplicación que se va a abrir ya tiene una ventana abierta, el exitCode no espera a que el proceso se cierre y te da directamente el código
            /*
            * Esto ocurre con firefox porque no permite que haya dos procesos con mismo perfil, ya que dicho proceso intenta abrir una nueva ventana
            * pero al estar ya abierta le da la señal de que el proceso de abrir una nueva ventana ya ha terminado, por lo que si queremos que abra una nueva
            * ventana y que espere a que se cierre dicha ventana para dar el exitCode, tenemos que tener otro perfil y en el processBuilder poner "--new-instance" y
            * "--no-remote". No entraría en colisión ambos procesos*/
            int exitCode = proceso.waitFor();
                System.out.println("Firefox se ha cerrado. El código de salida es: " + exitCode);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    // Lanzamiento de hilos
    public static void ejemplo3(){
        try {
            // EJECUCIÓN SECUENCIAL
            System.out.println("*** Ejecución secuencial ***");
            long inicioSec = System.currentTimeMillis();

            new Contador("Contador 1").run();
            new Contador("Contador 2").run();
            
        }
    }

}
