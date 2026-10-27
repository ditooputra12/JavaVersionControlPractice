import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== LAYANAN MANDIRI: GANTI KARTU ATM ===");
        System.out.print("Masukkan Nama Nasabah: ");
        String customerName = scanner.nextLine();

        System.out.print("Masukkan Nomor Rekening: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Pilih Alasan (1: Hilang, 2: Rusak): ");
        int reasonCode = scanner.nextInt();

        // Menggunakan Parameter Object
        CardRequestInput input = new CardRequestInput(customerName, accountNumber, reasonCode);
        AtmReplacementService service = new AtmReplacementService(input);

        service.executeTransaction();
        service.printReceipt();

        scanner.close();
    }
}