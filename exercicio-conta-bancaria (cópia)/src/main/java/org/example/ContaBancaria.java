package org.example;

public class ContaBancaria {
    private Integer numero;
    private Double saldo;
    public ContaBancaria(Integer numero, Double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
    public Boolean debitar(Double valor){
        if(valor > saldo || valor <= 0){
            System.out.println("Saldo insuficiente");
            return false;
        }
        saldo =  saldo - valor;
        System.out.println("Saldo após débito: " + saldo);
        return true;
    }
    public void creditar(Double valor){
        saldo = saldo + valor;
        System.out.println("Saldo após crédito: " + saldo);
    }
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContaBancaria{");
        sb.append("numero=").append(numero);
        sb.append(", saldo=").append(saldo);
        sb.append('}');
        return sb.toString();
    }
}
