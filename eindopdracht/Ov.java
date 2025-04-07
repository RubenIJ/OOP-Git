package eindopdracht;

import java.util.Scanner;


public class Ov
{
 
    public static void main(String[] args)
    {
	Scanner input = new Scanner(System.in);
	Ovpas Account = new Ovpas();
 
	System.out.println("wil je inchecken");
	Account.inchecken = input.nextLine();
	System.out.println("hoeveel staat er op je ov-kaart");
	Account.kaartBalance = input.nextDouble();
	
	System.out.println(Account.incheckPaal());
    }
 
}