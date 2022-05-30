package br.edu.uniaeso.aluno.lista_um.q17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuncionarioUI {
    private List<Funcionario> funcionarios;
    private double user_salario;
    private String user_nome;
    private Funcionario funcionario;
    private Scanner get;

    public FuncionarioUI() {
        setFuncionarios(null);
        setUser_salario(0);
        setUser_nome("");
        setFuncionario(null);
        setGet(new Scanner(System.in));
    }

    public FuncionarioUI(List<Funcionario> funcionarios, double user_salario, String user_nome, Funcionario pessoa) {
        setFuncionarios(funcionarios);
        setFuncionario(funcionario);
        setUser_salario(user_salario);
        setUser_nome(user_nome);
        setGet(new Scanner(System.in));
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public double getUser_salario() {
        return user_salario;
    }

    public void setUser_salario(double user_salario) {
        this.user_salario = user_salario;
    }

    public String getUser_nome() {
        return user_nome;
    }

    public void setUser_nome(String user_nome) {
        this.user_nome = user_nome;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Scanner getGet() {
        return get;
    }

    public void setGet(Scanner get) {
        this.get = get;
    }

    public void getUser() {
        List<Funcionario> user_funcionarios = new ArrayList<>();
        for(int x = 0; x < 10; x++) {
            System.out.println("Informe a nome do funcionário:");
            setUser_nome(getGet().nextLine());
            System.out.println("Infomre o salário do funcionário:");
            setUser_salario(getGet().nextDouble());
            setFuncionario(new Funcionario(getUser_nome(), getUser_salario()));
            user_funcionarios.add(getFuncionario());
        }
        setFuncionarios(user_funcionarios);
    }

    public void calculate() {
        Calcular c = new Calcular();
        System.out.println(c.getMediaSalario(getFuncionarios()));
    }
}
