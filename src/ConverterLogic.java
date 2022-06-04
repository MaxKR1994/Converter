public class ConverterLogic implements Converter{
    public int methodToConvert;
    public double baseTemperatureValue;
    public double convertedTemperatureValue;

    public ConverterLogic(int baseTemperatureType, double baseTemperatureValue) {
        this.methodToConvert = baseTemperatureType;
        this.baseTemperatureValue = baseTemperatureValue;
    }

    public void convertLogic(){
        if (methodToConvert == 1){
            convertedTemperatureValue = ConverterRules.convertCelsiusToCelsius(baseTemperatureValue);
            System.out.println(baseTemperatureValue + " Celsius" + " = " + convertedTemperatureValue + " Celsius");
        } else if (methodToConvert == 2){
            convertedTemperatureValue = ConverterRules.convertCelsiusToFahrenheit(baseTemperatureValue);
            System.out.println(baseTemperatureValue + " Celsius" + " = " + convertedTemperatureValue + " Fahrenheit");
        } else if (methodToConvert == 3) {
            convertedTemperatureValue = ConverterRules.convertCelsiusToKelvin(baseTemperatureValue);
            System.out.println(baseTemperatureValue + " Celsius" + " = " + convertedTemperatureValue + " Kelvin");
        } else if (methodToConvert == 4){
            convertedTemperatureValue = ConverterRules.convertFahrenheitToFahrenheit(baseTemperatureValue);
            System.out.println(baseTemperatureValue + " Fahrenheit" + " = " + convertedTemperatureValue + " Fahrenheit");
        } else if (methodToConvert == 5){
            convertedTemperatureValue = ConverterRules.convertFahrenheitToCelsius(baseTemperatureValue);
            System.out.println(baseTemperatureValue + " Fahrenheit" + " = " + convertedTemperatureValue + " Celsius");
        } else if (methodToConvert == 6){
            convertedTemperatureValue = ConverterRules.convertFahrenheitToKelvin(baseTemperatureValue);
            System.out.println(baseTemperatureValue + " Fahrenheit" + " = " + convertedTemperatureValue + " Kelvin");
        } else if (methodToConvert == 7){
            convertedTemperatureValue = ConverterRules.convertKelvinToKelvin(baseTemperatureValue);
            System.out.println(baseTemperatureValue + " Kelvin" + " = " + convertedTemperatureValue + " Kelvin");
        } else if (methodToConvert == 8){
            convertedTemperatureValue = ConverterRules.convertKelvinToCelsius(baseTemperatureValue);
            System.out.println(baseTemperatureValue + " Kelvin" + " = " + convertedTemperatureValue + " Celsius");
        } else if (methodToConvert == 9){
            convertedTemperatureValue = ConverterRules.convertKelvinToFahrenheit(baseTemperatureValue);
            System.out.println(baseTemperatureValue + "Kelvin" + " = " + convertedTemperatureValue + " Fahrenheit");
        }
    }
    @Override
    public void convert(){
        convertLogic();
    }
}
