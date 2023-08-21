package org.example;

public class PilhaObj<T> {

    // Atributos
    private T[] pilha;
    private int topo;

    // Construtor
    public PilhaObj(int capacidade) {
        pilha = (T[]) new Object[capacidade];
        topo = -1;
    }

    // Métodos

    // Retorna true se a pilha estiver vazia e false caso contrário
    public Boolean isEmpty() {
        return topo == -1;
    }

    // Retorna true se a pilha estiver cheia e false caso contrário
    public Boolean isFull() {
        return topo == pilha.length-1;
    }

    // Se a pilha estiver cheia, deve lançar IllegalStateException
    // Se a pilha não estiver cheia, empilha info
    public void push(T info) {
        if(isFull()){
            throw new IllegalStateException("Pilha cheia");
        }else {
            pilha[++topo] = info;
        }
    }

    // Desempilha e retorna o elemento do topo da pilha
    public T pop() {
        if(isEmpty()){
            throw  new IllegalStateException("Pilha vazia");
        }else {
            return pilha[topo--];
        }
    }

    // Retorna o elemento do topo da pilha, sem desempilhar
    public T peek() {
        if(isEmpty()){
            throw new IllegalStateException("Pilha vazia");
        }else {
            return pilha[topo];
        }
    }

    // Exibe o conteúdo da pilha
    public void exibe() {
        if(isEmpty()){
            throw  new IllegalStateException("Pilha vazia");
        }else {
//            for(T pilha : pilha){
//                System.out.println(pilha);
//            }
            for(int i = topo;i > -1;i--){
                System.out.println(pilha[i]);
            }
        }
    }

}