package org.example;

public class Vilao extends Personagem implements Ipoder{
    private String armaSecreta;

    public Vilao(String nome, String identidadeSecreta, String habilidade, Double forca, String armaSecreta) {
        super(nome, identidadeSecreta, habilidade, forca);
        this.armaSecreta = armaSecreta;
    }

    @Override
    public Double atacar() {
        return getForca() * 0.15;
    }

    public String getArmaSecreta() {
        return armaSecreta;
    }

    public void setArmaSecreta(String armaSecreta) {
        this.armaSecreta = armaSecreta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vilao{");
        sb.append("armaSecreta='").append(armaSecreta).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
