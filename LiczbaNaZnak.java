import java.util.Scanner;

public class LiczbaNaZnak {
    static char liczbaNaZnak()
    {
        System.out.println("Wprowadz liczbe z zakresu <33,126>");
        int cyfra;
        Scanner wpisana = new Scanner(System.in);
        cyfra= wpisana.nextInt();
        char znak = (char) cyfra;
        if(cyfra<3 || cyfra>126)
        {
            System.out.println("Wpisano liczbe spoza zakresu, wprowadz liczbe z zakresu <33,126> i sprobuj ponownie");
            return 'X';
        }
        else {

            System.out.println("Znak przypisany do cyfry " + cyfra + " to: " + znak);


        }


        return znak;
    }
}
