package com.ejercicio;

import java.util.*; // Importa todas las clases de la biblioteca de utilidades de Java (ArrayList, HashSet, HashMap, PriorityQueue)

public class Main {
    public static void main(String[] args) {
        // **Lista (ArrayList)**
        // Se crea un ArrayList llamado 'lista' que almacena Strings
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Ana"); // Se agrega "Ana" a la lista
        lista.add("Ana"); // Se vuelve a agregar "Ana", permitiendo duplicados
        System.out.println("Lista: " + lista); // Imprime la lista completa, incluyendo ambos valores "Ana"

        // **Conjunto (HashSet)**
        // Se crea un HashSet a partir de la lista (elimina duplicados automáticamente)
        HashSet<String> conjunto = new HashSet<>(lista);
        System.out.println("Conjunto: " + conjunto); // Imprime el conjunto, solo debe aparecer un "Ana"

        // **Mapa (HashMap)**
        // Se crea un HashMap donde las claves son Strings y los valores son enteros
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("Ana", 25); // Se asocia "Ana" con el valor 25
        mapa.put("Luis", 30); // Se asocia "Luis" con el valor 30
        System.out.println("Mapa: " + mapa); // Imprime el mapa con las claves y sus respectivos valores

        // **Cola con prioridad (PriorityQueue)**
        // Se crea una PriorityQueue que ordena automáticamente los elementos de menor a
        // mayor
        PriorityQueue<Integer> cola = new PriorityQueue<>();
        cola.add(3); // Se agrega el número 3
        cola.add(1); // Se agrega el número 1
        System.out.println("Cola: " + cola.poll()); // poll() extrae el elemento con la mayor prioridad (el menor
                                                    // número), en este caso, 1
    }
}
