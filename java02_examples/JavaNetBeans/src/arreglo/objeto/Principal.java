package arreglo.objeto;
/**
 *
 * @author ADMIN
 */
public class Principal {    
    /**
    * Determinar la edad mayor de varias personas
    */
    public static void main(String[] args) {
         /* Otra forma de ingresar datos de la persona al arreglo */ 
         // Persona arrayPersonas[] = new Persona[5];
         // arrayPersonas[0] = new Persona("Lorena", 20);
         // arrayPersonas[1] = new Persona("Armando", 18);         
        
        // 1. Se crea un arreglo para almacenar objetos de la Clase 'Persona'
        Persona arrayPersonas[] = {
            new Persona("Lorena", 20),
            new Persona("Armando", 18),
            new Persona("Mario", 15),
            new Persona("Rogelio", 25),
            new Persona("María", 10),
            new Persona("Jorge",45),
            new Persona("Cecilia",40)
        };
        
        // 2. Se pasa el arreglo a la Clase 'Edad Mayor' para procesarlo
        int edadMayor = EdadMayor.personaMayor(arrayPersonas);
        System.out.println("La edad mayor del arreglo es : " + edadMayor);
        
        // 3. Con un ciclo, Muestra en pantalla cada uno de los objetos del Arreglo arrayPersons
        System.out.println("Los datos del arreglo son : \n");
        for (int i = 0; i < arrayPersonas.length; i++) {
            // 4. Muestra en pantalla los datos de una persona. Nota: Se puede dejar o quitar el método toString()
            System.out.println("Datos de la Persona " + (i + 1) + ":\n" + arrayPersonas[i].toString() + "\n");
        }
    }
}
