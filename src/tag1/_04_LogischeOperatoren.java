package tag1;

public class _04_LogischeOperatoren {
    static void main() {

        boolean istEingeloggt = true;
        boolean hatGutschein = true;

        IO.println("UND: Kunde ist eingeloggt und hat Gutschein: " + (istEingeloggt && hatGutschein)); // stand jetzt: false
        IO.println("ODER: Kunde ist eingeloggt ODER hat Gutschein: " + (istEingeloggt || hatGutschein));
        IO.println("Exklusives Oder: Kunde ist entweder eingeloggt oder hat Gutschein: " + (istEingeloggt ^ hatGutschein));
        IO.println("Negierung: " + !istEingeloggt);

        // Erklärung:
        // && ist true, wenn beide true sind
        // || ist true, wenn MINDESTENS einer true ist
        // ^ ist true, wenn GENAU einer true ist
        // ! kehrt den Wert um

        // komplexeres Beispiel
        int alter = 19;
        boolean kannProduktKaufen = istEingeloggt && hatGutschein && alter >= 18; // Kunde muss eingeloggt sein, Gutschein haben und ü18 sein



    }
}
