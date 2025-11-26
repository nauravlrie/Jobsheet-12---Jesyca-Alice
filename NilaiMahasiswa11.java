import java.util.Scanner;

public class NilaiMahasiswa11 {        // Ganti 11 dengan nomor absenmu

    // a. Fungsi untuk mengisi array (input dari user)
    public static void isianArray(double[] nilai, int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan " + n + " nilai mahasiswa:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i+1) + " : ");
            nilai[i] = sc.nextDouble();
        }
    }

    // b. Fungsi untuk menampilkan seluruh nilai
    public static void tampilArray(double[] nilai) {
        System.out.println("\nDaftar nilai mahasiswa:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa ke-" + (i+1) + " = " + nilai[i]);
        }
    }

    // c. Fungsi untuk menghitung total nilai (return double)
    public static double hitTot(double[] nilai) {
        double total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total = total + nilai[i];
        }
        return total;
    }

    // d. Fungsi main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int N = sc.nextInt();

        // Membuat array dengan ukuran N
        double[] nilaiMhs = new double[N];

        // Memanggil fungsi-fungsi
        isianArray(nilaiMhs, N);      // isi nilai
        tampilArray(nilaiMhs);        // tampilkan semua nilai
        double totalNilai = hitTot(nilaiMhs);  // hitung total
        
        // Tampilkan total nilai
        System.out.println("\nTotal nilai semua mahasiswa = " + totalNilai);

        sc.close();
    }
}