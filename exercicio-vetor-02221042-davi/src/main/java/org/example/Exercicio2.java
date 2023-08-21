package org.example;

import java.sql.Array;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int[] acima = new int[10];
        Scanner in = new Scanner(System.in);
        for (int i = 0;i < vetor.length;i++){
            System.out.println("Digite um número (limite de 10): ");
            vetor[i] = in.nextInt();
        }
        int soma = 0;
        for(int i = 0;i < vetor.length;i++){
            soma += vetor[i];
        }
        int media = soma/vetor.length;
        System.out.println("=".repeat(60));
        System.out.println("Média: " + media);
        System.out.println("Acima da média: ");
        for(int i = 0;i < vetor.length;i++){
            if(vetor[i] > media){
                acima[i] = vetor[i];
                System.out.println(acima[i]);
            }
        }
        System.out.println("=".repeat(60));
    }
}
