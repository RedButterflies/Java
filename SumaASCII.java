public class SumaASCII {
    static void Suma(String lancuch)
    {
        int suma=0;
        char tablica [] = new char [lancuch.length()];
        tablica= lancuch.toCharArray();

        for(int i=0;i<lancuch.length();i++)
        {
            if(tablica[i]>=47 && tablica[i]<=57 || tablica[i]>=97 && tablica[i]<=122)
            {
                suma+=tablica[i];
                System.out.println("Dodano nowa liczbe lub znak");
            }
            else
            {

            }

        }
        System.out.println("Suma wynosi: "+ suma);
    }
}
