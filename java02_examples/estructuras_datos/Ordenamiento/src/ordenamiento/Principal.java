package ordenamiento;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        int opcion = 0;
        int dato;        
        Scanner sc = new Scanner(System.in);        
        int arrayNum[] = {8,4,6,10,1};
        int mostrarArray[];
        
        do {
            System.out.println("\nDado el siguente arreglo:\n");
            System.out.println("\tarrayNum[] = {8, 4, 6, 10, 1, }");
            System.out.println("\n----- MENÚ ALGORITMOS ORDENAMIENTO -----\n");
            System.out.println("1. Insertion Sort");
            
            System.out.println("6. Salir");
            System.out.print("\nSeleccione una opción del menú: ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:                    
                    System.out.println("\nINSERTION SORT\n");
                    System.out.println("1. Ascendente");
                    System.out.println("2. Descendente");
                    System.out.print("\nSeleccione la forma de ordenar: ");                    
                    Case01InsertionSort insertionSort = new Case01InsertionSort();                        
                    dato = sc.nextInt();
                    if (dato == 1) {
                        insertionSort.ordenarAsc(arrayNum);
                        insertionSort.mostrarArr();
                    } else {
                        insertionSort.ordenarDesc(arrayNum);
                        insertionSort.mostrarArr();
                    }
                    break;
                case 6:                    
                    System.out.println("Programa Finalizado");
                    break;
                default:
                    System.out.println("Seleccione la opción correcta");
            }
        
        } while (opcion!=6);
        
    }
    
}
