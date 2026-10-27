public class Main {
    public static void main(String[] args) {
        // Membuat dua objek rekening
        RekeningBank rekening1 = new RekeningBank("202410370110134", "Dhito putra", 500000);
        RekeningBank rekening2 = new RekeningBank("202410370311149", "Ibong", 1000000);

        // Menampilkan informasi awal rekening
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        // Simulasi transaksi
        rekening1.setorUang(200000);
        rekening2.setorUang(500000);

        rekening1.tarikUang(800000);
        rekening2.tarikUang(300000);

        // Menampilkan informasi akhir rekening
        System.out.println();
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
    }
}

