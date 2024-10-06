public class Punkt {
    private double x;
    private double y;

    public Punkt() {
        this.x = 0;
        this.y = 0;
    }

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double obliczOdleglosc(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public double obliczOdleglosc(Punkt innyPunkt) {
        return Math.sqrt(Math.pow(this.x - innyPunkt.x, 2) + Math.pow(this.y - innyPunkt.y, 2));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
