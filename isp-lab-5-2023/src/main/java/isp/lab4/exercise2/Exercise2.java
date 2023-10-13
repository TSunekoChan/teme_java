package isp.lab4.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        Chargeable laptop = new Laptop();
        Chargeable smartWatch = new SmartWatch();
        Chargeable smartPhone = new Smart_Phone();

        laptop.getBatteryLevel(10);
        smartPhone.getBatteryLevel(50);
        smartWatch.getBatteryLevel(20);

        laptop.charge(180);
        smartWatch.charge(120);
        smartPhone.charge(60);
        System.out.println("laptop's battery is now "+ laptop + "%");
        System.out.println("smart phone's battery is now "+ smartPhone + "%");
        System.out.println("smartwatch's battery is now "+ smartWatch + "%");

    }

}
