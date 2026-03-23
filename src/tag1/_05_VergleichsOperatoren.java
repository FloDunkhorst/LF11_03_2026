package tag1;

public class _05_VergleichsOperatoren {
    static void main() {
        double preis1 = 9.99;
        double preis2 = 15.99;
        double preis3 = 19.99;
        double preis4 = 9.99;

        IO.println("Preis1 < Preis2? " + (preis1 < preis2));
        IO.println("Preis1 > Preis2? " + (preis1 > preis2));

        IO.println("Preis1 >= Preis4? " + (preis1 >= preis4));

        IO.println("Preis1 == Preis2? " + (preis1 == preis2));
        IO.println("Preis1 == Preis4? " + (preis1 == preis4));

        IO.println("Preis1 != Preis4? " + (preis1 != preis4));
    }
}
