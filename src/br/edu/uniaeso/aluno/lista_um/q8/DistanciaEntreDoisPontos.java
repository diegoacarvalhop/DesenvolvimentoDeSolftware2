package br.edu.uniaeso.aluno.lista_um.q8;

public class DistanciaEntreDoisPontos {
    private double ponto_x1, ponto_x2, ponto_y1, ponto_y2;

    public DistanciaEntreDoisPontos() {
        setPonto_x1(0);
        setPonto_x2(0);
        setPonto_y1(0);
        setPonto_x2(2);
    }

    public DistanciaEntreDoisPontos(double ponto_x1, double ponto_x2, double ponto_y1, double ponto_y2) {
        setPonto_x1(ponto_x1);
        setPonto_x2(ponto_x2);
        setPonto_y1(ponto_y1);
        setPonto_y2(ponto_y2);
    }

    public double getPonto_x1() {
        return ponto_x1;
    }

    public void setPonto_x1(double ponto_x1) {
        this.ponto_x1 = ponto_x1;
    }

    public double getPonto_x2() {
        return ponto_x2;
    }

    public void setPonto_x2(double ponto_x2) {
        this.ponto_x2 = ponto_x2;
    }

    public double getPonto_y1() {
        return ponto_y1;
    }

    public void setPonto_y1(double ponto_y1) {
        this.ponto_y1 = ponto_y1;
    }

    public double getPonto_y2() {
        return ponto_y2;
    }

    public void setPonto_y2(double ponto_y2) {
        this.ponto_y2 = ponto_y2;
    }

    public double calculateDistancia() {
        return Math.sqrt((Math.pow(getPonto_x2() - getPonto_x1(), 2) + Math.pow(getPonto_y2() - getPonto_y1(), 2)));
    }
}
