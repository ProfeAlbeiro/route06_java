package arreglo.parametro;

import javax.swing.JOptionPane;

public class Principal {
    
    // 1. Método Principal de la Aplicación
    public static void main(String[] args) {
        int tam;
        tam = Integer.parseInt(JOptionPane.showInputDialog(
                null, "Ingrese el Tamaño del arreglo"
        ));
        int arrayNumeros[] = new int[tam];
        rellenarArreglo(arrayNumeros);
        mostrarArreglo(arrayNumeros);
    }
    
    // 2. Crear un método para llenar el arreglo
    public static void rellenarArreglo(int numeros[]){
        JOptionPane.showMessageDialog(null, "Ingresar los datos del arreglo");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(
                    null, "Ingresa el número " + (i + 1)
            ));
        }
    }
    // 3. Crear un método para mostrar los datos del arreglo
    public static void mostrarArreglo(int numeros[]){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número" + (i + 1) + ": " + numeros[i]);
        }
    }
    
}
