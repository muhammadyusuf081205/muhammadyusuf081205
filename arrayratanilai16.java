import java.util.Scanner;

public class arrayratanilai16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahMahasiswa = 10;
        int totalNilai = 0;

        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            int nilai = scanner.nextInt();
            totalNilai += nilai;
        }

        double rataRata = (double) totalNilai / jumlahMahasiswa;
        System.out.println("Rata-rata nilai = " + rataRata);

        scanner.close();
    }
}