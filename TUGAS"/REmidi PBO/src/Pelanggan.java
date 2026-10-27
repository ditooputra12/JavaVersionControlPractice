public class Pelanggan {
    private String nama;
    private int durasiInap;
    private KamarHotel kamarDipesan;

    public Pelanggan(String nama, int durasiInap) {
        this.nama = nama;
        this.durasiInap = durasiInap;
    }

    public String getNama() {
        return nama;
    }

    public int getDurasiInap() {
        return durasiInap;
    }

    public void pesanKamar(KamarHotel kamar) {
        if (!kamar.isTersedia()) {
            System.out.println("Kamar tidak tersedia.");
        } else {
            kamar.setTersedia(false);
            kamarDipesan = kamar;
            System.out.println(nama + " memesan " + kamar.getTipe() + " nomor " + kamar.getNomor() + " selama " + durasiInap + " malam.");
        }
    }

    public double hitungTotalBiaya() {
        if (kamarDipesan != null) {
            return kamarDipesan.hitungBiaya(durasiInap);
        } else {
            return 0;
        }
    }
}
