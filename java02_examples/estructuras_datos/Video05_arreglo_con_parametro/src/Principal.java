// Importaciones
import javax.swing.JOptionPane;

// Clase Principal
public class Principal {
    
    // M�todo principal
    public static void main(String[] args) {
        // Declarar variable para el tama�o del arreglo
        int tam;
        // Solicitar el tama�o del arreglo al usuario
        tam = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tama�o del arreglo"));
        // Declarar arreglo y dimensionarlo con el tama�o ingresado por el usuario
        int arrayNumeros[] = new int[tam];
        // Llamar m�todo para rellenar el arreglo
        rellenarArreglo(arrayNumeros);
        // Llamar m�todo para mostrar los n�meros del arreglo y su posici�n6
        mostrarArreglo(arrayNumeros);
    }
    
    // M�todo para llenar el arreglo
    public static void rellenarArreglo(int numeros[]){
        JOptionPane.showMessageDialog(null, "Ingresar los datos del arreglo");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(
                    null,"Ingresa el n�mero " + (i + 1)));
        }
    }
    
    // M�todo para mostrar los datos del arreglo
    public static void mostrarArreglo(int numeros[]){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("N�mero " + (i + 1) + ": " + numeros[i]);
        }
    }
    
}
