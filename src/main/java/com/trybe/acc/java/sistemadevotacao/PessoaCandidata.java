package com.trybe.acc.java.sistemadevotacao;

/** class people candidate.*/

public class PessoaCandidata extends Pessoa {
  private int numero;
  private int votos;

  /** constructor.*/
  
  public PessoaCandidata(String nome, int numero) {
    this.nome = nome;
    this.numero = numero;
    this.votos = 0;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getVotos() {
    return votos;
  }

  public void receberVoto(int votos) {
    this.votos += votos;
  }
}
