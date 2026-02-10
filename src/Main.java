import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNext()) {
            sc.close();
            return;
        }

        String soalKe = sc.next();

        switch (soalKe) {
            case "Soal1":
                if (sc.hasNextInt()) {
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    if (isOverflow(a, b)) {
                        System.out.println("OVERFLOW");
                    } else {
                        System.out.println(a + b);
                    }
                }
                break;

            case "Soal2":
                if (sc.hasNext()) {
                    String s1 = sc.next();
                    String s2 = sc.next();
                    float f1 = Float.parseFloat(s1);
                    float f2 = Float.parseFloat(s2);
                    double d1 = Double.parseDouble(s1);
                    double d2 = Double.parseDouble(s2);
                    
                    double diff = Math.abs((f1 + f2) - (d1 + d2));
                    System.out.printf("%.6f%n", diff);
                }
                break;

            case "Soal3":
                if (sc.hasNextInt()) {
                    int n = sc.nextInt();
                    Integer a = n; // Autoboxing
                    Integer b = a; // Copy reference
                    a = a + 1;     // Nilai a berubah (objek baru dibuat karena Integer immutable)

                    System.out.println("==: " + (a == b));
                    System.out.println("equals: " + a.equals(b));
                }
                break;

            case "Soal4":
                if (sc.hasNext()) {
                    String s = sc.next();
                    String a = s;
                    String b = new String(s); // Objek baru di heap
                    a = a + "X"; // String bersifat immutable, 'a' sekarang merujuk ke objek baru

                    System.out.println("==: " + (a == b));
                    System.out.println("equals: " + a.equals(b));
                }
                break;

            case "Soal5":
                if (sc.hasNext()) {
                    int valInt = Integer.parseInt(sc.next());
                    double valDouble = Double.parseDouble(sc.next());
                    boolean valBool = Boolean.parseBoolean(sc.next());

                    double hasil = valInt * valDouble;
                    if (!valBool) {
                        hasil = hasil * -1;
                    }
                    System.out.printf("%.2f%n", hasil);
                }
                break;
        }

        sc.close();
    }

    public static boolean isOverflow(int a, int b) {
        if (b > 0 && a > Integer.MAX_VALUE - b) return true;
        if (b < 0 && a < Integer.MIN_VALUE - b) return true;
        return false;
    }
}