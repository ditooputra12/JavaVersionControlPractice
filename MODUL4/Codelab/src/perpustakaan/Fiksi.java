package perpustakaan;

public class Fiksi extends Buku{
    String Genre;

    public Fiksi(String penulis, String judul, String Genre) {
        super(penulis, judul);
        this.Genre = Genre;
    }

    @Override
    public void displayInfo() {
        System.out.println("Buku Fiksi: "+judul+" oleh: "+penulis+ " (Genre: "+Genre+")");
    }
}
