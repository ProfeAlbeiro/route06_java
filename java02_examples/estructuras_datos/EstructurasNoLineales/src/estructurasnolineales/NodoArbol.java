package estructurasnolineales;

public class NodoArbol {
    
    // Se crea el espacio para el valor y la recursividad del Nodo
    // Izquierdo y el Nodo Derecho
    private int valor;
    private NodoArbol nodoIzq;
    private NodoArbol nodoDer;
        
    // Se crea el constructor para recibir el valor
    public NodoArbol(int valor){
        this.valor = valor;
        this.nodoIzq = null;
        this.nodoDer = null;
        
    }
    
    // Se crean los métodos setter y getter
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public NodoArbol getNodoIzq() {
        return nodoIzq;
    }
    public NodoArbol getNodoDer() {
        return nodoDer;
    }
    
    public void insertar(int valor){
        if (valor < this.valor) {
            // Insertar en el lado izquierdo
            if (this.nodoIzq == null) {
                this.nodoIzq = new NodoArbol(valor);
            } else {
                // Recursivamente llama al mismo método
                this.nodoIzq.insertar(valor);
            }
        } else {
            // Insertar en el lado derecho
            if (this.nodoDer == null) {
                this.nodoDer = new NodoArbol(valor);
            } else {
                // Recursivamente llama al mismo método
                this.nodoDer.insertar(valor);
            }
        }
    }
    
}
