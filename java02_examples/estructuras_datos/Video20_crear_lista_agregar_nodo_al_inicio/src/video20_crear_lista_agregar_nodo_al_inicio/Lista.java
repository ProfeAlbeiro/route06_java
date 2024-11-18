package video20_crear_lista_agregar_nodo_al_inicio;

public class Lista {
    int cont = 0;    
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
        this.cont++;
        if (estaVacia()) {
            this.inicio = new Nodo(dato,this.inicio);
            this.fin = this.inicio;
        } else {
            this.inicio = new Nodo(dato,this.inicio);
        }        
    }
    
    public void agregarAlFinal(String dato){
        this.cont++;
        if (estaVacia()) {
            this.inicio = new Nodo(dato);
            this.fin = this.inicio;
        } else {
            this.fin.siguiente = new Nodo(dato);
            this.fin = this.fin.siguiente;
        }
    }
    
    public int cantidadNodos(){
        return this.cont;
    }
    
    public String primerElemento(){
        return this.inicio.dato;
    }
    public String ultimoElemento(){
        return this.fin.dato;
    }
    
    public boolean buscarDato(String dato){
        boolean encontrado = false;
        Nodo aux = this.inicio;
        while (encontrado!=true && aux!=null) {            
            if (dato.equals(aux.dato)) {
                encontrado = true;
            } else {
                aux = aux.siguiente;
            }
            if (encontrado==true)break;
        }
        return encontrado;
    }
    
    public String eliminarDatoInicio(){
        String eliminado = this.inicio.dato;
        if (this.cont == 1) {
            this.inicio = null;
            this.fin = this.inicio;
        } else {
            this.inicio = this.inicio.siguiente;
        }
        this.cont--;
        return eliminado;
    }
    
    public String eliminarDatoFin(){
        String eliminado = this.fin.dato;
        Nodo aux = this.inicio;
        while (aux.siguiente!=this.fin) {            
            aux = aux.siguiente;
        }
        this.cont--;
        this.fin = aux;
        this.fin.siguiente = null;
        return eliminado;
    }
    
    public void mostrarLista(){
        Nodo aux = this.inicio;
        while (aux != null) {            
            System.out.print("[" + aux.dato + "] --> ");            
            aux = aux.siguiente;
        }
    }
}
