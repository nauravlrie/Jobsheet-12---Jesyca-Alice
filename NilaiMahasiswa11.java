import java.util.Scanner;

public class NilaiMahasiswa11 {  

   
    public static void isianArray(double[] nilai, int n) {
        Scanner sc = new Scanner(System.in);  //untuk mengisi array
        System.out.println("Masukkan " + n + " nilai mahasiswa:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i+1) + " : ");
            nilai[i] = sc.nextDouble();
        }
    }

   
    public static void tampilArray(double[] nilai) { //untuk menampilkan seluruh nilai
        System.out.println("\nDaftar nilai mahasiswa:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa ke-" + (i+1) + " = " + nilai[i]);
        }
    }

    
    public static double hitTot(double[] nilai) { //untuk menghitung total nilai (return double)
        double total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total = total + nilai[i];
        }
        return total;
    }

    //fungsi main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int N = sc.nextInt();

        //membuat array dengan ukuran N
        double[] nilaiMhs = new double[N];

        //memanggil fungsi-fungsi
        isianArray(nilaiMhs, N);      
        tampilArray(nilaiMhs);        
        double totalNilai = hitTot(nilaiMhs); 
        
        System.out.println("\nTotal nilai semua mahasiswa = " + totalNilai);

        sc.close();
    }
}