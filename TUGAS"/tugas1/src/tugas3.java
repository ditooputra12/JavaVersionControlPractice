import java.util.Scanner;

public class tugas3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama mahasiswa: ");
        String nama = input.nextLine();

        System.out.print("Masukkan nilai ujian akhir: ");
        double nilai = input.nextDouble();

        String status;

        if (nilai >= 60) {
            status = "Lulus";
        } else {
            status = "Tidak Lulus";
        }

        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Status: " + status);

        input.close();
    }
}