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
public abstract class VehiculoTransporte extends Vehiculo
{
    private int plazas;

    public VehiculoTransporte() 
    {
        super();
        plazas = 0;
    }

    public VehiculoTransporte(int plazas, String matricula, int dias_alquiler) {
        super(matricula, dias_alquiler);
        this.plazas = plazas;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }
    
    @Override
    public abstract double importeAlquiler();

    @Override
    public void recibo() 
    {
        System.out.println("Matrícula: " + super.getMatricula()
        + "\nDuración: " + super.getDias_alquiler()
        + "\nPlazas: " + plazas
        + "\nImporte: " + this.importeAlquiler() + " €");
    }
    
}
