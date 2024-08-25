package hospital; // hola

import hospital.Persona;

public class Doctor 
{
    Persona datos_doctor;
    private int triage;
    private int pacientes_max = 6;
    private int pacientes_actual = 0;
    private boolean disponible;

    public Doctor() 
    {
        this.datos_doctor = null ;
        this.triage = 0;
        this.disponible = true;
    }
    public Doctor(Persona datos_doctor, int triaje) 
    {
        this.datos_doctor = datos_doctor;
        this.triage = triaje;
        this.disponible = true;
    }
    public Doctor(Persona datos_doctor) 
    {
        this.datos_doctor = datos_doctor;
        this.triage = 0;
        this.disponible = true;
    }

    public Persona getDatos_doctor() {
        return datos_doctor;
    }

    public void setDatos_doctor(Persona datos_doctor) {
        this.datos_doctor = datos_doctor;
    }

    public int getTriage() {
        return triage;
    }

    public void setTriage(int triage) {
        this.triage = triage;
    }

    public int getPacientes_max() {
        return pacientes_max;
    }

    public void setPacientes_max(int pacientes_max) {
        this.pacientes_max = pacientes_max;
    }

    public int getPacientes_actual() {
        return pacientes_actual;
    }

    public void setPacientes_actual(int pacientes_actual) {
        this.pacientes_actual = pacientes_actual;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    //metodos de clase
}