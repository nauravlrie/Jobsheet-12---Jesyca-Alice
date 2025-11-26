public class Kafe11 {
    public static void Menu (String namaPelanggan, boolean isMember, String  kodePromo ) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setip pembelian! ");

        }

        if (kodePromo.equals("DISKON50")) {
        System.out.println("SELAMAT! Anda mendapatkan DISKON 50% untuk semua menu!");
    } else if (kodePromo.equals("DISKON30")) {
        System.out.println("SELAMAT! Anda mendapatkan DISKON 30% untuk semua menu!");
    } else if (!kodePromo.isEmpty()) {  // kalau diisi dengan kode yang tidak cocok
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
        System.out.println("Silakan pilih menu yang Anda inginkan.");
        System.out.println(); //baris kosong agar  rapi
    }
    //fungsi main program akan dimulai dari sini
    public static void main(String[] args) {
        //untuk memanggil fungsi menu yang tadi dibuat
        //akan memanggil panggilan e 1
        Menu("Budi", true, "DISKON30"); //Budi memiliki kode kupon untuk diskon 30%
        
    }
}
        
   