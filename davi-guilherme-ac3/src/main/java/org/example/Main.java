package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Repositorio repositorio = new Repositorio();
        Scanner in = new Scanner(System.in);
        int id = 2000;
        int opcao = 0;
        int indice = -1;
        while(opcao != 1){
            System.out.println("Sistema de gerenciamento de consultas");
            System.out.println("[1] Finalizar");
            System.out.println("[2] Preencher ficha do paciente (salvar)");
            System.out.println("[3] Deletar pelo id");
            System.out.println("[4] Aumentar valor pelo id");
            System.out.println("[5] Diminuir valor pelo id");
            System.out.println("[6] Desfazer");
            System.out.println("[7] Agendar deletar pelo id");
            System.out.println("[8] Executar agendado");
            System.out.println("[9] salvar ápos id");
            System.out.println("[10] exibe");
            System.out.println("[11] exibir a soma dos numeros inteiros posteriores ao id do primeiro elemento do repositório");
            System.out.println("[12] exibir relatório");
            System.out.println("Digite o número da opção: ");
            opcao = in.nextInt();
            if(opcao == 2){
                String nome = "";
                Double valor = 0.0;
                int prioridade = 0;
                int pressao = 12;
                System.out.println("Nome: ");
                nome = in.next();
                System.out.println("Valor: ");
                valor = in.nextDouble();
                System.out.println("Prioridade: ");
                prioridade = in.nextInt();
                System.out.println("Pressão: ");
                pressao = in.nextInt();
                Paciente paciente = new Paciente(id+=1,nome,valor,prioridade,pressao);
                repositorio.salvar(paciente);
            } else if (opcao == 3) {
                System.out.println("Digite o id: ");
                int idAux = in.nextInt();
                System.out.println("Antes do deletar: ");
                repositorio.exibe();
                repositorio.deletarPeloId(idAux);
                System.out.println("Depois do deletar: ");
                repositorio.exibe();
            } else if (opcao == 4) {
                System.out.println("Entre com o id: ");
                int idAux =  in.nextInt();
                System.out.println("Entre com o valor do aumento: ");
                Double valorDoAumento = in.nextDouble();
                System.out.println("Antes do aumento: ");
                repositorio.exibe();

                repositorio.aumentarValorPeloId(idAux,valorDoAumento);

                System.out.println("Depois do aumento: ");
                repositorio.exibe();
            } else if (opcao == 5) {
                System.out.println("Entre com o id: ");
                int idAux =  in.nextInt();
                System.out.println("Entre com o valor que sera subtraido: ");
                Double valorDaSubtracao = in.nextDouble();
                System.out.println("Antes de subtrair: ");
                repositorio.exibe();
                repositorio.diminuirValorPorId(idAux,valorDaSubtracao);
                System.out.println("Depois da subtracao: ");
                repositorio.exibe();
            } else if (opcao == 6) {
                System.out.println("Entre com a quantidade de passos que você deseja desfazer: ");
                int qtdPassos = in.nextInt();
                repositorio.desfazer(qtdPassos);
                System.out.println("Desfeito :)");
            } else if (opcao == 7) {
                System.out.println("Entre com o id: ");
                int idAux =  in.nextInt();
                repositorio.agendarDeletarPorId(idAux);
                System.out.println("Agendado :)");
            } else if (opcao == 8) {
                System.out.println("Entre com o id: ");
                int idAux =  in.nextInt();
                repositorio.executarAgendado();
                System.out.println("Executado :)");
            } else if (opcao == 9) {
                String nome = "";
                Double valor = 0.0;
                int prioridade = 0;
                int pressao = 12;
                System.out.println("Nome: ");
                nome = in.next();
                System.out.println("Valor: ");
                valor = in.nextDouble();
                System.out.println("Prioridade: ");
                prioridade = in.nextInt();
                System.out.println("Pressão: ");
                pressao = in.nextInt();
                Paciente paciente = new Paciente(id+=1,nome,valor,prioridade,pressao);
                System.out.println("Entre com o id a ser salvo posteriormente: ");
                int idAux = in.nextInt();
                repositorio.salvarAposId(paciente,idAux);
                System.out.println("Salvo :)");
            } else if (opcao == 10) {
                repositorio.exibe();
            } else if (opcao==11) {
                Paciente paciente = repositorio.getLista().getElemento(0);
                System.out.println("===================================================");
                System.out.println("Soma dos inteiros posteriosos ao número do id "+ paciente.getId() + ": " + repositorio.somarInteiros(paciente.getId(),0));
                System.out.println("===================================================");
            } else if (opcao == 12) {
//                int linhas = repositorio.tamanhoRepositorio();
//
//                Integer[] media = new Integer[2];
//                Double[] mediaDouble = new Double[1];
//
//                Integer[] idPaciente = new Integer[linhas];
//                String[] nome = new String[linhas];
//                Double[][] valor = new Double[linhas][1];
//                Integer[][] prioridade = new Integer[linhas][1];
//                Integer[][] pressao = new Integer[linhas][1];
//
//                for(int i = 0;i < idPaciente.length;i++){
//                    idPaciente[i] = repositorio.getLista().getElemento(i).getId();
//                }
//                for(int linha = 0;linha < prioridade.length;linha++) {
//                    for (int coluna = 0; coluna < prioridade[linha].length; coluna++) {
//                        valor[linha][coluna] = repositorio.getLista().getElemento(linha).getValor();
//                    }
//                }
//                for(int i = 0; i < nome.length;i++){
//                    nome[i] = repositorio.getLista().getElemento(i).getNome();
//                }
//                for(int linha = 0;linha < prioridade.length;linha++) {
//                    for (int coluna = 0; coluna < prioridade[linha].length; coluna++) {
//                        prioridade[linha][coluna] = repositorio.getLista().getElemento(linha).getPrioridade();
//                    }
//                }
//                for(int linha = 0;linha < pressao.length;linha++) {
//                    for (int coluna = 0; coluna < prioridade[linha].length; coluna++) {
//                        pressao[linha][coluna] = repositorio.getLista().getElemento(linha).getPresao();
//                    }
//                }
//                mediaDouble[0] = somaColunaDouble(valor,0);
//                media[0] = somaColunaInteger(prioridade,0);
//                media[1] = somaColunaInteger(pressao,0);
//                System.out.printf("%-17s","Id" );
//                System.out.printf("%-17s","Nome" );
//                System.out.printf("%-17s","Valor" );
//                System.out.printf("%-17s","Prioridade" );
//                System.out.printf("%-17s","Pressão" );
//                System.out.println();
//                for (int linha = 0; linha < linhas;linha++){
//                    System.out.printf("%-17s",idPaciente[linha]);
//                    System.out.printf("%-17s", nome[linha]);
//                    System.out.printf("%-17s", valor[linha]);
//                    System.out.printf("%-17s", prioridade[linha]);
//                    System.out.printf("%-17s", pressao[linha]);
//                    System.out.println();
//                }
//                System.out.printf("%-17s","Média:");
//                System.out.printf("%-17s","*****");
//                System.out.printf("%-17s", (mediaDouble[0]/linhas));
//                System.out.printf("%-17s",(media[0]/linhas));
//                System.out.printf("%-17s",(media[1]/linhas));
//                System.out.println();
                String[] paciente = new String[5];
                Integer[][] pressaoPrioridade = new Integer[5][4];
                Double[] mediaColuna = new Double[4];
                Double[] mediaLinha = new Double[5];

                for(int i = 0; i < paciente.length;i++){
                    System.out.println("Digite o nome do paciente: ");
                    paciente[i] = in.next();
                }

                for(int linha = 0; linha < 5;linha++){
                    for(int coluna = 0; coluna < 1;coluna++){
                        System.out.printf("Digite a PRIORIDADE (hoje) de %s: ",paciente[linha]);
                        pressaoPrioridade[linha][0] = in.nextInt();
                    }
                }

                for(int linha = 0; linha < 5;linha++){
                    for(int coluna = 0; coluna < 1;coluna++){
                        System.out.printf("Digite a PRESSÃO (hoje) de %s: ",paciente[linha]);
                        pressaoPrioridade[linha][1] = in.nextInt();
                    }
                }

                for(int linha = 0; linha < 5;linha++){
                    for(int coluna = 0; coluna < 1;coluna++){
                        System.out.printf("Digite a PRIORIDADE (ontem) de %s: ",paciente[linha]);
                        pressaoPrioridade[linha][2] = in.nextInt();
                    }
                }

                for(int linha = 0; linha < 5;linha++){
                    for(int coluna = 0; coluna < 1;coluna++){
                        System.out.printf("Digite a PRESSÃO (ontem) de %s: ",paciente[linha]);
                        pressaoPrioridade[linha][3] = in.nextInt();
                    }
                }

                mediaColuna[0] = somaColuna(pressaoPrioridade,0);
                mediaColuna[1] = somaColuna(pressaoPrioridade,1);
                mediaColuna[2] = somaColuna(pressaoPrioridade,2);
                mediaColuna[3] = somaColuna(pressaoPrioridade,3);
                mediaLinha[0] = somaLinha(pressaoPrioridade,0);
                mediaLinha[1] = somaLinha(pressaoPrioridade,1);
                mediaLinha[2] = somaLinha(pressaoPrioridade,2);
                mediaLinha[3] = somaLinha(pressaoPrioridade,3);
                mediaLinha[4] = somaLinha(pressaoPrioridade,4);
                System.out.printf("%-17s","NOME DO PACIENTE" );
                System.out.printf("%17s","PRESSÃO(hoje)" );
                System.out.printf("%17s","PRIORIDADE(hoje)" );
                System.out.printf("%17s","PRESSÃO(ontem)" );
                System.out.printf("%18s","PRIORIDADE(ontem)" );
                System.out.printf("%10s","Média:" );
                System.out.println();
                for(int linha = 0; linha < pressaoPrioridade.length;linha++){
                    System.out.printf("%-17s",paciente[linha]);
                    System.out.printf("%17s", pressaoPrioridade[linha][0]);
                    System.out.printf("%17s", pressaoPrioridade[linha][1]);
                    System.out.printf("%17s", pressaoPrioridade[linha][2]);
                    System.out.printf("%18s", pressaoPrioridade[linha][3]);
                    System.out.printf("%10s", (mediaLinha[linha] / 5));
                    System.out.println();
                }
                System.out.printf("%-17s","Média:" );
                System.out.printf("%17s", (mediaColuna[0] / 5));
                System.out.printf("%17s", (mediaColuna[1] / 5));
                System.out.printf("%17s", (mediaColuna[2] / 5));
                System.out.printf("%17s", (mediaColuna[3] / 5));
                System.out.println();
            }
            }

        System.out.println("Fim :)");
    }
    public static Double somaColuna(Integer[][] matriz,int numeroColuna){
        Double totalColuna = 0.0;
        for(int linha = 0; linha< matriz.length;linha++){
            totalColuna += matriz[linha][numeroColuna];
        }
        return totalColuna;
    }
    public static Double somaLinha(Integer[][] matriz,int numeroLinha) {
        Double total = 0.0;
        for (int coluna = 0; coluna < matriz[numeroLinha].length; coluna++) {
            total += matriz[numeroLinha][coluna];
        }
        return total;
    }
}