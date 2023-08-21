package org.example;

public class Repositorio {
    private ListaObj<Paciente> lista;
    private PilhaObj<Operacao> pilha;
    private FilaObj<Integer> fila;
    private int contador;

    public Repositorio() {
        this.lista = new ListaObj(20);
        this.pilha = new PilhaObj(10);
        this.fila = new FilaObj(10);
        this.contador = 0;
    }



    public int tamanhoRepositorio(){
        return lista.getNroElem();
    }

    public void salvar(Paciente paciente){
        this.lista.adiciona(paciente);
    }

    public void deletarPeloId(int id) {
        boolean achado = false;
        for(int i = 0;i < lista.getNroElem();i++){
            if(lista.getElemento(i).getId() == id){
                achado = true;
                lista.removePeloIndice(i);
            }
        }
        if (achado == false){
            System.out.println("id inválido");
        }
    }

    public void aumentarValorPeloId(int id, Double valorDeAumento){
        boolean achado = false;
        for(int i = 0;i < lista.getNroElem();i++){
            if(lista.getElemento(i).getId() == id){
                achado = true;
                lista.getElemento(i).setValor(lista.getElemento(i).getValor() + valorDeAumento);
                Operacao operacao = new Operacao(id,valorDeAumento);
                pilha.push(operacao);
                fila.insert(contador);
                lista.adicionaNoIndice(lista.getElemento(i),i);
                contador++;
                break;
            }
        }
        if(achado == false){
            System.out.println("id inválido");
        }
    }

    public void diminuirValorPorId(int id, Double valorDeDiminuicao){
        boolean achou = false;
        for(int i = 0;i < lista.getNroElem();i++){
            if(lista.getElemento(i).getId() == id){
                achou = true;
                lista.getElemento(i).setValor(lista.getElemento(i).getValor() - valorDeDiminuicao);
                Operacao operacao = new Operacao(id,valorDeDiminuicao);
                fila.insert(contador);
                contador--;
                break;
            }
        }
        if(achou == false){
            System.out.println("Id inválido");
        }
    }
    public void desfazer(int qtdOperacoesAdesfazer) {
        if (qtdOperacoesAdesfazer < 0 || qtdOperacoesAdesfazer > contador) {
            System.out.println("Nada a desfazer");
        }
        else if(contador == 0){
            System.out.println("Nada a desfazer");
        }
        else {
            for (int i = 0; i < qtdOperacoesAdesfazer; i++) {
                Operacao operacao = pilha.pop();
                diminuirValorPorId(operacao.getId(), operacao.getValorDeAumento());
                contador--;
            }
        }
    }
    public void agendarDeletarPorId(int id){
        fila.insert(id);
    }
    public void executarAgendado() {
        if (fila.isEmpty()) {
            System.out.println("Nenhuma operação agendada");
        }

        int id = fila.poll();
        deletarPeloId(id);
    }

    public void salvarAposId(Paciente paciente, int id){
        boolean encontrado = false;
        int indice = 0;
        for(int i = 0;i < lista.getNroElem();i++){
            if(lista.getElemento(i).getId() == id){
                encontrado = true;
                indice = i;
            }
        }
        if(encontrado == false){
            System.out.println("id inválido");
        }else {
            lista.adicionaNoIndice(paciente,indice+1);
        }
    }
    public void exibe(){
        lista.exibe();
    }


    public static int somarInteiros(int numero, int total){
        if(numero > 0){
            total += numero;
            return somarInteiros(numero-1,total);
        }else{
            return total;
        }
    }

    public ListaObj<Paciente> getLista() {
        return lista;
    }
}
