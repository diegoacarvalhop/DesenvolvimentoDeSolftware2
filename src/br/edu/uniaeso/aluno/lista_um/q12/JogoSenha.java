package br.edu.uniaeso.aluno.lista_um.q12;

public class JogoSenha {

    private int user_a, user_b;

    public JogoSenha() {
    }

    public JogoSenha(int user_a, int user_b) {
        this.user_a = user_a;
        this.user_b = user_b;
    }

    public int getUser_a() {
        return user_a;
    }

    public void setUser_a(int user_a) {
        this.user_a = user_a;
    }

    public int getUser_b() {
        return user_b;
    }

    public void setUser_b(int user_b) {
        this.user_b = user_b;
    }

    public String playGame() {
        if (getUser_b() > getUser_a()) {
            return "O número é maior. Tente novamente!";
        } else if (getUser_b() < getUser_a()) {
            return "O número é menor. Tente novamente!";
        } else if (getUser_b() == getUser_a()) {
            return "O número é igual!";
        } else {
            return "TÁ QUENTE!!!";
        }
    }
}
