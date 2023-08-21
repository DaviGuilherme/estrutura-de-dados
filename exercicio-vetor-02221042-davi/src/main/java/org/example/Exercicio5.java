package org.example;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        String[] carros = new String[5];
        int[] rendimentos = new int[5];
        Scanner in = new Scanner(System.in);
        for(int i =0;i<5;i++){
            System.out.println("Digite até 5 modelos de carros: ");
            carros[i] = in.next();
            System.out.println("Digite o rendimento desse carro: ");
            rendimentos[i] = in.nextInt();
        }
        int maior = -99999999;
        String modelo = "";
        for (int i=0;i<rendimentos.length;i++){
            if(rendimentos[i] > maior){
                maior = rendimentos[i];
                modelo = carros[i];
            }
        }
        System.out.println(modelo + " é o mais econômico com " + maior + " de rendimento.");

    }
}
