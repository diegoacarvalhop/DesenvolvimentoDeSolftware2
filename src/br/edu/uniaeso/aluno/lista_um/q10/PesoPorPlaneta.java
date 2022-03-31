package br.edu.uniaeso.aluno.lista_um.q10;

public class PesoPorPlaneta {
    private static final double MERCURY = 0.37;
    private static final double VENUS = 0.88;
    private static final double MARS = 0.38;
    private static final double JUPITER = 2.64;
    private static final double SATURN = 1.15;
    private static final double URANUS = 1.17;

    private double peso;
    int planeta;

    public PesoPorPlaneta() {
        setPeso(0);
        setPlaneta(0);
    }

    public PesoPorPlaneta(double peso, int planeta) {
        setPeso(peso);
        setPlaneta(planeta);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getPlaneta() {
        return planeta;
    }

    public void setPlaneta(int planeta) {
        this.planeta = planeta;
    }

    public double calculatePeso() {
        if (getPlaneta() == 1) {
            return peso * PesoPorPlaneta.MERCURY;
        } else if (getPlaneta() == 2) {
            return peso * PesoPorPlaneta.VENUS;
        } else if (getPlaneta() == 3) {
            return peso * PesoPorPlaneta.MARS;
        } else if (getPlaneta() == 4) {
            return peso * PesoPorPlaneta.JUPITER;
        } else if (getPlaneta() == 6) {
            return peso * PesoPorPlaneta.SATURN;
        } else {
            return peso * PesoPorPlaneta.URANUS;
        }
    }
}
