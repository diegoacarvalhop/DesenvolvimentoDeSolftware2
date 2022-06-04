package br.edu.uniaeso.aluno.lista_um.q25;

public class DistanciaEntreDoisPontos extends br.edu.uniaeso.aluno.lista_um.q8.DistanciaEntreDoisPontos {
    private double ponto_z1, ponto_z2;

    public DistanciaEntreDoisPontos() {
        super();
        setPonto_z1(0);
        setPonto_z2(0);
    }

    public DistanciaEntreDoisPontos(double ponto_x1, double ponto_x2, double ponto_y1, double ponto_y2, double ponto_z1, double ponto_z2) {
        super(ponto_x1, ponto_x2, ponto_y1, ponto_y2);
        setPonto_z1(ponto_z1);
        setPonto_z2(ponto_z2);
    }

    @Override
    public double calculateDistancia() {
        return Math.sqrt((Math.pow(getPonto_x2() - getPonto_x1(), 2) +
                Math.pow(getPonto_y2() - getPonto_y1(), 2) +
                Math.pow(getPonto_z2() - getPonto_z1(), 2)));
    }

    public double getPonto_z1() {
        return ponto_z1;
    }

    public void setPonto_z1(double ponto_z1) {
        this.ponto_z1 = ponto_z1;
    }

    public double getPonto_z2() {
        return ponto_z2;
    }

    public void setPonto_z2(double ponto_z2) {
        this.ponto_z2 = ponto_z2;
    }
}
