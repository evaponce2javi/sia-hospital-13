package hospital;

import hospital.Paciente;

public class Habitacion 
{
    private int num_habitacion; //#1 a #150
    Paciente cama_1;
    Paciente cama_2;
    private boolean ocupado;

    public Habitacion(int num_habitacion) 
    {
        this.num_habitacion = num_habitacion;
        this.cama_1 = null;
        this.cama_2 = null;
        this.ocupado = false;
    }

    public int getNum_habitacion() {
        return num_habitacion;
    }

    public void setNum_habitacion(int num_habitacion) {
        this.num_habitacion = num_habitacion;
    }

    public Paciente getCama_1() {
        return cama_1;
    }

    public void setCama_1(Paciente cama_1) {
        this.cama_1 = cama_1;
    }

    public Paciente getCama_2() {
        return cama_2;
    }

    public void setCama_2(Paciente cama_2) {
        this.cama_2 = cama_2;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    
}
