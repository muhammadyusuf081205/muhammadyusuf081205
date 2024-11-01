import java.util.Scanner;

public class tgs1nilaimahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

        // Membuat array untuk menyimpan nilai mahasiswa
        int[] nilai = new int[jumlahMahasiswa];

        // Meminta pengguna memasukkan nilai setiap mahasiswa
        System.out.println("Masukkan nilai setiap mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = scanner.nextInt();
        }

        // Menghitung nilai rata-rata
        int totalNilai = 0;
        for (int nilaiMahasiswa : nilai) {
            totalNilai += nilaiMahasiswa;
        }
        double rataRata = (double) totalNilai / jumlahMahasiswa;

        // Mencari nilai tertinggi dan terendah
        int nilaiTertinggi = nilai[0];
        int nilaiTerendah = nilai[0];
        for (int nilaiMahasiswa : nilai) {
            if (nilaiMahasiswa > nilaiTertinggi) {
                nilaiTertinggi = nilaiMahasiswa;
            }
            if (nilaiMahasiswa < nilaiTerendah) {
                nilaiTerendah = nilaiMahasiswa;
            }
        }

        // Menampilkan hasil
        System.out.println("\nHasil:");
        System.out.println("Nilai rata-rata: " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        System.out.print("Semua nilai: ");
        for (int nilaiMahasiswa : nilai) {
            System.out.print(nilaiMahasiswa + " ");
        }
    }
}