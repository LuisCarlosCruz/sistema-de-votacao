package com.trybe.acc.java.sistemadevotacao;

import java.util.ArrayList;

/**
 * class voter.
 */

public class GerenciamentoVotacao {
  ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<>();
  ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<>();

  ArrayList<String> cpfComputado = new ArrayList<>();

  int totalVotos;


  /**
   * metodo cadastrar candidato.
   */
  public void cadastrarPessoaCandidata(String nome, int numero) {
    if (pessoasCandidatas.stream().anyMatch(o -> o.getNumero() == numero)) {
      System.out.println("Número pessoa candidata já utilizado!");
    } else {
      PessoaCandidata pc = new PessoaCandidata(nome, numero);
      pessoasCandidatas.add(pc);
    }
  }

  /**
   * metodo cadastrar eleitor.
   */
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    if (pessoasEleitoras.stream().anyMatch(o -> o.getCpf().equals(cpf))) {
      System.out.println("Pessoa eleitora já cadastrada!");
    } else {
      PessoaEleitora pe = new PessoaEleitora(nome, cpf);
      pessoasEleitoras.add(pe);
    }
  }

  /**
   * metodo votar.
   */
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    if (cpfComputado.contains(cpfPessoaEleitora)) {
      System.out.println("Pessoa eleitora já votou!");
    } else {
      for (PessoaCandidata candidato : pessoasCandidatas) {
        if (candidato.getNumero() == numeroPessoaCandidata) {
          candidato.receberVoto(1);
          cpfComputado.add(cpfPessoaEleitora);
          this.totalVotos += 1;
        }
      }
    }
  }

  /**
   * metodo mostrarResultado.
   */
  public void mostrarResultado() {
    if (totalVotos == 0) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
    } else {
      for (PessoaCandidata candidato : pessoasCandidatas) {
        String nome = candidato.getNome();
        int qtdVotos = candidato.getVotos();
        String votos = String.valueOf(qtdVotos);
        // calcular porcentagem passando candidato como index para o metodo calcularPonce
        double porcetVotosCandidato = this.calcularPorcentagemVotos(qtdVotos);
        String porcent = String.valueOf(porcetVotosCandidato);
        System.out.println("Nome: ".concat(nome).concat(" - ")
                .concat(votos).concat(" votos ").concat("( " + porcent + " )%"));
      }
      System.out.println("Total de votos: " + this.totalVotos);
    }
  }

  private double calcularPorcentagemVotos(int qtdVotos) {
    double votos = Double.parseDouble(String.valueOf(qtdVotos));
    double votosTotal = Double.parseDouble(String.valueOf(totalVotos));
    return Math.round((votos * 100) / votosTotal);
  }

}
