package br.edu.uniaeso.aluno.lista_um.q25;

import java.util.Scanner;

public class DistanciaEntreDoisPontosUI {
    private double user_ponto_x1, user_ponto_x2, user_ponto_y1, user_ponto_y2, user_ponto_z1, user_ponto_z2;
    private Scanner get;

    public DistanciaEntreDoisPontosUI() {
        setUser_ponto_x1(0);
        setUser_ponto_x2(0);
        setUser_ponto_y1(0);
        setUser_ponto_y2(0);
        setUser_ponto_z1(0);
        setUser_ponto_z2(0);
        setGet(new Scanner(System.in));
    }

    public DistanciaEntreDoisPontosUI(double user_ponto_x1, double user_ponto_x2,
                                      double user_ponto_y1, double user_ponto_y2,
                                      double user_ponto_z1, double user_ponto_z2) {
        setUser_ponto_x1(user_ponto_x1);
        setUser_ponto_x2(user_ponto_x2);
        setUser_ponto_y1(user_ponto_y1);
        setUser_ponto_y2(user_ponto_y2);
        setUser_ponto_z1(user_ponto_z1);
        setUser_ponto_z2(user_ponto_z2);
        setGet(new Scanner(System.in));
    }

    public double getUser_ponto_x1() {
        return user_ponto_x1;
    }

    public void setUser_ponto_x1(double user_ponto_x1) {
        this.user_ponto_x1 = user_ponto_x1;
    }

    public double getUser_ponto_x2() {
        return user_ponto_x2;
    }

    public void setUser_ponto_x2(double user_ponto_x2) {
        this.user_ponto_x2 = user_ponto_x2;
    }

    public double getUser_ponto_y1() {
        return user_ponto_y1;
    }

    public void setUser_ponto_y1(double user_ponto_y1) {
        this.user_ponto_y1 = user_ponto_y1;
    }

    public double getUser_ponto_y2() {
        return user_ponto_y2;
    }

    public void setUser_ponto_y2(double user_ponto_y2) {
        this.user_ponto_y2 = user_ponto_y2;
    }

    public double getUser_ponto_z1() {
        return user_ponto_z1;
    }

    public void setUser_ponto_z1(double user_ponto_z1) {
        this.user_ponto_z1 = user_ponto_z1;
    }

    public double getUser_ponto_z2() {
        return user_ponto_z2;
    }

    public void setUser_ponto_z2(double user_ponto_z2) {
        this.user_ponto_z2 = user_ponto_z2;
    }

    public Scanner getGet() {
        return get;
    }

    public void setGet(Scanner get) {
        this.get = get;
    }

    public void getUser() {
        System.out.println("Informe o valor para x1:");
        setUser_ponto_x1(getGet().nextDouble());
        System.out.println("Informe o valor para x2:");
        setUser_ponto_x2(getGet().nextDouble());
        System.out.println("Informe o valor para y1:");
        setUser_ponto_y1(getGet().nextDouble());
        System.out.println("Informe o valor para y2:");
        setUser_ponto_y2(getGet().nextDouble());
        System.out.println("Informe o valor para z1:");
        setUser_ponto_z1(getGet().nextDouble());
        System.out.println("Informe o valor para z2:");
        setUser_ponto_z2(getGet().nextDouble());
    }

    public double calculateDistancia() {
        DistanciaEntreDoisPontos d = new DistanciaEntreDoisPontos(getUser_ponto_x2(), getUser_ponto_x2(),
                                                                    getUser_ponto_y1(), getUser_ponto_y2(),
                                                                    getUser_ponto_z1(), getUser_ponto_z2());
        return d.calculateDistancia();
    }

}
