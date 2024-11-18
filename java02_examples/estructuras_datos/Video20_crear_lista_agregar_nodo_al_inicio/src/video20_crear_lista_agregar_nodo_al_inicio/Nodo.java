package video20_crear_lista_agregar_nodo_al_inicio;

/*
Cada vez que se crea un nuevo objeto de la clase 'Nodo',
Se estar� creando un nuevo Nodo.
*/

public class Nodo {
    String dato;
    Nodo siguiente; // Puntero que contendr� la direcci�n al siguiente Nodo 
    
    public Nodo(String dato, Nodo siguiente){
        this.dato = dato;
        this.siguiente = siguiente;
    }
    
    public Nodo(String dato){
        this.dato = dato;
        this.siguiente = null;
    }
}
