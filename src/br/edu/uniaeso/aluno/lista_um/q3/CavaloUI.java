package br.edu.uniaeso.aluno.lista_um.q3;

import br.edu.uniaeso.aluno.lista_um.q2.Terreno;

import java.util.Scanner;

public class CavaloUI {
    private int number_of_horses, number_horseshoe;
    private Cavalo cavalo;

    Scanner in;

    public CavaloUI() {
        setCavalo(new Cavalo());
        setNumber_of_horses(0);
        setNumber_horseshoe(0);
        in = new Scanner(System.in);
    }

    public CavaloUI(int number_of_horses, int number_horseshoe, Cavalo cavalo) {
        setCavalo(cavalo);
        setNumber_of_horses(number_of_horses);
        setNumber_horseshoe(number_horseshoe);
        in = new Scanner(System.in);
    }

    public int getNumber_of_horses() {
        return number_of_horses;
    }

    public void setNumber_of_horses(int number_of_horses) {
        this.number_of_horses = number_of_horses;
    }

    public int getNumber_horseshoe() {
        return number_horseshoe;
    }

    public void setNumber_horseshoe(int number_horseshoe) {
        this.number_horseshoe = number_horseshoe;
    }

    public Cavalo getCavalo() {
        return cavalo;
    }

    public void setCavalo(Cavalo cavalo) {
        this.cavalo = cavalo;
    }

    public int getUserNumberOfHorses() {
        System.out.print("Informe a quantidade de cavalos: ");
        setNumber_of_horses(in.nextInt());
        setNumber_horseshoe(getCavalo().calculateHorseshoes(getNumber_of_horses()));
        System.out.print("A quantidade de ferraduras para " + getNumber_of_horses() + " é: ");
        return getNumber_horseshoe();
    }
}
