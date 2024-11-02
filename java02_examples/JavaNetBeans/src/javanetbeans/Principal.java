/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javanetbeans;

/**
 *
 * @author ADMIN
 */
public class Principal {
    
    public static void main(String[] args) {
        
        int miArreglo[] = {1,4,8,20,100};
        
        // Mostrar un elemento
        System.out.println(miArreglo[4]);
        
        // Buscar un elemento
        System.out.println("Búsqueda de un número");        
        for (int i = 0; i < miArreglo.length; i++) {
            if (miArreglo[i] == 20) {
                System.out.println("El elemento se encuentra en la posición: " + i);
            } else {
                System.out.println("El elemento no se encuentra");
            }
        }
        
        
        
    }
    
}
