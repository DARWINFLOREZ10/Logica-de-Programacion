package com.sistemaacceso;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese el código numérico (1000 - 9999): ");
        int codigo = scanner.nextInt();

        System.out.print("Ingrese el nivel de autorización (1 - 5): ");
        int nivel = scanner.nextInt();

        System.out.print("¿Tiene clave especial? (true/false): ");
        boolean claveEspecial = scanner.nextBoolean();

        // Determinar acceso
        String resultado;
        if (codigo > 5000 && (nivel == 4 || nivel == 5)) {
            resultado = "Acceso Total";
        } else if (nivel == 3 && claveEspecial) {
            resultado = "Acceso Parcial";
        } else {
            resultado = "Acceso Denegado";
        }

        // Mostrar resultado
        System.out.println("Resultado: " + resultado);

        // Mensaje adicional si el código es menor a 2000
        if (codigo < 2000) {
            System.out.println("Código obsoleto");
        }

        scanner.close();
    }
}
