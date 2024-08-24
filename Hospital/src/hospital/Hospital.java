package hospital;
import hospital.Paciente;
import java.io.*;
import java.util.*;

public class Hospital 
{
    //HashMap doctores =
    //KEY = "Traumatología"
    //VALUE = "Doctor1, Doctor2..."
    HashMap<Integer, LinkedList<Doctor>> map_doctores = new HashMap<>();
    LinkedList<Paciente> lista_pacientes_prioridad = new LinkedList<>();
    ArrayList<Habitacion> habitaciones = new ArrayList<>();
}
