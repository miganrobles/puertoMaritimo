
/**
 * Write a description of class EmbarcacionDeportiva here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class EmbarcacionDeportiva extends Barco 
{
    // Potencia en CV
    private int potencia;

    /**
     * Constructor para objetos de la clase EmbarcacionDeportiva
     */
    public EmbarcacionDeportiva(int potencia, String matricula, float eslora, int anioFab) 
    {
        super(matricula, eslora, anioFab);
        this.potencia = potencia;
    }

    /**
     * Devuelve le coeficiente de bernua que será la potencia
     */
    @Override
    public int getCoeficienteBernua()
    {
        return potencia;
    }

    /**
     * Devuelve un String con información básica de la embarcación deportiva
     */
    @Override 
    public String toString()
    {
        return super.toString() + "Potencia en CV: " + potencia + "\n";
    }    
}
