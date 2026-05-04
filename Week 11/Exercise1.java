class TemperatureSensor {
    private double temperature;

    public void setTemperature(double temp) {
        if (temp < -273.15) {
            throw new IllegalArgumentException("Temperature cannot be below -273.15 (Absolute Zero).");
        }
        this.temperature = temp;
        System.out.println("Temperature set to: " + this.temperature);
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();

        try {
            sensor.setTemperature(-300);
        } catch (IllegalArgumentException e) {
            System.out.println("Friendly Message: That temperature is physically impossible! " + e.getMessage());
        }
    }
}