
/**
 * Write a description of class Velero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Velero extends Barco 
{
    // Número de mastiles del velero
    private int numMastiles;

    /**
     * Constructor para objetos de la clase velero
     */
    public Velero(int numMastiles,String matricula, float eslora, int anioFabricacion) 
    {
        super(matricula, eslora, anioFabricacion);
        this.numMastiles = numMastiles;
    }

    /**
     * Devuelve el coeficiente de bernua del velero 
     * que se corresponde con el número de mástiles
     */
    @Override
    public int getCoeficienteBernua() 
    {
        return numMastiles;
    }

    /**
     * Devuelve un String con información básica del velero
     */
    @Override
    public String toString()
    {
        return super.toString() + "Número de mastiles: " + numMastiles + "\n";
    }
}