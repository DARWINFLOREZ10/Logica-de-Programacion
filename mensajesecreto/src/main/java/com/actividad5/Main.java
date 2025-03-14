package com.actividad5;

public class Main {
    public static void main(String[] args) {
        // Mensaje codificado
        String mensajeCodificado = "H0l4  MUnD0,  3st0  3s  Un  m3ns4j3  s3cr3t0";

        // Reemplazar los números por letras
        String mensajeDecodificado = mensajeCodificado.replace("0", "o")
                .replace("3", "e")
                .replace("4", "a");

        // Eliminar espacios adicionales
        mensajeDecodificado = mensajeDecodificado.replaceAll("\\s+", " ").trim();

        // Convertir a mayúsculas
        mensajeDecodificado = mensajeDecodificado.toUpperCase();

        // Mostrar el mensaje decodificado
        System.out.println("Mensaje decodificado: " + mensajeDecodificado);
    }
}
