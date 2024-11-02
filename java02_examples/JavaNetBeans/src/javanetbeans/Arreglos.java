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
         * Despu�s se mostrar� las calificaciones aprobadas.
         * Tambi�n se mostrar� cu�ntas calificaciones aprob�.
         */
        
        // 1. Se declara el arreglo para las calificaciones y se dimensiona
           double calif [] = new double[6];
           int cont = 0;
        // double[]calif = new double[6];
        
        // 2. Solicitar cada una de las calificaciones
        System.out.println("Ingrese las 6 calificaciones \n");
        for (int i = 0; i < calif.length ; i++) {
            calif[i] = Double.parseDouble(JOptionPane.showInputDialog(
                    null, "Ingrese la calificaci�n " + (i + 1))
            );
        }
        
        // 3. Se imprime el n�mero de calificaci�n y cu�nto obtuvo
        System.out.println("Mostrar calificaciones aprobatorias \n");
        for (int i = 0; i < calif.length ; i++) {
            if (calif[i] >= 3.5) {
                System.out.println("La calificaci�n " + (i + 1) + " se aprob� con " + calif[i]);
                cont++;
            }
        }
        
        // Se imprime la cantidad de notas aprobadas
        System.out.println("\nTotal de calificaciones aprobadas: " + cont);
        System.out.println("");
        
        // Si las notas aprobadas son menores o iguales a 3 imprime un mensaje de advertencia
        if (cont <= 3) {
            JOptionPane.showMessageDialog(null,"Puede reprobar el a�o!!!", "PELIGRO", JOptionPane.WARNING_MESSAGE);
        }
        
    }
    
}
