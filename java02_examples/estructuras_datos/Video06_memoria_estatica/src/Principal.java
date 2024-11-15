/**
 * Programa para almacenar 10 números positivos, en caso de existir
 * un número negativo, se termina
 */

// Importar la librería Scanner para ingresar números desde consola
import java.util.Scanner;

// Clase Principal
public class Principal {
    // Método principal (Inicial)
    public static void main(String[] args) {
        // Declarar y dimensionar arreglo
        int arrayNumeros[] = new int[10];
        // Crear objeto Scanner para ingresar datos desde consola
        Scanner sc= new Scanner (System.in, "ISO-8859-1");
        // Declarar variables 'num' para almacenar el valor e 'i' 
        // para que sirva como contador y 'tam' para saber cuántos
        // números almacenamos
        int num;
        int i = 0;
        int tam = 0;
        // Solicitar los números hasta que 'i' sea mayor a 10 o el
        // número sea negativo o 'cero'
        do {            
            System.out.print("Ingrese un número: ");
            num = sc.nextInt();
            // Si el número es positivo, lo almacena en el arreglo
            if (num>0) {
                arrayNumeros[i] = num;
                tam++;
            }
            i++;
            // rompe el cilco en caso que 'i' llegue a 10
            if (i==10)break;
            // si el número en negativo se rompe el cilco
        } while (num>0);
        System.out.print("Los números registrados fueron: ");
        // Mostrar en Pantalla los números que se almacenaron
        for (int j = 0; j < tam; j++) {
            System.out.print(" - " + arrayNumeros[j]);
        }
        System.out.println("");
    }
    
}
