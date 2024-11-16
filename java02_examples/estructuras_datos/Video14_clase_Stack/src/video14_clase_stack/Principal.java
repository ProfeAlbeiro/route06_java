package video14_clase_stack;

import java.util.Scanner;
import java.util.Stack;

public class Principal {

    public static void main(String[] args) {
        int tam;
        Stack<Integer> pila = new Stack<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese cuántos elementos agregará: ");
        tam = sc.nextInt();
        System.out.println("Agregue los números a la Pila: ");
        for (int i = 0; i < tam; i++) {
            pila.push(sc.nextInt());
        }
        System.out.println("Elementos de la Pila: ");
        while (!pila.isEmpty()) {            
            System.out.println((int)pila.pop());
        }
    }
    
}
