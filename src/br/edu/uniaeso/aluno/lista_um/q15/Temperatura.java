package br.edu.uniaeso.aluno.lista_um.q15;

public class Temperatura {
    private static final double KELVIN = 273.15;
    private static final double REAUMUR = 0.8;
    private static final double RANKINE = 1.8 + 32 + 459.67;
    private static final double FAHRENHEIT = 1.8 + 32;

    private double temperature_celsius;

    public Temperatura() {
        setTemperature_celsius(0);
    }

    public Temperatura(double temperature_celsius) {
        setTemperature_celsius(temperature_celsius);
    }

    public double getTemperature_celsius() {
        return temperature_celsius;
    }

    public void setTemperature_celsius(double temperature_celsius) {
        this.temperature_celsius = temperature_celsius;
    }

    private double calculateTemperatureKelvin() {
        return getTemperature_celsius() + Temperatura.KELVIN;
    }

    public double calculateTemperatureReaumur() {
        return getTemperature_celsius() * Temperatura.REAUMUR;
    }

    public double calculateTemperatureRankine() {
        return getTemperature_celsius() * Temperatura.RANKINE;
    }

    public double calculateTemperatureFahrenheitt() {
        return getTemperature_celsius() * Temperatura.FAHRENHEIT;
    }
}
