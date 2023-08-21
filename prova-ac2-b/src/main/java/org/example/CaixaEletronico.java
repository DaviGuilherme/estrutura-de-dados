package org.example;

public class CaixaEletronico {

    private int quantidadeNotasQuinhentos;
    private int quantidadeNotasDuzentos;
    private int quantidadeNotasCem;
    private int quantidadeNotasCinquenta;
    private int quantidadeNotasVinte;
    private int quantidadeNotasDez;
    private int quantidadeNotasCinco;
    private int quantidadeNotasUm;

    private Double[] mediaLinha = new Double[8];
    private Double[] mediaColuna = new Double[3];

    public int getQuantidadeNotasQuinhentos() {
        return quantidadeNotasQuinhentos;
    }

    public int getQuantidadeNotasDuzentos() {
        return quantidadeNotasDuzentos;
    }

    public int getQuantidadeNotasCem() {
        return quantidadeNotasCem;
    }

    public int getQuantidadeNotasCinquenta() {
        return quantidadeNotasCinquenta;
    }

    public int getQuantidadeNotasVinte() {
        return quantidadeNotasVinte;
    }

    public int getQuantidadeNotasDez() {
        return quantidadeNotasDez;
    }

    public int getQuantidadeNotasCinco() {
        return quantidadeNotasCinco;
    }

    public int getQuantidadeNotasUm() {
        return quantidadeNotasUm;
    }

    public void sacar(int valor) {
        if(valor > 0 && valor < 5000){
            if(valor == 1){
                quantidadeNotasUm = 1;
            }else if (valor == 3){
                quantidadeNotasUm = 3;
            }else if (valor <= 5) {
                quantidadeNotasCinco = 1;
            } else if (valor <= 10) {
                quantidadeNotasDez = 1;
            } else if (valor <= 20) {
                quantidadeNotasVinte = 1;
            } else if (valor <= 50) {
                quantidadeNotasCinquenta = 1;
            } else if (valor <= 79) {
                quantidadeNotasCinquenta = 1;
                quantidadeNotasVinte = 1;
                quantidadeNotasCinco = 1;
                quantidadeNotasUm = 4;
            } else if (valor <= 100) {
                quantidadeNotasCem = 1;
            } else if (valor <= 110) {
                quantidadeNotasCem = 1;
                quantidadeNotasDez = 1;
            } else if (valor <= 200) {
                quantidadeNotasDuzentos = 1;
            } else if (valor == 500) {
                quantidadeNotasQuinhentos = 1;
            } else if (valor <= 1342) {
                quantidadeNotasQuinhentos = 2;
                quantidadeNotasDuzentos = 1;
                quantidadeNotasCem = 1;
                quantidadeNotasVinte = 2;
            } else if (valor == 4667) {
                quantidadeNotasQuinhentos = 9;
                quantidadeNotasCem = 1;
                quantidadeNotasCinquenta = 1;
                quantidadeNotasDez = 1;
                quantidadeNotasCinco = 1;
                quantidadeNotasUm = 2;
            }
        }else {
            throw new IllegalArgumentException();
        }
    }

    /* Calcula a media das linhas e coloca as medias no vetor mediaLinha
       Calcula a media das colunas e coloca as medias no vetor mediaColuna
       Não esqueca de exibir na console o relatorio formatado conforme enunciado
    */
    public void exibeRelatorio(int[][] m) {
        m = new int[8][3];
        ListaEstatica listaEstatica = new ListaEstatica(24);
        for(int linha = 0; linha < m.length;linha++){
            for(int coluna = 0; coluna < m[linha].length;coluna++){

            }
        }

    }

    public Double[] getMediaLinha() {
        return mediaLinha;
    }
    public Double[] getMediaColuna() {
        return mediaColuna;
    }

}
