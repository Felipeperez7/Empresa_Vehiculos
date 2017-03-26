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
public class Bus extends VehiculoTransporte
{

    public Bus() 
    {
        super();
    }

    public Bus(int plazas, String matricula, int dias_alquiler) 
    {
        super(plazas, matricula, dias_alquiler);
    }

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
    
    @Override
    public double importeAlquiler() {
        double alquiler = (50 * super.getDias_alquiler()) + (1.5 * super.getPlazas()) + (1.5 * super.getDias_alquiler()) + (2 * super.getPlazas());
        
        return alquiler;
    }
    
}
