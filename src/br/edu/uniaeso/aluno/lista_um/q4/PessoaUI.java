package br.edu.uniaeso.aluno.lista_um.q4;

import java.time.LocalDate;
import java.util.Scanner;

public class PessoaUI {
    private LocalDate data_nascimento;

    public PessoaUI() {
        setData_nascimento(null);
    }

    public PessoaUI(LocalDate data_nascimento) {
        setData_nascimento(data_nascimento);
    }

    public LocalDate getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(LocalDate data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public long calculaDiasDeVida() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a data de nascimento abaixo:\n");
        System.out.print("Dia: ");
        int dia = scan.nextInt();
        System.out.print("Mês: ");
        int mes = scan.nextInt();
        System.out.print("Ano: ");
        int ano = scan.nextInt();
        setData_nascimento(LocalDate.of(ano, mes, dia));

        Pessoa p = new Pessoa(getData_nascimento());
        long dias = p.calculaDiasDeVida(p.getData_nascimento());

        return dias;
    }
}
