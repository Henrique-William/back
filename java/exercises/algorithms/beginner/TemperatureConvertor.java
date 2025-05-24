//simple class to convert temperature from celsius to fahrenheit and vice versa

package algorithms.beginner;

public class TemperatureConvertor {
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
