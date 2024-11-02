package sesion01;

import javax.swing.JOptionPane;
/**
 *
 * @author RPR-C80A406ES
 */
public class PrimerosNumeros {
    public static void main(String[] args) {
         /**
         * Se pide ingresar las 6 calificaciones de un estudiante, en un arreglo.
         * Después se mostrará las calificaciones aprobadas.
         * También se mostrará cuántas calificaciones aprobó.
         */
        // Declaración del arreglo y Dimensión
        double[] calificacion = new double[6];
        int cont = 0;
        
        // Solicitar Datos
        for (int i = 0; i < calificacion.length; i++) {
            calificacion[i] = Double.parseDouble(JOptionPane.showInputDialog(
                    null, "Ingrese la calificación " + (i + 1) + ":")
            );
        }
        // Imprimir las notas
        for (int i = 0; i < calificacion.length; i++) {
            if (calificacion[i] >= 3) {
                System.out.println("Aprobó la Nota " + (i + 1) + " con: " + calificacion[i]);
                cont++;
            }
        }        
        System.out.println("Las notas que aprobó fueron: " + cont);
    }
}
