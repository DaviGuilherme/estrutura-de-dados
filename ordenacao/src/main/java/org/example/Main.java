package org.example;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {
    public static void exibir(int[] vetor){
        for (int i = 0; i < vetor.length;i++){
            System.out.println(vetor[i]);
        }
    }
    public static void selectionSort(){
        int[] vetor = {4,7,5,2,8,1,6,3};
        int troca = 0;
        int comparacao = 0;
        int aux = 0;
        exibir(vetor);
        for(int i = 0; i < vetor.length-1;i++){
            for (int j = i+1;j < vetor.length;j++){
                comparacao++;
                if(vetor[j] < vetor[i]){
                    troca++;
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j]= aux;
                }
            }
        }
        System.out.printf("Troca: %d\nComparação: %d\n",troca,comparacao);
        exibir(vetor);
    }
    public static void selectionSortOtimizado(){
        int[] vetor = {4,7,5,2,8,1,6,3};
        int posicao_menor = 0;
        int aux = 0;
        int comparacao = 0;
        int troca = 0;
        exibir(vetor);
        for(int i = 0; i < vetor.length-1;i++){
            posicao_menor = i;
            for(int j =i+1;j < vetor.length;j++){
                comparacao++;
                if(vetor[j] < vetor[posicao_menor]){
                    posicao_menor = j;
                }
            }
            troca++;
            aux =  vetor[posicao_menor];
            vetor[posicao_menor] = vetor[i];
            vetor[i] = aux;
        }
        System.out.printf("Troca: %d\nComparação: %d\n",troca,comparacao);
        exibir(vetor);
    }
    public static void bubbleSort(){
        int[] vetor = {4,7,5,2,8,1,6,3};
        int posicao_menor = 0;
        int aux = 0;
        int comparacao = 0;
        int troca = 0;
        exibir(vetor);
        for(int i = 0;i < vetor.length-1;i++){
            for(int j =1;j < vetor.length-i;j++){
                comparacao++;
                if(vetor[j-1] > vetor[j]){
                    troca++;
                    aux = vetor[j-1];
                    vetor[j-1] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
        System.out.printf("Troca: %d\nComparação: %d\n",troca,comparacao);
        exibir(vetor);
    }
    public static void pesquisaBinaria(){
        int[] vetor = {1,2,3,4,5,6,7,8};
        int posicao_menor = 0;
        int aux = 0;
        int comparacao = 0;
        int troca = 0;

        int inicio = 0;
        int fim = vetor.length -1;
        int meio = 0;
        int buscado = 7;
        boolean isAchado = false;

        exibir(vetor);
        while(inicio <=  fim){
            comparacao++;
                meio = (inicio + fim) / 2;
                if(vetor[meio] == buscado){
                    isAchado = true;
                    break;
                }else if(vetor[meio] < buscado){
                    inicio = meio + 1;
                }else {
                    inicio = meio - 1;
                }
        }
        if(isAchado == true){
            System.out.println("Buscas: "+ comparacao +"\n" + "Existe na posição " + meio);
        }else{
            System.out.println("Buscas: "+ comparacao +"\n" + "Não existe");
        }
    }
    public static void pesquisaBinariaComUsuario(){
        int[] vetor = {1,2,3,4,5,6,7,8};
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = in.nextInt();

        int comparacao = 0;

        int inicio = 0;
        int fim = vetor.length -1;
        int meio = 0;
        boolean isAchado = false;

        System.out.println("Vetor: ");
        exibir(vetor);
        while(inicio <=  fim){
            comparacao++;
            meio = (inicio + fim) / 2;
            if(vetor[meio] == num){
                isAchado = true;
                break;
            }else if(vetor[meio] < num){
                inicio = meio + 1;
            }else {
                inicio = meio - 1;
            }
        }
        if(isAchado == true){
            System.out.println("Buscas: "+ comparacao +"\n" + "Existe na posição " + meio);
        }else{
            System.out.println("Buscas: "+ comparacao +"\n" + num + " não existe no vetor.");
        }
    }
    public static void main(String[] args) {
        System.out.println("=================== Selection sort Normal ===================");
        selectionSort();
        System.out.println("\n=================== Selection sort Otimizado ===================");
        selectionSortOtimizado();
        System.out.println("\n=================== Bubble sort ===================");
        bubbleSort();
        System.out.println("\n=================== Pesquisa Binaria mocada ===================");
        pesquisaBinaria();
        System.out.println("\n=================== Pesquisa Binaria com interação do Usuario ===================");
        pesquisaBinariaComUsuario();
    }
}