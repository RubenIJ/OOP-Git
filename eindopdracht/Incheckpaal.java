package eindopdracht;

public class Incheckpaal extends Ovpas {

    private static final double INSTAPTARIEF = 20.0;

    public Incheckpaal(double balance) {
        super(balance);
    }

    public String incheck(String antwoord) {
        if (antwoord.equalsIgnoreCase("ja")) {
            if (heeftVoldoendeSaldo(INSTAPTARIEF)) {
                afschrijven(INSTAPTARIEF);
                setIngecheckt(true);
                return "Je bent ingecheckt. Instaptarief van €" + INSTAPTARIEF + " is afgeschreven.";
            } else {
                return "Onvoldoende saldo om in te checken.";
            }
        } else {
            return "Inchecken geannuleerd.";
        }
    }

    public String uitcheck(String antwoord) {
        if (antwoord.equalsIgnoreCase("ja") && isIngecheckt()) {
            setIngecheckt(false);
            return "Je bent succesvol uitgecheckt.";
        } else {
            return "Uitchecken niet gelukt.";
        }
    }
}