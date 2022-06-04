import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConverterRules {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static void runConvert() throws IOException {
        System.out.println("1. Convert Celsius to Celsius. ");
        System.out.println("2. Convert Celsius to Fahrenheit. ");
        System.out.println("3. Convert Celsius to Kelvin. ");
        System.out.println("4. Convert Fahrenheit to Fahrenheit. ");
        System.out.println("5. Convert Fahrenheit to Celsius. ");
        System.out.println("6. Convert Fahrenheit to Kelvin. ");
        System.out.println("7. Convert Kelvin to Kelvin. ");
        System.out.println("8. Convert Kelvin to Celsius. ");
        System.out.println("9. Convert Kelvin to Fahrenheit. ");
        System.out.println("Choose one of the options by number! Please, enter the number: ");
        int methodToConvert = Integer.parseInt(READER.readLine());
        System.out.println("Set the temperature value to be converted: ");
        double baseTemperatureValue = Integer.parseInt(READER.readLine());
        ConverterLogic temp = new ConverterLogic(methodToConvert,baseTemperatureValue);
        temp.convert();
    }

    public static double convertCelsiusToCelsius(double baseValue) {
        return baseValue;
    }
    public static double convertCelsiusToKelvin(double baseValue) {
        return baseValue + 273.15;
    }
    public static double convertCelsiusToFahrenheit(double baseValue) {
        return 1.8 * baseValue + 32;
    }
    public static double convertFahrenheitToFahrenheit(double baseValue) {
        return baseValue;
    }
    public static double convertFahrenheitToCelsius(double baseValue) {
        return (baseValue - 32) * (0.5555);
    }
    public static double convertFahrenheitToKelvin(double baseValue) {
        return (baseValue - 32) * (0.5555) + 273.15;
    }
    public static double convertKelvinToKelvin(double baseValue) {
        return baseValue;
    }
    public static double convertKelvinToCelsius(double baseValue) {
        return baseValue - 273.15;
    }
    public static double convertKelvinToFahrenheit(double baseValue) {
        return (baseValue - 273.15) * 1.8 + 32;
    }

}
