package isp.lab2.Exercise6WordGuess;

import  java.util.Scanner;
import  java.util.Random;
public class Exercise6WordGuess {


    public static char[] StringToChar(String dictionary)
    {
        String[] dict = dictionary.split(",");
        Random random = new Random();
        int j = random.nextInt(dict.length);
        String cuvant = dict[j];
        char[] c = new char[cuvant.length()];
        for(int i=0; i<cuvant.length(); i++)
        {
            c[i] = cuvant.charAt(i);
        }
        return c;
    }


    public static int countOccurence(char... word)
    {
        Scanner scanner = new Scanner(System.in);

        char[] copie = new char[word.length];

        for(int i=0; i<copie.length;i++)
        {
            copie[i] = '-';
        }

        int k=0; // numar de incercari
        int ok=0;
        int greseala;

        System.out.println(new String(copie) + " cuvantul are " + copie.length + " litere.");

        while(ok==0)
        {
            greseala=1;
            k++;
            ok=1;
            System.out.println("Litera este ");
            char c = scanner.next().charAt(0);

            for(int i=0; i<word.length; i++)
                if(word[i] == c)
                {
                    System.out.println("corect");
                    copie[i] = c;
                    System.out.println(copie);
                    greseala = 0;
                }
            if(greseala == 1) System.out.println("incorect");

            for(int i=0; i<copie.length; i++)
                if(copie[i] == '-')
                {
                    ok=0;
                    break;
                }
            if (ok == 1) System.out.println("Cuvantul a fost " + new String(word));
        }

        return k;
    }

    public static void main(String[] args)
    {
        String dictionary="casa,carcasa,scara,banana,mar,masina,logan,golf,medicament,urs,caine,pisica,iepure,maimuta,koala";
        char[] nume = StringToChar(dictionary);
        int n = countOccurence(nume);
        System.out.println("Numarul de incercari a fost " + n);
    }

}
