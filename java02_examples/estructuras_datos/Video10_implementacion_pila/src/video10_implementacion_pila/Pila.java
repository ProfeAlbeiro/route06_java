package video10_implementacion_pila;

import java.util.Scanner;

public class Pila {
    // Declarando e iniciando variables
    int tope = -1;
    // Declarando y dimensionando arreglos
    int pilaNumerica[] = new int[5];
    // Creando objeto 'sc' para ingresar datos desde la consola
    Scanner sc = new Scanner(System.in);
    
    // Método para ingresar elementos a la Pila
    public void push(){
        if (tope >= pilaNumerica.length - 1) {
            System.out.println("La Pila está llena");
        } else {
            tope+=1;
            System.out.print("Ingrese el dato: ");
            pilaNumerica[tope] = sc.nextInt();
            System.out.println(tope);
        }
    }
    
    // Método para retirar elementos de la Pila
    public void pop(){
        if (tope == -1) {
            System.out.println("La Pila está vacía");
        } else {
            pilaNumerica[tope] = 0;
            System.out.println("Se ha Eliminado un elemento de la Pila");            
            tope--;
        }
    }
    
    // Método para mostrar los elementos de la Pila
    public void mostrarPila(){
        for (int i = pilaNumerica.length - 1; i >= 0; i--) {
            System.out.println("Datos de la Pila: " + pilaNumerica[i]);
        }        
        System.out.println(tope);
    }
    
    
}
