package isp.lab3.exercise1;


public class Tree {


    private static int height;

    public Tree() {
        height = 15;
    }


    public static int grow(int meters) {
        if (meters >= 1)
            height += meters;
        return height;

    }

    public String toString() {
        return height + " meters";
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        System.out.println("The tree's height is currently " + tree.height + " meters");
        System.out.println("The tree's new height is " + tree.grow(5) + " meters");
    }
}
