package org.example;

public class Civil extends Personagem {
    private Integer contasApagar;

    public Civil(String nome, String identidadeSecreta, String habilidade, Double forca, Integer contasApagar) {
        super(nome, identidadeSecreta, habilidade, forca);
        this.contasApagar = contasApagar;
    }

    public Integer getContasApagar() {
        return contasApagar;
    }

    public void setContasApagar(Integer contasApagar) {
        this.contasApagar = contasApagar;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Civil{");
        sb.append("contasApagar=").append(contasApagar);
        sb.append('}');
        return sb.toString();
    }
}
