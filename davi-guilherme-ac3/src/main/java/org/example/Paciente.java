package org.example;

public class Paciente {
    private int id;
    private String nome;
    private Double valor;
    private int prioridade;
    private int pressao;

    public Paciente(int id, String nome, Double valor, int prioridade, int pressao){
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.prioridade = prioridade;
        this.pressao = pressao;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public int getPresao() {
        return pressao;
    }

    public void setPresao(int presao) {
        this.pressao = presao;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Paciente{");
        sb.append("id=").append(id);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", valor=").append(valor);
        sb.append(", prioridade=").append(prioridade);
        sb.append(", presao=").append(pressao);
        sb.append('}');
        return sb.toString();
    }
}
