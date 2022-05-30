package br.edu.uniaeso.aluno.lista_um.q19;

import br.edu.uniaeso.aluno.lista_um.q18.Pessoa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Agenda extends Pessoa {
    private List<Pessoa> agenda;

    public Agenda() {
        super();
        setAgenda(null);
    }

    public Agenda(String nome, LocalDate data_nascimento, double altura, int idade) {
        super(nome, data_nascimento, altura, idade);
        setAgenda(new ArrayList<>());
    }

    public List<Pessoa> getAgenda() {
        return agenda;
    }

    public void setAgenda(List<Pessoa> agenda) {
        this.agenda = agenda;
    }

    public void armazenaPessoa(String nome, long idade, double altura) {
        Pessoa p = new Pessoa(nome, null, altura, idade);
        agenda.add(p);
    }

    public void removePessoa(String nome) {
        for(Pessoa p : agenda) {
            if(p.getNome().equals(nome)) {
                agenda.remove(agenda.indexOf(p));
            }
        }
    }

    public int buscaPessoa(String nome) {
        Pessoa pessoa = null;
        for(Pessoa p : agenda) {
            if(p.getNome().equals(nome)) {
                pessoa = p;
            }
        }
        return agenda.indexOf(pessoa);
    }

    public void imprimeAgenda() {
        for(Pessoa p : agenda) {
            System.out.println(p);
        }
    }

    public void imprimePessoa(int index) {
        System.out.println(agenda.get(index));
    }
}
