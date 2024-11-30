package estructurasnolineales;

public class Arbol {
    
    // Objeto tipo Nodo que inicie el árbol
    NodoArbol inicial;
    
    // Constructor vacío iniciando 'inicial' como nulo
    public Arbol(){
        this.inicial = null;
    }
    
    // Método para pasarle el valor al árbol
    public void insertarDato(int valor){
        if (this.inicial == null) {
            this.inicial = new NodoArbol(valor);
        } else {
            this.inicial.insertar(valor);
        }
    }
    
    // Método para disparar inorden
    public void dispararInorden(){
        this.inorden(this.inicial);
    }    
    // Método de inorden
    public void inorden(NodoArbol nodo){
        if (nodo == null) {
            return; // Detiene la recursividad
        } else {
            inorden(nodo.getNodoIzq());
            System.out.print(nodo.getValor() + " - ");
            inorden(nodo.getNodoDer());
        }
    }    
    // Método para disparar preorden
    public void dispararPreorden(){
        this.preorden(this.inicial);
    }    
    // Método de preorden
    public void preorden(NodoArbol nodo){
        if (nodo == null) {
            return; // Detiene la recursividad
        } else {
            System.out.print(nodo.getValor() + " - ");
            preorden(nodo.getNodoIzq());
            preorden(nodo.getNodoDer());
        }
    }
    
    // Método para disparar postorden
    public void dispararPostorden(){
        this.postorden(this.inicial);
    }    
    // Método de postorden
    public void postorden(NodoArbol nodo){
        if (nodo == null) {
            return; // Detiene la recursividad
        } else {
            postorden(nodo.getNodoIzq());
            postorden(nodo.getNodoDer());
            System.out.print(nodo.getValor() + " - ");
        }
    }
            
            
}
