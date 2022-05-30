package br.edu.uniaeso.aluno.lista_um.q6;

import java.util.Scanner;

public class FuncionarioUI {
    private final double SALARIO_MINIMO = 1.212;
    private double salario_funcionario;
    private Scanner get = new Scanner(System.in);

    public FuncionarioUI() {
        setSalario_funcionario(0);
    }

    public FuncionarioUI(double salario_funcionario) {
        setSalario_funcionario(salario_funcionario);
    }

    public double getSalario_funcionario() {
        return salario_funcionario;
    }

    public void setSalario_funcionario(double salario_funcionario) {
        this.salario_funcionario = salario_funcionario;
    }

    public void getUser() {
        System.out.println("Informe o salário do funcionário");
        setSalario_funcionario(get.nextDouble());
    }

    public double calculateQuantidadeSalario() {
        Funcionario f = new Funcionario(this.SALARIO_MINIMO, getSalario_funcionario());
        return f.calculateQuantidadeSalario();
    }
}
