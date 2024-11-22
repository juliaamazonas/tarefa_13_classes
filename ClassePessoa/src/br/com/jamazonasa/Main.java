package br.com.jamazonasa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoaFisica = new PessoaFisica("Bartolomeu", "Rua Singapura", "78547189874");
        pessoaFisica.informacoesPessoa();

        Pessoa pessoaJuridica = new PessoaJuridica("Bartolomeu & CIA", "Rua da Empresa", "785471898740001/78");
        pessoaJuridica.informacoesPessoa();

    }
}
