package video11_pila_agregar_buscar_eliminar;

public class Pila {
    // Declarar variables y arreglos
    private int tope = 0, maximo;
    private String pilaComidas[];
    
    // Contructor de '1' parámetro
    public Pila (int max){
        maximo = max;
        pilaComidas = new String[maximo];
    }
    
    // Método para agregar comida
    public void agregarComida(String comida){
        if (tope < maximo) {
            pilaComidas[tope] = comida;
            System.out.println("\nEl dato ha sido agregado.");
            tope++;
        } else {
            System.out.println("\nLa pila está llena.");
        }
    }
    
    // Método para eliminar comida
    public void eliminarComida(){
        if (tope > 0) {
            System.out.println("El dato ha sido eliminado.");
            tope--;
        } else {
            System.out.println("No hay datos para eliminar.");
        }
    }
    
    // Método para evaluar si la Pila está vacía
    public boolean estaVacia(){
        if (tope <= 0) {
            return true;
        } else {
            return false;
        }
    }
    
    // Método para buscar una comida
    public boolean buscarComida(String dato){
        boolean encontrado = false;
        if (!estaVacia()) {
            for (int i = (tope-1); i >= 0; i--) {
                if (pilaComidas[i].equals(dato)) {
                    encontrado = true;
                }
            }
        } else {
            System.out.print("\nNo existen datos para buscar. ");
        }
        return encontrado;
    }
    
    // Método para mostrar comidas
    public void mostrarComidas(){
        if (!estaVacia()) {
            for (int i = (tope-1); i >= 0; i--) {
                System.out.println(pilaComidas[i]);
            }
        } else {
            System.out.println("La pila está vacía.");
        }
    }
}
