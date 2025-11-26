public class PengunjungCafe11 {
    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");

        for (String nama : namaPengunjung) { //menggunakan foor each loop
        System.out.println("- " + nama);
        }
        System.out.println();
    }

    //fungsi main
    public static void main(String[] args) {
        //pemanggil 1
        daftarPengunjung("Ali", "Budi", "Citra");
        //pemanggil 2
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eka", "Fahmi", "Galih");
        //pemanggil 3
        daftarPengunjung();
    }
}

