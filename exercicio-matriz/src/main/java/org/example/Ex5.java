package org.example;

import java.util.List;

public class Ex5 {

    public static void exibe(int[] vetor){
        for(int i = 0;i<vetor.length;i++){
            System.out.println(vetor[i]);
        }
    }
    public static int somaColuna(int[][] matriz,int numeroColuna){
        int totalColuna = 0;
        for(int linha = 0; linha< matriz.length;linha++){
            totalColuna += matriz[linha][numeroColuna];
        }
        return totalColuna;
    }
    public static int somaDiagonal(int[][] matriz, boolean isPrincipal) {
        if (isPrincipal == true) {
            int totalDiagonalPrincipal = 0;
            for (int linha = 0; linha < matriz.length; linha++) {
                for (int coluna = 0; coluna < matriz.length; coluna++) {
                    totalDiagonalPrincipal += matriz[linha][linha];
                    linha++;
                }
            }
            return totalDiagonalPrincipal;
        }else{
            int totalDiagonalSecundaria = 0;
            for (int linha = 0; linha < matriz.length; linha++) {
                for (int coluna = matriz.length - 1; coluna >= 0; coluna--) {
                    totalDiagonalSecundaria += matriz[linha][coluna];
                    linha++;
                }
            }
            return totalDiagonalSecundaria;
        }
    }
    public static int somaLinha(int[][] matriz, int numeroLinha){
        int totalLinha = 0;
        int aux = numeroLinha;
        for(int linha = 0; linha < matriz.length;linha++){
            if(linha == numeroLinha){
                for(int coluna = 0; coluna < matriz[linha].length;coluna++){
                    totalLinha += matriz[linha][coluna];
                }
            }
        }
        return totalLinha;
    }

        public static void main(String[] args) {
        int[][] matriz = {{2,7,6},{9,5,1},{4,3,8}};
        System.out.println("Soma da 1 primeira coluna: " + somaColuna(matriz,0));
        System.out.println("Soma da 2 primeira coluna: " + somaColuna(matriz,1));
        System.out.println("Soma da 3 primeira coluna: " + somaColuna(matriz,2));
        System.out.println("Soma da diagonal principal: " + somaDiagonal(matriz,true));
        System.out.println("Soma da secundaria secundaria: " +somaDiagonal(matriz,false));
        System.out.println("Soma da 1 linha: " + somaLinha(matriz,0));
        System.out.println("Soma da 2 linha: " + somaLinha(matriz,1));
        System.out.println("Soma da 3 linha: " + somaLinha(matriz,2));
        System.out.println("=".repeat(70));

        ListaEstatica lista = new ListaEstatica(8);

        lista.adiciona(somaColuna(matriz,0));
        lista.adiciona(somaColuna(matriz,1));
        lista.adiciona(somaColuna(matriz,2));
        lista.adiciona(somaLinha(matriz,2));
        lista.adiciona(somaLinha(matriz,2));
        lista.adiciona(somaLinha(matriz,2));
        lista.adiciona(somaDiagonal(matriz,true));
        lista.adiciona(somaDiagonal(matriz,false));
        System.out.println("É um quadrado mágico: " + lista.todosElementosIguais());


    }

    public static void adiciona(int nroElem, int[] vetor, int valor){
        if(nroElem != vetor.length){
            vetor[nroElem++] = valor;
        }else {
            System.out.println("O vetor está cheio");
        }
    }
}
