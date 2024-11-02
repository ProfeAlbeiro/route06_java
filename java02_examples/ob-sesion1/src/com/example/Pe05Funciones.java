package com.example;

public class Pe05Funciones {

    public static void main(String[] args) {

        // Opción 1: Sin parámetros Sin retorno de valor
        // showMenu();

        // Opción 2: Sin parámetros Con retorno de valor

        // String menu = getMenu();
        // System.out.println(menu);

        // double price = getPrice();
        // System.out.println(price);

        // Opción 3: Con parámetros Sin retorno de valor
        // String name = "Albeiro Ramos";
        // imprimirSaludo(name);

        // Opción 4: Con parámetros Con retorno de valor
        String name = "Albeiro";
        String lastName = "Ramos";

        String saludo = obtenerSaludo(name, lastName);
        System.out.println(saludo);

        int resultadoSuma = suma(50, 200);
        System.out.println(resultadoSuma);

    }

    static int suma(int num1, int num2) {
        return num1 + num2;
    }

    static String obtenerSaludo(String name, String lastName) {
        return "Buenas tardes " + name + " " + lastName;
    }

    static void imprimirSaludo(String name) {
        System.out.println("Buenas Tardes " + name);
    }

    static double getPrice() {
        return 100.99;
    }

    static void showMenu(){
        System.out.println("Bienvenidos al E-Commerce de Zapatillas");
        System.out.println("1 - Ver Zapatillas");
        System.out.println("2 - Comprar Zapatillas");
        System.out.println("3 - Salir");
    }

    static String getMenu(){
        return "Bienvenidos al E-Commerce de Zapatillas \n1 - Ver Zapatillas \n2 - Comprar Zapatillas \n3 - Salir";
    }

}
