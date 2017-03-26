/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 * La clase VehiculoTrasnsporte es una clase genérica
 * @author Felipe
 */
public abstract class VehiculoTransporte extends Vehiculo
{
    private int plazas;

    /**
     * Constructor por defecto
     */
    public VehiculoTransporte() 
    {
        super();
        plazas = 0;
    }

    /**
     * Constructor por parámetros
     * @param plazas indica el número de plazas del vehículo
     * @param matricula indica la matrícula del vehículo
     * @param dias_alquiler indica los días de alquiler del vehículo
     */
    public VehiculoTransporte(int plazas, String matricula, int dias_alquiler) {
        super(matricula, dias_alquiler);
        this.plazas = plazas;
    }

    /**
     * Muestra el número de plazas
     * @return número de plazas
     */
    public int getPlazas() {
        return plazas;
    }

    /**
     * Modifica el número de plazas
     * @param plazas nuevo número de plazas
     */
    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }
    
    /**
     * Calcula el importe del alquiler
     * @return indica el importe del alquiler
     */
    @Override
    public abstract double importeAlquiler();

    /**
     * El método recibo imprime un recibo de la factura
     */
    @Override
    public void recibo() 
    {
        System.out.println("Matrícula: " + super.getMatricula()
        + "\nDuración: " + super.getDias_alquiler()
        + "\nPlazas: " + plazas
        + "\nImporte: " + this.importeAlquiler() + " €");
    }
    
}
