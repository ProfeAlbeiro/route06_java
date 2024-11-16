package video18_referencias_al_mismo_arreglo;

public class Principal {

    public static void main(String[] args) {
        
        int num = 0;
        int arr1[] = new int[10];        
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = num;
            num = num + 10;
        }        
        
        String arr2[] = new String[5];
        // arr2 = arr1;
        
        /*
        if (arr1 == arr2) {
            System.out.println("Los dos arreglos apuntan a la misma dirección");
        } else {
            System.out.println("Los dos arreglos NO apuntan a la misma dirección");
        }        
        */
        
        System.out.println("Datos del arreglo arr2[]");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        
        /*        
        System.out.println("Datos del arreglo arr1[]");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println("Datos del arreglo arr2[]");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        arr1 = new int[5];
        System.out.println("Datos del arreglo arr1[]");
        arr1[0] = 100;
        arr1[1] = 200;
        arr1[2] = 300;
        arr1[3] = 400;
        arr1[4] = 500;
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        */
        
    }
    
}
