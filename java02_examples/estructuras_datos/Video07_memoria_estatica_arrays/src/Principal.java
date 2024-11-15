public class Principal {

    public static void main(String[] args) {
        int arrayNumeros[] = new int[5];
        UsoArrays.rellenarArreglo(arrayNumeros);
        System.out.println("Calificaciones sin ordenar");
        UsoArrays.mostrarArreglo(arrayNumeros);
        System.out.println("Calificaciones ordenadas");
        UsoArrays.ordenarArreglo(arrayNumeros);        
    }
    
}