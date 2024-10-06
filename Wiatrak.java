public class Wiatrak {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Wiatrak() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5.0;
        this.color = "biały";
    }

    public Wiatrak(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public String informacje() {
        return "Prędkość: " + speed + ", Stan: " + (on ? "Włączony" : "Wyłączony") +
                ", Promień: " + radius + ", Kolor: " + color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
