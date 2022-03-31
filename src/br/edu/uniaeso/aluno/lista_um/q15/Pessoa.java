package br.edu.uniaeso.aluno.lista_um.q15;

public class Pessoa {
    private String nome;

    public Pessoa() {
        setNome("");
    }

    public Pessoa(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
