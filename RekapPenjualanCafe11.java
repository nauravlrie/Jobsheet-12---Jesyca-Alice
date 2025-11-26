import java.util.Scanner;

public class RekapPenjualanCafe11 {

    public static void inputData(int[][] data) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n=== MASUKKAN DATA PENJUALAN ===");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Menu ke-" + (i+1) + ":");
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("   Hari ke-" + (j+1) + " : ");
                data[i][j] = sc.nextInt();
            }
        }
        System.out.println();
    }

    public static void tampilkanTabel(int[][] data) {
        System.out.println("\n" + "=".repeat(70));
        System.out.println("           REKAP PENJUALAN CAFE - IBU MARIANA");
        System.out.println("=".repeat(70));

        System.out.printf("%-12s", "Menu");
        for (int j = 0; j < data[0].length; j++) {
            System.out.printf(" | H%d", j+1);
        }
        System.out.println(" | Total");
        System.out.println("-".repeat(70));

        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-12s", "Menu " + (i+1));  
            int total = 0;
            for (int j = 0; j < data[i].length; j++) {
                System.out.printf(" | %2d", data[i][j]);
                total += data[i][j];
            }
            System.out.printf(" | %3d\n", total);
        }
        System.out.println("=".repeat(70));
    }

    public static void menuTerlaris(int[][] data) {
        int max = 0;
        int idx = 0;
        for (int i = 0; i < data.length; i++) {
            int sum = 0;
            for (int x : data[i]) sum += x;
            if (sum > max) {
                max = sum;
                idx = i;
            }
        }
        System.out.println("\nMenu terlaris: Menu " + (idx+1) + " → " + max + " porsi");
    }

    public static void rataRataPerMenu(int[][] data) {
        System.out.println("\nRATA-RATA PENJUALAN PER MENU:");
        for (int i = 0; i < data.length; i++) {
            int sum = 0;
            for (int x : data[i]) sum += x;
            double rata = (double)sum / data[i].length;
            System.out.printf("Menu %d → %.2f porsi/hari\n", i+1, rata);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("REKAP PENJUALAN CAFE - IBU MARIANA");
        System.out.print("Masukkan jumlah menu : ");
        int menu = sc.nextInt();
        System.out.print("Masukkan jumlah hari : ");
        int hari = sc.nextInt();

        int[][] penjualan = new int[menu][hari];

        inputData(penjualan);
        tampilkanTabel(penjualan);
        menuTerlaris(penjualan);
        rataRataPerMenu(penjualan);

        System.out.println("\nRekap selesai. Terima kasih!");
        sc.close();
    }
}