
abstract class Shape {
    abstract double getLuas();
}


class SegiEmpat extends Shape {
    double panjang, lebar;

    public SegiEmpat(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    double getLuas() {
        return panjang * lebar;
    }
}


class Segitiga extends Shape {
    double alas, tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    double getLuas() {
        return 0.5 * alas * tinggi;
    }
}
n
class Lingkaran extends Shape {
    double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    double getLuas() {
        return 3.14 * jariJari * jariJari;
    }
}

// Demo
public class DemoShape {
    public static void main(String[] args) {
        Shape s1 = new SegiEmpat(10, 5);    // 10 * 5 = 50
        Shape s2 = new Segitiga(6, 4);      // 0.5 * 6 * 4 = 12
        Shape s3 = new Lingkaran(7);        // 3.14 * 7 * 7 = 153.86

        System.out.println("Luas Segi Empat: " + s1.getLuas());
        System.out.println("Luas Segitiga: " + s2.getLuas());
        System.out.println("Luas Lingkaran: " + s3.getLuas());
    }
}
