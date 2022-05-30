package br.edu.uniaeso.aluno.lista_um.q17;

import java.util.List;

public class Calcular {
    private double media, soma;
    private int quantidade;

    public Calcular() {
        setMedia(0);
        setQuantidade(0);
        setSoma(0);
    }

    public Calcular(double media, double soma, int quantidade) {
        setMedia(media);
        setQuantidade(quantidade);
        setSoma(soma);
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getSoma() {
        return soma;
    }

    public void setSoma(double soma) {
        this.soma = soma;
    }

    public double getMediaSalario(List<Funcionario> funcionarios) {
        setQuantidade(funcionarios.size());
        for (int i = 0; i < getQuantidade(); i++) {
            setSoma(getSoma() + funcionarios.get(i).getSalario());
        }
        setMedia(getSoma() / getQuantidade());
        return getMedia();
    }
}
