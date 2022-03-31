package br.edu.uniaeso.aluno.lista_um.q3;

public class Triangulo {
    private double cateto_a, cateto_b;

    public Triangulo() {
        setCateto_a(0);
        setCateto_b(0);
    }

    public Triangulo(double cateto_a, double cateto_b) {
        setCateto_a(cateto_a);
        setCateto_b(cateto_b);
    }

    public double getCateto_a() {
        return cateto_a;
    }

    public void setCateto_a(double cateto_a) {
        this.cateto_a = cateto_a;
    }

    public double getCateto_b() {
        return cateto_b;
    }

    public void setCateto_b(double cateto_b) {
        this.cateto_b = cateto_b;
    }

    public double calculateHipotenusa() {
        return Math.sqrt(Math.pow(getCateto_a(), 2) + Math.pow(getCateto_b(), 2));
    }
}
