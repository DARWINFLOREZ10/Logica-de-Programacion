package com.ejercicios;

//Ejercico de tiempo
public class Main {

    public static void main(String[] args) {
        // Cantidad de segundos a convertir
        int segundosTotales = 3665;

        // Cálculo de conversión
        int horas = segundosTotales / 3600;
        int minutos = (segundosTotales % 3600) / 60;
        int segundos = segundosTotales % 60;

        // Mostrar resultado
        System.out.printf("%d segundos equivalen a:%n", segundosTotales);
        System.out.printf("%d horas, %d minutos y %d segundos%n",
                horas, minutos, segundos);
    }
}
