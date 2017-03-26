/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 * La clase coche nos indica un tipo de vehículo
 * @author Felipe
 */
public class Coche extends VehiculoTransporte
{
    /**
     * Constructor por defecto
     */
    public Coche() 
    {
        super();
    }

    /**
     * Constructor por parámetros
     * @param plazas indica el número de plazas del vehículo
     * @param matricula indica la matrícula del vehículo
     * @param dias_alquiler indica los días de alquiler del vehículo
     */
    public Coche(int plazas, String matricula, int dias_alquiler) 
    {
        super(plazas, matricula, dias_alquiler);
    }
    
    /**
     * El método recibo imprime un recibo de la factura
     */
    @Override
    public void recibo()
    {
        System.out.println("--------------------"
        + "\nCOCHE"
        + "\n--------------------"
        +"\nMatrícula: " + super.getMatricula()
        + "\nDuración: " + super.getDias_alquiler()
        + "\nPlazas: " + super.getPlazas()
        + "\nImporte: " + this.importeAlquiler() + " €");
    }
    
    /**
     * Calcula el importe del alquiler
     * @return indica el importe del alquiler
     */
    @Override
    public double importeAlquiler() {
        double alquiler = (50 * super.getDias_alquiler()) + (1.5 * super.getPlazas()) + (1.5 * super.getDias_alquiler());
        
        return alquiler;
    }
    
}
