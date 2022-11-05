public class OdliczanieWPetli {
    static void PetlaFor() {
        for (int i = 5; i <= 80; i += 15) {
            System.out.print(i+" ");
        }
    }
    static void PetlaWhile()
    {
        int i=5;
        while(i<=80){
            System.out.print(i+" ");
            i+=15;
        }

    }

    static void PetlaDoWhile()
    {
        int i=5;
        do{
            System.out.print(i+ " ");
            i+=15;
        }while(i<=80);
    }
}
