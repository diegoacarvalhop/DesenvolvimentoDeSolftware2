package br.edu.uniaeso.aluno.lista_um.q7;

import java.util.Scanner;

public class LosangoUI {
    private double user_diagonal_menor, user_diagonal_maior;
    private Scanner get;

    public LosangoUI() {
        setUser_diagonal_menor(0);
        setUser_diagonal_maior(0);
        setGet(new Scanner(System.in));
    }

    public LosangoUI(double user_diagonal_menor, double user_diagonal_maior) {
        setUser_diagonal_menor(user_diagonal_menor);
        setUser_diagonal_maior(user_diagonal_maior);
        setGet(new Scanner(System.in));
    }

    public double getUser_diagonal_menor() {
        return user_diagonal_menor;
    }

    public void setUser_diagonal_menor(double user_diagonal_menor) {
        this.user_diagonal_menor = user_diagonal_menor;
    }

    public double getUser_diagonal_maior() {
        return user_diagonal_maior;
    }

    public void setUser_diagonal_maior(double user_diagonal_maior) {
        this.user_diagonal_maior = user_diagonal_maior;
    }

    public Scanner getGet() {
        return get;
    }

    public void setGet(Scanner get) {
        this.get = get;
    }

    public void getUser() {
        System.out.println("Informe o valor da diagonal menor:");
        setUser_diagonal_menor(getGet().nextDouble());
        System.out.println("Informe o valor da diagonal maior:");
        setUser_diagonal_maior(getGet().nextDouble());
    }

    public double calculateAreaLosango() {
        Losango l = new Losango(getUser_diagonal_menor(), getUser_diagonal_maior());
        return l.calculateArea();
    }
}
