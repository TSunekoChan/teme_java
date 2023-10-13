package isp.lab4.exercise2;

public class SmartWatch implements Chargeable {
    private int batteryLevel;

    @Override
    public void getBatteryLevel(int batteryLevel) {
        this.batteryLevel=batteryLevel;
    }

    public void charge(int durationInMinutes) {

        while (this.batteryLevel < 100 && durationInMinutes > 0) {
            this.batteryLevel += 5;
            durationInMinutes -= 1;

        }
        if (this.batteryLevel > 100)
            this.batteryLevel = 100;

    }

    @Override
    public String toString() {
        return  " "+batteryLevel;
    }
}
