package org.example;

public class Heroi extends Personagem implements Ipoder{
    private String organizacao;

    public Heroi(String nome, String identidadeSecreta, String habilidade, Double forca, String organizacao) {
        super(nome, identidadeSecreta, habilidade, forca);
        this.organizacao = organizacao;
    }

    @Override
    public Double atacar() {
        return getForca() * 0.20;
    }

    public String getOrganizacao() {
        return organizacao;
    }

    public void setOrganizacao(String organizacao) {
        this.organizacao = organizacao;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Heroi{");
        sb.append("organizacao='").append(organizacao).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
