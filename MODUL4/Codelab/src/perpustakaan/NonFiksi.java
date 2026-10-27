package perpustakaan;

public class NonFiksi extends Buku{
    String Bidang;

    public NonFiksi(String penulis, String judul, String Bidang) {
        super(penulis, judul);
        this.Bidang = Bidang;
    }

    @Override
    public void displayInfo() {
        System.out.println("Buku non Fiksi: "+judul+" oleh "+penulis+" (Bidang: "+Bidang+")");
    }
}
