package org.example;
public class Operacao {

    private ContaBancaria objConta;
    private String tipoOperacao;
    private Double valor;

    public Operacao(ContaBancaria objConta, String tipoOperacao, Double valor) {
        this.objConta = objConta;
        this.tipoOperacao = tipoOperacao;
        this.valor = valor;
    }

    // Métodos

    // toString()
    @Override
    public String toString() {
        return String.format("\n----------Operação----------\n" +
                        "Tipo de operação: %s\n" +
                        "Valor da operação: R$%.2f",
                tipoOperacao, valor);
    }

    // Getters
    public ContaBancaria getContaBancaria() {
        return objConta;
    }

    public String getTipoOperacao() {
        return tipoOperacao;
    }

    public Double getValor() {
        return valor;
    }

}
