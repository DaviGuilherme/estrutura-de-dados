package org.example;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner in = new Scanner(System.in);
        for (int i = 0;i<vetor.length;i++){
            System.out.println("Digite até 10 números: ");
            vetor[i] = in.nextInt();
        }
        System.out.println("Digite um número: ");
        int escolha = in.nextInt();

        int quantidade = 0;

        for (int i = 0;i< vetor.length;i++){
            if(vetor[i] == escolha){
                quantidade++;
            }
        }
        if(quantidade > 0){
            System.out.println("O número " + escolha + " ocorre " + quantidade + " vezes");
        }else {
            System.out.println("O número " + escolha + " não ocorre nenhuma vez");
        }
    }
}
