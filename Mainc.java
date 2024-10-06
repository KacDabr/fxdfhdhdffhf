public class Main {
    public static void main(String[] args) {
        Wiatrak domyslnyWiatrak = new Wiatrak();
        Wiatrak nowyWiatrak = new Wiatrak(Wiatrak.FAST, true, 10.0, "czerwony");

        System.out.println(domyslnyWiatrak.informacje());
        System.out.println(nowyWiatrak.informacje());
    }
}
