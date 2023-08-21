package org.example;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila(3);
        fila.insert("A");
        fila.insert("B");
        fila.insert("C");
        fila.exibe();
        System.out.println("=".repeat(90));
        fila.poll();
        System.out.println("=".repeat(90));
        fila.exibe();
    }
}