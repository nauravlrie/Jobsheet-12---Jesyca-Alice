import java.util.Scanner;

public class RekapPenjualanCafe11 { 

    //menginput data penjualan menggunakan array 2D
    public static void inputData(int[][] penjualan) {
        Scanner sc = new Scanner(System.in);
        String[] menu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};
        
        System.out.println("=== INPUT DATA PENJUALAN 7 HARI ===");
        for (int i = 0; i < penjualan.length; i++) {        
            System.out.println("\nMenu: " + menu[i]);
            for (int j = 0; j < penjualan[i].length; j++) { 
                System.out.print("  Hari ke-" + (j+1) + " : ");
                penjualan[i][j] = sc.nextInt();
            }
        }
    }

    public static void tampilkanTabel(int[][] penjualan) {
        String[] menu = {"Kopi         ", "Teh          ", "Es Kelapa Muda", "Roti Bakar   ", "Gorengan     "};
        
        System.out.println("\n=== REKAP PENJUALAN CAFE (7 HARI) ===");
        System.out.println("Menu           | H1 | H2 | H3 | H4 | H5 | H6 | H7 | Total");
        System.out.println("-----------------------------------------------------------");
        
        for (int i = 0; i < penjualan.length; i++) {
            System.out.print(menu[i] + " | ");
            int totalMenu = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j] + " | ");
                totalMenu += penjualan[i][j];
            }
            System.out.println(" " + totalMenu);
        }
    }

    //mencari menu dengan penjualan tertinggi  selama 7 hari
    public static void menuTerlaris(int[][] penjualan) {
        String[] menu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};
        int max = 0;
        String namaMenu = "";
        
        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            if (total > max) {
                max = total;
                namaMenu = menu[i];
            }
        }
        System.out.println("\nMenu terlaris (7 hari): " + namaMenu + " → " + max + " cup/porsi");
    }

    //menghitung  rata-rata penjualan tiap menu
    public static void rataRataPerMenu(int[][] penjualan) {
        String[] menu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};
        
        System.out.println("\n=== RATA-RATA PENJUALAN PER MENU (7 HARI) ===");
        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            double rata = (double) total / 7;
            System.out.println(menu[i] + " → " + String.format("%.2f", rata) + " per hari");
        }
    }

    public static void main(String[] args) {
        int[][] penjualan = new int[5][7];  //5 menu dalam 7 hari

        inputData(penjualan);         
        tampilkanTabel(penjualan);    
        menuTerlaris(penjualan);      
        rataRataPerMenu(penjualan);   
    }
}