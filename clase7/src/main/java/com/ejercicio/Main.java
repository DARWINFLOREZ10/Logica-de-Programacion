package com.ejercicio;

public class Main {
    public static void main(String[] args) {
        // Estructura condicional IF
        int edad = 20;
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }

        // Estructura condicional IF-ELSE IF-ELSE
        int nota = 85;
        if (nota >= 90) {
            System.out.println("Obtuviste una A");
        } else if (nota >= 80) {
            System.out.println("Obtuviste una B");
        } else if (nota >= 70) {
            System.out.println("Obtuviste una C");
        } else {
            System.out.println("Debes mejorar tu calificación");
        }

        // Estructura SWITCH
        int diaSemana = 3;
        switch (diaSemana) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            default:
                System.out.println("Otro día");
                break;
        }

        // Bucle FOR
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteración: " + i);
        }

        // Bucle WHILE
        int contador = 0;
        while (contador < 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }

        // Bucle DO-WHILE
        int numero = 0;
        do {
            System.out.println("Número: " + numero);
            numero++;
        } while (numero < 5);
    }
}
