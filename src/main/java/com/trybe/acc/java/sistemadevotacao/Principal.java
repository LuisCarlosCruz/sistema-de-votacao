package com.trybe.acc.java.sistemadevotacao;

import java.util.ArrayList;
import java.util.Scanner;

/** class principal.*/

public class Principal {
  
  /** Meted main. */

  public static void main(String[] args) {
    byte option1;
    byte option2;
    byte option3;
    ArrayList<PessoaCandidata> listaCandidatos = new ArrayList<>();
    ArrayList<PessoaEleitora> listaEleitores = new ArrayList<>();
    
    //    GerenciamentoVotacao gerenciamentoVotacao = new GerenciamentoVotacao();
    //    System.out.println(gerenciamentoVotacao);

    Scanner scanner = new Scanner(System.in);
    
    // PRIMEIRO LAÇO - MENU CADASTRO PESSOAS CANDIDATAS
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
        short numeroCanditado = Short.parseShort(num);
          
        PessoaCandidata pc = new PessoaCandidata(nomeCandidato, numeroCanditado);
        
        listaCandidatos.add(pc);
      }

    } while (option1 != 2);

    //for (PessoaCandidata canditado : listaCandidatos) {
    //System.out.println(canditado.getNomeCandidato()
    //    + " " + canditado.getNumeroCandidato());
    //}
    
    // SEGUNDO LACO - MENU CADASTRO PESSOAS ELEITORAS
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
        String cpfEleitor = scanner.next();
        
        PessoaEleitora pe = new PessoaEleitora(nomeEleitor, cpfEleitor);
        
        listaEleitores.add(pe);
      }
      
    } while (option2 != 2);
    
    //    for (PessoaEleitora eleitor : listaEleitores) {
    //      System.out.println(eleitor.getNomeEleitor());
    //      System.out.println(eleitor.getCpfEleitor());
    //    }
        
    // TERCEIRO LACO - MENU (VOTA / RESULT PARCIAL / FINALIZAR VOTACAO)
    
    do {
      System.out.println("Entre com o número correspondente à opção desejada:\n"
            + "1 - Votar\n"
            + "2 - Resultado Parcial\n"
            + "3 - Finalizar Votação");
      option3 = scanner.nextByte();
      
      if (option3 == 1) {
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpf = scanner.next();
        // VERIFICAR SE O CPF JA EXISTE NO ARRAY DE ELEITORES
        System.out.println("Entre com o número da pessoa candidata:");
        String voto = scanner.next();
        // COMPUTAR O VOTO
      } 
      
      if (option3 == 2) {
        System.out.println("OPCAO 2");
      }
      
    } while (option3 != 3);
    
    scanner.close();
    System.out.println("FIM");
  }

}


// VERIFICA TIPO VARIAVEL
// System.out.println(numeroCandidato.getClass().getSimpleName());
