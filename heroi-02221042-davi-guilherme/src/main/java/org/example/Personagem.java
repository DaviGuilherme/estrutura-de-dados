package org.example;

public abstract class Personagem {
    private String nome;
    private String identidadeSecreta;
    private String habilidade;
    private Double forca;

    public Personagem(String nome, String identidadeSecreta, String habilidade, Double forca) {
        this.nome = nome;
        this.identidadeSecreta = identidadeSecreta;
        this.habilidade = habilidade;
        this.forca = forca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentidadeSecreta() {
        return identidadeSecreta;
    }

    public void setIdentidadeSecreta(String identidadeSecreta) {
        this.identidadeSecreta = identidadeSecreta;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public Double getForca() {
        return forca;
    }

    public void setForca(Double forca) {
        this.forca = forca;
    }
}
