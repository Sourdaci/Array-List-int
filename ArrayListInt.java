import java.util.Arrays;
/**
 * Coleccion de enteros
 * Interfaz ArrayList
 * Implementacion Array
 */
public class ArrayListInt
{
    // instance variables - replace the example below with your own
    private int[] arrayDeEnteros;

    /**
     * Creamos el array vacio
     */
    public ArrayListInt()
    {
        arrayDeEnteros = new int[0];
    }

    /**
     * Agregamos un entero al final del array
     */
    public void add(int valor){
        int longitudBase = arrayDeEnteros.length;
        arrayDeEnteros = Arrays.copyOf(arrayDeEnteros, (longitudBase + 1));
        arrayDeEnteros[longitudBase] = valor;
    }
}
