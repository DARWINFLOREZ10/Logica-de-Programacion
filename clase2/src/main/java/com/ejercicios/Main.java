package com.ejercicios; // Declaración del paquete (asegúrate de que el archivo está en la carpeta correspondiente)

// Ejercicio de conversión de tiempo
public class Main {
    public static void main(String[] args) {
        // Cantidad de segundos a convertir
        int segundosTotales = 3665; // Definimos un total de 3665 segundos

        // **Cálculo de conversión**
        int horas = segundosTotales / 3600; // Se obtienen las horas dividiendo entre 3600 (segundos por hora)
        int minutos = (segundosTotales % 3600) / 60; // Se obtiene el residuo de la división anterior y se convierte a
                                                     // minutos
        int segundos = segundosTotales % 60; // Se obtienen los segundos restantes después de calcular minutos y horas

        // **Mostrar resultado en pantalla**
        System.out.printf("%d segundos equivalen a:%n", segundosTotales); // Imprime el total de segundos a convertir
        System.out.printf("%d horas, %d minutos y %d segundos%n", horas, minutos, segundos); // Imprime el resultado en
                                                                                             // formato legible
    }
}
