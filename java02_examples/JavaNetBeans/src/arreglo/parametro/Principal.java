package arreglo.parametro;

import javax.swing.JOptionPane;

public class Principal {
    
    // 1. M�todo Principal de la Aplicaci�n
    public static void main(String[] args) {
        int tam;
        tam = Integer.parseInt(JOptionPane.showInputDialog(
                null, "Ingrese el Tama�o del arreglo"
        ));
        int arrayNumeros[] = new int[tam];
        rellenarArreglo(arrayNumeros);
        mostrarArreglo(arrayNumeros);
    }
    
    // 2. Crear un m�todo para llenar el arreglo
    public static void rellenarArreglo(int numeros[]){
        JOptionPane.showMessageDialog(null, "Ingresar los datos del arreglo");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(
                    null, "Ingresa el n�mero " + (i + 1)
            ));
        }
    }
    // 3. Crear un m�todo para mostrar los datos del arreglo
    public static void mostrarArreglo(int numeros[]){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("N�mero" + (i + 1) + ": " + numeros[i]);
        }
    }
    
}
