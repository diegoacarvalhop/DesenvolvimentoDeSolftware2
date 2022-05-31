package br.edu.uniaeso.aluno.lista_um.q21;

import java.util.Scanner;

public class ControleRemoto {

    public int acaoVolume () {
        return 1;
    }

    public int acaoCanal () {
        return 1;
    }

    public int acaoCanalIndicado () {
        System.out.print("Informe um canal: ");
        return new Scanner(System.in).nextInt();
    }

    public void consultarVolumeCanal() {
        Televisao.info();
    }

}
