package javanetbeans;

/**
 *
 * @author ADMIN
 */
import javax.swing.JOptionPane;
public class Arreglos {
    
    public static void main(String[] args) {
        /**
         * Se pide ingresar las 6 calificaciones de un estudiante, en un arreglo.
         * Después se mostrará las calificaciones aprobadas.
         * También se mostrará cuántas calificaciones aprobó.
         */
        
        // 1. Se declara el arreglo para las calificaciones y se dimensiona
           double calif [] = new double[6];
           int cont = 0;
        // double[]calif = new double[6];
        
        // 2. Solicitar cada una de las calificaciones
        System.out.println("Ingrese las 6 calificaciones \n");
        for (int i = 0; i < calif.length ; i++) {
            calif[i] = Double.parseDouble(JOptionPane.showInputDialog(
                    null, "Ingrese la calificación " + (i + 1))
            );
        }
        
        // 3. Se imprime el número de calificación y cuánto obtuvo
        System.out.println("Mostrar calificaciones aprobatorias \n");
        for (int i = 0; i < calif.length ; i++) {
            if (calif[i] >= 3.5) {
                System.out.println("La calificación " + (i + 1) + " se aprobó con " + calif[i]);
                cont++;
            }
        }
        
        // Se imprime la cantidad de notas aprobadas
        System.out.println("\nTotal de calificaciones aprobadas: " + cont);
        System.out.println("");
        
        // Si las notas aprobadas son menores o iguales a 3 imprime un mensaje de advertencia
        if (cont <= 3) {
            JOptionPane.showMessageDialog(null,"Puede reprobar el año!!!", "PELIGRO", JOptionPane.WARNING_MESSAGE);
        }
        
    }
    
}
