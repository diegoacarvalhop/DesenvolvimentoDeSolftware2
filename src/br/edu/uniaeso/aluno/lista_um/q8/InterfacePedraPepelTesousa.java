package br.edu.uniaeso.aluno.lista_um.q8;

import java.util.Scanner;

public class InterfacePedraPepelTesousa {
    private int user_option;
    private Scanner get;

    public InterfacePedraPepelTesousa() {
        setUser_option(0);
        setGet(new Scanner(System.in));
    }

    public InterfacePedraPepelTesousa(int user_option, Scanner get) {
        setUser_option(user_option);
        setGet(new Scanner(System.in));
    }

    public int getUser_option() {
        return user_option;
    }

    public void setUser_option(int user_option) {
        this.user_option = user_option;
    }

    public Scanner getGet() {
        return get;
    }

    public void setGet(Scanner get) {
        this.get = get;
    }

    public void getUser() {
        System.out.println("Informe 0 para pedra, 1 para pepel e 2 para tesoura:");
        setUser_option(getGet().nextInt());
    }

    public String calculateGame() {
        PedraPepelTesoura ppt = new PedraPepelTesoura(getUser_option());
        return ppt.calculateGame();
    }

}
