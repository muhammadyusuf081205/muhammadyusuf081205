import java.util.Scanner;

public class arraynilai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int[10]; // Array dengan kapasitas 10 elemen

        // Mengisi array dengan nilai dari input pengguna
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-" + i + " : ");
            nilaiAkhir[i] = sc.nextInt();
        }

        // Menampilkan semua nilai yang telah diinputkan
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.println("Nilai akhir ke-" + i + " adalah " + nilaiAkhir[i]);
        }

        sc.close(); // Menutup Scanner setelah selesai
    }
}

