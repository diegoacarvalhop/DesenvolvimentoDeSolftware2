package br.edu.uniaeso.aluno.lista_um.q9;

import java.util.Scanner;

public class TipoTrianguloUI {
    private int user_lado_a, user_lado_b, user_lado_c;
    private Scanner get;

    public TipoTrianguloUI() {
        setUser_lado_a(0);
        setUser_lado_b(0);
        setUser_lado_c(0);
        setGet(new Scanner(System.in));
    }

    public TipoTrianguloUI(int user_lado_a, int user_lado_b, int user_lado_c) {
        setUser_lado_a(user_lado_a);
        setUser_lado_b(user_lado_b);
        setUser_lado_c(user_lado_c);
        setGet(new Scanner(System.in));
    }

    public int getUser_lado_a() {
        return user_lado_a;
    }

    public void setUser_lado_a(int user_lado_a) {
        this.user_lado_a = user_lado_a;
    }

    public int getUser_lado_b() {
        return user_lado_b;
    }

    public void setUser_lado_b(int user_lado_b) {
        this.user_lado_b = user_lado_b;
    }

    public int getUser_lado_c() {
        return user_lado_c;
    }

    public void setUser_lado_c(int user_lado_c) {
        this.user_lado_c = user_lado_c;
    }

    public Scanner getGet() {
        return get;
    }

    public void setGet(Scanner get) {
        this.get = get;
    }

    public void getUser() {
        System.out.println("Informe o valor para o lado a:");
        setUser_lado_a(getGet().nextInt());
        System.out.println("Informe o valor para o lado b:");
        setUser_lado_b(getGet().nextInt());
        System.out.println("Informe o valor para o lado c:");
        setUser_lado_c(getGet().nextInt());
    }

    public String calculateTriangulo() {
        TipoTriangulo tt = new TipoTriangulo(getUser_lado_a(), getUser_lado_b(), getUser_lado_c());
        return tt.calculateTipoTriangulo();
    }
}
