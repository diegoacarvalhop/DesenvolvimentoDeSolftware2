package br.edu.uniaeso.aluno.lista_um.q23;

public class Lampada {
    private String tipo, cor, marca;
    private int voltagem, potencia;
    private double preco;
    private boolean status;

    public Lampada() {
        setTipo("");
        setCor("");
        setMarca("");
        setVoltagem(0);
        setPotencia(0);
        setPreco(0);
        setStatus(true);
    }

    public Lampada(String tipo, String cor, String marca, int voltagem, int potencia, double preco, boolean status) {
        setTipo(tipo);
        setCor(cor);
        setMarca(marca);
        setVoltagem(voltagem);
        setPotencia(potencia);
        setPreco(preco);
        setStatus(status);
    }

    public void acender() {
        setStatus(true);
    }

    public void apagar() {
        setStatus(false);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Lampada{" +
                "tipo='" + tipo + '\'' +
                ", cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", voltagem=" + voltagem +
                ", potencia=" + potencia +
                ", preco=" + preco +
                ", status=" + status +
                '}';
    }
}
