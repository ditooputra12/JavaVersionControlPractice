public class KamarHotel {
    protected String tipe;
    protected double hargaPerMalam;
    protected boolean tersedia;
    protected int nomor;

    public KamarHotel(int nomor, String tipe, double hargaPerMalam) {
        this.nomor = nomor;
        this.tipe = tipe;
        this.hargaPerMalam = hargaPerMalam;
        this.tersedia = true;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

    public double hitungBiaya(int durasi) {
        return hargaPerMalam * durasi;
    }

    public String getInfo() {
        return "Kamar #" + nomor + " - " + tipe + " - Rp" + hargaPerMalam + " - " + (tersedia ? "Tersedia" : "Terisi");
    }

    public String getTipe() {
        return tipe;
    }

    public int getNomor() {
        return nomor;
    }
}
