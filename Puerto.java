import java.util.ArrayList;

/**
 * Write a description of class Puerto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puerto
{
    // Almacena los alquileres
    private ArrayList<Alquiler> alquileres;
    // Número de amarres que tiene el puerto
    private static final int NUMERO_AMARRES = 4;

    /**
     * Constructor para objetos de la clase Puerto
     */
    public Puerto() 
    {
        alquileres = new ArrayList<>();
    }

    /**
     * Realiza el alquiler del primer amarre que encuentre libre y devuelve el número del amarre
     * Si no se ha podido añadir por que estén todos ocupados devoverá -1
     */
    public int addAlquiler(int numeroDias, Cliente cliente, Barco barco) 
    {
        int numAmarre = -1;
        if (alquileres.size() < NUMERO_AMARRES) {
            for (int index = 0; index < NUMERO_AMARRES && numAmarre == -1; index++) {
                if (estadoAmarre(index) == null) {
                    numAmarre = index;
                    alquileres.add(new Alquiler(numeroDias, cliente, barco, numAmarre));
                }
            }          
        }
        return numAmarre;
    }

    /**
     * Se le pasa un número de amarre y devuleve null si esta libre
     * o el alquiler si no lo está
     */
    private Alquiler estadoAmarre(int numeroAmarre)
    {
        Alquiler alquiler = null;
        int index = 0;
        int amarresAlquilados = alquileres.size();
        while (index < amarresAlquilados && alquiler == null)  {
            if (alquileres.get(index).getNumAmarre() == numeroAmarre) {
                alquiler = alquileres.get(index);
            }
            index++;
        }
        return alquiler;
    }

    /**
     * Muestra el estado de los amarres
     * Si están ocupados muestra el precio del alquiler
     */
    public void verEstadoAmarres()
    {
        for (int index = 0; index < NUMERO_AMARRES; index++) {
            Alquiler alquiler = estadoAmarre(index);
            if (alquiler == null) {
                System.out.println("Amarre " + index + " libre");
            }
            else {
                System.out.println("Amarre " + index + " ocupado, precio del alquiler: " 
                    + alquiler.getCosteAlquiler() + "€");
            }
        } 
    }

    /**
     * Liquida un aquiler pasándole la posción del amarre y devuelve el coste 
     * o devuelve -1 si el amarre no está alquilado
     */
    public float liquidarAlquiler(int posicion)
    {
        float costeAlquiler = -1;
        if (alquileres.size() > 0) {
            Alquiler alquiler = estadoAmarre(posicion);
            if (alquiler != null) {
                costeAlquiler = alquiler.getCosteAlquiler();
                alquileres.remove(alquiler);
            }
        }
        return costeAlquiler;
    }
}