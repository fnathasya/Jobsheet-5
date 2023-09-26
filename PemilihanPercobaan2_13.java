import java.util.Scanner;

public class PemilihanPercobaan213 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        String nilaiHuruf = "null";

        System.out.println("Nilai uas : ");
        float uas = input13.nextFloat();
        System.out.println("Nilai UTS : ");
        float uts = input13.nextFloat();
        System.out.println("Nilai Kuis : ");
        float kuis = input13.nextFloat();
        System.out.println("NIlai Tugas : ");
        float tugas = input13.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String message = total < 65 ? " Remidi " : " Tidak Remidi ";
        System.out.println("Nilai Akhir = " + total + " sehingga " + message);

        if (total > 80 && total <= 100) {
            nilaiHuruf = "A";
        } else if (total > 73 && total <= 80) {
            nilaiHuruf = "B+";
        } else if (total > 65 && total <= 73) {
            nilaiHuruf = "B";
        } else if (total > 60 && total <= 65) {
            nilaiHuruf = "C=";
        } else if (total > 50 && total <= 60) {
            nilaiHuruf = "C";
        } else if (total > 39 && total <= 50) {
            nilaiHuruf = "D";
        } else if (total <= 39) {
            nilaiHuruf = "E";
        }

        System.out.println("Nilai Kompetensi yaitu " + nilaiHuruf);

    }
}