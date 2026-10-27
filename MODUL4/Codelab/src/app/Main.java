package app;

import perpustakaan.Anggota;
import perpustakaan.Buku;
import perpustakaan.Fiksi;
import perpustakaan.NonFiksi;

public class Main {
    public static void main(String[] args) {
        Buku bukufiksi = new Fiksi("terelie","bumi","romance");
        Buku bukunonfiksi = new NonFiksi("Nikola Tesla","Teori Kuantum","Fisika");

        Anggota anggota1 = new Anggota("Dhito","D134");
        Anggota anggota2 = new Anggota("Ayub","D123");

        bukufiksi.displayInfo();
        bukunonfiksi.displayInfo();

        System.out.println();

        anggota1.displayInfo();
        anggota2.displayInfo();

        System.out.println();

        anggota1.pinjambuku("bumi");
        anggota2.pinjambuku("Teori Kuantum",7);

        System.out.println();

        anggota1.kembalikanbuku("bumi");
        anggota2.kembalikanbuku("Teori Kuantum");
    }
}