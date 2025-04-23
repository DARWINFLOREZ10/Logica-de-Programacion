package com.actividad10;

public class Main {
    public static void mostrarBienvenida() {
        System.out.println("Bienvenido al supermercado el marrano feliz");
        System.out.println("Por compras superiores a $50, recibe un 10% de descuento");
    }

    public static double calcularTotal(double precio1, double precio2) {
        return precio1 + precio2;
    }

    public static double aplicarDescuento(double total) {
        if (total > 50) {
            return total * 0.9;
        } else {
            return total;
        }
    }

    public static double calcularCambio(double total, double pago) {
        if (pago < total) {
            return -1; // Pago insuficiente
        } else {
            return pago - total;
        }
    }

    public static void imprimirResumen(double total, double totalConDescuento, double pago, double cambio) {
        System.out.printf("\nResumen de la compra:\n");
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
}