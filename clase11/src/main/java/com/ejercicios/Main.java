package com.ejercicios;
import java.util.Scanner;

public class Main {

   
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int opcion;
    
            do {
                System.out.println("\nMENÚ DE EJERCICIOS");
                for (int i = 1; i <= 30; i++) {
                    System.out.println(i + ". Ejercicio " + i);
                }
                System.out.println("0. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();
    
                switch (opcion) {
                    case 1:
                        ejercicio1(scanner);
                        break;
                    case 2:
                        ejercicio2(scanner);
                        break;
                    case 3:
                        ejercicio3(scanner);
                        break;
                    case 4:
                        ejercicio4(scanner);
                        break;
                    case 5:
                        ejercicio5(scanner);
                        break;
                    case 6:
                        ejercicio6(scanner);
                        break;
                    case 7:
                        ejercicio7(scanner);
                        break;
                    case 8:
                        ejercicio8(scanner);
                        break;
                    case 9:
                        ejercicio9(scanner);
                        break;
                    case 10:
                        ejercicio10(scanner);
                        break;
                    case 11:
                        ejercicio11(scanner);
                        break;
                    case 12:
                        ejercicio12(scanner);
                        break;
                    case 13:
                        ejercicio13(scanner);
                        break;
                    case 14:
                        ejercicio14(scanner);
                        break;
                    case 15:
                        ejercicio15(scanner);
                        break;
                    case 16:
                        ejercicio16(scanner);
                        break;
                    case 17:
                        ejercicio17(scanner);
                        break;
                    case 18:
                        ejercicio18(scanner);
                        break;
                    case 19:
                        ejercicio19(scanner);
                        break;
                    case 20:
                        ejercicio20(scanner);
                        break;
                    case 21:
                        ejercicio21(scanner);
                        break;
                    case 22:
                        ejercicio22(scanner);
                        break;
                    case 23:
                        ejercicio23(scanner);
                        break;
                    case 24:
                        ejercicio24(scanner);
                        break;
                    case 25:
                        ejercicio25(scanner);
                        break;
                    case 26:
                        ejercicio26(scanner);
                        break;
                    case 27:
                        ejercicio27(scanner);
                        break;
                    case 28:
                        ejercicio28(scanner);
                        break;
                    case 29:
                        ejercicio29(scanner);
                        break;
                    case 30:
                        ejercicio30(scanner);
                        break;
                    case 0:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                }
            } while (opcion != 0);
    
            scanner.close();
        }
    
        public static void ejercicio1(Scanner scanner) {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
            System.out.println("El número ingresado es: " + numero);
        }
    
        public static void ejercicio2(Scanner scanner) {
            System.out.print("Ingrese su nombre: ");
            String nombre = scanner.next();
            System.out.println("Hola, " + nombre + "!");
        }
    
        public static void ejercicio3(Scanner scanner) {
            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();
            System.out.println("Tienes " + edad + " años.");
        }
    
        public static void ejercicio4(Scanner scanner) {
            System.out.print("Ingrese el primer número: ");
            int a = scanner.nextInt();
            System.out.print("Ingrese el segundo número: ");
            int b = scanner.nextInt();
            System.out.println("La suma es: " + (a + b));
        }
    
