package tag1;

import javax.swing.*;

public class _06_In_und_Output {
    static void main() {

        // Output
        IO.println("Hier ist meine Ausgabe");

        // Input
        String userName = IO.readln("Gib deinen Namen ein: ");
        IO.println("Der Name ist " + userName);

        int alter = Integer.parseInt(IO.readln("Gib dein Alter ein: "));
        IO.println("Das Alter ist: " + alter);

        double meinKontostand = Double.parseDouble(IO.readln("Gib den Kontostand ein: "));
        IO.println("Kontostand: " + meinKontostand);

        // JOptionPane - grafische GUI
        String jOptionName = JOptionPane.showInputDialog("Gib deinen Namen ein: ");
        JOptionPane.showMessageDialog(null, "Der eingegebene Name ist: " + jOptionName);
    }
}
