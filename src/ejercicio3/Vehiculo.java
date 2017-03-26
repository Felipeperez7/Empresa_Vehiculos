/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author Felipe
 */
public abstract class Vehiculo 
{
    private String matricula;
    private int dias_alquiler;

    public Vehiculo() 
    {
        matricula = "";
        dias_alquiler = 0;
    }

    public Vehiculo(String matricula, int dias_alquiler) 
    {
        this.matricula = matricula;
        this.dias_alquiler = dias_alquiler;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getDias_alquiler() {
        return dias_alquiler;
    }

    public void setDias_alquiler(int dias_alquiler) {
        this.dias_alquiler = dias_alquiler;
    }
    
    public abstract double importeAlquiler();
    
    public abstract void recibo();
}
