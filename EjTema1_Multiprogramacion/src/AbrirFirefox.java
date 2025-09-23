public class AbrirFirefox extends Thread{
    @Override
    public void run(){
        try {
            ProcessBuilder pb = new ProcessBuilder("firefox");
            Process proceso = pb.start();
            System.out.println("Firefox corriendo...");

            int exitCode = proceso.waitFor();
            System.out.println("Firefox cerrado con código: " + exitCode);
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
