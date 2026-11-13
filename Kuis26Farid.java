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
        int terTinggi = 0; 
        int lebihDari3Kg = 0; 
      

    
        for (int i = 1; i < n; i++) {
            int biaya;
            System.out.print("Berat cucian pelanggan ke-" + i + " (kg): ");
            int berat = sc.nextInt();
          
            if (berat <= 3) {
                biaya = 15000;
            } else {
                biaya = 15000 + (berat - 3) * 4000;
            }
            double rataBerat = totalBerat / n;
            totalBiaya += 0;
            totalBiaya += biaya;
            totalBerat += berat;  
            
            int kg;
            if (kg > terTinggi){  // tugas 2
                    terTinggi = kg;
                }
                if (kg > 3) {
                    lebihDari3Kg++; //tugas 2

                }
            }
        }
        System.out.println("  Biaya: Rp " + biaya);

        System.out.println("=== REKAP HARIAN ===");
        System.out.println("Total pemasukan : Rp " + totalBiaya);
        System.out.println("Rata-rata berat : " + rataBerat + " kg");
        System.out.println("parkir terlama: "+ terTinggi +"jam");
        System.out.println("parkir lebih dari 3 jam : " + lebihDari3Kg + "kendaraan");

    }
}
