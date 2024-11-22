package br.com.jamazonasa;

abstract class Pessoa {
    public    String nome;
    public    String endereco;

    public Pessoa(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public  abstract void informacoesPessoa();
}
