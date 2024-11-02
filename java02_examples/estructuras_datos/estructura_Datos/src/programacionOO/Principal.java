/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionOO;

/**
 *
 * @author RPR-C80A406ES
 */
public class Principal {
    
    public static void main(String[] args) {        
        
        // 1. Se crear un arreglo para almacenar objetos de la Clase 'Persona'
        /*
        Persona arrayPersonas[] = {
            new Persona("Lorena", 20),
            new Persona("Armando", 18),
            new Persona("Mario", 15),
            new Persona("Rogelio", 25),
            new Persona("Maria", 10)                   
        };
        */
        
        // 2. Otra forma de ingresar datos de la persona al arreglo
        Persona arrayPersonas[] = new Persona[2];
        arrayPersonas[0] = new Persona("Juan", 20);
        arrayPersonas[1] = new Persona("Ana", 18);
        
        int edadMayor = MayorEdad.personaMayor(arrayPersonas);
        System.out.println("La edad mayor del arreglo es: " + edadMayor);
    }
    
}
