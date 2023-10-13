package aut.isp.lab4.exercise2;

public class AquariumController {
    private String manufacturer;
    private String model;
    private float currentTime;

    public float iscurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(float currentTime) {
        this.currentTime = currentTime;
    }

    @Override
    public String toString() {
        return "AquariumController{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", currentTime=" + currentTime +
                '}';
    }

    //attributs
    //constructors
    //methods
}
