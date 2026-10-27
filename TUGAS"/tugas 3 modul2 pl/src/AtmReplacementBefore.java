import java.util.Scanner;

public class AtmReplacementBefore {
    public String nm;
    public String rk;
    public int al;
    public AtmReplacementBefore(String nm, String rk, int al) {
        this.nm = nm;
        this.rk = rk;
        this.al = al;
    }

    public void processRequest() {
        System.out.println("\n--- Detail Permintaan ---");
        System.out.println("Nama   : " + nm);
        System.out.println("Rekening: " + rk);


        double biaya = 15000.0;
        if (al == 1) {
            biaya += 10000.0; 
            System.out.println("Alasan : Kartu Hilang");
        } else {
            System.out.println("Alasan : Kartu Rusak");
        }
        System.out.println("Total Biaya Cetak: Rp " + biaya);
        System.out.println("Status : Permohonan penggantian kartu diproses.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== LAYANAN MANDIRI: GANTI KARTU ATM ===");
        System.out.print("Masukkan Nama Nasabah: ");
        String nm = scanner.nextLine();

        System.out.print("Masukkan Nomor Rekening: ");
        String rk = scanner.nextLine();

        System.out.print("Pilih Alasan (1: Hilang, 2: Rusak): ");
        int al = scanner.nextInt();

        AtmReplacementBefore service = new AtmReplacementBefore(nm, rk, al);
        service.processRequest();

        scanner.close();
    }
}