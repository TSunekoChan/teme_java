package isp.lab2.Exercise5EvenOddSearch;

import java.util.Scanner;

public class Exercise5EvenOddSearch {

    public static int[] findEvenOdd(String input) {
        String[] tokens = input.split(",");
        int even=Integer.MIN_VALUE, odd=Integer.MAX_VALUE;
        int IEven=-1, IOdd=-1;
        for (int i = 0; i < tokens.length; i++)
        {int numar =Integer.parseInt(tokens[i].trim());
            if(numar%2==0 && numar>even)
            {even=numar;
                IEven=i;
            }
            else if(numar %2!=0&& numar<odd)
            {odd=numar;
                IOdd=i;}
        }
        if (IEven == -1) {
            System.out.println("There are no even numbers in the list.");
        } else {
            System.out.println("Largest even number: " + even + " (position " + IEven + ")");
        }

        if (IOdd == -1) {
            System.out.println("There are no odd numbers in the list.");
        } else {
            System.out.println("Smallest odd number: " + odd + " (position " + IOdd + ")");
        }



        return new int[]{even,odd};
    }
    public static String readFromConsoleInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter line: ");
        return scanner.nextLine();
    }
    public static void main(String[] args) {
        String input = "1,2,3,4,5,6,7,8,9,10";
        int[] result = findEvenOdd(input);
        String ex5= readFromConsoleInt();
        int[] result2=findEvenOdd(ex5);
        for (int i : result2) {
            System.out.println(i);
        }
    }
}