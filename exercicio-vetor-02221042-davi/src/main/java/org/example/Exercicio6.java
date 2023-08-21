package org.example;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        int[] meses = {1,2,3,4,5,6,7,8,9,10,11,12};
        int[] dias = {31,28,31,30,31,30,31,31,30,31,30,31};
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o dia: ");
        int dia = in.nextInt();
        System.out.println("Digite o mês: ");
        int mes = in.nextInt();
        int somaDosMeses = 0;
        for(int i = 0;i < (mes - 1);i++){
            somaDosMeses += dias[i];
        }
        int data = somaDosMeses + dia;
        System.out.printf("O dia %d/%d corresponde ao dia %d do ano.",dia,mes,data);
    }
}
