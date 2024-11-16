package video16_referencias_a_objetos;

public class Principal {

    public static void main(String[] args) {
        
        Persona p1 = new Persona("José",40);
        Persona p2 = new Persona("Ana",12);
        System.out.println("\nPersona 1. " + p1);
        System.out.println("\nPersona 2. " + p2);
        System.out.println("");
        
        p2 = p1;
        
        System.out.println("Después de hacer p2 = p1");
        System.out.println("\nPersona 1. " + p1);
        System.out.println("\nPersona 2. " + p2);
        
        
    }
    
}
