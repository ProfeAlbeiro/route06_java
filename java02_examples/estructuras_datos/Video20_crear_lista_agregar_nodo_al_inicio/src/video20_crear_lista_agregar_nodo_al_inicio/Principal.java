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
                System.out.println("\n----- MEN� LISTAS ENLAZADAS -----\n");
                System.out.println(" 1. Agregar nodo al inicio");
                System.out.println(" 2. Agregar nodo al final");
                System.out.println(" 3. Buscar el dato de un nodo");
                System.out.println(" 4. Cantidad de nodos");
                System.out.println(" 5. Primer Nodo (dato) de la lista");
                System.out.println(" 6. �ltimo Nodo (dato) de la lista");
                System.out.println(" 7. Eliminar nodo del inicio de la lista");
                System.out.println(" 8. Eliminar nodo del final de la lista");
                System.out.println(" 9. Lista de nodos vac�a?");
                System.out.println("10. Mostrar la lista de nodos");
                System.out.println("11. Salir");
                System.out.print("\nSeleccione una opci�n del men�: ");
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
                            System.out.println("\nEl dato SE encontr�");
                        } else {
                            System.out.println("\nEl dato NO se encontr�");
                        }                        
                        break;
                    case 4:
                        System.out.println("\nLa cantidad de nodos es: " + miLista.cantidadNodos());
                        break;
                    case 5:
                        System.out.println("\nEl primer Nodo (dato) de la lista es: " + miLista.primerElemento());
                        break;
                    case 6:
                        System.out.println("\nEl �ltimo Nodo (dato) de la lista es: " + miLista.ultimoElemento());
                        break;
                    case 7:
                        System.out.println("\nNodo del inicio eliminado de la lista: " + miLista.eliminarDatoInicio());
                        break;
                    case 8:
                        System.out.println("\nNodo del final eliminado de la lista: " + miLista.eliminarDatoFin());

                        break;
                    case 9:
                        if (miLista.estaVacia()) {
                            System.out.println("\nLa lista EST� vac�a");
                        } else {
                            System.out.println("\nLa lista NO est� vac�a");
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
                        System.out.println("Seleccione la opci�n correcta");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error. Ingrese un n�mero entero: " + e.getMessage());
            }
        } while (opcion!=11);
        
    }
    
}
