package isp.lab3.exercise2;

public class Rectangle {
    private static int length = 2;
    private static int width = 1;
    private static String color = String.valueOf("red");

    Rectangle () {
        length = 5;
        width = 3;
        color = "blue";
    }

    public static int getLength() {
        return length;
    }

    public static int getWidth() {
        return width;
    }

    public static String getColor() {
        return color;
    }

    public static int getPerimeter() {
        int perimeter = width * 2 + length * 2;
        return perimeter;
    }

    public static int getArea() {
        int area = width * length;
        return area;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("the lengh is " +getLength()+" meters");
        System.out.println("the width is "+getWidth()+" meters");
        System.out.println("the color is " +getColor());
        System.out.println("perimeter is "+ getPerimeter()+" meters");
        System.out.println("the area is "+ getArea()+ " square meters");
    }
}
