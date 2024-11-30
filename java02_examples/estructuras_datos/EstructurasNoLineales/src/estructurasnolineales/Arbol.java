package estructurasnolineales;

public class Arbol {
    
    // Objeto tipo Nodo que inicie el �rbol
    NodoArbol inicial;
    
    // Constructor vac�o iniciando 'inicial' como nulo
    public Arbol(){
        this.inicial = null;
    }
    
    // M�todo para pasarle el valor al �rbol
    public void insertarDato(int valor){
        if (this.inicial == null) {
            this.inicial = new NodoArbol(valor);
        } else {
            this.inicial.insertar(valor);
        }
    }
    
    // M�todo para disparar inorden
    public void dispararInorden(){
        this.inorden(this.inicial);
    }    
    // M�todo de inorden
    public void inorden(NodoArbol nodo){
        if (nodo == null) {
            return; // Detiene la recursividad
        } else {
            inorden(nodo.getNodoIzq());
            System.out.print(nodo.getValor() + " - ");
            inorden(nodo.getNodoDer());
        }
    }    
    // M�todo para disparar preorden
    public void dispararPreorden(){
        this.preorden(this.inicial);
    }    
    // M�todo de preorden
    public void preorden(NodoArbol nodo){
        if (nodo == null) {
            return; // Detiene la recursividad
        } else {
            System.out.print(nodo.getValor() + " - ");
            preorden(nodo.getNodoIzq());
            preorden(nodo.getNodoDer());
        }
    }
    
    // M�todo para disparar postorden
    public void dispararPostorden(){
        this.postorden(this.inicial);
    }    
    // M�todo de postorden
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
