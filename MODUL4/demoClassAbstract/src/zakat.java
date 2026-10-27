abstract class Zakat {
    int umur;
    abstract int hitungZakat();
}

class ZakatKambing extends Zakat {
    int banyak;

    public ZakatKambing(int umur, int banyak) {
        this.umur = umur;
        this.banyak = banyak;
    }

    int hitungZakat() {
        if (umur > 2 && banyak > 100) {
            return banyak / 100;
        }
        return 0;
    }
}

class ZakatSapi extends Zakat {
    int banyak;

    public ZakatSapi(int umur, int banyak) {
        this.umur = umur;
        this.banyak = banyak;
    }

    int hitungZakat() {
        if (umur > 5 && banyak > 2) {
            return banyak / 2;
        }
        return 0;
    }
}

public class DemoZakat {
    public static void main(String[] args) {
        Zakat z1 = new ZakatKambing(3, 250); // 250 / 100 = 2
        Zakat z2 = new ZakatSapi(6, 10);     // 10 / 2 = 5
        Zakat z3 = new ZakatSapi(3, 5);      // umur < 5, tidak wajib zakat

        System.out.println("Zakat Kambing: " + z1.hitungZakat() + " ekor");
        System.out.println("Zakat Sapi 1: " + z2.hitungZakat() + " ekor");
        System.out.println("Zakat Sapi 2: " + z3.hitungZakat() + " ekor");
    }
}
