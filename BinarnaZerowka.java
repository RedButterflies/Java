import java.util.Scanner;
import java.util.*;

public class BinarnaZerowka {
    static String Pobranie ()
    {
        System.out.println("Wprowadz liczbe: ");
        Scanner sc = new Scanner(System.in);
        int liczba= sc.nextInt();
        String liczbaBinarna=Integer.toBinaryString(liczba);
        System.out.println("Wprowadzono liczbe: " + liczba + "\n W zapisie binarnym to: " + liczbaBinarna);
        return liczbaBinarna;
    }
    static int SekwencjaZer(String liczbaBinarna)
    {
        int [] ileZer = new int [liczbaBinarna.length()];
        int licznik=0;
        char [] tablicaZnakow = new char [liczbaBinarna.length()];
        tablicaZnakow=liczbaBinarna.toCharArray();
        for(int i=0;i<liczbaBinarna.length();i++)
        {
            if(tablicaZnakow[i]=='1')
            {
                ileZer[i]=licznik;
                licznik=0;
            }
            else if(tablicaZnakow[i]=='0')
            {
                licznik++;
            }


        }
        int najwiekszy=ileZer[0];
        for(int i=0;i<liczbaBinarna.length();i++)
        {
            if(ileZer[i]>najwiekszy)
            {
                najwiekszy=ileZer[i];
                ileZer[i]=najwiekszy;
            }
        }
        System.out.println("Najdluzsza sekwencja zer wystepujaca w tej liczbie ma dlugosc: ");
        return najwiekszy;

    }
}
