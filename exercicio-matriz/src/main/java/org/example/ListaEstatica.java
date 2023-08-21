package org.example;

public class ListaEstatica {
    private int[] vetor;
    private int nroElem;

    public ListaEstatica(int tamanho){
        this.vetor = new int[tamanho];
        this.nroElem = 0;
    }

    public void adiciona(int valor){
        if(nroElem != vetor.length){
            vetor[nroElem++] = valor;
        }else {
            System.out.println("O vetor está cheio");
        }
    }
    public void exibe(){
        for (int i = 0; i <nroElem;i++){
            System.out.println(vetor[i]);
        }
    }
    public int busca(int valor){
        for (int i =0;i<nroElem;i++){
            if(vetor[i] == valor){
                return i;
            }
        }
        return -1;
    }
    public boolean removerPeloIndice(int indice){
        if(indice >= 0 && indice < nroElem){
            for(int i = indice;i<nroElem-1;i++){
                vetor[i] = vetor[i+1];
            }
            nroElem--;
            return true;
        }
        return false;
    }

    public boolean removeElemento(int elemento) {
        boolean achou = false;
        for(int i = 0;i<nroElem;i++){
            if(vetor[i] == elemento){
                achou = true;
                removerPeloIndice(busca(elemento));
            }
        }
        return achou;
    }

    public boolean substitui(int valorAntigo, int valorNovo){
        boolean substituido = false;
        for(int i = 0;i<nroElem;i++){
            if(vetor[i] == valorAntigo){
                vetor[i] = valorNovo;
                substituido = true;
            }
        }
        return substituido;
    }

    public int contaOcorrencias(int valor){
        int contador = 0;
        for(int i = 0;i<nroElem;i++){
            if(vetor[i] == valor){
                contador++;
            }
        }
        return contador;
    }

    public boolean adicionaNoInicioReverso(int valor) {
        boolean adicionou = false;
        int aux = 0;
        if(nroElem != vetor.length){
            vetor[nroElem++] = valor;
            for (int i = 0;i<nroElem;i++){
                aux = vetor[nroElem-1];
                vetor[nroElem-1] = vetor[i];
                vetor[i] = aux;
            }
            adicionou = true;
        }else {
            System.out.println("O vetor está cheio");
        }
        return adicionou;
    }
    public boolean adicionaNoInicio(int valor) {
        boolean adicionou = false;
        int aux = 0;
        if(nroElem != vetor.length){
            for (int i = 0;i<nroElem;i++){
                aux = vetor[nroElem];
                vetor[nroElem] = vetor[i];
                vetor[i] = aux;
            }
            nroElem++;
            vetor[0] = valor;
            adicionou = true;
        }else {
            System.out.println("O vetor está cheio");
        }
        return adicionou;
    }

    public boolean todosElementosIguais(){
        for(int i = 0;i < vetor.length-1;i++){
            if(vetor[i] != vetor[i+1]){
                return false;
            }
        }
        return true;
    }
}
