package br.com.jamazonasa;

public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String nome, String endereco, String cnpj) {
        super(nome, endereco);
        this.cnpj = cnpj;
    }

    @Override
    public void informacoesPessoa(){
        System.out.println(nome);
        System.out.println(endereco);
        System.out.println(cnpj);
    }


}
