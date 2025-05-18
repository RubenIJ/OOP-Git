package eindopdracht;

public class Incheckpaal extends Ovpas {

    public Incheckpaal(double balance) {
        super(balance);
    }

    public String incheckPaal() {
        int accept = 0;
        if (inchecken.equalsIgnoreCase("yes") || inchecken.equalsIgnoreCase("ja") || inchecken.equalsIgnoreCase("yahoo") || inchecken.equalsIgnoreCase("misschien :)")) {
            accept++;
        }
        if (accept == 1 && kaartBalance >= 20) {
            ingecheckt = "Ingecheckt";
            return ingecheckt;
        } else if (accept == 1 && kaartBalance < 20) {
            ingecheckt = "Sorry geen saldo :(";
            return ingecheckt;
        } else {
            ingecheckt = "doei :(";
            return ingecheckt;
        }
    }

    public String uitcheckPaal() {
        if (ingecheckt.equalsIgnoreCase("ingecheckt")) {
            uitcheck = "uitgecheckt";
            return uitcheck;
        } else {
            return "Niet uitgecheckt.";
        }
    }
}