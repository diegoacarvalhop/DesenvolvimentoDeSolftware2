package br.edu.uniaeso.aluno.lista_um.q11;

import java.util.Scanner;

public class MediaUI {
    private double user_p1, user_p2, user_p3;
    private Scanner get;

    public MediaUI() {
        setUser_p1(0);
        setUser_p2(0);
        setUser_p3(0);
        setGet(new Scanner(System.in));
    }

    public MediaUI(double user_p1, double user_p2, double user_p3) {
        setUser_p1(user_p1);
        setUser_p2(user_p2);
        setUser_p3(user_p3);
        setGet(new Scanner(System.in));
    }

    public double getUser_p1() {
        return user_p1;
    }

    public void setUser_p1(double user_p1) {
        this.user_p1 = user_p1;
    }

    public double getUser_p2() {
        return user_p2;
    }

    public void setUser_p2(double user_p2) {
        this.user_p2 = user_p2;
    }

    public double getUser_p3() {
        return user_p3;
    }

    public void setUser_p3(double user_p3) {
        this.user_p3 = user_p3;
    }

    public Scanner getGet() {
        return get;
    }

    public void setGet(Scanner get) {
        this.get = get;
    }

    public void getUser() {
        System.out.println("Por favor, informe a primeira nota:");
        setUser_p1(getGet().nextDouble());
        System.out.println("Por favor, informe a segunda nota:");
        setUser_p2(getGet().nextDouble());
    }

    public String calculateMedia() {
        Media m = new Media(getUser_p1(), getUser_p2());
        double media = m.calculateMedia(getUser_p1(), getUser_p2());
        if (media >= 5.0) {
            return "Média " + media + ": Aprovado";
        } else {
            System.out.println("Não foi suficiente para ser aprovado. Por favor, informe a terceira nota:");
            setUser_p3(getGet().nextDouble());
            if (getUser_p1() > getUser_p2()) {
                media = m.calculateMedia(getUser_p1(), getUser_p3());
            } else if (getUser_p2() > getUser_p1()) {
                media = m.calculateMedia(getUser_p2(), getUser_p3());
            } else {
                media = m.calculateMedia(getUser_p1(), getUser_p3());
            }
            if (media >= 5.0) {
                return "Média " + media + ": Aprovado";
            } else {
                return "Média " + media + ": Reprovado";
            }
        }
    }
}
