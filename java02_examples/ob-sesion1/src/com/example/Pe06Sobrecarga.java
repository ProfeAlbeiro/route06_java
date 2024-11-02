package com.example;

public class Pe06Sobrecarga {
    public static void main(String[] args) {

        int resultado1 = suma(50, 20);
        System.out.println(resultado1);

        int resultado2 = suma(50, 20, 15);
        System.out.println(resultado2);

    }

    static int suma(int num1, int num2) {
        return num1 + num2;
    }

    static int suma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

}
