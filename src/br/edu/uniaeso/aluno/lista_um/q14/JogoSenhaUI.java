package br.edu.uniaeso.aluno.lista_um.q14;

import java.util.Scanner;

public class JogoSenhaUI {
    private int user_a, user_b, play_again;
    private Scanner get;

    public JogoSenhaUI() {
        setUser_a(0);
        setUser_b(0);
        setPlay_again(0);
        setGet(new Scanner(System.in));
    }

    public JogoSenhaUI(int user_a, int user_b, int play_again) {
        setUser_a(user_a);
        setUser_b(user_b);
        setPlay_again(play_again);
        setGet(new Scanner(System.in));
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

    public Scanner getGet() {
        return get;
    }

    public void setGet(Scanner get) {
        this.get = get;
    }

    public int getPlay_again() {
        return play_again;
    }

    public void setPlay_again(int play_again) {
        this.play_again = play_again;
    }

    public void getUserA() {
        do {
            System.out.println("Usuário 1: Favor informar um número entre 0 e 100:");
            setUser_a(getGet().nextInt());
            if (getUser_a() < 0 && getUser_a() > 100) {
                System.out.println("Favor informar um número entre 0 e 100. Informe um novo número!");
            }
        } while (getUser_a() >= 0 && getUser_a() <= 100);
    }

    public void getUserB() {
        do {
            System.out.println("Usuário 2: Favor informar um número entre 0 e 100: ");
            setUser_b(getGet().nextInt());
            if (getUser_b() < 0 && getUser_b() > 100) {
                System.out.println("Favor informar um número entre 0 e 100. Informe um novo número!");
            }
        } while (getUser_b() >= 0 && getUser_b() <= 100);
    }

    public void playGame() {
        JogoSenha s = new JogoSenha(getUser_a(), getUser_b());
        getUserA();
        int cont = 1;
        do {
            do {
                getUserB();
                if (cont <= 5) {
                    System.out.println(s.playGame());
                } else {
                    System.out.println("Você perdeu. Tente novamente depois.");
                }
                cont++;
            } while (cont <= 5);
            System.out.println("Deseja jogar novamente? (1 - Sim / 2 - Não)");
            setPlay_again(getGet().nextInt());
            if (getPlay_again() == 1) {
                playGame();
            } else {
                System.out.println("Até a próxima!!!");
            }
        } while (getPlay_again() == 1);
    }
}
