package br.edu.uniaeso.aluno.lista_um.q10;

import java.util.Scanner;

public class InterfacePesoPorPlaneta {
    private double user_peso;
    private int planeta;
    private Scanner get;

    public InterfacePesoPorPlaneta() {
        setUser_peso(0);
        setPlaneta(0);
        setGet(new Scanner(System.in));
    }

    public InterfacePesoPorPlaneta(double user_peso, int planeta) {
        setUser_peso(user_peso);
        setPlaneta(planeta);
        setGet(new Scanner(System.in));
    }

    public double getUser_peso() {
        return user_peso;
    }

    public void setUser_peso(double user_peso) {
        this.user_peso = user_peso;
    }

    public int getPlaneta() {
        return planeta;
    }

    public void setPlaneta(int planeta) {
        this.planeta = planeta;
    }

    public Scanner getGet() {
        return get;
    }

    public void setGet(Scanner get) {
        this.get = get;
    }

    public void getUser() {
        System.out.println("Informe o seu peso:");
        setUser_peso(getGet().nextDouble());
        System.out.println("Agora informe qual planeta você deseja calcular seu peso." +
                "\n1 - Mercúrio" +
                "\n2 - Vênus" +
                "\n3 - Marte" +
                "\n4 - Júpiter" +
                "\n5 - Saturno" +
                "\n6 - Urano" +
                "\nOpção:");
        setPlaneta(getGet().nextInt());
    }

    public double calculatePeso() {
        PesoPorPlaneta p = new PesoPorPlaneta(getUser_peso(), getPlaneta());
        return p.calculatePeso();
    }

}
