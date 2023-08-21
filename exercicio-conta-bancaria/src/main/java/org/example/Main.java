package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PilhaObj<Operacao> pilha = new PilhaObj(10);
        FilaObj<Operacao> fila = new FilaObj(10);

        int contador = 0;
        int contadorAgendado = 0;

        ContaBancaria conta1 = new ContaBancaria(1,10.0);
        ContaBancaria conta2 = new ContaBancaria(2,10.0);

        int opcao = 0;
        while (opcao !=  6){
            System.out.println("1 - Debitar valor");
            System.out.println("2 - Creditar(Depositar) valor");
            System.out.println("3 - Desfazer operação");
            System.out.println("4 - Agendar operação");
            System.out.println("5 - Executar operações agendadas");
            System.out.println("6 - Sair");
            opcao = in.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Digite o número da conta: ");
                    int numero = in.nextInt();
                    System.out.println("Digite o valor a ser debitado: ");
                    double valor = in.nextDouble();
                    if(numero == 1){
                        if(conta1.debitar(valor)){
                            Operacao operacao1 = new Operacao(conta1,"debitar",valor);
                            try {
                                pilha.push(operacao1);
                                contador++;
                            }catch (IllegalArgumentException nexc){
                                System.out.println("Não é possivel empilhar esta operação");
                            };
                        };
                    }else if(numero == 2){
                        if(conta2.debitar(valor)){
                            Operacao operacao2 = new Operacao(conta1,"debitar",valor);
                            try {
                                pilha.push(operacao2);
                                contador++;
                            }catch (IllegalArgumentException nexc){
                                System.out.println("Não é possivel empilhar esta operação");
                            };
                        }
                    }
                    break;
                case 2:
                    System.out.println("Digite o número da conta: ");
                    numero = in.nextInt();
                    System.out.println("Digite o valor a ser creditado: ");
                    valor = in.nextDouble();
                    if(numero == 1){
                        conta1.creditar(valor);
                        Operacao opCreditarConta1 = new Operacao(conta1,"creditar",valor);
                    }else if(numero == 2){
                        conta2.creditar(valor);
                        Operacao opCreditarConta2 = new Operacao(conta2,"creditar",valor);
                    }
                    break;
                case 3:
                    System.out.println("Entre com a quantidade de operações a serem desfeitas: ");
                    int qtdOperacoes = in.nextInt();
                    if(qtdOperacoes < contador){
                        System.out.println("Quantidade inválida");
                    }else {
                        for (int i = 0; i < qtdOperacoes; i++) {
                            Operacao operacao = pilha.pop();
                            if(operacao.getTipoOperacao() == "debitar"){
                                operacao.getObjConta().creditar(operacao.getValor());
                            }else if (operacao.getTipoOperacao() == "creditar"){
                                operacao.getObjConta().debitar(operacao.getValor());
                            }
                            contador--;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Escolha uma operação: ");
                    System.out.println("1 - Debitar\n2 - Creditar");

                    int escolha = in.nextInt();

                    String operacao = "";

                    if(escolha == 1){
                        operacao = "debitar";
                    }else if (escolha == 2){
                        operacao = "creditar";
                    }

                    System.out.println("Entre com o valor: ");
                    double valorAgendado = in.nextDouble();
                    System.out.println("Entre com o número da conta: ");
                    int numeroConta = in.nextInt();
                    if(numeroConta == 1){
                        Operacao operacaoAgendanda = new Operacao(conta1,operacao,valorAgendado);
                        try {
                            fila.insert(operacaoAgendanda);
                            contadorAgendado++;
                        }catch (IllegalStateException nexc){
                            System.out.println("Fila cheia");
                        }
                    } else if (numeroConta == 2) {
                        Operacao operacaoAgendanda = new Operacao(conta2,operacao,valorAgendado);
                        try {
                            fila.insert(operacaoAgendanda);
                            contadorAgendado++;
                        }catch (IllegalStateException nexc){
                            System.out.println("Fila cheia");
                        }
                    }
                    break;
                case 5:
                    if(fila.isEmpty()){
                        System.out.println("Não tem operaçõea agendadas");
                    }
                    System.out.println(fila.getTamanho());
                    for(int i = 0; i < contadorAgendado;i++){
                        Operacao operacaoAgendada = fila.poll();
                        if(operacaoAgendada.getTipoOperacao() == "creditar"){
                            operacaoAgendada.getObjConta().creditar(operacaoAgendada.getValor());
                            System.out.printf("Após execução: " + operacaoAgendada.toString());
                        } else if (operacaoAgendada.getTipoOperacao() == "debitar") {
                            operacaoAgendada.getObjConta().debitar(operacaoAgendada.getValor());
                            System.out.printf("Após execução: " + operacaoAgendada.toString());
                        }
                        System.out.println(operacaoAgendada.toString());
                    }
            }
        }
        System.out.println("Fim :)");
    }
}