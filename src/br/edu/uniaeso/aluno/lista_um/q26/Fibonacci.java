package br.edu.uniaeso.aluno.lista_um.q26;

public class Fibonacci {
    private int numero;

    public Fibonacci() {
        setNumero(0);
    }

    public Fibonacci(int numero) {
        setNumero(numero);
    }

    public void calculaFibonacci() {
        int n1 = 0, n2 = 1;
        for (int x = getNumero(); x > 0; x--) {
            System.out.print(n1 + " ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
