package br.edu.uniaeso.aluno.lista_um.q18;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    private String nome;
    private LocalDate data_nascimento;
    private double altura;

    public Pessoa() {
        setNome("");
        setData_nascimento(null);
        setAltura(0);
    }

    public Pessoa(String nome, LocalDate data_nascimento, double altura) {
        setNome(nome);
        setData_nascimento(data_nascimento);
        setAltura(altura);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(LocalDate data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", data_nascimento=" + data_nascimento +
                ", altura=" + altura +
                '}';
    }

    public long calcularIdade(LocalDate data_nascimento) {
        if (data_nascimento.getDayOfMonth() < LocalDate.now().getDayOfMonth() &&
                data_nascimento.getMonthValue() <= LocalDate.now().getMonthValue()) {
            return ChronoUnit.YEARS.between(data_nascimento, LocalDate.now()) - 1;
        } else {
            return ChronoUnit.YEARS.between(data_nascimento, LocalDate.now());
        }
    }
}
