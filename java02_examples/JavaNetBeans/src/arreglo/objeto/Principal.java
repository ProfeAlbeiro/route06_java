package arreglo.objeto;

/**
 *
 * @author ADMIN
 */
public class Principal {
    
    public static void main(String[] args) {
        /**
         * Determinar la edad mayor de varias personas
         */
        // 1. Se crear un arreglo para almacenar objetos de la Clase 'Persona'
           Persona arrayPersonas[] = {
               new Persona("Lorena", 20),
               new Persona("Armando", 18),
               new Persona("Mario", 15),
               new Persona("Rogelio", 25),
               new Persona("Maria", 10)                   
           };
           
           int edadMayor = EdadMayor.personaMayor(arrayPersonas);
           System.out.println("La edad mayor del arreglo es: " + edadMayor);
           
        
        // 2. Otra forma de ingresar datos de la persona al arreglo
        // Persona arrayPersonas[] = new Persona[5];
        // arrayPersonas[0] = new Persona("Juan", 20);
        // arrayPersonas[1] = new Persona("Ana", 18);       
        
    }
    
}
