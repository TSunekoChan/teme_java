package aut.isp.lab4.exercise3;

public class AquariumController {
    private String manufacturer;
    private String model;
    private float currentTime;
    private float feedingTime;

    public float iscurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(float currentTime) {
        this.currentTime = currentTime;
    }

    public void setFeedingTime(float feedingTime) {
        this.feedingTime = feedingTime;
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
