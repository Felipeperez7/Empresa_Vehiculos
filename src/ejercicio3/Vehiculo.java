/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 * La clase Vehiculo es una clase genérica
 * @author Felipe
 */
public abstract class Vehiculo 
{
    private String matricula;
    private int dias_alquiler;

    /**
     * Constructor por defecto
     */
    public Vehiculo() 
    {
        matricula = "";
        dias_alquiler = 0;
    }

    /**
     * Constructor por parámetros
     * @param matricula indica la matrícula del vehículo
     * @param dias_alquiler indica los días de alquiler del vehículo
     */
    public Vehiculo(String matricula, int dias_alquiler) 
    {
        this.matricula = matricula;
        this.dias_alquiler = dias_alquiler;
    }

    /**
     * Muestra la matrícula
     * @return matrícula del vehículo
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Modifica la matrícula
     * @param matricula es la nueva matrícula
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Muestra los días de alquiler
     * @return días de alquiler
     */
    public int getDias_alquiler() {
        return dias_alquiler;
    }

    /**
     * Modifica los días de alquiler
     * @param dias_alquiler nuevos días de alquiler
     */
    public void setDias_alquiler(int dias_alquiler) {
        this.dias_alquiler = dias_alquiler;
    }
    
    /**
     * Calcula el importe del alquiler
     * @return indica el importe del alquiler
     */
    public abstract double importeAlquiler();
    
    /**
     * El método recibo imprime un recibo de la factura
     */
    public abstract void recibo();
}
