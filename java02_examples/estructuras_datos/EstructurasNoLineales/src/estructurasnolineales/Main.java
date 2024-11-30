package estructurasnolineales;

public class Main {    
    public static void main(String[] args) {
        // Crear objeto arbol
        Arbol arbol = new Arbol();
        arbol.insertarDato(43);
        arbol.insertarDato(10);
        arbol.insertarDato(8);
        arbol.insertarDato(54);
        arbol.insertarDato(15);
        arbol.insertarDato(50);
        arbol.insertarDato(53);        
         // Imprimir InOrden
        System.out.println("\nINORDEN:");
        arbol.dispararInorden();        
        // Imprimir PreOrden
        System.out.println("\n\nPREORDEN:");
        arbol.dispararPreorden();
        // Imprimir PostOrden
        System.out.println("\n\nPOSTORDEN:");
        arbol.dispararPostorden();        
    }    
}
