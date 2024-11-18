package video20_crear_lista_agregar_nodo_al_inicio;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        int opcion = 0;
        String dato;
        Lista miLista = new Lista();
        Scanner sc = new Scanner(System.in);
        
        do {
            try {                
                System.out.println("\n----- MENÚ LISTAS ENLAZADAS -----\n");
                System.out.println(" 1. Agregar nodo al inicio");
                System.out.println(" 2. Agregar nodo al final");
                System.out.println(" 3. Buscar el dato de un nodo");
                System.out.println(" 4. Cantidad de nodos");
                System.out.println(" 5. Primer Nodo (dato) de la lista");
                System.out.println(" 6. Último Nodo (dato) de la lista");
                System.out.println(" 7. Eliminar nodo del inicio de la lista");
                System.out.println(" 8. Eliminar nodo del final de la lista");
                System.out.println(" 9. Lista de nodos vacía?");
                System.out.println("10. Mostrar la lista de nodos");
                System.out.println("11. Salir");
                System.out.print("\nSeleccione una opción del menú: ");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.print("\nIngrese el dato del Nodo al inicio: ");
                        dato = sc.next();
                        miLista.agregarAlInicio(dato);
                        break;
                    case 2:
                        System.out.print("\nIngrese el dato del Nodo al final: ");
                        dato = sc.next();
                        miLista.agregarAlFinal(dato);
                        break;
                    case 3:
                        System.out.print("\nIngrese dato del Nodo a buscar: ");
                        dato = sc.next();
                        if (miLista.buscarDato(dato)) {
                            System.out.println("\nEl dato SE encontró");
                        } else {
                            System.out.println("\nEl dato NO se encontró");
                        }                        
                        break;
                    case 4:
                        System.out.println("\nLa cantidad de nodos es: " + miLista.cantidadNodos());
                        break;
                    case 5:
                        System.out.println("\nEl primer Nodo (dato) de la lista es: " + miLista.primerElemento());
                        break;
                    case 6:
                        System.out.println("\nEl último Nodo (dato) de la lista es: " + miLista.ultimoElemento());
                        break;
                    case 7:
                        System.out.println("\nNodo del inicio eliminado de la lista: " + miLista.eliminarDatoInicio());
                        break;
                    case 8:
                        System.out.println("\nNodo del final eliminado de la lista: " + miLista.eliminarDatoFin());

                        break;
                    case 9:
                        if (miLista.estaVacia()) {
                            System.out.println("\nLa lista ESTÁ vacía");
                        } else {
                            System.out.println("\nLa lista NO está vacía");
                        }
                        break;
                    case 10:
                        System.out.println("");
                        miLista.mostrarLista();
                        System.out.println("");
                        break;
                    case 11:
                        System.out.println("\nPrograma Finalizado.\n");
                        break;
                    default:
                        System.out.println("Seleccione la opción correcta");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error. Ingrese un número entero: " + e.getMessage());
            }
        } while (opcion!=11);
        
    }
    
}
