package org.example;

public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("Livro1","autor1");
        Livro l2 = new Livro("Livro2","autor2");
        Livro l3 = new Livro("Livro3","autor3");

        PilhaObj<Livro> pilha = new PilhaObj(3);

        pilha.push(l1);
        pilha.push(l2);
        pilha.push(l3);

        pilha.exibe();
        System.out.println("=".repeat(90));
        System.out.println(pilha.popElementoDoIndice(1));
        System.out.println("=".repeat(90));
        pilha.exibe();
    }
}