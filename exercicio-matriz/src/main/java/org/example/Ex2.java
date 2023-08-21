package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex2 {
    public static void exibeMatriz(int[][]matriz){
        for(int linha =0; linha < matriz.length;linha++){
            for(int coluna = 0; coluna < matriz[linha].length;coluna++){
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][]matriz = new int[2][3];
        int[][]matriz2 = new int[2][3];
        int[][]matriz3 = new int[2][3];
        Scanner in = new Scanner(System.in);

        for(int linha =0;linha<matriz.length;linha++){
            for(int coluna = 0; coluna < matriz[linha].length;coluna++){
                System.out.printf("\nDigite o valor da 1° matriz[%d][%d]: ",linha,coluna);
                matriz[linha][coluna] = in.nextInt();
            }
        }

        for(int linha =0;linha<matriz2.length;linha++){
            for(int coluna = 0; coluna < matriz2[linha].length;coluna++){
                System.out.printf("\nDigite o valor da 2° matriz[%d][%d]: ",linha,coluna);
                matriz2[linha][coluna] = in.nextInt();
            }
        }

        int soma = 0;

        for(int linha =0;linha<matriz3.length;linha++){
            for(int coluna = 0; coluna < matriz3[linha].length;coluna++){
                matriz3[linha][coluna] = matriz2[linha][coluna] + matriz[linha][coluna];
            }
        }
        System.out.println("=".repeat(50));
        System.out.println("Soma da 1° com a 2° matriz: ");
        exibeMatriz(matriz3);
        System.out.println("=".repeat(50));

    }
}
