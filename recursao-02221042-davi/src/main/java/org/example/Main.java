package org.example;

public class Main {
    public static int somarInteiros(int numero, int total){
        if(numero > 0){
            total += numero;
            return somarInteiros(numero-1,total);
        }else{
            return total;
        }
    }
    public static int somarInteiros(int numero){
        int total = 0;
        for(int i = 0;i<=numero;i++){
            total += i;
        }
        return total;
    }
    public static int somarVetorInteiros(int posicao,int[] vetor, int total){
        if(posicao < vetor.length){
            total = total + vetor[posicao];
            return somarVetorInteiros(posicao+1,vetor,total);
        }else {
            return total;
        }
    }
    public static int somarVetorInteiros(int[] vetor){
        int total = 0;
        for(int i = 0;i<vetor.length;i++){
            total += vetor[i];
        }
        return total;
    }

    public static int somarPares(int posicao,int[] vetor,int total){
        if(posicao < vetor.length){
            if(vetor[posicao] % 2 == 0){
                total += vetor[posicao];
            }
            return somarPares(posicao+1,vetor,total);
        }else {
            return total;
        }
    }
    public static int somarPares(int vetor[]){
        int total = 0;
        for(int i = 0;i < vetor.length;i++){
            if(vetor[i] % 2 == 0){
                total += vetor[i];
            }
        }
        return total;
    }
    public static int qtdImpares(int posicao, int[] vetor,int total) {
        if(posicao < vetor.length){
            if(vetor[posicao] % 2 != 0){
                total += 1;
            }
            return qtdImpares(posicao+1,vetor,total);
        }else {
            return total;
        }
    }
    public static int qtdImpares(int[] vetor) {
        int qtd = 0;
        for(int i = 0;i<vetor.length;i++){
            if(vetor[i] % 2 != 0){
                qtd++;
            }
        }
        return qtd;
    }

    public static int qtdOcorrenciasNoVetor(int posicao,int buscado,int[] vetor, int qtdOcorrencia){
        if(posicao == vetor.length){
            return qtdOcorrencia;
        }else {
            if(vetor[posicao] == buscado){
               qtdOcorrencia++;
            }
            return qtdOcorrenciasNoVetor(posicao+1,buscado,vetor,qtdOcorrencia);
        }
    }
    public static int qtdOcorrenciasNoVetor(int buscado,int[] vetor){
        int qtd = 0;
        for(int i=0;i<vetor.length;i++){
            if(vetor[i] == buscado){
                qtd++;
            }
        }
        return qtd;
    }


        public static int algoritmoEuclides(int n1, int n2,int resto){
        if(n1 % n2 != 0){
            resto =  n1 % n2;
            return algoritmoEuclides(n2,resto,resto);
        }else {
            return resto;
        }
    }
    public static int algoritmoEuclides(int n1, int n2){
        int resto = 0;
        while(n1 % n2 != 0){
            resto = n1 % n2;
            n2 = resto;
        }
        return resto;
    }
    public static int maiorElementoVetor(int posicao, int[] vetor, int maior){
        if(posicao == vetor.length){
            return maior;
        }else {
            if(vetor[posicao] > maior){
                maior = vetor[posicao];
            }
            return maiorElementoVetor(posicao+1, vetor, maior);
        }
    }
    public static int maiorElementoVetor(int[] vetor){
        int maior = -99999999;
        for(int i = 0;i<vetor.length;i++){
            if(vetor[i] > maior){
                maior = vetor[i];
            }
        }
        return maior;
    }

    public static int somaDosDigitos(int numero,int resto){
        if(numero % 10 == 0){
            return resto;
        }else {
            resto += numero % 10;
            numero = numero / 10;

            return somaDosDigitos(numero,resto);
        }
    }
    public static int somaDosDigitos(int numero){
        int resto = 0;
        while (numero % 10 != 0){
            resto += numero % 10;
            numero = numero / 10;
        }
        return resto;
    }
    public static String binario(int numero, String numBinario) {
        if (numero < 1) {
            return new StringBuilder(numBinario).reverse().toString();
        }
        else {
            numBinario += String.format("%d", numero % 2);
            numero = numero / 2;
            return binario(numero, numBinario);
        }
    }
    public static String binario(int numero) {
        String numBinario = "";
        while (numero >= 1){
            numBinario += String.format("%d",numero%2);
            numero = numero / 2;
        }
        return new StringBuilder(numBinario).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println("Somando inteiros recursivo: ");
        System.out.println(somarInteiros(5,0));
        System.out.println("Somar inteiros iterativo:");
        System.out.println(somarInteiros(5));
        System.out.println("=".repeat(50));
        System.out.println("Somando um vetor de inteiros - Recursivo: ");
        int[] vetor = {7,3,5,3};
        int total = 0;
        System.out.println(somarVetorInteiros(0,vetor,total));
        System.out.println("Somando um vetor de inteiros - Iterativo");
        System.out.println(somarVetorInteiros(vetor));
        System.out.println("=".repeat(50));
        System.out.println("Somando os elementos pares do vetor - Recursivo:");
        System.out.println(somarPares(0,vetor,0));
        System.out.println("Somando os elementos pares do vetor - Iterativo:");
        System.out.println(somarPares(vetor));
        System.out.println("=".repeat(50));
        System.out.println("Quantidade de impares - Recursivo:");
        System.out.println(qtdImpares(0,vetor,0));
        System.out.println("Quantidade de impares - Iterativo:");
        System.out.println(qtdImpares(vetor));
        System.out.println("=".repeat(50));
        System.out.println("Quantidade de ocorrencias no vetor - Recursivo:");
        System.out.println(qtdOcorrenciasNoVetor(0,3,vetor,0));
        System.out.println("Quantidade de ocorrencias no vetor - Iterativo:");
        System.out.println(qtdOcorrenciasNoVetor(3,vetor));
        System.out.println("=".repeat(50));
        System.out.println("Algoritmo de Euclides - Recursivo:");
        System.out.println(algoritmoEuclides(90,54,0));
        System.out.println("Algoritmo de Euclides - Iterativo");
        System.out.println(algoritmoEuclides(90,54));
        System.out.println("=".repeat(50));
        System.out.println("Maior elemento do vetor - Recursivo:");
        System.out.println(maiorElementoVetor(0,vetor,-9999));
        System.out.println("Maior elemento do vetor - Iterativo:");
        System.out.println(maiorElementoVetor(vetor));
        System.out.println("=".repeat(50));
        System.out.println("Soma dos digitos do número inteiros:");
        System.out.println(somaDosDigitos(132,0));
        System.out.println("Soma dos digitos do número inteiros");
        System.out.println(somaDosDigitos(132));
        System.out.println("=".repeat(50));
        System.out.println("Número em binário - Recursivo: ");
        String emBinario = "";
        System.out.println(binario(12,emBinario));
        System.out.println("Número em binário - Iterativo:");
        System.out.println(binario(12));
        System.out.println("=".repeat(50));
    }
}