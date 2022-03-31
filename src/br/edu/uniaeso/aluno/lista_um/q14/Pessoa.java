package br.edu.uniaeso.aluno.lista_um.q14;

public class Pessoa {
    private double altura;
    private String sexo;

    public Pessoa() {
        setAltura(0);
        setSexo("");
    }

    public Pessoa(double altura, String sexo) {
        setAltura(altura);
        setSexo(sexo);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
