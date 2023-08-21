package org.example;

public class Pilha {
    // 01) Atributos
    private int[] pilha;
    private int topo;



    public boolean ehPalindromo(int[] pilha){
        Pilha pilhaAux = new Pilha(pilha.length);
        for(int i = pilha.length / 2; i < 0;i--){
            pilhaAux.push(pilha[i--]);
        }
        for(int i = pilha.length-1;i < 0;i--){
            if(pilha[i] != pilhaAux.pop()){
                return false;
            }
        }
        return true;
    }

    public boolean ehPalindromo(){
        Pilha pilhaAux = new Pilha(pilha.length);
        for(int i = pilha.length / 2; i < 0;i--){
            pilhaAux.push(pilha[i--]);
        }
        for(int i = pilha.length-1;i < 0;i--){
            if(pilha[i] != pilhaAux.pop()){
                return false;
            }
        }
        return true;
    }
    public int qtdDivisoes(int numero, int total){
        if(numero > 0){
            return total;
        }else {
            numero = numero / 2;
            return qtdDivisoes(numero,total +1);
        }
    }
    //    public int[] empilharBinario(int numero, int[] pilha){
//        if(numero > 0){
//            return pilha;
//        }else {
//            numero = numero / 2;
//            ;
//            return qtdDivisoes(numero, pilha);
//        }
//    }
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

    // 02) Construtor
    public Pilha(int capacidade) {
        pilha = new int[capacidade];
        topo = -1;
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
    public void push(int info) {
        if(isFull()){
            throw new IllegalStateException("Pilha vazia");
        }else {
            pilha[++topo] = info;
        }
    }

    // 06) MÃ©todo pop
    public int pop() {
        if(isEmpty()){
            return -1;
        }else {
            return pilha[topo--];
        }
    }

    // 07) MÃ©todo peek
    public int peek() {
        if(isEmpty()){
            return -1;
        }else {
            return pilha[topo];
        }
    }

    // 08) MÃ©todo exibe
    public void exibe() {
        if(isEmpty()){
            System.out.println("Pilha vazia");
        }else {
            for(int pilha : pilha){
                System.out.println(pilha);
            }
        }
    }

    public void exibeBinario(int num) {
        Pilha p1 = new Pilha((int) (Math.log(num) / Math.log(2)) + 1);
        for(int numero : this.pilha){
            p1.push(this.pop());
        }
        for(int pilha : p1.pilha){
            System.out.print(pilha);
        }
    }


    //Getters & Setters (manter)
    public int getTopo() {
        return topo;
    }
}
