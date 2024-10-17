package atividade03.calculos;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    @Override
    public void celsiusParaFahrenheit(double celsius) {
        celsius = (celsius * 9 / 5) + 32;
        System.out.println("Celsius de Fahrenheit: " + celsius);
    }
    @Override
    public void fahrenheitParaCelsius(double fahrenheit) {
        fahrenheit = (fahrenheit - 32) * 5 / 9;
        System.out.println("Fahrenheit de Celsius: " + fahrenheit);
    }
}
