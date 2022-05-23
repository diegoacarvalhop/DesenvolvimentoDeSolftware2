package br.edu.uniaeso.aluno.lista_um.q3;

public class Cavalo {
    private int horseshoe;

    public Cavalo() {
        setHorseshoe(4);
    }

    public Cavalo(int horseshoe) {
        setHorseshoe(horseshoe);
    }

    public int getHorseshoe() {
        return horseshoe;
    }

    public void setHorseshoe(int horseshoe) {
        this.horseshoe = horseshoe;
    }

    public int calculateHorseshoes(int number_horses) {
        return getHorseshoe() * number_horses;
    }
}
