package com.ejercicios; // Declaración del paquete (asegúrate de que el archivo está en la carpeta correspondiente)

// Conversión de temperatura entre Celsius y Fahrenheit
public class Main {
    public static void main(String[] args) {
        // **Convertir de Celsius a Fahrenheit**

        // Definimos una temperatura en Celsius como una cadena de texto
        String celsiusStr = "25";

        // Convertimos la cadena a un número decimal (double)
        double celsius = Double.parseDouble(celsiusStr);

        // Fórmula de conversión de Celsius a Fahrenheit: (°C × 9/5) + 32
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Imprimir el resultado en consola
        System.out.println(celsius + "°C equivale a " + fahrenheit + "°F");

        // **Convertir de Fahrenheit a Celsius**

        // Definimos una temperatura en Fahrenheit como número decimal
        double tempF = 98.6;

        // Fórmula de conversión de Fahrenheit a Celsius: (°F - 32) × 5/9
        double tempC = (tempF - 32) * 5 / 9;

        // Conversión de temperatura a entero eliminando decimales (casting explícito)
        int tempCInt = (int) tempC;

        // Imprimir resultados en consola
        System.out.println(tempF + "°F equivale a " + tempC + "°C");
        System.out.println("Temperatura en Celsius (redondeada): " + tempCInt + "°C");
    }
}
