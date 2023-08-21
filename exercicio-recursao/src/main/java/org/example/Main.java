package org.example;

public class Main {
    public static int somaInteiros(int valor){
        int total = 0;
        if(valor >= 0){
            for(int i = 0;i <= valor;i++){
                total += i;
            }
        }
        return total;
    }

    public static int somaInteirosRecursiva(int n){
    if(n == 0){
        return 0;
    }else {
        return n + somaInteirosRecursiva(n-1);
        }
    }
    public int somaElementos(int[] v){
        int soma = 0;
        for(int i =0;i<v.length;i++){
            soma += v[i];
        }
        return soma;
    }
    public static int somaElementosRecursivos(int[] v,int n){
        if(n == 0){
            return n;
        }else {
            return v[n] += somaElementosRecursivos(v,n-1);
        }
    }

    public static void main(String[] args) {
//        System.out.println("Soma inteiros (5): " + somaInteiros(5));
//        System.out.println(somaInteirosRecursiva(5));
        int[] vetor = {1,25,1};
        int total = 0;
        int tamanho = vetor.length;
        System.out.println(somaElementosRecursivos(vetor,tamanho));
    }
}