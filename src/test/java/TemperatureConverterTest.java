import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    TemperatureConverter temperatureConverter = new TemperatureConverter();
        @org.junit.jupiter.api.Test
        void celsiusToFahrenheit() {
            assertEquals(32, temperatureConverter.celsiusToFahrenheit(0));
            assertEquals(212, temperatureConverter.celsiusToFahrenheit(100));
            assertEquals(-148, temperatureConverter.celsiusToFahrenheit(-100));
        }

        @org.junit.jupiter.api.Test
        void fahrenheitToCelsius() {
            assertEquals(0, temperatureConverter.fahrenheitToCelsius(32));
            assertEquals(100, temperatureConverter.fahrenheitToCelsius(212));
            assertEquals(-100, temperatureConverter.fahrenheitToCelsius(-148));
        }

        @org.junit.jupiter.api.Test
        void isExtremeTemperature() {
            assertTrue(temperatureConverter.isExtremeTemperature(-50));
            assertTrue(temperatureConverter.isExtremeTemperature(50));
            assertFalse(temperatureConverter.isExtremeTemperature(0));
        }
}