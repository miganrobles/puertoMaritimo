
/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente
{
    // Nombre del cliente
    private String nombre;
    // DNI del cliente
    private String dni;

    /**
     * Constructor para objetos de la clase Cliente
     */
    public Cliente(String nombre, String dni) 
    {
        this.nombre = nombre;
        this.dni = dni;
    }

    /**
     * Devuelve el nombre del cliente
     */
    public String getNombre() 
    {
        return nombre;
    }

    /**
     * Devuelve el DNI del cliente
     */
    public String getDni() 
    {
        return null;
    }

    /**
     * Devuelve un String con la información básica del cliente
     */
    @Override
    public String toString()
    {
        return nombre + "   DNI: " + dni;
    }
}
