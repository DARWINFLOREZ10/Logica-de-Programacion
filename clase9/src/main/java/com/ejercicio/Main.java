package com.ejercicio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Random random = new Random();

            String[] nombres = { "Producto A", "Producto B", "Producto C", "Producto D", "Producto E" };
            double[] precios = { 30000, 55000, 70000, 20000, 60000 };
            int[][] horas = { { 8, 7, 9, 8, 6 }, { 9, 9, 8, 8, 7 }, { 7, 8, 8, 9, 8 } };
            ArrayList<Double> notas = new ArrayList<>(Arrays.asList(3.0, 4.5, 2.8, 3.9, 5.0, 3.6, 2.5, 4.2, 3.8, 4.0));
            int[] billetes = { 100000, 50000, 20000, 10000 };
            double[] ventas = { 50000, 30000, 80000, 20000, 90000, 70000, 40000 };
            ArrayList<String> pacientes = new ArrayList<>(Arrays.asList("Juan", "Maria", "Pedro", "Ana", "Carlo"));
            int[] prioridades = { 2, 1, 3, 1, 2 };
            double[] horarios = { 7.00, 9.30, 12.00, 14.45, 17.20, 20.00 };
            double[] compras = { 45000, 75000, 120000, 90000, 30000, 110000, 65000, 40000 };
            double[] temperaturas = { 18.5, 22.3, 36.1, 19.8, 35.2, 20.5, 37.0, 21.4, 25.6, 34.8, 38.2, 19.3 };
            int[] productos = new int[50];

            mostrarProductosCaros(nombres, precios);
            mostrarHorasTrabajadas(horas);
            calcularNotas(notas);
            simularCajero(sc, billetes);
            analizarVentas(ventas);
            ordenarPacientesPorPrioridad(pacientes, prioridades);
            evaluarProductosFabricados(productos, random);
            buscarProximoBus(sc, horarios);
            clasificarCompras(compras);
            monitorearTemperaturas(temperaturas);
        }
    }

    static void mostrarProductosCaros(String[] nombres, double[] precios) {
        System.out.println("Productos con precio mayor a 50,000 COP:");
        for (int i = 0; i < nombres.length; i++) {
            if (precios[i] > 50000) {
                System.out.println(nombres[i] + " - " + precios[i] + " COP");
            }
        }
    }

    static void mostrarHorasTrabajadas(int[][] horas) {
        for (int i = 0; i < horas.length; i++) {
            int total = 0;
            for (int j : horas[i]) {
                total += j;
            }
            System.out.println("Total horas trabajador " + (i + 1) + ": " + total);
        }
    }

    static void calcularNotas(ArrayList<Double> notas) {
        double suma = 0;
        int aprobados = 0;
        for (double nota : notas) {
            suma += nota;
            if (nota >= 3.5)
                aprobados++;
        }
        System.out.println("Promedio de notas: " + (suma / notas.size()) + " - Aprobados: " + aprobados);
    }

    static void simularCajero(Scanner sc, int[] billetes) {
        System.out.print("Ingrese el monto a retirar: ");
        int monto = sc.nextInt();
        for (int billete : billetes) {
            if (monto >= billete) {
                System.out.println(billete + " COP: " + (monto / billete));
                monto %= billete;
            }
        }
    }

    static void analizarVentas(double[] ventas) {
        double maxVenta = ventas[0], minVenta = ventas[0];
        for (double venta : ventas) {
            if (venta > maxVenta) maxVenta = venta;
            if (venta < minVenta) minVenta = venta;
        }
        System.out.println("Ventas - Máx: " + maxVenta + " Min: " + minVenta);
    }

    static void ordenarPacientesPorPrioridad(ArrayList<String> pacientes, int[] prioridades) {
        System.out.println("Pacientes ordenados por prioridad:");
        for (int i = 1; i <= 3; i++) {
            for (int j = 0; j < prioridades.length; j++) {
                if (prioridades[j] == i) {
                    System.out.println(pacientes.get(j) + " - Prioridad " + prioridades[j]);
                }
            }
        }
    }

    static void evaluarProductosFabricados(int[] productos, Random random) {
        int defectuosos = 0;
        for (int i = 0; i < productos.length; i++) {
            productos[i] = random.nextInt(2);
            if (productos[i] == 0) defectuosos++;
        }
        System.out.println("Productos defectuosos: " + defectuosos);
    }

    static void buscarProximoBus(Scanner sc, double[] horarios) {
        System.out.print("Ingrese la hora actual: ");
        double hora = sc.nextDouble();
        for (double h : horarios) {
            if (h > hora) {
                System.out.println("Próximo bus: " + h);
                break;
            }
        }
    }

    static void clasificarCompras(double[] compras) {
        int pequenos = 0, medianos = 0, grandes = 0;
        for (double compra : compras) {
            if (compra < 50000) pequenos++;
            else if (compra <= 100000) medianos++;
            else grandes++;
        }
        System.out.println("Pequeñas: " + pequenos + ", Medianas: " + medianos + ", Grandes: " + grandes);
    }

    static void monitorearTemperaturas(double[] temperaturas) {
        int sobre35 = 0, bajo20 = 0;
        for (double temp : temperaturas) {
            if (temp > 35) sobre35++;
            if (temp < 20) bajo20++;
        }
        System.out.println("Temperaturas >35°C: " + sobre35 + " <20°C: " + bajo20);
    }
}
