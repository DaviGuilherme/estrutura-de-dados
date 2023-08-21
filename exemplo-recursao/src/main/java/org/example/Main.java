package org.example;

public class Main {
    public static void contagemRegressiva(int n){
        for(int i = n;i >= 0;i--){
            System.out.println(i);
        }
    }

    public static void contagemRegressivaRecursiva(int n){
        if(n == 0){                 // CASO BÁSICO
            System.out.println(n);  // NÃO CHAMA MAIS A RECURSÃO
        }
        else{                       // PARTE RECURSIVA
            System.out.println(n);  // FAZ O QUE TEM QUE FAZER PARA ESSE VALOR DE N
            // CHAMA RECURSIVAMENTE O MÉTODO PARA FAZER PARA N-1 OU N+1
            contagemRegressivaRecursiva(n - 1);
        }
    }

    //Fatorial de n
    // se n = 1, então n! = 1
    // se n > 1, então n! = n * (n-1)!
    // exemplo: 2! = 2 * 1! = 2 * 1 * 0! = 2

    public static int fatorialRecursivo(int n){
        if (n == 0){
            return 1;
        }else {
            return n * fatorialRecursivo(n - 1);
        }
    }
    public static void exibeVetor(int[] v, int i){
        if(i < v.length){
            System.out.println(v[i]);
            exibeVetor(v,i+1);
        }
    }

    public static void exibeVetorInvertido(int[] v, int i) {
        if(i >= 0){
            System.out.println(v[i]);
            exibeVetorInvertido(v,i-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Contagem regressiva do 5");
        contagemRegressiva(5);
        System.out.println("Contagem regressiva do 5 recursiva");
        contagemRegressivaRecursiva(5);
        System.out.println("5! = " + fatorialRecursivo(5));
        System.out.println("4! = " + fatorialRecursivo(4));
        System.out.println("FATORAÇÃO");
        int[] v = {1,2,3,4};
        exibeVetor(v,2);
        System.out.println("FATORAÇÃO invertida");
        exibeVetorInvertido(v,2);
    }
}