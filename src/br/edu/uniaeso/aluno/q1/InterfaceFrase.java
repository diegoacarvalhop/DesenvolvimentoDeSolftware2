package br.edu.uniaeso.aluno.q1;

import java.util.Scanner;

public class InterfaceFrase {
    private String user_frase, user_word_frase, user_word_replace;
    Scanner in;

    public InterfaceFrase() {
        in = new Scanner(System.in);
    }

    public InterfaceFrase(String user_frase, String user_word_frase, String user_word_replace) {
        setUser_frase(user_frase);
        setUser_word_frase(user_word_frase);
        setUser_word_replace(user_word_replace);
    }

    public String getUser_frase() {
        return user_frase;
    }

    public void setUser_frase(String user_frase) {
        this.user_frase = user_frase;
    }

    public String getUser_word_frase() {
        return user_word_frase;
    }

    public void setUser_word_frase(String user_word_frase) {
        this.user_word_frase = user_word_frase;
    }

    public String getUser_word_replace() {
        return user_word_replace;
    }

    public void setUser_word_replace(String user_word_replace) {
        this.user_word_replace = user_word_replace;
    }

    public String getFraseAndWords() {
        System.out.println("Informe uma frase:");
        setUser_frase(in.nextLine());
        System.out.println("Informe uma palavra que deseja alterar:");
        setUser_word_frase(in.nextLine());
        System.out.println("Informe uma palavra para substituir:");
        setUser_word_replace(in.nextLine());

        Frase frase = new Frase(getUser_frase(), getUser_word_frase(), getUser_word_replace());

        return frase.replaceFrase();
    }

}
