package org.example;

public class Ex3 {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
        int coluna1 = 0;
        int coluna2 = 0;
        int coluna3 = 0;
        int diagona1 = 0;
        int diagonal2 = 0;

        int coluna =0;
        for(int linha = 0;linha < matriz.length;linha++){
            coluna1 += matriz[linha][0];
            coluna2 += matriz[linha][1];
            coluna3 += matriz[linha][2];
        }
        System.out.println("Coluna 1: " + coluna1);
        System.out.println("Coluna 2: " + coluna2);
        System.out.println("Coluna 3: " + coluna3);
    }
}
