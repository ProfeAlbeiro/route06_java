// Importaciones
import javax.swing.JOptionPane;

// Clase Principal
public class Principal {
    
    // Método principal
    public static void main(String[] args) {
        // Declarar variable para el tamaño del arreglo
        int tam;
        // Solicitar el tamaño del arreglo al usuario
        tam = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño del arreglo"));
        // Declarar arreglo y dimensionarlo con el tamaño ingresado por el usuario
        int arrayNumeros[] = new int[tam];
        // Llamar método para rellenar el arreglo
        rellenarArreglo(arrayNumeros);
        // Llamar método para mostrar los números del arreglo y su posición6
        mostrarArreglo(arrayNumeros);
    }
    
    // Método para llenar el arreglo
    public static void rellenarArreglo(int numeros[]){
        JOptionPane.showMessageDialog(null, "Ingresar los datos del arreglo");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(
                    null,"Ingresa el número " + (i + 1)));
        }
    }
    
    // Método para mostrar los datos del arreglo
    public static void mostrarArreglo(int numeros[]){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número " + (i + 1) + ": " + numeros[i]);
        }
    }
    
}
