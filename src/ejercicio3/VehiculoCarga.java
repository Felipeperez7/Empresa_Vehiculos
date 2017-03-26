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
public abstract class VehiculoCarga extends Vehiculo
{
    private int tara;

    public VehiculoCarga() 
    {
        super();
        tara = 0;
    }

    public VehiculoCarga(int tara, String matricula, int dias_alquiler) 
    {
        super(matricula, dias_alquiler);
        this.tara = tara;
    }

    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }
    
    @Override
    public abstract double importeAlquiler();

    @Override
    public void recibo() 
    {
        System.out.println("Matrícula: " + super.getMatricula()
        + "\nDuración: " + super.getDias_alquiler()
        + "\nTara: " + tara + " Toneladas"
        + "\nImporte: " + this.importeAlquiler() + " €");
    }
    
}
