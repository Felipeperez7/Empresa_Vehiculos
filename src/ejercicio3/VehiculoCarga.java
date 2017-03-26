/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 * La clase VehiculoCarga es una clase genérica
 * @author Felipe
 */
public abstract class VehiculoCarga extends Vehiculo
{
    private int tara;

    /**
     * Constructor por defecto
     */
    public VehiculoCarga() 
    {
        super();
        tara = 0;
    }

    /**
     * Constructor por parámetros
     * @param tara indica la tara del vehículo
     * @param matricula indica la matrícula del vehículo
     * @param dias_alquiler indica los días de alquiler del vehículo
     */
    public VehiculoCarga(int tara, String matricula, int dias_alquiler) 
    {
        super(matricula, dias_alquiler);
        this.tara = tara;
    }

    /**
     * Muestra la tara
     * @return tara del vehículo
     */
    public int getTara() {
        return tara;
    }

    /**
     * Modifica la tara
     * @param tara nueva tara
     */
    public void setTara(int tara) {
        this.tara = tara;
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
        + "\nTara: " + tara + " Toneladas"
        + "\nImporte: " + this.importeAlquiler() + " €");
    }
    
}
