package br.com.jamazonasa;

public class PessoaFisica extends Pessoa {
    private String cpf;

    public  PessoaFisica(String nome, String endereco, String cpf) {
        super(nome, endereco);
        this.cpf = cpf;
    }

    @Override
    public void informacoesPessoa(){
        System.out.println(nome);
        System.out.println(endereco);
        System.out.println(cpf);
    }
}
