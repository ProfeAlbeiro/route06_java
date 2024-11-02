package com.example;

/**
 * Crear un proyecto Java desde Cero
 * Crear un paquete
 * Dentro del paquete crear una Clase
 * Dentro de la Clase crear un método main
 * Imprimir todos los tipos de datos vistos
 *
 * Tipos de datos más comunes:
 * int, long, double, boolean, String
 */
public class Pe03TiposDatos {
    public static void main(String[] args) {
        // 01. Numéricos

        // 01.01. Enteros
        byte variable1 = 4;
        System.out.println(variable1);
        short variable2 = 10;
        System.out.println(variable2);
        int variable3 = 30;
        System.out.println(variable3);
        long variable4 = 100;
        System.out.println(variable4);
        long numeroTelefono = 666555444;
        System.out.println(numeroTelefono);
        // Los tipos de datos primitivos no pueden tener valores null
        // long preico = null;

        // 01.02. Decimales
        float variable5 = 5.5f;
        System.out.println(variable5);
        double variable6 = 10.5d;
        variable6 = 20.5d;
        System.out.println(variable6);
        double precioSilla = 49.99;
        System.out.println(precioSilla);

        // 02. Booleanos
        boolean variable7 = false;
        System.out.println(variable7);
        boolean variable8 = true;
        System.out.println(variable8);

        // 03. Texto
        char variable9 = 'a';
        String variable10 = "Lorem ipsum dolor sit amen.....";

    }
}
