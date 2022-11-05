import java.util.*;

public class Main {
    public static void main(String[] args) {
        String slowo;
        char litera;
        System.out.println("Wprowadz litere, ktora chcesz policzyc w lancuchu znakow (wielkosc liter ma znaczenie): ");
        Scanner sc = new Scanner(System.in);
        litera = sc.next().charAt(0);
        System.out.println("Wprowadz lancuch znakow, w ktorym chcesz poszukiwac liter: ");
        //Scanner xc = new Scanner(System.in);
        slowo= sc.next().toString();
        ObecnoscWLancuchu.Ilerazy(litera,slowo);
        System.out.println("Wprowadz zdanie/slowo,w kotorym chcesz zsumowac znaki ASCII malych liter i liczb ");
        String lancuch;
        lancuch=sc.next().toString();
        SumaASCII.Suma(lancuch);
        LiczbaNaZnak.liczbaNaZnak();
        String napis;
        napis=SzyfrCezara.wczytanieZwracanie();
        String zaszyfrowanyNapis;
        zaszyfrowanyNapis=SzyfrCezara.Zaszyfrowanie(napis);
        System.out.println("Zaszyfrowany napis " + zaszyfrowanyNapis);
        String napisZaszyfrowany;
        napisZaszyfrowany=SzyfrCezara.wczytanieZwracanie();
        String odszyfrowanyNapis;
        odszyfrowanyNapis=SzyfrCezara.Odszyfrowanie(napisZaszyfrowany);
        System.out.println("Odszyfrowany napis " + odszyfrowanyNapis);
        System.out.println("Wprowadz palindorm: ");
        String palindrom = SzyfrCezara.wczytanieZwracanie();
        SzyfrCezara.Palindrom(palindrom);
        System.out.println(BinarnaZerowka.SekwencjaZer(BinarnaZerowka.Pobranie()));




    }
}