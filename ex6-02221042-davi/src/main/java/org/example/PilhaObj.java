package org.example;

import java.sql.SQLOutput;

public class PilhaObj <T>{
    // 01) Atributos
    private T[] pilha;
    private int topo;

    // 02) Construtor
    public PilhaObj(int capacidade) {
        pilha = (T[]) new Object[capacidade];
        topo = -1;
    }

    public T popElementoDoIndice(int n){
        for (int i = getTopo();i > -1;i--){
            if(i == n){
                return pop();
            }
        }
        throw  new IllegalStateException("Elemento inexistente");
    }

    public void exibeElemento(){
        for(T pilhaObj : pilha){
            System.out.println(pilhaObj.toString());
        }
    }

    public void emBinario(int num){
        int numero = num;
        int qtdDivisoes = 0;
        Pilha p1 = new Pilha((int) (Math.log(num) / Math.log(2)) + 1);

        numero = num;
        while(numero > 0){
            p1.push(numero % 2);
            numero = numero / 2;
        }
        p1.exibeBinario(num);
    }


    // 03) MÃ©todo isEmpty
    public Boolean isEmpty() {
        return topo == -1;
    }

    // 04) MÃ©todo isFull
    public Boolean isFull() {
        return topo == pilha.length-1;
    }

    // 05) MÃ©todo push
    public void push(T info) {
        if(isFull()){
            throw new IllegalStateException("Pilha cheia");
        }else {
            pilha[++topo] = info;
        }
    }

    // 06) MÃ©todo pop
    public T pop() {
        if(isEmpty()){
            throw  new IllegalStateException("Pilha vazia");
        }else {
            return pilha[topo--];
        }
    }

    // 07) MÃ©todo peek
    public T peek() {
        if(isEmpty()){
            throw new IllegalStateException("Pilha vazia");
        }else {
            return pilha[topo];
        }
    }

    // 08) MÃ©todo exibe
    public void exibe() {
        if(isEmpty()){
            throw  new IllegalStateException("Pilha vazia");
        }else {
//            for(T pilha : pilha){
//                System.out.println(pilha);
//            }
            for(int i = getTopo();i > -1;i--){
                System.out.println(pilha[i]);
            }
        }
    }

    public void exibeJunto() {
        if(isEmpty()){
            throw  new IllegalStateException("Pilha vazia");
        }else {
//            for(T pilha : pilha){
//                System.out.println(pilha);
//            }
            for(int i = getTopo();i > -1;i--){
                System.out.print(pilha[i]);
            }
        }
    }

    public void exibeDesempilhando() {
        if(isEmpty()){
            throw  new IllegalStateException("Pilha vazia");
        }else {
            for(T pilha1 : pilha){
                System.out.println(this.pop());
            }
        }
    }

    public void invertido(){

    }

//    public void exibeBinario(int num) {
//        Pilha p1 = new Pilha((int) (Math.log(num) / Math.log(2)) + 1);
//        for(int numero : this.pilha){
//            p1.push(this.pop());
//        }
//        for(int pilha : p1.pilha){
//            System.out.print(pilha);
//        }
//    }


    //Getters & Setters (manter)
    public int getTopo() {
        return topo;
    }
}
