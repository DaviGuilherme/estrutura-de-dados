package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int maxAluno = 0;
        while (maxAluno < 5 || maxAluno > 15){
            System.out.println("Digite o valor maxímo de alunos: ");
            maxAluno = in.nextInt();
        }
        String[] aluno = new String[maxAluno];
        Double[][] notas = new Double[maxAluno][2];
        Double[] media = new Double[2];

        for(int i = 0; i < aluno.length;i++){
            System.out.println("Digite o nome do aluno: ");
            aluno[i] = in.next();
        }

        for(int linha = 0; linha < notas.length;linha++){
            for(int coluna = 0; coluna < notas[linha].length;coluna++){
                System.out.println("Digite a nota de cada aluno: ");
                notas[linha][coluna] = in.nextDouble();
            }
        }

        media[0] = somaColuna(notas,0);
        media[1] = somaColuna(notas,1);
        System.out.printf("%-17s","NOME DO ALUNO" );
        System.out.printf("%12s","NOTA AC1" );
        System.out.printf("%12s","NOTA AC2" );
        System.out.println();
        for(int linha = 0; linha < notas.length;linha++){
                System.out.printf("%-17s",aluno[linha]);
                System.out.printf("%12.1f", notas[linha][0]);
                System.out.printf("%12.1f", notas[linha][1]);
                System.out.println();
        }
        System.out.printf("%-17s","Média:" );
        System.out.printf("%12.1f", (media[0] / maxAluno));
        System.out.printf("%12.1f", (media[1] / maxAluno));

    }

    public static Double somaColuna(Double[][] matriz,int numeroColuna){
        Double totalColuna = 0.0;
        for(int linha = 0; linha< matriz.length;linha++){
            totalColuna += matriz[linha][numeroColuna];
        }
        return totalColuna;
    }
}
