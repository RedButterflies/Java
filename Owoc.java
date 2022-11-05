public class Owoc {
    private String nazwa;
    private String kolor;
    private int liczba;
    private char czyPestki;
    private double ZawartoscWody;
    private boolean czyCukier;

    public void setCzyCukier(boolean czyCukier) {
        this.czyCukier = czyCukier;
    }

    public boolean isCzyCukier() {
        return czyCukier;
    }

    public Owoc(boolean czyCukier, String nazwa, String kolor, int liczba, char czyPestki, double zawartoscWody) {
        this.nazwa = nazwa;
        this.kolor = kolor;
        this.liczba = liczba;
        this.czyPestki = czyPestki;
        ZawartoscWody = zawartoscWody;
        this.czyCukier = czyCukier;
    }
    public Owoc() {
        this.nazwa = "banan";
        this.kolor = "zolty";
        this.liczba = 3;
        this.czyPestki = 't';
        this.ZawartoscWody = 0.5;
        this.czyCukier = true;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public int getLiczba() {
        return liczba;
    }

    public void setLiczba(int liczba) {
        this.liczba = liczba;
    }

    public char getCzyPestki() {
        return czyPestki;
    }

    public void setCzyPestki(char czyPestki) {
        this.czyPestki = czyPestki;
    }

    public double getZawartoscWody() {
        return ZawartoscWody;
    }

    public void setZawartoscWody(double zawartoscWody) {
        ZawartoscWody = zawartoscWody;
    }
    static void wypiszOwoc(Owoc a)
    {
        System.out.println("Nazwa: "+ a.nazwa);
        System.out.println("Kolor: " + a.kolor);
        System.out.println("Czy ma pestki: "+ a.czyPestki);
        System.out.println("Liczba owocow: "+ a.liczba);
        System.out.println("Procent zawartosci wody: " + a.ZawartoscWody);
        System.out.println("Czy cukier przekracza 50% zawartosci soku: "+ a.czyCukier);
    }
}
