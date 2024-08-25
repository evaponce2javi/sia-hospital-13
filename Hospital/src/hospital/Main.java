package hospital;
import java.io.*;
import java.util.*;
//Instancia el hospital pero la clase que realmente
//gestiona el hospital es gestor hospital.
public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String opcion = "";
        boolean continuar = true;

         while (continuar) {
            System.out.println("""
                    + - - - - - - - - - - - - - - - - - - - - - - - - - +
                    | Bienvenido/a al sistema de Atención Hospitalaria. |
                    | Por  favor,  seleccione  una  de  las  siguientes |
                    | opciones  ingresando  el  número  correspondiente:|
                    + - - - - - - - - - - - - - - - - - - - - - - - - - +
                    | 1. Añadir paciente                                |
                    | 2. Registrar alta voluntaria                      |
                    | 3. Asignar doctor a paciente                      |
                    | 4. Asignar habitación a paciente                  |
                    | 5. Registrar visita a paciente                    |
                    | 6. Consultar pacientes por triaje                 |
                    | 7. Ver estado de habitaciones y camas             |
                    | 8. Ver disponibilidad de doctores                 |
                    | 9. Explicación de las opciones del menú           |
                    | 10. Salir del sistema                             |
                    + - - - - - - - - - - - - - - - - - - - - - - - - - +
                    """);
            System.out.print("Ingrese su opción: ");

             switch (opcion) {
                    case "1":
                        // "Añadir paciente"
                        System.out.println("OPCION 1");
                        // presioneTecla();
                        // limpiarPantalla();
                        // Estas opciones las agregaré a un nuevo archivo, quizá como gestion del programa
                        break;
                    case "2":
                        // "Registrar alta voluntaria"
                         System.out.println("OPCION 2");
                        break;
                    case "3":
                        // "Asignar doctor a paciente"
                         System.out.println("OPCION 3");
                        break;
                    case "4":
                        // "Asignar habitación a paciente"
                         System.out.println("OPCION 4");
                        break;
                    case "5":
                        // "Registrar visita a paciente"
                         System.out.println("OPCION 5");
                        break;
                    case "6":
                        // Consultar pacientes por triaje"
                         System.out.println("OPCION 6");
                        break;
                    case "7":
                        // "Ver estado de habitaciones y camas"
                         System.out.println("OPCION 7");
                        break;
                    case "8":
                        // "Ver disponibilidad de doctores"
                         System.out.println("OPCION 8");
                        break;
                    case "9":
                        // "Explicación de las opciones del menú"
                         System.out.println("OPCION 9");
                        break;
                    case "10":
                        //  "Salir del sistema"
                         System.out.println("OPCION 1o");
                        continuar = false;  
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, ingrese un número del 1 al 10.");
                        break;
                }
            } catch (IOException e) {
                System.out.println("Error al leer la entrada. Por favor, intente de nuevo.");
            }
        }

        System.out.println("Gracias por usar el sistema de Atención Hospitalaria. ¡Hasta luego!");
    }
}