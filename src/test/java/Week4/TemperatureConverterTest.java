package Week4;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    TemperatureConverter converter = new TemperatureConverter();
    @org.junit.jupiter.api.Test
    void fahrenheitToCelsius() {
        assertEquals(0, converter.fahrenheitToCelsius(32));
        assertEquals(100, converter.fahrenheitToCelsius(212));
    }

    @org.junit.jupiter.api.Test
    void celsiusToFahrenheit() {
        assertEquals(32, converter.celsiusToFahrenheit(0));
        assertEquals(212, converter.celsiusToFahrenheit(100));
    }

    @org.junit.jupiter.api.Test
    void isExtremeTemperature() {
        assertTrue(converter.isExtremeTemperature(-41));
        assertTrue(converter.isExtremeTemperature(51));
        assertFalse(converter.isExtremeTemperature(-40));
        assertFalse(converter.isExtremeTemperature(50));
    }
}