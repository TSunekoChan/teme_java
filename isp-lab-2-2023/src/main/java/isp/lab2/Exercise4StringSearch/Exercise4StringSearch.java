package isp.lab2.Exercise4StringSearch;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercise4StringSearch {
    /**
     * This method should return an array of strings that contain the substring.
     * @param input
     * @param substring what to search for
     * @return
     */
    public static String[] searchSubstrings(String input, String substring) {
        String[] tokens = input.split(",");
        List<String> cuvinte = new ArrayList<>();
        for (String token : tokens)
            if (token.contains(substring)) {

                cuvinte.add(token);
            }
        String[] result =cuvinte.toArray(new String[0]);
        for (String s : result) System.out.println(s);
        return result;}

    public static String readFromConsoleInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter line: ");
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        String input = "apples,computer,bread,tea,car";
        String substring = "te";
        searchSubstrings(input, substring);
        String Sir= readFromConsoleInt();
        String Subsir= readFromConsoleInt();
        String[] rest=searchSubstrings(Sir,Subsir);


    }
}

