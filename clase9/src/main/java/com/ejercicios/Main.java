package com.ejercicios;
import java.util.*;

// Ejercicio 1
class Productos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[5];
        double[] precios = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre del producto " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();
            System.out.print("Ingrese el precio del producto en COP: ");
            precios[i] = sc.nextDouble();
            sc.nextLine(); // Limpiar buffer
        }

        System.out.println("Productos con precio mayor a 50.000 COP:");
        for (int i = 0; i < 5; i++) {
            if (precios[i] > 50000) {
                System.out.println(nombres[i] + " - $" + precios[i]);
            }
        }
        sc.close();
    }
}

// Ejercicio 2
class RegistroHoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] horas = new double[3][5];

        for (int i = 0; i < 3; i++) {
            System.out.println("Trabajador " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("  Día " + (j + 1) + " - Horas trabajadas: ");
                horas[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < 3; i++) {
            double total = 0;
            for (int j = 0; j < 5; j++) {
                total += horas[i][j];
            }
            System.out.println("Total horas trabajadas por Trabajador " + (i + 1) + ": " + total);
        }
        sc.close();
    }
}

// Ejercicio 3
class AnalisisNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        double suma = 0;
        int aprobados = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese la nota del estudiante " + (i + 1) + ": ");
            double nota = sc.nextDouble();
            notas.add(nota);
            suma += nota;
            if (nota >= 3.5) aprobados++;
        }

        double promedio = suma / notas.size();
        System.out.println("Promedio: " + promedio);
        System.out.println("Estudiantes aprobados: " + aprobados);
        sc.close();
    }
}

// Ejercicio 4
class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] billetes = {100000, 50000, 20000, 10000};
        System.out.print("Ingrese el monto a retirar: ");
        int monto = sc.nextInt();

        System.out.println("Billetes entregados:");
        for (int b : billetes) {
            int cantidad = monto / b;
            if (cantidad > 0) {
                System.out.println(b + ": " + cantidad);
                monto %= b;
            }
        }
        if (monto > 0) System.out.println("No se puede entregar exactamente: faltan " + monto);
        sc.close();
    }
}

// Ejercicio 5
class RevisionVentas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] ventas = new double[7];

        for (int i = 0; i < 7; i++) {
            System.out.print("Ventas del día " + (i + 1) + ": ");
            ventas[i] = sc.nextDouble();
        }

        int diaMayor = 0, diaMenor = 0;
        for (int i = 1; i < 7; i++) {
            if (ventas[i] > ventas[diaMayor]) diaMayor = i;
            if (ventas[i] < ventas[diaMenor]) diaMenor = i;
        }

        System.out.println("Día con mayor venta: Día " + (diaMayor + 1) + " - $" + ventas[diaMayor]);
        System.out.println("Día con menor venta: Día " + (diaMenor + 1) + " - $" + ventas[diaMenor]);
        sc.close();
    }
}

// Ejercicio 6
class CentroSalud {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Integer> prioridades = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Nombre del paciente " + (i + 1) + ": ");
            nombres.add(sc.nextLine());
            System.out.print("Prioridad (1=Alta, 2=Media, 3=Baja): ");
            prioridades.add(sc.nextInt());
            sc.nextLine();
        }

        System.out.println("Pacientes ordenados por prioridad:");
        for (int p = 1; p <= 3; p++) {
            for (int i = 0; i < nombres.size(); i++) {
                if (prioridades.get(i) == p) {
                    System.out.println("Prioridad " + p + ": " + nombres.get(i));
                }
            }
        }
        sc.close();
    }
}

// Ejercicio 7
class EvaluacionProductos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] estado = new int[50];
        int buenos = 0, defectuosos = 0;

        for (int i = 0; i < 50; i++) {
            System.out.print("Producto " + (i + 1) + " (1=bueno, 0=defectuoso): ");
            estado[i] = sc.nextInt();
            if (estado[i] == 1) buenos++;
            else defectuosos++;
        }

        double porcentaje = (defectuosos / 50.0) * 100;
        System.out.println("Productos buenos: " + buenos);
        System.out.println("Productos defectuosos: " + defectuosos);
        System.out.println("Porcentaje defectuosos: " + porcentaje + "%");
        sc.close();
    }
}

// Ejercicio 8
class TransportePublico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] horarios = {7.00, 9.30, 12.00, 14.30, 17.00, 19.30};
        System.out.print("Ingrese la hora actual (formato 24h): ");
        double horaActual = sc.nextDouble();

        boolean encontrado = false;
        for (double h : horarios) {
            if (h > horaActual) {
                System.out.println("Próximo bus: " + h);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) System.out.println("No hay más buses disponibles hoy.");
        sc.close();
    }
}

// Ejercicio 9
class ClasificacionCompras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> compras = new ArrayList<>();
        int p = 0, m = 0, g = 0;

        for (int i = 0; i < 8; i++) {
            System.out.print("Compra del cliente " + (i + 1) + ": ");
            double compra = sc.nextDouble();
            compras.add(compra);
            if (compra < 50000) p++;
            else if (compra <= 100000) m++;
            else g++;
        }

        System.out.println("Clientes con compras pequeñas: " + p);
        System.out.println("Clientes con compras medianas: " + m);
        System.out.println("Clientes con compras grandes: " + g);
        sc.close();
    }
}

// Ejercicio 10
class MonitoreoTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] temperaturas = new double[12];
        int altas = 0, bajas = 0;

        for (int i = 0; i < 12; i++) {
            System.out.print("Temperatura hora " + (i + 1) + ": ");
            temperaturas[i] = sc.nextDouble();
            if (temperaturas[i] > 35) altas++;
            if (temperaturas[i] < 20) bajas++;
        }

        System.out.println("Temperaturas > 35°C: " + altas);
        System.out.println("Temperaturas < 20°C: " + bajas);
        sc.close();
    }
}
