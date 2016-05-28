/**
 * Abstract class Barco - write a description of the class here
 * 
 * @author: 
 * Date: 
 */

public abstract class Barco
{
    // Matricula del barco
    private String matricula;
    // Largo del barco en metros
    private float eslora;
    // Año de fabricación
    private int anioFabricacion;

    /**
     * Contructor clase Barco
     */
    public Barco(String matricula, float eslora, int anioFabricacion) 
    {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    /**
     * Devuelve la matricula del barco
     */
    public String getMatricula() 
    {
        return matricula;
    }

    /**
     * Devuelve los metros de eslora del barco
     */
    public float getEslora() 
    {
        return eslora;
    }

    /**
     * Devuelve el año de fabricación
     */
    public int getAnioFabricacion() 
    {
        return anioFabricacion;
    }

    /**
     * Metodo abstracto.
     * Devuelve el coeficiente de bernua
     */
    public abstract int getCoeficienteBernua();

    /**
     * Devuelve un String con información básica del barco 
     */
    @Override
    public String toString()
    {
        return "Matrícula: " + matricula + "\n" + "Eslora: " + eslora + " m\n"+
                "Año de fabricación: " + anioFabricacion + "\n" +
                "Coeficiente de bernua: " + getCoeficienteBernua() + "\n";
    }
}
