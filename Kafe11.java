import java.util.Scanner;

public class Kafe11 {  
    public static int hitungTotalHargaNoAbsen(int pilihanMenu, int banyakItem, String kodePromo, boolean isMember) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int totalHarga = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equals("DISKON50")) {
            System.out.println("SELAMAT! Anda mendapatkan DISKON 50%");
            totalHarga = totalHarga * 50 / 100;    
        } 
        else if (kodePromo.equals("DISKON30")) {
            System.out.println("SELAMAT! Anda mendapatkan DISKON 30%"); //mendapatkan diskon sesuai kupon
            totalHarga = totalHarga * 70 / 100; }

        else if (!kodePromo.isEmpty()) {
            System.out.println("Maaf, kode promo '" + kodePromo + "' tidak valid atau sudah kadaluarsa.");
            // tidak ada pengurangan harga karena kode tidak valid
        }

        // Diskon member 10% (jika member)
        if (isMember) {
            System.out.println("Diskon member 10% juga diterapkan!");
            totalHarga = totalHarga * 90 / 100;     
        }

        return totalHarga;
    }

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("SELAMAT! Anda mendapatkan DISKON 50% untuk semua menu!");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("SELAMAT! Anda mendapatkan DISKON 30% untuk semua menu!");
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Maaf, kode promo '" + kodePromo + "' tidak valid atau sudah kadaluarsa.");
        }

        System.out.println();
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15.000");
        System.out.println("2. Cappuccino - Rp 20.000");
        System.out.println("3. Latte - Rp 22.000");
        System.out.println("4. Teh Tarik - Rp 12.000");
        System.out.println("5. Roti Bakar - Rp 10.000");
        System.out.println("6. Mie Goreng - Rp 18.000");
        System.out.println("==========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu("Budi", true, "DISKON30");

        System.out.print("Masukkan nomor menu yang ingin Anda pesan : ");
        int pilihanMenu = sc.nextInt();

        System.out.print("Masukkan jumlah item yang ingin dipesan   : ");
        int banyakItem = sc.nextInt();

        //fungsi yang sudah dimodifikasi
        int totalBayar = hitungTotalHargaNoAbsen(pilihanMenu, banyakItem, "DISKON30", true);

        System.out.println("\nTotal harga untuk pesanan Anda: Rp " + totalBayar);
        System.out.println("Terima kasih telah berkunjung!");

        sc.close();
    }
}