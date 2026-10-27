import java.util.Scanner;

public class Tugas312 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();
        
        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1.");
        } else {
            int totalBarangSeluruhToko = 0;
            int maxBarang = -1;
            int tokoTerbanyak = 0;
            
            for (int i = 1; i <= jumlahToko; i++) {
                System.out.println("\nToko " + i);
                System.out.print("Masukkan jumlah pelanggan: ");
                int jumlahPelanggan = sc.nextInt();
                
                while (jumlahPelanggan < 0) {
                    System.out.print("Jumlah pelanggan tidak boleh negatif. Ulangi input: ");
                    jumlahPelanggan = sc.nextInt();
                }
                
                int totalBarangToko = 0;
                for (int j = 1; j <= jumlahPelanggan; j++) {
                    System.out.print("  Jumlah barang pelanggan " + j + ": ");
                    int barang = sc.nextInt();
                    while (barang < 0) {
                        System.out.print("  Jumlah barang tidak boleh negatif! Ulangi input: ");
                        barang = sc.nextInt();
                    }
                    totalBarangToko += barang;
                }
                
                System.out.println("Toko " + i + "\npelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko);
                
                totalBarangSeluruhToko += totalBarangToko;
                
                if (totalBarangToko > maxBarang) {
                    maxBarang = totalBarangToko;
                    tokoTerbanyak = i;
                }
            }
            
            System.out.println("\n==================================");
            System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
            System.out.println("==================================");
        }
        
        sc.close();
    }
}