package org.example;

public class Teste {
    public static void separaPositivoNegativoEmOrdem(Integer[] vetor){
        FilaObj<Integer> filaPositiva = new FilaObj(10);
        FilaObj<Integer> filaNegativa = new FilaObj(10);
        int tamanhoNegativa = 0;
        int tamanhoPositiva = 0;
        for(int i = 0;i < vetor.length;i++){
            if(vetor[i] >= 0){
                filaPositiva.insert(vetor[i]);
                tamanhoPositiva++;
            }else {
                filaNegativa.insert(vetor[i]);
                tamanhoNegativa++;
            }
        }
        for(int i = 0;i < tamanhoPositiva;i++){
            System.out.println(filaPositiva.poll());
        }
        for(int i = 0;i < tamanhoNegativa;i++){
            System.out.println(filaNegativa.poll());
        }

    }
    public static void separaPositivoNegativoOrdemDiferente(Integer[] vetor){
        FilaObj<Integer> filaPositiva = new FilaObj(10);
        PilhaObj<Integer> pilhaNegativa = new PilhaObj(10);
        int tamanhoNegativa = 0;
        int tamanhoPositiva = 0;
        for(int i = 0;i < vetor.length;i++){
            if(vetor[i] >= 0){
                filaPositiva.insert(vetor[i]);
                tamanhoPositiva++;
            }else {
                pilhaNegativa.push(vetor[i]);
                tamanhoNegativa++;
            }
        }
        for(int i = 0;i < tamanhoPositiva;i++){
            System.out.println(filaPositiva.poll());
        }
        for(int i = 0;i < tamanhoNegativa;i++){
            System.out.println(pilhaNegativa.pop());
        }
    }
    public static void main(String[] args) {
        Integer[] vetor = {2,7,-3,-50,45,-4,30,-21,38};
        separaPositivoNegativoEmOrdem(vetor);
        System.out.println("=".repeat(70));
        separaPositivoNegativoOrdemDiferente(vetor);
    }
}
