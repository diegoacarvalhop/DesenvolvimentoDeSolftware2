package br.edu.uniaeso.aluno.lista_um.q7;

public class Losango {
    private double diagonal_menor, diagonal_maior;

    public Losango() {
        setDiagonal_menor(0);
        setDiagonal_maior(0);
    }

    public Losango(double diagonal_menor, double diagonal_maior) {
        setDiagonal_menor(diagonal_menor);
        setDiagonal_maior(diagonal_maior);
    }

    public double getDiagonal_menor() {
        return diagonal_menor;
    }

    public void setDiagonal_menor(double diagonal_menor) {
        this.diagonal_menor = diagonal_menor;
    }

    public double getDiagonal_maior() {
        return diagonal_maior;
    }

    public void setDiagonal_maior(double diagonal_maior) {
        this.diagonal_maior = diagonal_maior;
    }

    public double calculateArea() {
        return (getDiagonal_maior() * getDiagonal_menor())/2;
    }
}
