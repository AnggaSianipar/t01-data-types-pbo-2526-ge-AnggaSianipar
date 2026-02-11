//12S24032-Angga B. P. Sianipar

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNext()) {
            sc.close();
            return;
        }//mengecek apakah ada input atau tidak, jika tidak ada input agar program di hentikan 

        String soalKe = sc.next();//program membaca inputan pertama dari user 

        switch (soalKe)//pemilihan soal ke berapa dari inputan pertama itu 
         {
            case "Soal1":
                if (sc.hasNextInt()) {
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    if (isOverflow(a, b)) {
                        System.out.println("OVERFLOW");
                    } else {
                        System.out.println(a + b);
                    }//untuk mengecek apakah penjumlahan ini melewati batas penjumlahan int atau tidak 
                }
                break;

            case "Soal2":
                if (sc.hasNext()) {
                    String s1 = sc.next();
                    String s2 = sc.next();//membaca angka dalam bentuk string
                    float f1 = Float.parseFloat(s1);
                    float f2 = Float.parseFloat(s2);//mengubah ke float
                    double d1 = Double.parseDouble(s1);
                    double d2 = Double.parseDouble(s2);//mengubah ke double
                    
                    double diff = Math.abs((f1 + f2) - (d1 + d2));//menghitung hasil penjumlahan float dan double 
                    System.out.printf("%.6f%n", diff);
                }
                break;

            case "Soal3":
                if (sc.hasNextInt()) {
                    int n = sc.nextInt();
                    Integer a = n; // Autoboxing(int di bungkus jadi objek Integer)
                    Integer b = a; // b tidak menyalin nilai tapi merujuk ke objek yang sama 
                    a = a + 1;     // Nilai Integer itu Immutable, sehingga di buat objek baru 

                    System.out.println("==: " + (a == b));//membandingkan alamat objek
                    System.out.println("equals: " + a.equals(b));//membandingkan nilai 
                }
                break;

            case "Soal4":
                if (sc.hasNext()) {
                    String s = sc.next();
                    String a = s;//a dan s menunjuk ke objek yang sama 
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
                    //mengubah input string
                    
                    double hasil = valInt * valDouble;
                    if (!valBool) {
                        hasil = hasil * -1;//jika bololean false, hasil di buat negatif
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