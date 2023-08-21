package org.example;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número maior que 1 e menor que 6: ");
        int numero = in.nextInt();
        int[][] matriz;
        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;
        if(numero <= 1 || numero >= 6){
            System.out.println("Número inválido ;-;");
        }else {
            matriz = new int[numero][numero];
            for(int linha = 0;linha < matriz.length;linha++){
                for(int coluna  = 0; coluna<matriz[linha].length;coluna++){
                    System.out.printf("Digite o valor da matriz[%d][%d]: ",linha,coluna);
                    matriz[linha][coluna] = in.nextInt();
                }
            }
            System.out.println("=".repeat(100));
            for(int linha = 0;linha < numero;linha++){
                for(int coluna  = 0; coluna< numero;coluna++){
                    System.out.printf("Diagonal principal matriz[%d][%d]: %d",linha,coluna,matriz[linha][coluna]);
                    System.out.println();
                    somaDiagonalPrincipal += matriz[linha][linha];
                    linha++;
                }
            }
            System.out.printf("\nSoma da diagonal principal: %d\n",somaDiagonalPrincipal);

            System.out.println("=".repeat(100));
            for(int linha = 0;linha < numero;linha++){
                for(int coluna  = numero-1; coluna >= 0;coluna--){
                    System.out.println(String.format("Diagonal principal matriz[%d][%d]: %d",linha,coluna,matriz[linha][coluna]));
                    somaDiagonalSecundaria += matriz[linha][coluna];
                    linha++;
                }
            }
            }
            System.out.printf("\nSoma da diagonal secundaria: %d\n",somaDiagonalSecundaria);
            System.out.println("=".repeat(100));
    }

}
