package br.edu.uniaeso.aluno.lista_um.q8;

import java.util.Random;

public class PedraPepelTesoura {
    private int option, computer;

    public PedraPepelTesoura() {
        setComputer(0);
        setOption(0);
    }

    public PedraPepelTesoura(int option) {
        setOption(option);
    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }

    public int getComputer() {
        return computer;
    }

    public void setComputer(int computer) {
        this.computer = computer;
    }

    public String calculateGame() {
        setComputer(randInt(0, 2));
        if (getOption() == 0 && getComputer() == 2) {
            return "Usuário: Pedra -- Computador: Tesoura\nUsuário venceu!";
        } else if (getOption() == 0 && getComputer() == 1) {
            return "Usuário: Pedra -- Computador: Papel\nComputador venceu!";
        } else if (getOption() == 0 && getComputer() == 0) {
            return "Usuário: Pedra -- Computador: Pedra\nEmpate!";
        } else if (getOption() == 1 && getComputer() == 2) {
            return "Usuário: Papel -- Computador: Tesoura\nComputador venceu!";
        } else if (getOption() == 1 && getComputer() == 0) {
            return "Usuário: Papel -- Computador: Pedra\nUsuário venceu!";
        } else if (getOption() == 1 && getComputer() == 1) {
            return "Usuário: Papel -- Computador: Papel\nEmpate!";
        } else if (getOption() == 2 && getComputer() == 1) {
            return "Usuário: Tesoura -- Computador: Papel\nUsuário venceu!";
        } else if (getOption() == 2 && getComputer() == 0) {
            return "Usuário: Tesoura -- Computador: Pedra\nComputador venceu!";
        } else {
            return "Usuário: Tesoura -- Computador: Tesoura\nEmpate!";
        }
    }

    public static int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
}
