package br.edu.uniaeso.aluno.lista_um.q2;

import java.util.Scanner;

public class InterfaceTerreno {
    private double user_width, user_length;
    Scanner in;

    public InterfaceTerreno() {
        in = new Scanner(System.in);
    }

    public InterfaceTerreno(double user_width, double user_length) {
        this.user_width = user_width;
        this.user_length = user_length;
    }

    public double getUser_width() {
        return user_width;
    }

    public void setUser_width(double user_width) {
        this.user_width = user_width;
    }

    public double getUser_length() {
        return user_length;
    }

    public void setUser_length(double user_length) {
        this.user_length = user_length;
    }

    public double getUserTerreno() {
        Terreno t = null;
        do {
            System.out.println("Informe a largura do terreno:");
            setUser_width(in.nextDouble());
            System.out.println("Informe o comprimento do terreno:");
            setUser_length(in.nextDouble());
            if (getUser_width() == getUser_length()) {
                System.out.println("O terreno não pode ter a mesma largura e comprimento. Tente novamente!!");
            } else {
                t = new Terreno(getUser_width(), getUser_length());
            }
        } while (t == null);
        return t.calculateArea();
    }
}
