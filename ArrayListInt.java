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
        int longitudBase = arrayDeEnteros.length; // Guardo tamaño
        // Creo una copia de si mismo con un espacio mas
        arrayDeEnteros = Arrays.copyOf(arrayDeEnteros, (longitudBase + 1));
        // Agrego el valor en la ultima posicion, que es el tamaño antes de la copia
        arrayDeEnteros[longitudBase] = valor;
    }
    
    /**
     * Agregamos un elemento en la posicion especificada
     */
    public void add(int posicion, int valor){
        int longitudBase = arrayDeEnteros.length; // Guardo tamaño
        if (posicion >= 0 && posicion < longitudBase){ // Si la posicion esta en rango y hay elementos
            // Esta comprobacion no funciona con 0 y 0, resuelto en el else
            if(posicion < longitudBase){
                int[] arrayTemp = new int[longitudBase + 1]; // Creo el nuevo array
                for (int i1 = 0; i1 < posicion; i1++){ // Guardo datos hasta llegar a posicion
                    arrayTemp[i1] = arrayDeEnteros[i1];
                }
                arrayTemp[posicion] = valor; // Guardo el nuevo dato en posicion
                for (int i2 = posicion + 1; i2 < longitudBase + 1; i2++){
                    // Guardo los siguientes datos hasta acabar
                    arrayTemp[i2] = arrayDeEnteros[i2 - 1];
                }
                arrayDeEnteros = arrayTemp; // Reasigno las referencias para quedarme con el array bueno
            }
        }else if (posicion == 0 && longitudBase == 0){
            // Si el array esta vacio y la posicion es cero, llama al otro metodo add
            add(valor);
        }
    }
    
    /**
     * Elimina la coleccion, y crea una vacia
     */
    public void clear(){
        arrayDeEnteros = new int[0];
    }
}
