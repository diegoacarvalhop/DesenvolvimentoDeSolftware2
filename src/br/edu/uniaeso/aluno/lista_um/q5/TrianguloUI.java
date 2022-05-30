package br.edu.uniaeso.aluno.lista_um.q5;

import java.util.Scanner;

public class TrianguloUI {
    private double user_cateto_a, user_cateto_b;
    private Scanner get = new Scanner(System.in);

    public TrianguloUI() {
        setUser_cateto_a(0);
        setUser_cateto_b(0);
    }

    public TrianguloUI(double user_cateto_a, double user_cateto_b) {
        setUser_cateto_a(user_cateto_a);
        setUser_cateto_b(user_cateto_b);
    }

    public double getUser_cateto_a() {
        return user_cateto_a;
    }

    public void setUser_cateto_a(double user_cateto_a) {
        this.user_cateto_a = user_cateto_a;
    }

    public double getUser_cateto_b() {
        return user_cateto_b;
    }

    public void setUser_cateto_b(double user_cateto_b) {
        this.user_cateto_b = user_cateto_b;
    }

    public void getUser() {
        System.out.println("Informe o valor do cateto a:");
        setUser_cateto_a(get.nextDouble());
        System.out.println("Informe o valor do cateto b:");
        setUser_cateto_b((get.nextDouble()));
    }

    public double calculateHipotenusa() {
        Triangulo t = new Triangulo(getUser_cateto_a(), getUser_cateto_a());
        return t.calculateHipotenusa();
    }
}
