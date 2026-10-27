package perpustakaan;

public class Anggota implements Peminjaman{
    String nama;
    String idAnggota;

    public Anggota(String nama, String idAnggota) {
        this.nama = nama;
        this.idAnggota = idAnggota;
    }

    @Override
    public void pinjambuku(String judul) {
        System.out.println(nama+ " meminjam buku berjudul: "+judul);
    }

    @Override
    public void kembalikanbuku(String judul) {
        System.out.println(nama+" mengembalikan buku berjudul: "+judul);
    }
    public void pinjambuku(String judul, int durasi){
        System.out.println(nama+" meminjam buku "+ judul + " selama "+durasi+" hari");
    }

    public void displayInfo(){
        System.out.println("Anggota: "+nama+ " (ID: "+idAnggota+")");
    }

}
