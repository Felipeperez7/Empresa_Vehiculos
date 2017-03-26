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
public class Furgoneta extends VehiculoCarga
{

    public Furgoneta() 
    {
        super();
    }

    public Furgoneta(int tara, String matricula, int dias_alquiler) 
    {
        super(tara, matricula, dias_alquiler);
    }

    @Override
    public void recibo()
    {
        System.out.println("--------------------"
        + "\nFurgoneta"
        + "\n--------------------"
        +"\nMatrícula: " + super.getMatricula()
        + "\nDuración: " + super.getDias_alquiler()
        + "\nTara: " + super.getTara() + " Toneladas"
        + "\nImporte: " + this.importeAlquiler() + " €");
    }
    
    @Override
    public double importeAlquiler() {
        double alquiler = (50 * super.getDias_alquiler()) + (20 * super.getTara());
        
        return alquiler;
    }
    
}
