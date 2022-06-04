package br.edu.uniaeso.aluno.lista_um.q27;

public class Pessoa {
    private String nome, cpf;

    public Pessoa() {
        setNome("");
        setCpf("");
    }

    public Pessoa(String nome, String cpf) {
        setNome(nome);
        setCpf(cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
