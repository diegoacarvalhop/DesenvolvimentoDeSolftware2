package br.edu.uniaeso.aluno.lista_um.q20;

public class ManutencaoException extends Exception {

    public ManutencaoException() {
        super("Só pode entrar ou sair ao final da manutenção!");
    }
}
