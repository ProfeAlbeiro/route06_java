/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionOO;

/**
 *
 * @author RPR-C80A406ES
 */
public class MayorEdad {
    
     public static int personaMayor(Persona[]persona){
        int mayor;
        mayor = persona[0].getEdad();
        int i = 1;
        while(i < persona.length){
            if (persona[i].getEdad() > mayor) {
                mayor = persona[i].getEdad();
            }
            i++;
        }
        return mayor;
    }
    
}
