package video11_pila_agregar_buscar_eliminar;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        // Declarar variables, arreglos u objetos
        int tam, opcion;
        String dato;
        Scanner sc = new Scanner(System.in);
        
        // Solicitar el tamaño de la Pila
        System.out.print("Elija el tamaño de la Pila: ");
        tam = sc.nextInt();
        
        // Crear una instancia de la Clase Pila para pasarle el tamaño 'tam'
        Pila p1 = new Pila(tam);
        
        // Se repite el ciclo hasta que la 'opcion' se diferente de '5'
        do {            
            System.out.println("\n----- Menú Restaurante -----");
            System.out.println("1. Agregar comida");
            System.out.println("2. Eliminar comida");
            System.out.println("3. Mostrar las comidas");
            System.out.println("4. Buscar una comida");
            System.out.println("5. Salir\n");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();
            System.out.println("");
            
            switch (opcion) {
                case 1:
                    System.out.print("¿Cuál comida agregará?: ");
                    dato = sc.next();
                    p1.agregarComida(dato);
                    break;
                case 2:                    
                    p1.eliminarComida();
                    break;
                case 3:                    
                    p1.mostrarComidas();
                    break;
                case 4:
                    System.out.print("¿Cuál comida está buscando?: ");
                    dato = sc.next();
                    if (p1.buscarComida(dato)) {
                        System.out.print("Comida encontrada.\n");
                    } else {
                        System.out.print("Comida No encontrada.\n");
                    }
                    break;
                case 5:                    
                    break;
                default:
                    System.out.println("Elija una opción correcta (1 al 5).");
            }
        } while (opcion!=5);
        
        
        
        
    }
    
}
