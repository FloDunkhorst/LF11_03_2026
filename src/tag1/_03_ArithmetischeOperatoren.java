package tag1;

public class _03_ArithmetischeOperatoren {

    static void main() {
        double preis1 = 3.99;
        double preis2 = 8.99;

        // Grundlegende Berechnungen
        IO.println("Gesamtpreis: " + (preis1 + preis2)); // +
        IO.println("Preis1 - Preis2: " + (preis1 - preis2)); // -
        IO.println("Preis1 * Preis2: " + (preis1 * preis2)); // *
        IO.println("Preis1 / Preis2: " + (preis1 / preis2)); // /
        IO.println("Modulo: Preis1 % Preis2: " + (preis1 % preis2)); // Restdivision

        // Modulo
        IO.println("Modulo Ganzzahl: " + (5 % 3));

        // Zuweisungsoperatoren
        //preis1 = preis1 + 2;
        preis1 += 2;

        // funktioniert auch mit -=, *=, /=, %=
    }

}
