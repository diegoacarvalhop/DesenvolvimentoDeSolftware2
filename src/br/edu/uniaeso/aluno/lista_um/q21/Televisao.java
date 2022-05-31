package br.edu.uniaeso.aluno.lista_um.q21;

import java.util.ConcurrentModificationException;

public class Televisao extends ControleRemoto {
    private static int volume;
    private static int canal;

    public Televisao() {
        super();
        setVolume(13);
        setCanal(10);
    }

    public void aumentarVolume() {
        setVolume(getVolume() + acaoVolume());
    }

    public void diminuirVolume() {
        setVolume(getVolume() - acaoVolume());
    }

    public void aumentarCanal() {
        setCanal(getCanal() + acaoCanal());
    }

    public void diminuirCanal() {
        setCanal(getCanal() - acaoCanal());
    }

    public void mudarCanalIndicado() {
        setCanal(acaoCanalIndicado());
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public static String info() {
        return "Televisao { " +
                "\n\tVolume = " + volume +
                "\n\tCanal = " + canal +
                "\n}";
    }
}
