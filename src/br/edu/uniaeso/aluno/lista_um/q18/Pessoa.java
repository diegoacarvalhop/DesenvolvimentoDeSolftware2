package br.edu.uniaeso.aluno.lista_um.q18;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    private String nome;
    private LocalDate data_nascimento;
    private double altura;
    private long idade;

    public Pessoa() {
        setNome("");
        setData_nascimento(null);
        setAltura(0);
        setIdade(0);
    }

    public Pessoa(String nome, LocalDate data_nascimento, double altura, long idade) {
        setNome(nome);
        setData_nascimento(data_nascimento);
        setAltura(altura);
        setIdade(idade);
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

    public long getIdade() {
        return idade;
    }

    public void setIdade(long idade) {
        this.idade = idade;
    }

    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", data_nascimento=" + data_nascimento +
                ", altura=" + altura +
                ", idade=" + idade +
                '}';
    }

    public long calcularIdade(LocalDate data_nascimento) {
        if (data_nascimento.getDayOfMonth() < LocalDate.now().getDayOfMonth() &&
                data_nascimento.getMonthValue() <= LocalDate.now().getMonthValue()) {
            setIdade(ChronoUnit.YEARS.between(data_nascimento, LocalDate.now()) - 1);
            return getIdade();
        } else {
            setIdade(ChronoUnit.YEARS.between(data_nascimento, LocalDate.now()));
            return getIdade();
        }
    }
}
