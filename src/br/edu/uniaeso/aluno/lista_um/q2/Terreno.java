package br.edu.uniaeso.aluno.lista_um.q2;

public class Terreno {
    private double width, length;

    public Terreno(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double calculateArea() {
        return getLength() * getWidth();
    }
}
