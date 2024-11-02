package com.example;

public class Pe04Operadores {

    public static void main(String[] args) {

        // Aritméticos:
        int numero1 = 10;
        int numero2 = 20;
        int resultadoSuma = numero1 + numero2;

        System.out.println(resultadoSuma);
        System.out.println(resultadoSuma + 5.76);

        int resultadoResta = numero1 - numero2;

        // Comparación
        boolean resultado1 = numero1 > numero2;
        System.out.println(resultado1);

        boolean resultado2 = numero1 < numero2;
        System.out.println(resultado2);

        // Lógicos
        boolean resultado3 = numero1 > 5 && numero1 < 30;

        int edad = 17;
        boolean carnetJoven = edad >= 15 && edad <= 26;

    }

}
