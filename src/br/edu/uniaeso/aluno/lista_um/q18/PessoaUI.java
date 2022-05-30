package br.edu.uniaeso.aluno.lista_um.q18;

import java.time.LocalDate;
import java.util.Scanner;

public class PessoaUI {
    private String nome;
    private LocalDate data_nascimento;
    private double altura;

    Scanner scan = new Scanner(System.in);

    public PessoaUI() {
        setNome("");
        setData_nascimento(null);
        setAltura(0);
    }

    public PessoaUI(String nome, LocalDate data_nascimento, double altura) {
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

    public void getUsuario() {
        System.out.print("Informe seu nome: ");;
        setNome(scan.nextLine());
        System.out.print("\nInforme sua data de dasciento: ");
        System.out.print("\nDia: ");
        int dia = scan.nextInt();
        System.out.print("\nMês: ");
        int mes = scan.nextInt();
        System.out.println("\nAno: ");
        int ano = scan.nextInt();
        System.out.println("\n\nAltura: ");
        setAltura(scan.nextInt());

        setData_nascimento(LocalDate.of(ano, mes, dia));
    }

    public long calculaIdade() {
        Pessoa p = new Pessoa(getNome(), getData_nascimento(), getAltura());
        return p.calcularIdade(p.getData_nascimento());
    }
}
