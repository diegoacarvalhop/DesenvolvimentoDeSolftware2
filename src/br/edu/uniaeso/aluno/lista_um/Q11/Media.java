package br.edu.uniaeso.aluno.lista_um.Q11;

public class Media {
    private double p1, p2, p3, media;

    public Media() {
        setP1(0);
        setP2(0);
        setP3(0);
        setMedia(0);
    }

    public Media(double p1, double p2) {
        setP1(p1);
        setP2(p2);
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public double getP3() {
        return p3;
    }

    public void setP3(double p3) {
        this.p3 = p3;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double calculateMedia(double p1, double p2) {
        setMedia((p1 + p2) / 2);
        return getMedia();
    }
}
