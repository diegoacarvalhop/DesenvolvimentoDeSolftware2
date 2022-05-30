package br.edu.uniaeso.aluno.lista_um.q17;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario() {
        super();
        setSalario(0);
    }

    public Funcionario(String nome, double salario) {
        super(nome);
        setSalario(salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
