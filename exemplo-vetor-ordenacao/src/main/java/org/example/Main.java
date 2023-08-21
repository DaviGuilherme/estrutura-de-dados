package org.example;

import java.util.Scanner;

public class Main {
    public static void exibeVetor(int[] v){
        for (int i = v.length -1;i > 0;i--){
            System.out.println("vetor[" + i + "] = " + v[i]);
        }
    }
    public static void exibeVetor(String[] v){
        for (String s : v){
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        // Criando um vetor
        int[] vetor = new int[5];

        // Criação de um 2° vetor de inteiros, ja inicializados no momento da criação
        int[] vetor2 = {100,200,300,400,500,600,700};

        // Criação de um objeto leitor
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < vetor.length;i++){
            System.out.println("Digite o número: ");
            vetor[i] = in.nextInt();
        }

        // Criacao do 3° vetor
        String[] vetor3 = new String[4];
        for (int i = 0; i < vetor3.length;i++){
            System.out.println("Digite um nome: ");
            vetor3[i] = in.next();
        }

//        //preenchendo o vetor
//        for(int i = 0;i < vetor.length;i++){
//            vetor[i] = i * 10;
//        }



        // Exibe o vetor
        exibeVetor(vetor);
        System.out.println("+".repeat(60));
        exibeVetor(vetor2);
        System.out.println("+".repeat(60));
        exibeVetor(vetor3);
    }
}