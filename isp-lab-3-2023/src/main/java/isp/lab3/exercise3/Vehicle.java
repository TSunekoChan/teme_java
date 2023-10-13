package isp.lab3.exercise3;

public class Vehicle {
    private String model;
    private String type;
    private int speed;
    private char fuelType;
    private static int count = 0;

    public Vehicle(String model, String type, int speed, char fuelType) {
        this.model = model;
        this.type = type;
        this.speed = speed;
        this.fuelType = fuelType;
        count++;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                model +
                "(" + type + ")" +
                ", speed= " + speed +
                ", fuel type= " + fuelType +
                '}';
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Dacia", "logan", 150, 'B');
        Vehicle vehicle2 = new Vehicle("Peugeot", "308", 185, 'D');
        System.out.println("we have " + count + " vehicles");
        System.out.println("first vehicle: " + vehicle1);
        System.out.println("second vehicle: " + vehicle2);
    }


}
