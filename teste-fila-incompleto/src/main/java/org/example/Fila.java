package org.example;

public class Fila {
    // Atributos
    private int tamanho;
    private String[] fila;

    // Construtor
    public Fila(int capaciade) {
        this.tamanho = 0;
        this.fila = new String[capaciade];
    }

    // Métodos

    /* Método isEmpty() - retorna true se a fila está vazia e false caso contrário */
    public boolean isEmpty() {
        if(tamanho == 0){
            return true;
        }else {
            return false;
        }
    }

    /* Método isFull() - retorna true se a fila está cheia e false caso contrário */
    public boolean isFull() {
        if(tamanho == fila.length){
            return true;
        }
        return false;
    }

    /* Método insert - recebe um elemento e insere esse elemento na fila
                       no índice tamanho, e incrementa tamanho
                       Lançar IllegalStateException caso a fila esteja cheia
     */
    public void insert(String info) {
        if(isFull()){
            throw new IllegalStateException("Fila cheia");
        }else {
            fila[tamanho++] = info;
        }
    }

    /* Método peek - retorna o primeiro elemento da fila, sem removê-lo */
    public String peek() {
        if(isEmpty()){
            throw new IllegalStateException("Fila vazia");
        }else {
            return fila[0];
        }
    }

    /* Método poll - remove e retorna o primeiro elemento da fila, se a fila não estiver
       vazia. Quando um elemento é removido, a fila "anda", e tamanho é decrementado
       Depois que a fila andar, "limpar" o ex-último elemento da fila, atribuindo null
     */
    public String poll() {
        if(isEmpty()){
            throw new IllegalStateException("Fila vazia");
        }else {
            String aux = fila[0];
            for(int i = 0;i < tamanho -1;i++){
                fila[i] = fila[i+1];
            }
            fila[tamanho-1] = null;
            tamanho--;
            return aux;
        }
    }

    /* Método exibe() - exibe o conteúdo da fila */
    public void exibe() {
        for(String elemento : fila){
            System.out.println(elemento);
        }
    }

    /* Usado nos testes  - complete para que fique certo */
    public int getTamanho(){
        return tamanho;
    }
}

