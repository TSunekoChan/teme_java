package isp.lab4.exercise3;

public class Exercise3 {
    public static void main(String[] args) {
        MonitoringService monitoringService = new MonitoringService();
        Sensor temperatureSensor1 = new TemperatureSensor("Bedroom", "Temperature Sensor1", 25.1);
        Sensor temperatureSensor2 = new TemperatureSensor("Living room", "Temperature Sensor2", 24.6);
        Sensor temperatureSensor3 = new TemperatureSensor("Basement", "Temperature Sensor3", 15.3);
        Sensor temperatureSensor4 = new TemperatureSensor("Kids bedroom", "Temperature Sensor4", 25.4);
        Sensor temperatureSensor5 = new TemperatureSensor("Kitchen", "Temperature Sensor5", 29);
        Sensor pressureSensor1 = new PressureSensor("Bedroom", "Pressure Sensor1", 101.325);
        Sensor pressureSensor2 = new PressureSensor("Living room", "Pressure Sensor2", 100.213);
        Sensor pressureSensor3 = new PressureSensor("Basement", "Pressure Sensor3", 90);
        Sensor pressureSensor4 = new PressureSensor("Kids bedroom", "Pressure Sensor4", 70);
        Sensor pressureSensor5 = new PressureSensor("Kitchen", "Pressure Sensor1", 80);

        monitoringService.Add(temperatureSensor1);
        monitoringService.Add(temperatureSensor2);
        monitoringService.Add(temperatureSensor3);
        monitoringService.Add(temperatureSensor4);
        monitoringService.Add(temperatureSensor5);
        monitoringService.Add(pressureSensor1);
        monitoringService.Add(pressureSensor2);
        monitoringService.Add(pressureSensor3);
        monitoringService.Add(pressureSensor4);
        monitoringService.Add(pressureSensor5);

        double avgTemp= monitoringService.getAverageTemperatureSensors();
        double avgAll= monitoringService.getAverageAllSensors();
        System.out.println("Average temperature is: "+avgTemp);
        System.out.println("Average all is: "+avgAll);
    }
}
