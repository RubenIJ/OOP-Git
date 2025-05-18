package eindopdracht;

public class Ovpas {
    public double kaartBalance;
    public String inchecken;
    public String ingecheckt;
    public boolean isIngecheckt = false;
    public char[] incheckPaal;
    public String uitchecken;
    public String uitcheck;

    public Ovpas(double balance) {
        this.kaartBalance = balance;
    }

    public void deposit(double x) {
        this.kaartBalance += x;
    }
}
