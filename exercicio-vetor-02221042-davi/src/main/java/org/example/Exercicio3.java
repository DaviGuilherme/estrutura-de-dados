package org.example;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        String[] vetor = new String[10];
        Scanner in = new Scanner(System.in);
        for (int i = 0;i< vetor.length;i++){
            System.out.println("Digite até 10 nomes: ");
            vetor[i] = in.next();
        }
        System.out.println("Digite um nome: ");
        String opcao = in.next();
        Boolean isEncontrado = false;
        for(int i = 0;i < vetor.length;i++){
            if (opcao.equals(vetor[i])){
                isEncontrado = true;
                System.out.println("Nome encontrado no indice " + i);
            }
        }
        if (isEncontrado == false){
            System.out.println("Nome não encontrado");
            }
        }
    }

