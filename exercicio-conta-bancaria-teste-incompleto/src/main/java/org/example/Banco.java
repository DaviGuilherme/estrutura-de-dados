package org.example;
public class Banco {

    // Atributos
    PilhaObj<Operacao> pilhaOperacao = new PilhaObj(10);
    FilaObj<Operacao> filaOperacao = new FilaObj(10);
    // Contador de operações empilhadas
    Integer contadorOperacao = 0;

    // Métodos

    /* Método debitar - recebe o valor a ser debitado e o objeto conta bancária
       Se o débito ocorreu com sucesso, cria um objeto Operacao com os valores adequados
       e empilha a operação para poder ser desfeita. Atualiza contadorOperacao.
     */
    public void debitar(Double valor, ContaBancaria conta) {
        if(conta.debitar(valor)){
            Operacao operacao = new Operacao(conta,"Débito",valor);
//            try {
//                pilhaOperacao.push(operacao);
//                contadorOperacao++;
//            }catch (IllegalArgumentException nexc){
//                System.out.println("Não é possivel empilhar esta operação");
//            };
            pilhaOperacao.push(operacao);
            contadorOperacao++;
        };
    }

    /* Método creditar - recebe o valor a ser depositado e o objeto conta bancária
       Executa o depósito, cria um objeto Operacao com os valores adequados
       e empilha a operação para poder ser desfeita. Atualiza contadorOperacao.
     */
    public void creditar(Double valor, ContaBancaria conta) {
        if(valor <= 0){
            throw new IllegalArgumentException();
        }
        conta.creditar(valor);
        Operacao opCreditarConta1 = new Operacao(conta,"Crédito",valor);
        pilhaOperacao.push(opCreditarConta1);
        contadorOperacao++;
    }

    /* Método desfazerOperacao - recebe a quantidade de operações a serem desfeitas
       Se essa quantidade for inválida, lança IllegalArgumentException
       Senão, "desfaz" a quantidade de operações passadas como argumento
       e atualiza o contadorOperacao
     */
    public void desfazerOperacao(Integer qtdOperacaoDesfeita) {
        if(qtdOperacaoDesfeita > contadorOperacao || qtdOperacaoDesfeita <= 0){
            throw new IllegalArgumentException();
        }else {
            for (int i = 0; i < qtdOperacaoDesfeita; i++) {
                Operacao operacao = pilhaOperacao.pop();
                if (operacao.getTipoOperacao() == "Débito") {
                    operacao.getContaBancaria().creditar(operacao.getValor());
                    contadorOperacao--;
                } else if (operacao.getTipoOperacao() == "Crédito") {
                    operacao.getContaBancaria().debitar(operacao.getValor());
                    contadorOperacao--;
                }
            }
        }
    }


    /* Método agendarOperacao - recebe o tipo da operaçõa, o valor e o objeto conta bancária
       Se um dos argumentos for inválido, lança IllegalArgumentException.
       Senão, cria um objeto Operacao e insere esse objeto na fila.
    */
    public void agendarOperacao(String tipoOperacao, Double valor, ContaBancaria conta) {
        if(tipoOperacao != "Débito"){
            throw new IllegalArgumentException();
        } else if (valor <= 0 || valor == null) {
            throw new IllegalArgumentException();
        } else if (conta == null) {
            throw new IllegalArgumentException();
        }
        Operacao operacaoAgendanda = new Operacao(conta,tipoOperacao,valor);
        try {
            filaOperacao.insert(operacaoAgendanda);
            contadorOperacao++;
        }catch (IllegalStateException nexc){
            System.out.println("Fila cheia");
        }
    }

    /* Método executarOperacoesAgendadas
       Se não houver operações na fila, exibe mensagem de que não há operações agendadas.
       Senão, esvazia a fila, executando cada uma das operações agendadas.
    */
    public void executarOperacoesAgendadas() {
        if(filaOperacao.isEmpty()){
            System.out.println("Não tem operações agendadas");
        }
        for(int i = 0; i < contadorOperacao;i++) {
            Operacao operacaoAgendada = filaOperacao.poll();
            if (operacaoAgendada.getTipoOperacao() == "Crédito") {
                operacaoAgendada.getContaBancaria().creditar(operacaoAgendada.getValor());
            } else if (operacaoAgendada.getTipoOperacao() == "Débito") {
                operacaoAgendada.getContaBancaria().debitar(operacaoAgendada.getValor());
            }
        }
    }

    // Gettens
    public PilhaObj<Operacao> getPilhaOperacao() {
        return pilhaOperacao;
    }

    public FilaObj<Operacao> getFilaOperacao() {
        return filaOperacao;
    }

    public Integer getContadorOperacao() {
        return contadorOperacao;
    }
}
