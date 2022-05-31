package br.edu.uniaeso.aluno.lista_um.q20;

public class Capacidade {
    private int qtd_pessoas;
    private double peso_maximo;

    public Capacidade() {
        setQtd_pessoas(0);
        setPeso_maximo(0);
    }

    public Capacidade(int qtd_pessoas, double peso_maximo) {
        setQtd_pessoas(qtd_pessoas);
        setPeso_maximo(peso_maximo);
    }

    public int getQtd_pessoas() {
        return qtd_pessoas;
    }

    public void setQtd_pessoas(int qtd_pessoas) {
        this.qtd_pessoas = qtd_pessoas;
    }

    public double getPeso_maximo() {
        return peso_maximo;
    }

    public void setPeso_maximo(double peso_maximo) {
        this.peso_maximo = peso_maximo;
    }
}
