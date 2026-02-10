import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Memeriksa apakah ada input yang masuk
        if (!sc.hasNext()) {
            sc.close();
            return;
        }

        String soalKe = sc.next();

        // Menggunakan switch untuk memilih logika soal
        switch (soalKe) {
            case "Soal1":
                if (sc.hasNextInt()) {
                    int a = sc.nextInt();
                    if (sc.hasNextInt()) {
                        int b = sc.nextInt();
                        if (isOverflow(a, b)) {
                            System.out.println("OVERFLOW");
                        } else {
                            System.out.println(a + b);
                        }
                    }
                }
                break;

            case "Soal2":
                if (sc.hasNext()) {
                    String s1 = sc.next();
                    if (sc.hasNext()) {
                        String s2 = sc.next();

                        float f1 = Float.parseFloat(s1);
                        float f2 = Float.parseFloat(s2);
                        float sumFloat = f1 + f2;

                        double d1 = Double.parseDouble(s1);
                        double d2 = Double.parseDouble(s2);
                        double sumDouble = d1 + d2;

                        double diff = Math.abs(sumFloat - sumDouble);
                        System.out.printf("%.6f%n", diff);
                    }
                }
                break;

            default:
                // Opsional: Pesan jika input soal tidak dikenal
                // System.out.println("Soal tidak ditemukan.");
                break;
        }

        sc.close();
    }

    // Fungsi pengecekan overflow
    public static boolean isOverflow(int a, int b) {
        if (b > 0 && a > Integer.MAX_VALUE - b) {
            return true;
        }
        if (b < 0 && a < Integer.MIN_VALUE - b) {
            return true;
        }
        return false;
    }
}