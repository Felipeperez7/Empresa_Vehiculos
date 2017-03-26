/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 * La clase Camion nos indica un tipo de vehículo
 * @author Felipe
 */
public class Camion extends VehiculoCarga
{
    /**
     * Constructor por defecto
     */
    public Camion()
    {
        super();
    }
    
    /**
     * Constructor por parámetros
     * @param tara indica la tara del vehículo
     * @param matricula indica la matrícula del vehículo
     * @param dias_alquiler indica los dias de alquler del vehículo
     */
    public Camion(int tara, String matricula, int dias_alquiler) 
    {
        super(tara, matricula, dias_alquiler);
    }

    /**
     * El método recibo imprime un recibo de la factura
     */
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
    
    /**
     * Calcula el importe del alquiler
     * @return indica el importe del alquiler
     */
    @Override
    public double importeAlquiler() {
        double alquiler = (50 * super.getDias_alquiler()) + (20 * super.getTara()) + 40;
        
        return alquiler;
    }
    
}
