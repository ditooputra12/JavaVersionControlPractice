public class AtmReplacementService extends TransactionBase implements Printable {
    private int reasonCode;

    // Teknik 4: Introduce Constant
    private static final double BASE_FEE = 15000.0;
    private static final double LOST_PENALTY = 10000.0;
    private static final int REASON_LOST = 1;

    public AtmReplacementService(CardRequestInput input) {
        super(input);
        this.reasonCode = input.getReasonCode();
    }

    // Teknik 5: Extract Method untuk menghitung total biaya penggantian kartu
    private double calculateTotalCost() {
        if (reasonCode == REASON_LOST) {
            return BASE_FEE + LOST_PENALTY;
        }
        return BASE_FEE;
    }

    @Override
    public void printReceipt() {
        System.out.println("[STRUK] Silakan ambil bukti pengajuan di mesin printer.");
    }

    @Override
    public void executeTransaction() {
        // Teknik 6: Rename Method & Variable (dari nm, rk, al menjadi nama deskriptif)
        System.out.println("\n--- Detail Permintaan ---");
        System.out.println("Nama   : " + customerName);
        System.out.println("Rekening: " + accountNumber);

        if (reasonCode == REASON_LOST) {
            System.out.println("Alasan : Kartu Hilang");
        } else {
            System.out.println("Alasan : Kartu Rusak");
        }

        System.out.println("Total Biaya Cetak: Rp " + calculateTotalCost());
        System.out.println("Status : Permohonan penggantian kartu diproses.");
    }
}