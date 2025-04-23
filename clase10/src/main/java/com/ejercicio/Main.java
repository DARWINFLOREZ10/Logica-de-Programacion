package com.ejercicio;

public class Main {
    public void metodoPublico() {
        System.out.println("Método público");
    }

    private void metodoPrivado() {
        System.out.println("Método privado");
    }

    protected void metodoProtegido() {
        System.out.println("Método protegido");
    }

    void metodoDefault() {
        System.out.println("Método default");
    }

    public static void main(String[] args) {
        Main objeto = new Main();
        objeto.metodoPublico();
        objeto.metodoPrivado(); // Esto funciona solo si se llama dentro de la misma clase
        objeto.metodoProtegido();
        objeto.metodoDefault();
    }
}
