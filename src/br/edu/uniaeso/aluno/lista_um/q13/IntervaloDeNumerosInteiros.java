package br.edu.uniaeso.aluno.lista_um.q13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntervaloDeNumerosInteiros {
    private int limite_inferior, limite_superior;
    private Scanner get;

    public IntervaloDeNumerosInteiros() {
        setLimite_inferior(0);
        setLimite_superior(0);
        setGet(new Scanner(System.in));
    }

    public IntervaloDeNumerosInteiros(int limite_inferior, int limite_superior) {
        setLimite_inferior(limite_inferior);
        setLimite_superior(limite_superior);
        setGet(new Scanner(System.in));
    }

    public int getLimite_inferior() {
        return limite_inferior;
    }

    public void setLimite_inferior(int limite_inferior) {
        this.limite_inferior = limite_inferior;
    }

    public int getLimite_superior() {
        return limite_superior;
    }

    public void setLimite_superior(int limite_superior) {
        this.limite_superior = limite_superior;
    }

    public Scanner getGet() {
        return get;
    }

    public void setGet(Scanner get) {
        this.get = get;
    }

    public int calculateSumIntegers() {
        int soma = 0;
        int inferiorLimit = getLimite_inferior();
        while (inferiorLimit < getLimite_superior()) {
            soma += inferiorLimit++;
        }
        return soma;
    }

    public int calculateIntervalIntegers() {
        int i = 0;
        int inferiorLimit = getLimite_inferior();
        while (inferiorLimit < getLimite_superior()) {
            inferiorLimit++;
            i++;
        }
        return i;
    }

    public int calculateOddIntegers() {
        int i = 0;
        int inferiorLimit = getLimite_inferior();
        while (inferiorLimit < getLimite_superior()) {
            inferiorLimit++;
            if (inferiorLimit % 2 != 0) {
                i++;
            }
        }
        return i;
    }

    public List<List<Integer>> calculateOddOrEvenIntegers() {
        List<List<Integer>> lista = new ArrayList<>();
        List<Integer> listaIntPar = new ArrayList<>();
        List<Integer> listaIntImpar = new ArrayList<>();

        int inferiorLimit = getLimite_inferior();
        while (inferiorLimit < getLimite_superior()) {
            if (inferiorLimit % 2 == 0) {
                listaIntPar.add(inferiorLimit);
            } else {
                listaIntImpar.add(inferiorLimit);
            }
            inferiorLimit++;
        }

        lista.add(listaIntPar);
        lista.add(listaIntImpar);

        return lista;
    }
}
