package com.actividad4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tarifas del taxi
        double tarifaBase = 4000;
        double valorKilometro = 900;
        double valorMinuto = 150;

        // Solicitar la distancia del viaje
        System.out.print("Ingrese la distancia del viaje en kilómetros: ");
        double distancia = scanner.nextDouble();

        // Solicitar el tiempo de espera en tráfico
        System.out.print("Ingrese el tiempo de espera en tráfico (minutos): ");
        double tiempoEspera = scanner.nextDouble();

        // Calcular el precio del viaje
        double costoDistancia = distancia * valorKilometro;
        double costoEspera = tiempoEspera * valorMinuto;
        double precioTotal = tarifaBase + costoDistancia + costoEspera;

        // Mostrar el resultado
        System.out.println("\n--- Costo del Viaje ---");
        System.out.println("Tarifa base: $" + String.format("%.2f", tarifaBase));
        System.out.println("Costo por distancia: $" + String.format("%.2f", costoDistancia));
        System.out.println("Costo por espera: $" + String.format("%.2f", costoEspera));
        System.out.println("Precio total del viaje: $" + String.format("%.2f", precioTotal));

        scanner.close(); // Cerrar el Scanner
    }
}
