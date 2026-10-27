import java.util.Scanner;

public class NilaiKelompok12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah kelompok: ");
        int jumlahKelompok = sc.nextInt();
        
        System.out.print("Masukkan jumlah penilai per kelompok: ");
        int jumlahPenilai = sc.nextInt();
        
        int i = 1;
        double rataTertinggi = -1;
        int kelompokTerbaik = 0;
        
        // Outer loop: Mengontrol perulangan untuk setiap kelompok
        while (i <= jumlahKelompok) {
            double totalNilai = 0;
            System.out.println("\n--- Penilaian Kelompok " + i + " ---");
            
            // Inner loop: Mengontrol perulangan untuk setiap penilai
            for (int j = 1; j <= jumlahPenilai; j++) {
                System.out.print("Masukkan nilai dari penilai ke-" + j + " (0-100): ");
                double nilai = sc.nextDouble();
                totalNilai += nilai;
            }
            
            // Menghitung rata-rata nilai kelompok
            double rataRata = totalNilai / jumlahPenilai;
            System.out.println("Rata-rata nilai Kelompok " + i + " = " + rataRata);
            
            // Mencari rata-rata tertinggi dan kelompok terbaik
            if (rataRata > rataTertinggi) {
                rataTertinggi = rataRata;
                kelompokTerbaik = i;
            }
            
            i++;
        }
        
        // Menampilkan hasil akhir
        System.out.println("\n==============================================");
        System.out.println("Kelompok dengan rata-rata tertinggi adalah Kelompok " + kelompokTerbaik + " dengan nilai " + rataTertinggi);
        System.out.println("==============================================");
        
        sc.close();
    }
}