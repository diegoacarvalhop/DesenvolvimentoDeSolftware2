package br.edu.uniaeso.aluno.lista_um.q22;

public class CanetaTeste {
    private Caneta caneta;

    public CanetaTeste() {
        setCaneta(new Caneta("Bic", "Azul", 15));
        getCaneta();
    }

    public Caneta getCaneta() {
        return caneta;
    }

    public void setCaneta(Caneta caneta) {
        this.caneta = caneta;
    }
}
