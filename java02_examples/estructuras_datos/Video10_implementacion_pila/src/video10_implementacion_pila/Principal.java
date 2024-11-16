package video10_implementacion_pila;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        // Declaración de la variable opción para el menu
        int opcion; 
        // Se crea una instancia de la clase Pila
        Pila obj = new Pila();
        // Se crea una instancia de la clase Scanner para ingresar datos
        Scanner op = new Scanner(System.in);        
        // Se ejecuta el menu hasta que 'opcion' sea igual a '4'
        do {
            System.out.println("\n----- Menú de la Pila ----- \n");
            System.out.println("1. Ingresar elementos (push)");
            System.out.println("2. Ingresar elementos (pop)");
            System.out.println("3. Mostrar elementos de la pila");
            System.out.println("4. Salir");
            System.out.print("\nIngrese una opción: ");
            opcion = op.nextInt();
            System.out.println("");
            
            switch (opcion) {
                case 1:
                    obj.push();
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.mostrarPila();
                    break;
                case 4:                    
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
            }
            
        } while (opcion != 4);
    }
    
}
