package video20_crear_lista_agregar_nodo_al_inicio;

public class Lista {
    Nodo inicio, fin; // Punteros para acceder al 'inicio' y al 'fin' de la lista
    
    public Lista(){
        inicio = null;
        fin = null;
    }
    
    public boolean estaVacia(){
        /*
        if (inicio == null) {
            return true;
        } else {
            return false;
        }        
        */
        return inicio == null;
    }
    
    public void agregarAlInicio(String dato){
        if (estaVacia()) {
            this.inicio = new Nodo(dato,this.inicio);
            this.fin = this.inicio;
        } else {
            this.inicio = new Nodo(dato,this.inicio);
        }
    }
}
