package org.example;

public class ListaEstatica {
    private int[] vetor;
    private int numElemento;

    public ListaEstatica(int tamanho){
        this.vetor = new int[tamanho];
        this.numElemento = 0;
    }

    public void adiciona(int valor){
        if(vetor[numElemento] != vetor.length){
            vetor[numElemento++] = valor;
        }else {
            System.out.println("O vetor está cheio");
        }
    }
    public void exibe(){
        for (int i = 0; i <numElemento;i++){
            System.out.println(vetor[i]);
        }
    }
    public int busca(int valor){
        for (int i =0;i<numElemento;i++){
            if(vetor[i] == valor){
                return i;
            }
        }
        return -1;
    }
    public boolean removerPeloIndice(int indice){
        if(indice >= 0 && indice < vetor.length){
            for(int i = 0;i<numElemento-1;i++){
                vetor[i] = vetor[i+1];
            }

            numElemento--;
            return true;
        }
        return false;
    }

    public boolean removeElemento(int elemento){
        return removerPeloIndice(busca(elemento));
    }

}
