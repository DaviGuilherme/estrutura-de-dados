package org.example;

public class Main {
    public static void main(String[] args) {
        ListaEstatica l1 = new ListaEstatica(5);
        ListaEstatica l2 = new ListaEstatica(5);
        System.out.println("Lista 1");
        l1.adiciona(10);
        l1.adiciona(20);
        l1.adiciona(30);
        l1.adiciona(40);
        l1.exibe();
        System.out.println("Lista 2");
        l2.adiciona(10);
        l2.adiciona(20);
        l2.adiciona(30);
        l2.adiciona(40);
        l2.exibe();

        System.out.println("============= Adicionando no inicio =====================");
        l1.adicionaNoInicio(50);
        l1.exibe();
        System.out.println("============= Adicionando no inicio reverso =============");
        l2.adicionaNoInicioReverso(50);
        l2.exibe();
    }
}