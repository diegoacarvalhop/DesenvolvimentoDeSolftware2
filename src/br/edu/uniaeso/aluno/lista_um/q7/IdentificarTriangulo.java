package br.edu.uniaeso.aluno.lista_um.q7;

public class IdentificarTriangulo {
    private int lado_a, lado_b, lado_c;

    public IdentificarTriangulo() {
        setLado_a(0);
        setLado_b(0);
        setLado_c(0);
    }

    public IdentificarTriangulo(int lado_a, int lado_b, int lado_c) {
        setLado_a(lado_a);
        setLado_b(lado_b);
        setLado_c(lado_c);
    }

    public int getLado_a() {
        return lado_a;
    }

    public void setLado_a(int lado_a) {
        this.lado_a = lado_a;
    }

    public int getLado_b() {
        return lado_b;
    }

    public void setLado_b(int lado_b) {
        this.lado_b = lado_b;
    }

    public int getLado_c() {
        return lado_c;
    }

    public void setLado_c(int lado_c) {
        this.lado_c = lado_c;
    }

    public String calculateTipoTriangulo() {
        if (getLado_a() == getLado_b() && getLado_a() == getLado_c()) {
            return "Triângulo Equilátero";
        } else if ((getLado_a() == getLado_b() && getLado_a() != getLado_c()) ||
                (getLado_a() == getLado_c() && getLado_a() != getLado_b()) ||
                (getLado_b() == getLado_c() && getLado_b() != getLado_a())) {
            return "Triângulo Isósceles";
        } else {
            return "Triângulo Escaleno";
        }
    }
}
