package com.ejercicio; // Declaración del paquete

public class Main {
    public static void main(String[] args) {
        // **Estructura condicional IF**
        int edad = 20; // Definimos la variable edad con valor 20

        // Si la edad es mayor o igual a 18, muestra que es mayor de edad, si no, es
        // menor
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }

        // **Estructura condicional IF-ELSE IF-ELSE**
        int nota = 85; // Definimos la variable nota con valor 85

        // Evaluamos el rango de la nota y mostramos la calificación correspondiente
        if (nota >= 90) {
            System.out.println("Obtuviste una A");
        } else if (nota >= 80) {
            System.out.println("Obtuviste una B");
        } else if (nota >= 70) {
            System.out.println("Obtuviste una C");
        } else {
            System.out.println("Debes mejorar tu calificación");
        }

        // **Estructura SWITCH**
        int diaSemana = 3; // Definimos el número del día de la semana

        // Dependiendo del valor de `diaSemana`, muestra el nombre del día
        // correspondiente
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
                break; // Finaliza el switch
        }

        // **Bucle FOR** (Repetir un bloque de código un número determinado de veces)
        for (int i = 0; i < 5; i++) { // Recorre desde 0 hasta 4 (5 iteraciones)
            System.out.println("Iteración: " + i);
        }

        // **Bucle WHILE** (Se ejecuta mientras la condición sea verdadera)
        int contador = 0; // Se inicializa un contador en 0

        while (contador < 5) { // Mientras el contador sea menor que 5
            System.out.println("Contador: " + contador);
            contador++; // Se incrementa el contador en 1 en cada iteración
        }

        // **Bucle DO-WHILE** (Ejecuta el código al menos una vez y luego evalúa la
        // condición)
        int numero = 0; // Se inicializa la variable `numero` en 0

        do {
            System.out.println("Número: " + numero);
            numero++; // Se incrementa en 1
        } while (numero < 5); // Se ejecuta mientras `numero` sea menor que 5
    }
}
