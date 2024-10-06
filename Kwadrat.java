public class Kwadrat {
    private double bok;

    public Kwadrat(double bok) {
        this.bok = bok;
    }

    public double obliczObwod() {
        return 4 * bok;
    }

    public double obliczPole() {
        return bok * bok;
    }

    public double getBok() {
        return bok;
    }

    public void setBok(double bok) {
        this.bok = bok;
    }
}
