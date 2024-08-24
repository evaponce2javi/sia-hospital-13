package hospital;

import hospital.Persona;

public class Paciente {
    Persona datos_paciente;
    private int edad;
    private int sexo; //(0M - 1F)
    private int triage; 
    Doctor medico_asignado;
    private String estado_atencion;
    private String num_habitacion = null; //debe ser un string de verdad?

    public Paciente(Persona datos_paciente, int edad, int sexo, int triage, Doctor medico_asignado, String estado_atencion, String num_cama, String especialidad) {
        this.datos_paciente = null;
        this.edad = 0;
        this.sexo = 0;
        this.triage = 1;
        this.medico_asignado = null;
        this.estado_atencion = "NO";
        this.num_habitacion = null;
    }

    public Persona getDatos_paciente() {
        return datos_paciente;
    }

    public void setDatos_paciente(Persona datos_paciente) {
        this.datos_paciente = datos_paciente;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public int getTriage() {
        return triage;
    }

    public void setTriage(int triage) {
        this.triage = triage;
    }

    public Doctor getMedico_asignado() {
        return medico_asignado;
    }

    public void setMedico_asignado(Doctor medico_asignado) {
        this.medico_asignado = medico_asignado;
    }

    public String getEstado_atencion() {
        return estado_atencion;
    }

    public void setEstado_atencion(String estado_atencion) {
        this.estado_atencion = estado_atencion;
    }

    public String getNum_habitacion() {
        return num_habitacion;
    }

    public void setNum_habitacion(String num_habitacion) {
        this.num_habitacion = num_habitacion;
    }
}
