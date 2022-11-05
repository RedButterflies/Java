public class Uczen {
    String imie;
    String nazwisko;
    int wiek;
    double srednia;

    public Uczen(String imie, String nazwisko, int wiek, double srednia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.srednia = srednia;
    }
    public Uczen() {
        this.imie = "Jan";
        this.nazwisko = "Kowalski";
        this.wiek = 25;
        this.srednia = 4.0;
    }
}
