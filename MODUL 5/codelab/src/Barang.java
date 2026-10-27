public class Barang {
    private String Nama;
    private  int stok;

    public Barang(String nama, int stok) {
        Nama = nama;
        this.stok = stok;
    }

    public String getNama() {
        return Nama;
    }



    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}
