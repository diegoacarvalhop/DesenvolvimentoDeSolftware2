package br.edu.uniaeso.aluno.lista_um.q15;

import java.util.Scanner;

public class TemperaturaUI {
    private double user_temperature_celsius;
    private Scanner get;

    public TemperaturaUI() {
        setUser_temperature_celsius(0);
        setGet(new Scanner(System.in));
    }

    public TemperaturaUI(double user_temperature_celsius) {
        setUser_temperature_celsius(user_temperature_celsius);
        setGet(new Scanner(System.in));
    }

    public double getUser_temperature_celsius() {
        return user_temperature_celsius;
    }

    public void setUser_temperature_celsius(double user_temperature_celsius) {
        this.user_temperature_celsius = user_temperature_celsius;
    }

    public Scanner getGet() {
        return get;
    }

    public void setGet(Scanner get) {
        this.get = get;
    }

    public void getUser() {
        System.out.println("Informe a temperatura em Graus Celsius (C):");
        setUser_temperature_celsius(getGet().nextDouble());
    }

    public double calculateTemperature() {
        Temperatura t = new Temperatura(getUser_temperature_celsius());
        return t.calculateTemperatureFahrenheitt();
    }
}
