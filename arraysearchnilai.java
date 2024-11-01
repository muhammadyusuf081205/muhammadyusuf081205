import java.util.Scanner;

public class arraysearchnilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nilai array dari pengguna (opsional)
        System.out.print("Masukkan jumlah elemen array: ");
        int n = scanner.nextInt();
        int[] arrNilai = new int[n];
        System.out.println("Masukkan nilai-nilai array:");
        for (int i = 0; i < n; i++) {
            arrNilai[i] = scanner.nextInt();
        }

        // Atau gunakan array yang sudah ditentukan sebelumnya
        // int[] arrNilai = {80, 85, 78, 96, 90, 82, 86};

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = scanner.nextInt();

        int hasil = -1; // Inisialisasi dengan -1 untuk menandakan nilai tidak ditemukan
        for (int i = 0; i < arrNilai.length; i++) {
            if (arrNilai[i] == key) {
                hasil = i;
                break;
            }
        }

        if (hasil != -1) {
            System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + hasil);
        } else {
            System.out.println("Nilai " + key + " tidak ditemukan.");
        }

        scanner.close();
    }
}