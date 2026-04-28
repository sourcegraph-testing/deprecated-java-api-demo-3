package dev.trly.java.example.primitive.wrappers;

public final class ForecastDeskApp {
    private ForecastDeskApp() {
    }

    public static void main(String[] args) {
        final String[] days = {
            "Mon",
            "Tue",
            "Wed",
            "Thu"
        };
        final Double[] temperatures = {
            new Double(18.5),
            new Double(21.25),
            new Double(19.75),
            new Double(22.0)
        };
        final Float[] rainfall = {
            new Float(0.4f),
            new Float(0.0f),
            new Float(1.1f),
            new Float(0.2f)
        };

        double totalTemperature = 0.0;
        float wettestDay = 0.0f;
        String wettestLabel = days[0];
        for (int index = 0; index < days.length; index++) {
            final double temperature = temperatures[index].doubleValue();
            final float rain = rainfall[index].floatValue();
            totalTemperature += temperature;
            if (rain > wettestDay) {
                wettestDay = rain;
                wettestLabel = days[index];
            }
            System.out.printf("%s: %.2f C, %.1f mm rain%n", days[index], temperature, rain);
        }

        System.out.printf("Average temperature: %.2f C%n", totalTemperature / temperatures.length);
        System.out.printf("Wettest day: %s with %.1f mm%n", wettestLabel, wettestDay);
    }
}
