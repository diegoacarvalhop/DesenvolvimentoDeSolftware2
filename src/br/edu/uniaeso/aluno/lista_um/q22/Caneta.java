package br.edu.uniaeso.aluno.lista_um.q22;

public class Caneta {
    private String marca, cor;
    private double tamanho;

    public Caneta() {
        setMarca("");
        setCor("");
        setTamanho(0);
    }

    public Caneta(String marca, String cor, double tamanho) {
        setMarca(marca);
        setCor(cor);
        setTamanho(tamanho);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Caneta { " +
                "\n\tMarca = " + marca +
                "\n\tCor = " + cor +
                "\n\tTamanho = " + tamanho +
                "\n}";
    }
}
