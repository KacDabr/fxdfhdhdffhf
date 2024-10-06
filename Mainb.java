public class Main {
    public static void main(String[] args) {
        Punkt punkt1 = new Punkt();
        Punkt punkt2 = new Punkt(3, 4);

        System.out.println("Odległość między punkt1 a (" + punkt2.getX() + ", " + punkt2.getY() + ") : " + punkt1.obliczOdleglosc(3, 4));
        System.out.println("Odległość między punkt1 a punkt2: " + punkt1.obliczOdleglosc(punkt2));
    }
}
