package isp.lab4.exercise3;
import java.util.ArrayList;
import java.util.List;

public class MonitoringService {
    private List<Sensor> sensors;

    public MonitoringService() {
        sensors = new ArrayList<>();

    }

    public void Add(Sensor sensor) {
        sensors.add(sensor);
    }

    public double getAverageTemperatureSensors() {
        double sum = 0;
        int i = 0;
        for (Sensor sensor : sensors) {
            if (sensor instanceof TemperatureSensor) {
                sum += sensor.getValue();
                i++;

            }
        }
        if (i > 0) {
            return sum / i;

        } else {
            return 0;
        }

    }

    public double getAverageAllSensors() {
        double sum = 0;
        int i = 0;
        for (Sensor sensor : sensors) {
            sum += sensor.getValue();
            i++;
        }
        if (i > 0) {
            return sum / i;

        } else {
            return 0;
        }
    }
}
