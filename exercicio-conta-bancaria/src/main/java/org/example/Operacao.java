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

    public ContaBancaria getObjConta() {
        return objConta;
    }

    public void setObjConta(ContaBancaria objConta) {
        this.objConta = objConta;
    }

    public String getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(String tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Operacao{");
        sb.append("objConta=").append(objConta);
        sb.append(", tipoOperacao='").append(tipoOperacao).append('\'');
        sb.append(", valor=").append(valor);
        sb.append('}');
        return sb.toString();
    }
}
