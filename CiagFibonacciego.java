public class CiagFibonacciego {
    static void elementyZCiagu(int n)
    {
        int liczba;
        int tablica[] = new int [n];
        for(int i=0;i<n;i++)
        {
            tablica[i]=i;
            if(i==0)
            {
                liczba=0;

            }
            else if(i==1)
            {
                liczba=1;

            }
            else
            {
                liczba=tablica[i-1]+tablica[i-2];
                tablica[i]=liczba;

            }
            System.out.println(liczba);
        }
    }
}
