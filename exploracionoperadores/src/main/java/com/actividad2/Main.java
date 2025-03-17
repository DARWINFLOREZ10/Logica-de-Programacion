package com.actividad2;

public class Main {
    public static void main(String[] args) {
        // Definición de variables
        int a = 11;
        int b = 5;
        double c = 7.5;
        boolean condicion1 = true;
        boolean condicion2 = false;
        int x = 14; // Para operadores betwise
        int y = 7; // Para operadores betwise

        // Operadores aritméticos
        System.out.println("Suma de a y b: " + (a + b));
        System.out.println("Resta de a y b: " + (a - b));
        System.out.println("Multiplicación de a y c: " + (a * c));
        System.out.println("División de a entre b: " + (a / b));
        System.out.println("Módulo de a entre b: " + (a % b));

        a++;
        System.out.println("Incremento de a: " + a);

        b--;
        System.out.println("Decremento de b: " + b);

        // Operadores bitwise
        System.out.println("x AND y (bitwise): " + (x & y));

        // Operadores de comparación
        System.out.println("¿a es mayor que b? " + (a > b));
        System.out.println("¿a es igual a b? " + (a == b));
        System.out.println("¿c es menor o igual que a? " + (c <= a));
        System.out.println("¿a es diferente de b? " + (a != b));

        // Operadores lógicos
        System.out.println("condicion1 AND condicion2: " + (condicion1 && condicion2));
        System.out.println("condicion1 OR condicion2: " + (condicion1 || condicion2));
        System.out.println("NOT condicion1: " + (!condicion1));
        System.out.println("condicion1 XOR condicion2: " + (condicion1 ^ condicion2));

        // Operadores de asignación
        a += b;
        System.out.println("Nuevo valor de a: " + a);

        b *= 2;
        System.out.println("Nuevo valor de b: " + b);

        c /= 2;
        System.out.println("Nuevo valor de c: " + c);

        // Operador ternario
        String resultadoTernario = (a > b) ? "a es mayor" : "b es mayor o igual";
        System.out.println("Resultado del operador ternario: " + resultadoTernario);

        // Condiciones if-else
        if (c > 10) {
            System.out.println("c es mayor que 10");
        } else if (c == 10) {
            System.out.println("c es igual a 10");
        } else {
            System.out.println("c es menor que 10");
        }
    }
}
