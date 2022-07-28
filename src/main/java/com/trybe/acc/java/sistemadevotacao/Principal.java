package com.trybe.acc.java.sistemadevotacao;

import java.util.Scanner;

/** * class principal. */

public class Principal {

  /*** Meted main.*/

  public static void main(String[] args) {
    byte option1;
    byte option2;
    byte option3;

    GerenciamentoVotacao votacao = new GerenciamentoVotacao();
    Scanner scanner = new Scanner(System.in);
    System.out.println("----------- Bem-vindo ao Sistema de Votação -----------");
    do {
      System.out.println("Cadastrar pessoa candidata?\n"
              + "1 - Sim\n"
              + "2 - Não\n"
              + "Entre com o número correspondente à opção desejada:");
      option1 = scanner.nextByte();
      if (option1 == 1) {
        System.out.println("Entre com o nome da pessoa candidata:");
        String nomeCandidato = scanner.next();
        System.out.println("Entre com o número da pessoa candidata:");
        String num = scanner.next();
        int numeroCanditado = Integer.parseInt(num);
        votacao.cadastrarPessoaCandidata(nomeCandidato, numeroCanditado);
      }
    } while (option1 != 2);

    System.out.println("----------- Cadastre as pessoas eleitoras -----------");
    do {
      System.out.println("Cadastrar pessoa eleitora?\n"
              + "1 - Sim\n"
              + "2 - Não\n"
              + "Entre com o número correspondente à opção desejada:");
      option2 = scanner.nextByte();
      if (option2 == 1) {
        System.out.println("Entre com o nome da pessoa eleitora:");
        String nomeEleitor = scanner.next();
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpf = scanner.next();
        votacao.cadastrarPessoaEleitora(nomeEleitor, cpf);
      }
    } while (option2 != 2);

    System.out.println("----------- Votação iniciada! -----------");
    do {
      System.out.println("Entre com o número correspondente à opção desejada:\n"
              + "1 - Votar\n"
              + "2 - Resultado Parcial\n"
              + "3 - Finalizar Votação");
      option3 = scanner.nextByte();
      if (option3 == 1) {
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpf = scanner.next();
        System.out.println("Entre com o número da pessoa candidata:");
        String votoInput = scanner.next();
        int voto = Integer.parseInt(votoInput);
        votacao.votar(cpf, voto);
      }
      if (option3 == 2) {
        votacao.mostrarResultado();
      }
    } while (option3 != 3);
    scanner.close();
    System.out.println("FIM");
  }
}

