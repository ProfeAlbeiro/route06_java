package video17_referencias_a_arreglos;

public class Principal {

    public static void main(String[] args) {
        /*
        String cadena1 = "Hola ";
        String cadena2 = new String("Mundo");
        System.out.println(cadena1.concat(cadena2));
        */        
        Persona arr[] = new Persona[5];
        Persona arr2[] = new Persona[5];
        arr2 = arr;
        arr[0] = new Persona("Juan",18);
        arr[1] = new Persona("Alma",82);
        arr[2] = new Persona("José",20);
        arr[3] = new Persona("María",90);
        arr[4] = new Persona("Pedro",48);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Posición " + (i + 1) + ": " + arr2[i] + "\n");
        }
        if (arr2 == arr) {
            System.out.println("La Referencia es la misma\n");
        }
    }    
}
