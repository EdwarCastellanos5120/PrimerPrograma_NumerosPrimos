package org.example;

public class Main {
    public static void main(String[] args) {
        Numeros numeros = new Numeros();
        for (int i = 2; i < 11; i++) {
            if (numeros.esPrimo(i)) {
                System.out.println("El numero es: "+ i + " y es primo");
            }
        }
    }
}