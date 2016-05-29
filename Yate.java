
/**
 * Write a description of class Yate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Yate extends EmbarcacionDeportiva
{
    // Número de camarotes del yate
    private int camarotes;

    /**
     * Constructor para objetos de la clase Yate
     */
    public Yate( int camarotes, int potencia, String matricula, float eslora, int anioFabricacion) 
    {
        super(potencia, matricula, eslora, anioFabricacion);
        this.camarotes = camarotes;
    }

    /**
     * Devuelve el coeficiente de bernua del yate 
     * que se corresponde con el número de camarotes 
     */
    @Override
    public int getCoeficienteBernua() 
    {
         return camarotes + super.getCoeficienteBernua();
    }

    /**
     * Devuelve un String con información básica del yate
     */
    @Override
    public String toString()
    {
        return super.toString() + "Número de camarotes: " + camarotes + "\n";
    }
}