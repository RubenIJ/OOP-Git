package eindopdracht;

import java.util.Scanner;

public class Ov {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Incheckpaal paal = new Incheckpaal(25.0);

        System.out.println("Saldo op je OV-kaart: €" + paal.getKaartBalance());
        System.out.println("Wil je je saldo opwaarderen? (ja/nee)");
        String opwaardeerAntwoord = input.nextLine();
        if (opwaardeerAntwoord.equalsIgnoreCase("ja")) {
            System.out.print("Hoeveel wil je opwaarderen? €");
            double bedrag = input.nextDouble();
            paal.opwaarderen(bedrag);
            input.nextLine();
        }

        System.out.println("Wil je inchecken? (ja/nee)");
        String incheckAntwoord = input.nextLine();
        System.out.println(paal.incheck(incheckAntwoord));

        if (paal.isIngecheckt()) {
            System.out.println("Wil je uitchecken? (ja/nee)");
            String uitcheckAntwoord = input.nextLine();
            System.out.println(paal.uitcheck(uitcheckAntwoord));
        }

        input.close();
    }
}