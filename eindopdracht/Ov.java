package eindopdracht;

import java.util.Scanner;

public class Ov {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Incheckpaal account = new Incheckpaal(25.0);

        System.out.println("Wil je inchecken? (ja/nee)");
        account.inchecken = input.nextLine();

        System.out.println(account.incheckPaal());

        if (account.isIngecheckt) {
            System.out.println("Wil je uitchecken? (ja/nee)");
            input.nextLine();
            account.uitchecken = input.nextLine();
            System.out.println(account.uitcheckPaal());
        }

        input.close();
    }
}
