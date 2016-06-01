
/**
 * Write a description of class Alquiler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alquiler
{
    // Número de días que estará alquilado el amarre en el puerto
    private int numeroDias;
    // Cliente que alquila el amarre
    private Cliente cliente;
    // Barco para el que se ha alquilado el amarre
    private Barco barco;
    // Coste fijo del alquiler
    private static final int VALOR_FIJO_ALQUILER = 300;
    // Valor por el que se multiplica la eslora para calcular el alquiler
    private static final int MULTIPLICADOR_ESLORA = 10; 
    // Número del amarre alquilado
    private int numAmarre;

    /**
     * Constructor para objetos de la clase Alquiler
     */
    public Alquiler(int dias, Cliente cliente, Barco barco, int numAmarre) 
    {
        numeroDias = dias;
        this.cliente = cliente;
        this.barco = barco;
        this.numAmarre = numAmarre;
    }

    /**
     * Devuelve el precio del alquiler según el tipo de embarcación
     */
    public float getCosteAlquiler() 
    {
        return numeroDias * (barco.getEslora() * MULTIPLICADOR_ESLORA)
        + (VALOR_FIJO_ALQUILER * barco.getCoeficienteBernua());
    }
    
    public int getNumAmarre() 
    {
        return numAmarre;
    }

    /**
     * Devuelve un String con información básica del alquiler
     */
    @Override
    public String toString()
    {
        return "--- DATOS DEL ALQUILER ---\n" + cliente.toString() + "Matrícula del barco: " + 
        barco.getMatricula() + "\nDías de alquiler: " + numeroDias 
        + "\nPrecio: " + String.format("%.2f", getCosteAlquiler()) + "€\n";
    }
}