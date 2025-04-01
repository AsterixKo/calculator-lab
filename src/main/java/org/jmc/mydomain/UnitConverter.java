package org.jmc.mydomain;

public class UnitConverter {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * ((double) 9 / 5)) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * ((double) 5 / 9);
    }

    public static double degreesToRadians(double degrees) {
        return (degrees * Math.PI) / 180;
    }

    public static double radiansToDegrees(double radians) {
        return (radians * 180) / Math.PI;
    }
}
