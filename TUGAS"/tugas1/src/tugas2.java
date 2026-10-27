import java.util.Scanner;

public class tugas2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = scanner.nextInt();

        try {
            if (angka <= 0) {
                throw new InvalidNumberException(
                        "Angka tidak valid! Angka harus positif."
                );
            }

            System.out.println("Angka valid: " + angka);

        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}

class InvalidNumberException extends Exception {

    public InvalidNumberException(String message) {
        super(message);
    }
}