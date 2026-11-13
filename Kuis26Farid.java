import java.util.Scanner;
/**
 * Kuis26Farid
 */
public class Kuis26Farid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah pelanggan hari ini: ");
        int n = sc.nextInt();
        int totalBerat = 0;
        int totalBiaya = 0;
      

    
        for (int i = 1; i < n; i++) {
            int biaya;
            System.out.print("Berat cucian pelanggan ke-" + i + " (kg): ");
            int berat = sc.nextInt();
          
            if (berat <= 3) {
                biaya = 15000;
            } else {
                biaya = 15000 + (berat - 3) * 4000;
            }
            totalBiaya += 0;
            totalBiaya += biaya;
            totalBerat += berat;
            System.out.println("  Biaya: Rp " + biaya);
        }

        double rataBerat = totalBerat / n;
        System.out.println("=== REKAP HARIAN ===");
        System.out.println("Total pemasukan : Rp " + totalBiaya);
        System.out.println("Rata-rata berat : " + rataBerat + " kg");
    }
}
