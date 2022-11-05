import java.util.Scanner;
import java.lang.String;
public class SzyfrCezara {
    static String wczytanieZwracanie()
    {
        System.out.println("Wprowadz lancuch znakow: ");
        Scanner sc = new Scanner(System.in);
        String lancuch;
        lancuch= sc.next().toString();
        System.out.println("Wprowadzony lanuch znakow: " + lancuch);
        return lancuch;
    }
    static String Zaszyfrowanie(String a)
    {
        System.out.println("O ile miejsc ma byc przesuniety znak: ");
        int przesuniecie;
        Scanner sc = new Scanner(System.in);
        przesuniecie = sc.nextInt();
        char [] tablicaZnakow = new char [a.length()];
        tablicaZnakow=a.toCharArray();
        /*for(int i=0;i<a.length();i++)
        {
            System.out.println(tablicaZnakow[i]);
        }*/

        char nowaTablicaZnakow [] = new char [a.length()];
        for(int i=0;i<a.length();i++)
        {
            if((int)tablicaZnakow[i]>=65 && (int)tablicaZnakow[i]<=90 || (int)tablicaZnakow[i]>=97 && (int)tablicaZnakow[i]<=122 ) {
                nowaTablicaZnakow[i] = (char) ((int) tablicaZnakow[i] + przesuniecie);
            }
            else
            {
                System.out.println("Wykryty znak tablicy: "+ tablicaZnakow[i] + " nie jest litera, wprowadz poprawny wyraz i sprobuj ponownie");return "NIEPOPRAWNY ZNAK";
            }
        }
        /*for(int i=0;i<a.length();i++)
        {
            System.out.println(nowaTablicaZnakow[i]);
        }*/
        String nowyNapis = String.valueOf(nowaTablicaZnakow);

        return nowyNapis;

    }
    static String Odszyfrowanie(String a)
    {
        System.out.println("O ile miejsc jest przesuniety znak: ");
        int przesuniecie;
        Scanner sc = new Scanner(System.in);
        przesuniecie = sc.nextInt();
        char [] tablicaZnakow = new char [a.length()];
        tablicaZnakow=a.toCharArray();
        /*for(int i=0;i<a.length();i++)
        {
            System.out.println(tablicaZnakow[i]);
        }*/

        char nowaTablicaZnakow [] = new char [a.length()];
        for(int i=0;i<a.length();i++)
        {
            if((int)tablicaZnakow[i]>=65 && (int)tablicaZnakow[i]<=90 || (int)tablicaZnakow[i]>=97 && (int)tablicaZnakow[i]<=126 ) {
                nowaTablicaZnakow[i] = (char) ((int) tablicaZnakow[i] - przesuniecie);
            }
            else
            {
                System.out.println("Wykryty znak tablicy: "+ tablicaZnakow[i] + " nie jest litera, wprowadz poprawny wyraz i sprobuj ponownie");return "NIEPOPRAWNY ZNAK";
            }
        }
        /*for(int i=0;i<a.length();i++)
        {
            System.out.println(nowaTablicaZnakow[i]);
        }*/
        String nowyNapis = String.valueOf(nowaTablicaZnakow);

        return nowyNapis;

    }
    static boolean Palindrom(String slowo)
    {
        int flaga=0;
        char [] tablicaZnakowA = new char [slowo.length()];
        tablicaZnakowA=slowo.toCharArray();
        for(int i=0;i<slowo.length();i++)
        {
            if(tablicaZnakowA[i]!=tablicaZnakowA[slowo.length()-1-i])
            {
                flaga++;
            }

        }
        if(flaga!=0)
        {
            System.out.println("Wprowaszony argument klasy String nie jest palindromem");
            return false;
        }
        else
        {
            System.out.println("Wsprowadzone slowo jest palindromem");
            return true;
        }
    }
}
