package br.edu.uniaeso.aluno.lista_um.q19;

import br.edu.uniaeso.aluno.lista_um.q18.Pessoa;

import java.util.Scanner;

public class AgendaUI {
    private int opcao = 0;
    private Agenda a;
    private String nome;
    private int idade;
    private double altura;
    Scanner scan = new Scanner(System.in);

    public AgendaUI() {
        a = new Agenda();
    }

    public void menuAgenda() {
        System.out.print("- Agenda de Pessoas -");
        System.out.println("\n1 - Armazenar pessoas" +
                            "\n2 - Remover pessoa" +
                            "\n3 - Buscar pessoa" +
                            "\n3 - Imprimir agenda" +
                            "\n4 - Imprimir pessoa");

        setOpcao(scan.nextInt());

        switch (getOpcao()) {
            case 1:
                armazenaPessoa();
                break;
            case 2:
                removePessoa();
                break;
            case 3:
                buscaPessoa(false);
                break;
            case 4:
                imprimeAgenda();
                break;
            case 5:
                imprimePessoa();
                break;
        }
    }

    public void armazenaPessoa() {
        System.out.print("\nInforme o nome: ");
        setNome(scan.nextLine());
        System.out.print("\nInforme a idade: ");
        setIdade(scan.nextInt());
        System.out.print("\nInforme a altura: ");
        setAltura(scan.nextDouble());

        Agenda a = new Agenda(getNome(), null, getAltura(), getIdade());
        a.armazenaPessoa(a.getNome(), a.getIdade(), a.getAltura());
    }

    public void removePessoa() {
        System.out.print("\nInforme um nome para remover: ");
        setNome(scan.nextLine());
        a.removePessoa(getNome());
    }

    public int buscaPessoa(boolean imprimir) {
        if(imprimir) {
            System.out.print("\nInforme um nome para imprimir: ");
        } else {
            System.out.print("\nInforme um nome para remover: ");
        }
        setNome(scan.nextLine());
        return a.buscaPessoa(getNome());
    }

    public void imprimeAgenda() {
        a.imprimeAgenda();
    }

    public void imprimePessoa() {
        a.imprimePessoa(buscaPessoa(true));
    }

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }

    public Agenda getA() {
        return a;
    }

    public void setA(Agenda a) {
        this.a = a;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
