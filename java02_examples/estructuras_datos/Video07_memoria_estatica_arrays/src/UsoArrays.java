
// Importar librer�as
import java.util.Arrays;
import javax.swing.JOptionPane;

public class UsoArrays {
    
    // M�todo para rellenar el arreglo
    public static void rellenarArreglo(int[]arr){
        // Declarar variables 'n' para recibir el n�mero e 'i' para contar
        int n, i = 0;        
        // Rellenar el arreglo con n�meros entre 'cero' al 10
        do {            
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor " + (i + 1)));
            // Controla que los n�meros est�n entre 'cero' y 10, de lo contrario
            // va a seguir solicitando el valor
            if (n >= 0 && n <= 10) {
                arr[i] = n;
                i++;
            }
        } while (i<5);
    }
    
    // M�todo para ordenar el arreglo
    public static void ordenarArreglo(int[]arr){        
        Arrays.sort(arr);
        UsoArrays.mostrarArreglo(arr);
    }
    
    // M�todo para mostrar el arreglo
    public static void mostrarArreglo(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Calificaci�n "+ (i + 1) + ": " + arr[i]);
        }
    }
    
}
