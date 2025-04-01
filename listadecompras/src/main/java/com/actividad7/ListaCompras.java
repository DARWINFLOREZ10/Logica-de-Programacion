package com.actividad7; // Paquete donde se encuentra la clase ListaCompras.

import java.util.Scanner; // Importa la clase Scanner para leer la entrada del usuario.

public class ListaCompras {
    public static void main(String[] args) {
        // Crea una lista de compras utilizando ArrayList, que almacenará los artículos
        // como cadenas de texto.
        java.util.ArrayList<String> listaCompras = new java.util.ArrayList<>();

        // Crea un objeto Scanner para leer las opciones y entradas del usuario.
        Scanner scanner = new Scanner(System.in);

        // Bucle infinito que permitirá al usuario realizar acciones hasta que decida
        // finalizar la compra.
        while (true) {
            System.out.println("-----------------------------------");
            // Muestra el menú con las opciones disponibles.
            System.out.println("Opciones:");
            System.out.println("1. Agregar artículo");
            System.out.println("2. Eliminar artículo");
            System.out.println("3. Mostrar lista");
            System.out.println("4. Finalizar compra");
            System.out.print("Seleccione una opción: ");
            // Lee la opción que el usuario selecciona.
            int opcion = scanner.nextInt();

            // Opción 1: Agregar un artículo a la lista de compras.
            if (opcion == 1) {
                System.out.print("Ingrese el nombre del artículo: ");
                // Lee el nombre del artículo que el usuario quiere agregar.
                String articulo = scanner.next();
                // Agrega el artículo al final de la lista.
                listaCompras.add(articulo);
            }
            // Opción 2: Eliminar un artículo de la lista de compras.
            else if (opcion == 2) {
                System.out.print("Ingrese el nombre del artículo a eliminar: ");
                // Lee el nombre del artículo que el usuario quiere eliminar.
                String articuloEliminar = scanner.next();
                // Variable para verificar si el artículo fue encontrado y eliminado.
                boolean encontrado = false;

                // Recorre la lista de compras para encontrar el artículo.
                for (int i = 0; i < listaCompras.size(); i++) {
                    // Si encuentra el artículo, lo elimina de la lista.
                    if (listaCompras.get(i).equals(articuloEliminar)) {
                        listaCompras.remove(i);
                        // Muestra un mensaje indicando que el artículo ha sido eliminado.
                        System.out.println("Artículo eliminado.");
                        // Marca que el artículo fue encontrado y eliminado.
                        encontrado = true;
                        // Sale del ciclo ya que no es necesario seguir buscando.
                        break;
                    }
                }
                // Si no se encuentra el artículo, muestra un mensaje indicando que no fue
                // encontrado.
                if (!encontrado) {
                    System.out.println("Artículo no encontrado.");
                }
            }
            // Opción 3: Mostrar la lista de compras.
            else if (opcion == 3) {
                System.out.println("Lista de compras:");
                // Recorre la lista de compras e imprime cada artículo.
                for (int i = 0; i < listaCompras.size(); i++) {
                    System.out.println(listaCompras.get(i));
                }
            }
            // Opción 4: Finalizar la compra y salir del programa.
            else if (opcion == 4) {
                System.out.println("Gracias por su compra!");
                // Sale del bucle while, terminando el programa.
                break;

            }
        }
        scanner.close();
    }
}
