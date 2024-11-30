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
