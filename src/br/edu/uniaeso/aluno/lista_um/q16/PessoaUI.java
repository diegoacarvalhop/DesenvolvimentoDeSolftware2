package br.edu.uniaeso.aluno.lista_um.q16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PessoaUI extends Calcular {
    private List<Pessoa> pessoas;
    private double user_altura;
    private String user_sexo;
    private Scanner get;
    private Pessoa pessoa;

    public PessoaUI() {
        setPessoas(null);
        setUser_altura(0);
        setUser_sexo("");
        setPessoa(null);
        setGet(new Scanner(System.in));
    }

    public PessoaUI(List<Pessoa> pessoas, double user_altura, String user_sexo, Pessoa pessoa) {
        setPessoas(new ArrayList<>());
        setUser_altura(user_altura);
        setUser_sexo(user_sexo);
        setPessoa(pessoa);
        setGet(new Scanner(System.in));
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public double getUser_altura() {
        return user_altura;
    }

    public void setUser_altura(double user_altura) {
        this.user_altura = user_altura;
    }

    public String getUser_sexo() {
        return user_sexo;
    }

    public void setUser_sexo(String user_sexo) {
        this.user_sexo = user_sexo;
    }

    public Scanner getGet() {
        return get;
    }

    public void setGet(Scanner get) {
        this.get = get;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void getUser() {
        List<Pessoa> user_pessoas = new ArrayList<>();
        for (int x = 0; x < 10; x++) {
            System.out.println("Informe a altura:");
            setUser_altura(getGet().nextDouble());
            setUser_sexo(getGet().nextLine());
            setPessoa(new Pessoa(getUser_altura(), getUser_sexo()));
            user_pessoas.add(getPessoa());
        }
        setPessoas(user_pessoas);
    }

    public void calculate() {
        System.out.println(getNumberWoman(getPessoas()));
        System.out.println(getMaiorMenorAltura(getPessoas()));
        System.out.println(getMediaAlturaHomens(getPessoas()));
    }
}
