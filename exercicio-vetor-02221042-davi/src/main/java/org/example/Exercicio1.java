package org.example;

import java.sql.Array;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int[] vetor = new int[7];
        Scanner in = new Scanner(System.in);
        for (int i = 0;i < 7;i++){
            System.out.println("Digite um número: ");
            vetor[i] = in.nextInt();
        }
        System.out.println("Exibindo na ordem:");
        for(int i = 0;i < 7;i++){
            System.out.println(vetor[i]);
        }
        System.out.println("Exibindo ao contrario: ");
        for (int i = vetor.length -1; i >= 0;i--){
            System.out.println(vetor[i]);
        }
    }
}
