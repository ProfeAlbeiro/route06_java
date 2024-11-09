package arreglo.objeto;

/**
 *
 * @author ADMIN
 */
public class EdadMayor {
    /**
     * Devuelve la Edad de la Persona Mayor
     */
    public static int personaMayor(Persona[] persona){
        // 1. Se crea la variable 'mayor'
        int mayor;
        // 2. Se asigna a 'mayor' el valor de la primera persona (índice 0)
        mayor = persona[0].getEdad();
        // 3. Se ininica el contador 'i' en 1
        int i = 1;
        // 4. Se ejecuta la repetición segun la cantidad de personas en el arreglo
        while(i < persona.length){
            // 5. Se compara la edad de cada persona con el valor de 'mayor'
            if (persona[i].getEdad() > mayor) {
                // 6. Se almacena en 'mayor' si se cumple la condición
                mayor = persona[i].getEdad();
            }
            // 7. Se incrementa el contador 'i' en 1
            i++;
        }
        // 8. Se devuelve el valor de la variable 'mayor'
        return mayor;
    }       
    
}
