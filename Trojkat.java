public class Trojkat {
    static void czyTrojkat(int x, int y, int z)
    {
        if(x+y>z && x+z>y && y+z>x)
        {
            System.out.println("Utworzenie trojkata jest mozliwe");
            System.out.println("Suma kazdych dwoch bokow jest wieksza niz trzeci bok");

            if(x==y&& y==z)
            {
                System.out.println("Trojkat jest rownoboczny");
            }
            else if(x==y && y!=z || x==z && y!=z || y==z && x!=z)
            {
                System.out.println("Trojkat jest rownoramienny");
            }
            else
            {
                System.out.println("Trojkat jest roznoboczny");
            }

        }
        else
        {
            System.out.println("Z tych trzech odcinkow nie mozna utworzyc trojkata, sprobuj ponownie");
        }
    }
}
