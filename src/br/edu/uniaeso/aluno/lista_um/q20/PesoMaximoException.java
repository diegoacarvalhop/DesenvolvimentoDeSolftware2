package br.edu.uniaeso.aluno.lista_um.q20;

public class PesoMaximoException extends Exception {

    public PesoMaximoException() {
        super("Não pode descer ou subir, pois já atingiu o peso máximo!");
    }
}
