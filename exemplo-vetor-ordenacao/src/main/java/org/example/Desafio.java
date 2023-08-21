package org.example;

import java.util.Scanner;

public class Desafio {

    public static void exibir(int[] v){
        for (int i = 0; i < v.length;i++){
            System.out.print("Vetor[ " + i + "] = " + v[i]);
        }
    }
    public static void main(String[] args) {
        int[] vetor = {2,2};
        int total = 0;
        //1° Exibir a soma dos vetores do vetor
        for (int i = 0; i < vetor.length;i++){
            total += vetor[i];
        }
        System.out.println("1° desafio");
        System.out.println("Vetor: ");
        exibir(vetor);
        System.out.println("\nTotal: " + total);


        System.out.println("\n2° desafio");
        int vetor2[] = {1,2,3,4};
        for(int i = 0;i < vetor2.length;i++){
            if(vetor2[i] % 2 == 0){
                System.out.println("Valor[" + i +"] = " + vetor2[i]);
            }
        }

        System.out.println("\n3° desafio");

        String vetor3[] = {"Domingo","Segunda","Terça","Quarta","Quinta","Sexta","Sábado"};
        Scanner in = new Scanner(System.in);
        int numero = 0;
        do{
            System.out.println("Digite o um numero 1 á 7: ");
            numero = in.nextInt();
        }while(numero < 1 && numero > 7);

        System.out.println("Dia: " + vetor3[numero - 1 ]);
    }
}
