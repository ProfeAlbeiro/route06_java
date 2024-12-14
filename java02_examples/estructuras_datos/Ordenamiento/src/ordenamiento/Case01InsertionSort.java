package ordenamiento;

import java.util.Scanner;

public class Case01InsertionSort {
    
    private int arr[];
    
    // Método para ordenar de forma ascendete el arreglo
    public void ordenarAsc(int[]arr){
        this.arr = new int[arr.length];        
        for (int j = 0; j < arr.length; j++) {
            int actual = arr[j];            
            int i = j - 1;
            while (i >= 0 && arr[i] > actual) {
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = actual;
        }
        this.arr = arr;
    }
    
    // Método para ordenar de forma ascendete el arreglo
    public void ordenarDesc(int[]arr){        
        
    }
    
    // Método para Imprimir arreglo
    public void mostrarArr(){        
        System.out.print("\n\tarrayNum[] = {");
        for (int elem: this.arr) {
            System.out.print(elem + ", ");
        }
        System.out.println("}");
    }
    
}
