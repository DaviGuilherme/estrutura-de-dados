package org.example;

public class Livro {
    private String nome;
    private String autor;

    public Livro(String nome, String autor) {
        this.nome = nome;
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Livro{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", autor='").append(autor).append('\'');
        sb.append('}');
        return sb.toString();
    }
}


