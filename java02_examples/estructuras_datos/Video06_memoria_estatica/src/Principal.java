/**
 * Programa para almacenar 10 n�meros positivos, en caso de existir
 * un n�mero negativo, se termina
 */

// Importar la librer�a Scanner para ingresar n�meros desde consola
import java.util.Scanner;

// Clase Principal
public class Principal {
    // M�todo principal (Inicial)
    public static void main(String[] args) {
        // Declarar y dimensionar arreglo
        int arrayNumeros[] = new int[10];
        // Crear objeto Scanner para ingresar datos desde consola
        Scanner sc= new Scanner (System.in, "ISO-8859-1");
        // Declarar variables 'num' para almacenar el valor e 'i' 
        // para que sirva como contador y 'tam' para saber cu�ntos
        // n�meros almacenamos
        int num;
        int i = 0;
        int tam = 0;
        // Solicitar los n�meros hasta que 'i' sea mayor a 10 o el
        // n�mero sea negativo o 'cero'
        do {            
            System.out.print("Ingrese un n�mero: ");
            num = sc.nextInt();
            // Si el n�mero es positivo, lo almacena en el arreglo
            if (num>0) {
                arrayNumeros[i] = num;
                tam++;
            }
            i++;
            // rompe el cilco en caso que 'i' llegue a 10
            if (i==10)break;
            // si el n�mero en negativo se rompe el cilco
        } while (num>0);
        System.out.print("Los n�meros registrados fueron: ");
        // Mostrar en Pantalla los n�meros que se almacenaron
        for (int j = 0; j < tam; j++) {
            System.out.print(" - " + arrayNumeros[j]);
        }
        System.out.println("");
    }
    
}
