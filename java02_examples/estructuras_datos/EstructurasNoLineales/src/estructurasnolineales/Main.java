package estructurasnolineales;

public class Main {
    
    public static void main(String[] args) {
        // Crear objeto arbol
        Arbol arbol = new Arbol();
        arbol.insertar(43);
        arbol.insertar(10);
        arbol.insertar(8);
        arbol.insertar(54);
        arbol.insertar(15);
        arbol.insertar(50);
        arbol.insertar(53);
        
         // Imprimir PreOrden
        System.out.println("\nPREORDEN:");
        arbol.dispararPreorden();

        // Imprimir InOrden
        System.out.println("\n\nINORDEN:");
        arbol.dispararInorden();
        
        // Imprimir PostOrden
        System.out.println("\n\nPOSTORDEN:");
        arbol.dispararPostorden();
        
    }
    
}
