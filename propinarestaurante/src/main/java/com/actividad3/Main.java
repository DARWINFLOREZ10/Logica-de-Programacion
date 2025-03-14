package com.actividad3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el valor de la cuenta
        System.out.print("Ingrese el valor total de la cuenta: ");
        double valorCuenta = scanner.nextDouble();

        // Solicitar el porcentaje de propina
        System.out.print("Ingrese el porcentaje de propina que desea dejar: ");
        double porcentajePropina = scanner.nextDouble();

        // Calcular el valor de la propina
        double valorPropina = valorCuenta * (porcentajePropina / 100);

        // Calcular el valor total a pagar
        double valorTotal = valorCuenta + valorPropina;

        // Mostrar los resultados
        System.out.println("\n--- Resumen de Pago ---");
        System.out.println("Valor de la cuenta: $" + String.format("%.2f", valorCuenta));
        System.out.println("Porcentaje de propina: " + porcentajePropina + "%");
        System.out.println("Valor de la propina: $" + String.format("%.2f", valorPropina));
        System.out.println("Valor total a pagar: $" + String.format("%.2f", valorTotal));

        scanner.close(); // Cerrar el Scanner
    }
}
