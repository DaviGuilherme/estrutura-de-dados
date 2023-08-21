package org.example;

import java.util.Scanner;

public class Main {
    public static void exibir(String[] vetor){
        for (String i : vetor){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        String[] vetorT2 = new String[10];
        String[] vetorT1 = new String[10];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i< 10;i++){
            System.out.println("Aluno: ");
            String aluno = in.next();
            System.out.println("Turma: ");
            String turma = in.next();
            if(turma.equals("T1")) {
                for (int j = 0;j < vetorT1.length;j++){
                    if(vetorT1[j] == null){
                        vetorT1[j] = aluno;
                        break;
                    }
                }
            }else if(turma.equals("T2")){
                for (int j = 0;j < vetorT2.length;j++){
                    if(vetorT2[j] == null){
                        vetorT2[j] = aluno;
                        break;
                    }
                }
            }else{
                System.out.println("Opção invalida");
                break;
            }
        }
        int contadorA = 0;
        for(int i = 0; i < vetorT1.length;i++){
            if(vetorT1[i] != null){
                contadorA++;
            }
        }
        String[] vetorA = new String[contadorA];

        int contadorB = 0;
        for(int i = 0;i < vetorT2.length -1;i++){
            if(vetorT2[i] != null){
                contadorB++;
            }
        }
        String[] vetorB = new String[contadorB];

        for(int i = 0;i < vetorA.length;i++){
            vetorA[i] = vetorT1[i];
        }
        for(int i = 0;i < vetorB.length;i++){
            vetorB[i] = vetorT2[i];
        }

        System.out.println("Alunos da turma 1:");
        exibir(vetorA);
        System.out.println("Alunos da turma 2:");
        exibir(vetorB);
    }
}