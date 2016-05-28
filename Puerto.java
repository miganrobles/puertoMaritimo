
/**
 * Write a description of class Puerto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puerto
{
    // Almacena los alquileres
    private Alquiler[] alquileres;
    // Número de amarres que tiene el puerto
    private static final int NUMERO_AMARRES = 4;

    /**
     * Constructor para objetos de la clase Puerto
     */
    public Puerto() 
    {
        alquileres = new Alquiler[NUMERO_AMARRES];
    }

    /**
     * Realiza el alquiler del primer amarre que encuentre libre y devuelve el número del amarre
     * Si no se ha podido añadir por que estén todos ocupados devoverá -1
     */
    public int addAlquiler(int numeroDias, Cliente cliente, Barco barco) 
    {
        int numAmarre = -1;
        for (int i = 0; i < NUMERO_AMARRES && numAmarre == -1; i++) {
            if (alquileres[i] == null) {
                alquileres[i] = new Alquiler(numeroDias, cliente, barco);
                numAmarre = i;
            }
        }
        return numAmarre;
    }

    /**
     * Muestra el estado de los amarres
     * Si están ocupados muestra el precio del alquiler
     */
    public void verEstadoAmarres()
    {
        for (int i = 0; i < alquileres.length; i++) {
            if (alquileres[i] == null) {
                System.out.println("Amarre " + i + " libre");
            }
            else {
                System.out.println("Amarre " + i + " ocupado, precio del alquiler: " + alquileres[i].getCosteAlquiler() + "€");
            }
        } 
    }

    /**
     * Liquida un aquiler pasándole la posción del mismo y devuelve el coste
     * Si el amarre situado en la posición introducida no está alquilado o 
     * la posición introducida no es correcta muestra un mensage por pantalla y devuelve 0
     */
    public float liquidarAlquiler(int posicion)
    {
        float costeAlquiler = 0;
        if (posicion >= 0 && posicion < NUMERO_AMARRES) {
            if (alquileres[posicion] != null) {
                costeAlquiler = alquileres[posicion].getCosteAlquiler();
                alquileres[posicion] = null;
            }
            else {
                System.out.println("El número de amarre introducido no está alquilado");
            }
        }
        else {
            System.out.println("El valor introcudido no es correcto");
        } 
        return costeAlquiler;
    }
}