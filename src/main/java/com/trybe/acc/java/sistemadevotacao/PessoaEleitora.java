package com.trybe.acc.java.sistemadevotacao;

/** class people voter.*/

public class PessoaEleitora {
  private String nome;
  private String cpf;
  
  public PessoaEleitora(String nome, String cpf) {
    this.nome = nome;
    this.cpf = cpf;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nomeEleitor) {
    this.nome = nomeEleitor;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
  
}
