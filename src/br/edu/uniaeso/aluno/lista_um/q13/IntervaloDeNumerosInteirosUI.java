package br.edu.uniaeso.aluno.lista_um.q13;

import java.util.Scanner;

public class IntervaloDeNumerosInteirosUI {
    private int user_limite_inferior, user_limite_superior;
    private Scanner get;

    public IntervaloDeNumerosInteirosUI() {
        setUser_limite_inferior(0);
        setUser_limite_superior(0);
        setGet(new Scanner(System.in));
    }

    public IntervaloDeNumerosInteirosUI(int user_limite_inferior, int user_limite_superior) {
        setUser_limite_inferior(user_limite_inferior);
        setUser_limite_superior(user_limite_superior);
        setGet(new Scanner(System.in));
    }

    public int getUser_limite_inferior() {
        return user_limite_inferior;
    }

    public void setUser_limite_inferior(int user_limite_inferior) {
        this.user_limite_inferior = user_limite_inferior;
    }

    public int getUser_limite_superior() {
        return user_limite_superior;
    }

    public void setUser_limite_superior(int user_limite_superior) {
        this.user_limite_superior = user_limite_superior;
    }

    public Scanner getGet() {
        return get;
    }

    public void setGet(Scanner get) {
        this.get = get;
    }

    public void getUser() {
        System.out.println("Por favor, informe um valor para o limite inferior:");
        setUser_limite_inferior(getGet().nextInt());
        System.out.println("Por favor, informe um valor para o limite superior:");
        setUser_limite_superior(getGet().nextInt());
    }

    public void calculateIntervalo() {
        if (getUser_limite_inferior() > getUser_limite_superior()) {
            System.out.println("Limite inferior maior que o limite superior!");
        } else {
            IntervaloDeNumerosInteiros i = new IntervaloDeNumerosInteiros(getUser_limite_inferior(), getUser_limite_superior());
            System.out.println(i.calculateSumIntegers());
            System.out.println(i.calculateIntervalIntegers());
            System.out.println(i.calculateOddOrEvenIntegers());
            System.out.println(i.calculateOddIntegers());
        }
    }

}
