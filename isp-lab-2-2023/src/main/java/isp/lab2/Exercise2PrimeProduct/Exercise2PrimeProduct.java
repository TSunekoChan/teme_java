package isp.lab2.Exercise2PrimeProduct;

import java.util.Scanner;

public class Exercise2PrimeProduct {

    /**
     * This method should return the product of the first n prime numbers
     * @param n

     * @param m
     * @return
     */

    public static long getPrimeProduct(int n, int m) {
        int i,p=1;
        for(i=n;i<=m;i++)
        {
            int div,s=0;
            for(div=1;div<=i;div++)
            {
                if(i%div==0)
                    s=s+div;
            }
            if(s==i+1)
                p=p*i;
        }
        if(p>1)
        return p;
        else return 0;
    }


    /**
     * This method should read from the console a number
     * @return the number read from the console
     */
    public static int readfromConsoleInt(int a) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        return number;
    }

    public static void main(String[] args) {
        int n = 0,m=0;
        System.out.println("The product of the first 10 prime numbers is: " + getPrimeProduct(1, 10));
        System.out.println("The product of prime numbers between m and n: " + getPrimeProduct(readfromConsoleInt(n), readfromConsoleInt(m)));
    }

}