        public static void ejercicio5(Scanner scanner) {
            System.out.print("Ingrese un número: ");
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                System.out.println("El número es par.");
            } else {
                System.out.println("El número es impar.");
            }
        }
    
        public static void ejercicio6(Scanner scanner) {
            System.out.print("Ingrese una nota: ");
            double nota = scanner.nextDouble();
            if (nota >= 3.0) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Reprobado");
            }
        }
    
        public static void ejercicio7(Scanner scanner) {
            System.out.print("Ingrese un número: ");
            int num = scanner.nextInt();
            System.out.println("El cuadrado del número es: " + (num * num));
        }
    
        public static void ejercicio8(Scanner scanner) {
            System.out.print("Ingrese su salario: ");
            double salario = scanner.nextDouble();
            System.out.println("Su salario con aumento del 10% es: " + (salario * 1.10));
        }
    
        public static void ejercicio9(Scanner scanner) {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
            for (int i = 1; i <= numero; i++) {
                System.out.println(i);
            }
        }
    
        public static void ejercicio10(Scanner scanner) {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
            int factorial = 1;
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }
            System.out.println("El factorial es: " + factorial);
        }
    
        public static void ejercicio11(Scanner scanner) {
            System.out.print("Ingrese un número: ");
            int num = scanner.nextInt();
            if (num > 0) {
                System.out.println("Es positivo");
            } else if (num < 0) {
                System.out.println("Es negativo");
            } else {
                System.out.println("Es cero");
            }
        }
    
        public static void ejercicio12(Scanner scanner) {
            System.out.print("Ingrese un número para ver su tabla de multiplicar: ");
            int num = scanner.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
        }
    
        public static void ejercicio13(Scanner scanner) {
            System.out.print("Ingrese el número base: ");
            int base = scanner.nextInt();
            System.out.print("Ingrese el exponente: ");
            int exponente = scanner.nextInt();
            int resultado = 1;
            for (int i = 0; i < exponente; i++) {
                resultado *= base;
            }
            System.out.println("Resultado: " + resultado);
        }
    
        public static void ejercicio14(Scanner scanner) {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
            int suma = 0;
            while (numero > 0) {
                suma += numero % 10;
                numero /= 10;
            }
            System.out.println("La suma de los dígitos es: " + suma);
        }
    
        public static void ejercicio15(Scanner scanner) {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
            int invertido = 0;
            while (numero != 0) {
                int digito = numero % 10;
                invertido = invertido * 10 + digito;
                numero /= 10;
            }
            System.out.println("Número invertido: " + invertido);
        }
    
        // Aquí se agregan los ejercicios 16 al 30 (continuación)
        public static void ejercicio16(Scanner scanner) {
            System.out.println("Ejercicio 16: Calcular promedio de tres notas");
            System.out.print("Nota 1: ");
            double n1 = scanner.nextDouble();
            System.out.print("Nota 2: ");
            double n2 = scanner.nextDouble();
            System.out.print("Nota 3: ");
            double n3 = scanner.nextDouble();
            double promedio = (n1 + n2 + n3) / 3;
            System.out.println("Promedio: " + promedio);
        }
    
        public static void ejercicio17(Scanner scanner) {
            System.out.println("Ejercicio 17: Verificar año bisiesto");
            System.out.print("Ingrese el año: ");
            int año = scanner.nextInt();
            if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0) {
                System.out.println("Es bisiesto");
            } else {
                System.out.println("No es bisiesto");
            }
        }
    
        public static void ejercicio18(Scanner scanner) {
            System.out.println("Ejercicio 18: Convertir grados Celsius a Fahrenheit");
            System.out.print("Ingrese grados Celsius: ");
            double c = scanner.nextDouble();
            double f = c * 9 / 5 + 32;
            System.out.println("Fahrenheit: " + f);
        }
    
        public static void ejercicio19(Scanner scanner) {
            System.out.println("Ejercicio 19: Número primo");
            System.out.print("Ingrese un número: ");
            int num = scanner.nextInt();
            boolean primo = num > 1;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
            System.out.println(num + (primo ? " es primo" : " no es primo"));
        }
    
        public static void ejercicio20(Scanner scanner) {
            System.out.println("Ejercicio 20: Mostrar los primeros 10 números pares");
            for (int i = 1; i <= 10; i++) {
                System.out.println(i * 2);
            }
        }
    
        public static void ejercicio21(Scanner scanner) {
            System.out.println("Ejercicio 21: Calcular área de un triángulo");
            System.out.print("Base: ");
            double base = scanner.nextDouble();
            System.out.print("Altura: ");
            double altura = scanner.nextDouble();
            double area = (base * altura) / 2;
            System.out.println("Área: " + area);
        }
    
        public static void ejercicio22(Scanner scanner) {
            System.out.println("Ejercicio 22: Verificar mayor de edad");
            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            System.out.println(edad >= 18 ? "Mayor de edad" : "Menor de edad");
        }
    
        public static void ejercicio23(Scanner scanner) {
            System.out.println("Ejercicio 23: Suma de los 100 primeros números naturales");
            int suma = 0;
            for (int i = 1; i <= 100; i++) {
                suma += i;
            }
            System.out.println("Suma: " + suma);
        }
    
        public static void ejercicio24(Scanner scanner) {
            System.out.println("Ejercicio 24: Mostrar los primeros 10 múltiplos de 3");
            for (int i = 1; i <= 10; i++) {
                System.out.println(i * 3);
            }
        }
    
        public static void ejercicio25(Scanner scanner) {
            System.out.println("Ejercicio 25: Mostrar los divisores de un número");
            System.out.print("Número: ");
            int num = scanner.nextInt();
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) System.out.println(i);
            }
        }
    
        public static void ejercicio26(Scanner scanner) {
            System.out.println("Ejercicio 26: Calcular promedio de números hasta ingresar cero");
            int suma = 0, count = 0, num;
            do {
                System.out.print("Ingrese número (0 para terminar): ");
                num = scanner.nextInt();
                if (num != 0) {
                    suma += num;
                    count++;
                }
            } while (num != 0);
            if (count > 0) {
                System.out.println("Promedio: " + (double) suma / count);
            } else {
                System.out.println("No se ingresaron números");
            }
        }
    
        public static void ejercicio27(Scanner scanner) {
            System.out.println("Ejercicio 27: Mostrar la tabla ASCII");
            for (int i = 32; i <= 126; i++) {
                System.out.println(i + ": " + (char) i);
            }
        }
    
        public static void ejercicio28(Scanner scanner) {
            System.out.println("Ejercicio 28: Mostrar los dígitos de un número");
            System.out.print("Número: ");
            int num = scanner.nextInt();
            String numStr = String.valueOf(num);
            for (char c : numStr.toCharArray()) {
                System.out.println(c);
            }
        }
    
        public static void ejercicio29(Scanner scanner) {
            System.out.println("Ejercicio 29: Convertir días a semanas y días");
            System.out.print("Ingrese la cantidad de días: ");
            int dias = scanner.nextInt();
            int semanas = dias / 7;
            int restoDias = dias % 7;
            System.out.println(semanas + " semanas y " + restoDias + " días");
        }
    
        public static void ejercicio30(Scanner scanner) {
            System.out.println("Ejercicio 30: Mostrar los números del 100 al 1 de 5 en 5");
            for (int i = 100; i >= 1; i -= 5) {
                System.out.println(i);
            }
        }
    }
