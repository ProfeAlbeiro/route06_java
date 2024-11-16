
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Principal {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> listaNumerica = new ArrayList<Integer>(); 
        int n,i=0;
        do {            
            n = Integer.parseInt(JOptionPane.showInputDialog(
                    null, "Ingrese el número " + (i + 1) + ":"));
            if (n>=0) {
                listaNumerica.add(n);
                i++;
            }
        } while (n>=0);
        for (i = 0; i < listaNumerica.size(); i++) {
            System.out.println("Elemento " + (i + 1) + ": " + listaNumerica.get(i));
        }
        if (listaNumerica.isEmpty()) {
            System.out.println("La lista está vacía");
        } else {
            System.out.println("La lista no está vacía");
        }
    }    
}
