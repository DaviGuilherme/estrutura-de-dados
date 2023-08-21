package org.example;

public class Main {
    public static void main(String[] args) {
        ListaEstatica l1 = new ListaEstatica(4);
        l1.adiciona(10);
        l1.adiciona(20);
        l1.adiciona(30);
        l1.adiciona(40);
        l1.exibe();
        System.out.println("Indice do numero da sua busca: " + l1.busca(30));
        System.out.println("Indice do numero da sua busca: " + l1.busca(330));
        System.out.println("Remover pelo indice " + l1.removerPeloIndice(0));
        l1.exibe();
        System.out.println("Removendo pelo elemento: ");
        l1.removeElemento(20);
        l1.exibe();
    }
}