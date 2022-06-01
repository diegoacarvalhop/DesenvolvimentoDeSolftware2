package br.edu.uniaeso.aluno.lista_um.q24;

import java.util.Scanner;

public class ApoliceUI {
    private String nome_segurado;
    private int idade_segurado;
    private double valor_premio;

    public ApoliceUI() {
        setNome_segurado("");
        setIdade_segurado(0);
        setValor_premio(0);
    }

    public ApoliceUI(String nome_segurado, int idade_segurado, double valor_premio) {
        setNome_segurado(nome_segurado);
        setIdade_segurado(idade_segurado);
        setValor_premio(valor_premio);
    }

    public void getUsuario() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o nome do segurado: ");
        setNome_segurado(scan.nextLine());
        System.out.print("\nInforme a idade do segurado: ");
        setIdade_segurado(scan.nextInt());
        System.out.print("\nInforme o valor do prêmio: ");
        setValor_premio(scan.nextDouble());

        Apolice a = new Apolice(getNome_segurado(), getIdade_segurado(), getValor_premio());
        a.calcularPremioApolice();
        a.oferecerDesconto("Rio de Janeiro");
        System.out.println("\n" + a);
        System.out.println(a.getValor_premio());
    }

    public static void main(String[] args) {
        ApoliceUI aui = new ApoliceUI();
        aui.getUsuario();
    }

    public String getNome_segurado() {
        return nome_segurado;
    }

    public void setNome_segurado(String nome_segurado) {
        this.nome_segurado = nome_segurado;
    }

    public int getIdade_segurado() {
        return idade_segurado;
    }

    public void setIdade_segurado(int idade_segurado) {
        this.idade_segurado = idade_segurado;
    }

    public double getValor_premio() {
        return valor_premio;
    }

    public void setValor_premio(double valor_premio) {
        this.valor_premio = valor_premio;
    }
}
