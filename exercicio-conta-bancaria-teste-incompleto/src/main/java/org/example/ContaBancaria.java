package org.example;
public class ContaBancaria {

    // Atributos
    private Integer numero;
    private Double saldo;

    // Construtor
    public ContaBancaria(Integer numero, Double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    // Métodos

    /* Método debitar - recebe o valor a ser debitado
       Se o valor for inválido, deve lançar IllegalArgumentException
       Se o saldo for insuficiente para o débito, retorna false
       Senão, atualiza o saldo e retorna true
     */
    public Boolean debitar(Double valor){
        if(valor == null || valor <= 0){
            throw new IllegalArgumentException("Valor inválido");
        } else if (valor > saldo) {
            return false;
        } else {
            this.saldo -= valor;
            return true;
        }
    }

    /* Método creditar - recebe o valor a ser depositado
       Se o valor for inválido, deve lançar IllegalArgumentException
       Senão, atualiza o saldo
     */
    public void creditar(Double valor){
        if(valor == null || valor <= 0){
            throw new IllegalArgumentException();
        }
        saldo = saldo + valor;
    }


    /* Método toString() - retorna uma String formatada com o número e o saldo da conta. */

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContaBancaria{");
        sb.append("numero=").append(numero);
        sb.append(", saldo=").append(saldo);
        sb.append('}');
        return sb.toString();
    }

    // Getters
    public Integer getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }
}
