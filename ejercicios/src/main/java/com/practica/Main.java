package com.practica;

import java.util.Scanner;

// Ejercicios de condicionales

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Comparación de Números
        int a = 5, b = 10;
        if (a > b) {
            System.out.println("a es mayor que b");
        } else if (a < b) {
            System.out.println("b es mayor que a");
        } else {
            System.out.println("a y b son iguales");
        }

        // 2. Número Par o Impar
        int num = 7;
        System.out.println(num % 2 == 0 ? "Par" : "Impar");

        // 3. Estado del Agua
        int temp = -5;
        if (temp <= 0) {
            System.out.println("Estado: Sólido");
        } else if (temp > 0 && temp < 100) {
            System.out.println("Estado: Líquido");
        } else {
            System.out.println("Estado: Gaseoso");
        }

        // 4. Descuento en Compra
        double monto = 120;
        double descuento = (monto > 100) ? 0.10 : (monto > 50 ? 0.05 : 0);
        System.out.println("Monto final: " + (monto - (monto * descuento)));

        // 5. Verificador de Número
        num = -3;
        System.out.println(num > 0 ? "Positivo" : (num < 0 ? "Negativo" : "Cero"));
        System.out.println(num % 2 == 0 ? "Par" : "Impar");

        // 6. Conversor de Temperatura
        double celsius = 25;
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Celsius: " + ((fahrenheit - 32) * 5 / 9));

        // 7. Calculadora de IMC
        double peso = 70, altura = 1.75;
        double imc = peso / (altura * altura);
        System.out.println("IMC: " + imc);

        // 8. Conversión de Minutos
        int minutos = 145;
        System.out.println((minutos / 60) + " horas y " + (minutos % 60) + " minutos");

        // 9. Calificación de Notas
        int nota = 85;
        char calificacion = (nota >= 90) ? 'A' : (nota >= 80 ? 'B' : (nota >= 70 ? 'C' : (nota >= 60 ? 'D' : 'F')));
        System.out.println("Calificación: " + calificacion);

        // 10. Calculadora Simple
        int n1 = 8, n2 = 2;
        char operador = '+';
        switch (operador) {
            case '+':
                System.out.println(n1 + n2);
                break;
            case '-':
                System.out.println(n1 - n2);
                break;
            case '*':
                System.out.println(n1 * n2);
                break;
            case '/':
                System.out.println(n2 != 0 ? n1 / n2 : "No se puede dividir por cero");
                break;
        }

        // 11. Día de la Semana
        int dia = 3;
        String nombreDia = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Número inválido";
        };
        System.out.println(nombreDia);

        // 12. Categoría de Edad
        int edad = 25;
        System.out.println(edad <= 2 ? "Bebé"
                : edad <= 12 ? "Niño" : edad <= 19 ? "Adolescente" : edad <= 64 ? "Adulto" : "Adulto mayor");

        // 13. Calculadora de Préstamo
        double montoPrestamo = 10000, tasaAnual = 5, años = 5;
        double c = tasaAnual / 100 / 12;
        double n = años * 12;
        double pagoMensual = montoPrestamo * (c * Math.pow(1 + c, n)) / (Math.pow(1 + c, n) - 1);
        System.out.println("Pago Mensual: " + pagoMensual);

        // 14. Año Bisiesto
        int año = 2024;
        System.out.println((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0) ? "Bisiesto" : "No bisiesto");

        // 15. Descuento por Lealtad
        int añosCliente = 6;
        descuento = añosCliente > 5 ? 0.15 : (añosCliente >= 3 ? 0.10 : 0.05);
        if (monto > 500)
            descuento += 0.05;
        System.out.println("Descuento total: " + (descuento * 100) + "%");

        // 16. Operador Ternario
        String estado = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.println(estado);
        String resultado = (num > 0) ? "Positivo" : (num < 0) ? "Negativo" : "Cero";
        System.out.println(resultado);

        // 17. Operaciones Combinadas
        int x = 4, y = 6, z = 8;
        int suma = x + y + z;
        int mult = x * y * z;
        System.out.println("Suma mayor que multiplicación: " + (suma > mult));

        double promedio = suma / 3.0;
        System.out.println("Promedio mayor que suma: " + (promedio > suma));

        // 18. Verificador de Múltiplos
        num = 15;
        System.out.println("Múltiplo de 2: " + (num % 2 == 0));
        System.out.println("Múltiplo de 3: " + (num % 3 == 0));
        System.out.println("Múltiplo de 5: " + (num % 5 == 0));

        // 19. Calculadora de Notas Ponderadas
        double examenes = 85, proyectos = 90, tareas = 80, participacion = 95;
        double notaFinal = (examenes * 0.4) + (proyectos * 0.3) + (tareas * 0.2) + (participacion * 0.1);
        System.out.println("Nota final: " + notaFinal);

        // 20. Validador de Triángulo
        int l1 = 3, l2 = 4, l3 = 5;
        System.out.println((l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1) ? "Es un triángulo" : "No es un triángulo");

        sc.close();

    }
}
