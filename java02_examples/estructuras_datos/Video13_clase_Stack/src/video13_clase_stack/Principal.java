package video13_clase_stack;

import java.util.Scanner;
import java.util.Stack;

public class Principal {

    public static void main(String[] args) {
        Stack<String> pila = new Stack<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 5 palabras");
        for (int i = 0; i < 5; i++) {
            pila.push(sc.next());
        }
        System.out.println("Elementos de la Pila: ");
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }
    }
    
}
