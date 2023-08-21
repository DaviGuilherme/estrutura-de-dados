package org.example;

import java.util.Scanner;

public class Ex1 {
    public static void exibirMatriz(int[][]matriz){
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matriz = new int[2][3];
        Scanner in = new Scanner(System.in);
        for(int linha =0;linha<matriz.length;linha++){
            for(int coluna = 0; coluna < matriz[linha].length;coluna++){
                System.out.printf("\nDigite o valor de matriz[%d][%d]: ",linha,coluna);
                matriz[linha][coluna] = in.nextInt();
            }
        }
        System.out.println("Resultado:");
        exibirMatriz(matriz);
    }
}
