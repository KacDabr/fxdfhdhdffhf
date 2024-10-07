public class Main {
    public static void main(String[] args) {

        KartaPlatnicza kartaDebetowa = new KartaDebetowa(500);
        kartaDebetowa.wykonajPlatnosc(100);
        kartaDebetowa.doladuj(50);

        KartaPlatnicza kartaKredytowa = new KartaKredytowa(1000);
        kartaKredytowa.wykonajPlatnosc(1200);
        kartaKredytowa.doladuj(500);

    }

    interface Platnosc {
        public void wykonajPlatnosc(double kwota);
    }

    static abstract class KartaPlatnicza implements Platnosc {
        double saldo;

        abstract void doladuj(double kwota);
    }

    public static class KartaDebetowa extends KartaPlatnicza {
        double saldo;
        public void wykonajPlatnosc(double kwota) {
            saldo -= kwota;
            System.out.println("Platnosc " + kwota + " PLN zaakceptowana");
        }

        public KartaDebetowa(double saldo) {
            this.saldo = saldo;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        public void doladuj(double kwota) {
            saldo += kwota;
            System.out.println("Doladowano " + kwota + " PLN. Nowe saldo: " + saldo + " PLN");
        }
    }

    public static class KartaKredytowa extends KartaPlatnicza {
        double saldo;
        public void wykonajPlatnosc(double kwota) {
            saldo -= kwota;
            System.out.println("Platnosc " + kwota + " PLN zaakceptowana");
        }

        public KartaKredytowa(double saldo) {
            this.saldo = saldo;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        public void doladuj(double kwota) {
            saldo += kwota;
            System.out.println("Doladowano " + kwota + " PLN. Nowe saldo: " + saldo + " PLN");
        }

    }
}
