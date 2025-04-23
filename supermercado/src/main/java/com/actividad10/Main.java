package com.actividad10;

import java.util.Scanner;

public class Main {

    // Método para mostrar la bienvenida
    public static void mostrarBienvenida() {
        System.out.println("¡Bienvenido al Supermercado La Económica!");
        System.out.println("Por compras mayores a $50, obtienes un 10% de descuento.");
    }

    // Método para calcular el total
    public static double calcularTotal(double precio1, double precio2) {
        return precio1 + precio2;
    }

    // Método para aplicar descuento
    public static double aplicarDescuento(double total) {
        if (total > 50) {
            return total * 0.9; // Aplica 10% de descuento
        } else {
            return total;
        }
    }

    // Método para calcular el cambio
    public static double calcularCambio(double total, double pago) {
        if (pago < total) {
            return -1; // Indica pago insuficiente
        } else {
            return pago - total;
        }
    }

    // Método para imprimir el resumen de la compra
    public static void imprimirResumen(double total, double totalConDescuento, double pago, double cambio) {
        System.out.printf("Total original: $%.2f\n", total);
        System.out.printf("Total con descuento: $%.2f\n", totalConDescuento);
        System.out.printf("Pago recibido: $%.2f\n", pago);

        if (cambio >= 0) {
            System.out.printf("Cambio devuelto: $%.2f\n", cambio);
        } else {
            System.out.println("Error: Pago insuficiente.");
        }

        System.out.println("¡Gracias por su compra!");
    }

    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        mostrarBienvenida();

        System.out.print("Ingrese el precio del primer producto: ");
        double precio1 = scanner.nextDouble();

        System.out.print("Ingrese el precio del segundo producto: ");
        double precio2 = scanner.nextDouble();

        double total = calcularTotal(precio1, precio2);
        double totalConDescuento = aplicarDescuento(total);

        System.out.printf("Total a pagar (con descuento si aplica): $%.2f\n", totalConDescuento);
        System.out.print("Ingrese el monto pagado por el cliente: ");
        double pago = scanner.nextDouble();

        double cambio = calcularCambio(totalConDescuento, pago);

        imprimirResumen(total, totalConDescuento, pago, cambio);

        scanner.close();
    }
}
