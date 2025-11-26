import java.util.Scanner;

public class Kubus11 {        

    public static int luasPermukaan(int sisi) {
        int luas = 6 * sisi * sisi;
        return luas;
    }

    public static int volume(int sisi) {
        int vol = sisi * sisi * sisi;
        return vol;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== PROGRAM MENGHITUNG KUBUS ===");
        System.out.print("Masukkan panjang sisi kubus: ");
        int sisi = sc.nextInt();
        int luas = luasPermukaan(sisi);
        int vol  = volume(sisi);

        System.out.println("Luas permukaan kubus    = " + luas);
        System.out.println("Volume kubus            = " + vol);

        sc.close();
    }
}
