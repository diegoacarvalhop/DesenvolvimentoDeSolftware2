package br.edu.uniaeso.aluno.lista_um.q6;

public class Funcionario {
    private double salario_minimo, salario_funcionario;

    public Funcionario() {
        setSalario_minimo(0);
        setSalario_funcionario(0);
    }

    public Funcionario(double salario_minimo, double salario_funcionario) {
        setSalario_minimo(salario_minimo);
        setSalario_funcionario(salario_funcionario);
    }

    public double getSalario_minimo() {
        return salario_minimo;
    }

    public void setSalario_minimo(double salario_minimo) {
        this.salario_minimo = salario_minimo;
    }

    public double getSalario_funcionario() {
        return salario_funcionario;
    }

    public void setSalario_funcionario(double salario_funcionario) {
        this.salario_funcionario = salario_funcionario;
    }

    public double calculateQuantidadeSalario() {
        return salario_funcionario / salario_minimo;
    }
}
