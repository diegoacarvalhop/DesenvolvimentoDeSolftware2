package br.edu.uniaeso.aluno.lista_um.q26;

import java.util.Scanner;

public class FibonacciUI {
    private int numero;

    public FibonacciUI() {
        setNumero(0);
    }

    public FibonacciUI(int numero) {
        setNumero(numero);
    }

    public void calculaFibonacci() {
        System.out.print("Digite a quantidade de termos: ");
        setNumero(new Scanner(System.in).nextInt());
        Fibonacci f = new Fibonacci(getNumero());
        f.calculaFibonacci();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
