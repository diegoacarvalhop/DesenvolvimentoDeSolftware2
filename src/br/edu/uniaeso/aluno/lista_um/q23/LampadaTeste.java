package br.edu.uniaeso.aluno.lista_um.q23;

public class LampadaTeste {
    private Lampada l1, l2;

    public LampadaTeste() {
        setL1(null);
        setL2(null);
    }

    public LampadaTeste(Lampada l1, Lampada l2) {
        setL1(new Lampada("LED", "Vermelho", "Philips", 220, 10, 12.00, true));
        setL2(new Lampada("Fluorescente", "Branco", "Positivo", 220, 20, 18.50, false));
    }

    public Lampada maiorPotencia() {
        if (getL1().getPotencia() > getL2().getPotencia()) {
            return getL1();
        } else {
            return getL2();
        }
    }

    public Lampada maisCara() {
        if (getL1().getPreco() > getL2().getPreco()) {
            return getL1();
        } else {
            return getL2();
        }
    }

    public Lampada getL1() {
        return l1;
    }

    public void setL1(Lampada l1) {
        this.l1 = l1;
    }

    public Lampada getL2() {
        return l2;
    }

    public void setL2(Lampada l2) {
        this.l2 = l2;
    }
}
