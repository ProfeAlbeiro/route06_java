package video15_pila_objetos;

import java.util.Scanner;
import java.util.Stack;

public class Principal {

    public static void main(String[] args) {
        int cant, k = 0, ab;
        Scanner sc = new Scanner(System.in);
        Stack<Producto> p = new Stack<Producto>();
        Producto prod;
        System.out.print("Ingrese la cantidad de Productos: ");
        cant = sc.nextInt();        
        for (int i = 0; i < cant; i++) {
            System.out.println("\nIngrese el código, nombre y cantidad en Stock del Producto " + (k + 1) + ":");
            prod = new Producto(
                sc.nextInt(),
                sc.next(),
                sc.nextInt()
            );
            p.push(prod);
            k++;
        }
        System.out.println("\nStock menor a 10:");
        while (!p.isEmpty()) {            
            prod = p.pop();
            ab = prod.getStock();
            if (ab < 10) {
                prod.mostrarProducto();
            }
        }
        System.out.println("");
        
        
    }
    
}
