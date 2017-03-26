/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 * La clase Bus nos indica un tipo de vehículo
 * @author Felipe
 */
public class Bus extends VehiculoTransporte
{
    /**
     * Constructor por defecto
     */
    public Bus() 
    {
        super();
    }

    /**
     * Constructor por parametros
     * @param plazas indica el numero de plazas del vehículo
     * @param matricula indica la matrícula del vehículo
     * @param dias_alquiler indica los días de alquiler del vehículos
     */
    public Bus(int plazas, String matricula, int dias_alquiler) 
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
        + "\nBUS"
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
        double alquiler = (50 * super.getDias_alquiler()) + (1.5 * super.getPlazas()) + (1.5 * super.getDias_alquiler()) + (2 * super.getPlazas());
        
        return alquiler;
    }
    
}
