import java.io.*;

public class GestionTerminal{
// Son funciones para presionar tecla para continuar y limpiar el texto de la consola.
// Es importante probar si "limpiar pantalla" servirá para todos los ambientes.
  public static void presioneTecla() throws IOException{
    System.out.print("Presione tecla para continuar...");
    BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
    lector.readLine(); 
  }

  public static void limpiarPantalla() {
    try {
        if (System.getProperty("os.name").contains("Windows")) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
            // Para sistemas UNIX/Linux/MacOS
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    } catch (Exception e) {
        System.out.println("No se pudo limpiar la consola.");
    }
  }

}