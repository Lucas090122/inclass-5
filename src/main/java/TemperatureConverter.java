public class TemperatureConverter {
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = celsius * 9 / 5 + 32;
        return fahrenheit;
    }

    public static boolean isExtremeTemperature(double celsius) {
        if (celsius > -40 && celsius < 50) {
            return false;
        } else {
            return true;
        }

    }
}
