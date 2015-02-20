
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
        int[] nuevoArray = new int[(longitudBase + 1)];
        for (int i = 0; i < longitudBase; i++){
            nuevoArray[i] = arrayDeEnteros[i];
        }
        nuevoArray[longitudBase] = valor;
        arrayDeEnteros = nuevoArray;
    }
}
