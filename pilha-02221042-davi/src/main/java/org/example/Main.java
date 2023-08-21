package org.example;

import java.text.Normalizer;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Main {
    public static String removerEspacos(String frase) {
        frase = frase.replaceAll("-", "");
        frase = frase.replaceAll(" ", "");
        return frase;
    }

    public static void main(String[] args) {
        System.out.println("========== Exercicio 1 ==========");
        int[] p1 = {1,2,2,1};
        Pilha pilha = new Pilha(p1.length);
        System.out.println("Externo: " + pilha.ehPalindromo(p1));
        pilha.push(1);
        pilha.push(2);
        pilha.push(2);
        pilha.push(1);
        System.out.println("Interno: " + pilha.ehPalindromo());

        System.out.println("=".repeat(70));

        System.out.println("========== Exercicio 2 ==========");
        pilha.emBinario(12);

        System.out.println();
        System.out.println("=".repeat(70));

        System.out.println("========== Exercicio 3 ==========");
        PilhaObj<String> pilhaObj = new PilhaObj<String>(5);
        pilhaObj.push("A");
        pilhaObj.push("B");
        pilhaObj.push("C");
        pilhaObj.push("D");
        pilhaObj.push("E");
        System.out.println("A lista esta cheia: " + pilhaObj.isFull());
        System.out.println("Exibindo: ");
        pilhaObj.exibe();
        System.out.println("Exibindo desempilhando: ");
        pilhaObj.exibeDesempilhando();
        System.out.println("A lista esta vazia: " + pilhaObj.isEmpty());

        System.out.println("========== Exercicio 4 ==========");

        Scanner in = new Scanner(System.in);
        System.out.println("Digite a frase: ");
        String digitado = in.nextLine();

        PilhaObj<Character> frase = new PilhaObj(digitado.length());

        for (int i = 0;i < digitado.length();i++){
            frase.push(digitado.charAt(i));
        }

        frase.exibeJunto();
        System.out.println("========== Exercicio 5 ==========");
//        Scanner in = new Scanner(System.in);
        System.out.println("Digite a frase: ");
        String fraseDigitada = in.nextLine();

        PilhaObj<Character> frase1 = new PilhaObj(fraseDigitada.length());
        PilhaObj<Character> frase2 = new PilhaObj(fraseDigitada.length());
        PilhaObj<Character> frase3 = new PilhaObj(fraseDigitada.length());

        String fraseLimpa = removerEspacos(fraseDigitada);

        for(int i = 0;i < fraseLimpa.length();i++){
            frase1.push(fraseLimpa.charAt(i));
            frase2.push(fraseLimpa.charAt(i));
        }
        for(int i = 0;i < fraseLimpa.length();i++){
            frase3.push(frase1.pop());
        }

        Boolean isPalindromo = true;
        for(int i = 0;i < fraseLimpa.length();i++){
            if(frase3.pop() != frase2.pop()){
                isPalindromo = false;
                break;
            }
        }
        if(isPalindromo){
            System.out.println("É um palindromo");
        }else {
            System.out.println("Não é palindromo");
        }

    }
}