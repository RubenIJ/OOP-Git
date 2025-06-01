package eindopdracht;

public class Ovpas {
    private double kaartBalance;
    private boolean ingecheckt;

    public Ovpas(double balance) {
        this.kaartBalance = balance;
        this.ingecheckt = false;
    }

    public double getKaartBalance() {
        return kaartBalance;
    }

    public void opwaarderen(double bedrag) {
        if (bedrag > 0) {
            kaartBalance += bedrag;
            System.out.println("Saldo succesvol opgewaardeerd. Nieuw saldo: €" + kaartBalance);
        } else {
            System.out.println("Ongeldig bedrag.");
        }
    }

    public boolean isIngecheckt() {
        return ingecheckt;
    }

    public void setIngecheckt(boolean status) {
        this.ingecheckt = status;
    }

    public boolean heeftVoldoendeSaldo(double minimum) {
        return kaartBalance >= minimum;
    }

    public void afschrijven(double bedrag) {
        kaartBalance -= bedrag;
    }
}