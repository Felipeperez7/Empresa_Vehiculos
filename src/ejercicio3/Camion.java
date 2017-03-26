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
public class Camion extends VehiculoCarga
{

    public Camion()
    {
        super();
    }

    public Camion(int tara, String matricula, int dias_alquiler) 
    {
        super(tara, matricula, dias_alquiler);
    }

    @Override
    public void recibo()
    {
        System.out.println("--------------------"
        + "\nCamión"
        + "\n--------------------"
        +"\nMatrícula: " + super.getMatricula()
        + "\nDuración: " + super.getDias_alquiler()
        + "\nTara: " + super.getTara() + " Toneladas"
        + "\nImporte: " + this.importeAlquiler() + " €");
    }
    
    
    @Override
    public double importeAlquiler() {
        double alquiler = (50 * super.getDias_alquiler()) + (20 * super.getTara()) + 40;
        
        return alquiler;
    }
    
}
