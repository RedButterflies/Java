public class Zad3 {
    static void FormatowanieWyjscia()
    {
        int x,y;
        int z = 12;
        double i = 2.45;
        char znak ='z';
        double j;
        x=0;
        y=333;
        j=0.002;
        System.out.printf("\n i=%4.5e, j=%8.5e, x=%5d, y=%5d znak:%c", i, j, x,y, znak);
        //i bedzie wyswietlone na 4 pozycjach z jedna cyfra po kropce
        //j bedzie wyswietlone na 8 pozycjach z dwoma cyframi po kropce w formacie zmiennopozycyjnym
        //x bedzie wyswietlone na 6 pozycjach(spacje z przodu)
        //znak bedzie wyswietlony jako pojednyczy znak


    }
}
