import java.util.Scanner;

public class Kafe09 {
    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian");
        }

        // if (jamKunjungan >= 14 && jamKunjungan <= 16) {
        //     System.out.println("Happy Hour! Diskon 20% untuk semua minuman");
        // }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHarga09(int pilihanMenu, int banyakItems, int i) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItems;
        return hargaTotal;
    }

    public static double hitungDiskon(int totalHarga, String kodePromo, boolean isMember) {
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String nama;
        String member;
        // int jam;
        int pilihanMenu;
        int banyakItems;
        String lanjut = "y";
        int i = 0;
        int totalHarga = 0;

        System.out.print("Masukkan nama anda: ");
        nama = sc.nextLine();

        System.out.print("Apakah anda punya member? (y/t): ");
        member = sc.nextLine();

        // System.out.print("Jam berapa anda berkunjung: ");
        // jam = sc.nextInt();

        
        Menu(nama, member.equalsIgnoreCase("y"));

        do {
            System.out.print("Pilih menu (1-6): ");
            pilihanMenu = sc.nextInt();

            if (pilihanMenu <= 0 || pilihanMenu > 6) { //B
                System.out.println("Menu tidak tersedia. pilih ulang (1-6)");
                continue;
            }
    
            System.out.print("Masukkan jumlah item: ");
            banyakItems = sc.nextInt();
            sc.nextLine();
            i++;

            System.out.print("Beli pesanan lain? (y/t): "); //A
            lanjut = sc.nextLine();
    
            totalHarga += hitungTotalHarga09(pilihanMenu, banyakItems, i);
            
        } while (lanjut.equalsIgnoreCase("y"));

        System.out.println("Total harga untuk pesanan anda: " + totalHarga);
    }

    // public static void ubahNama(String nama) {
    //     nama = "Tamu";
    //     System.out.println("Didalam fungsi: " + nama);
    // }

    // public static void main(String[] args) {
    //     String nama = "Andi";
    //     ubahNama(nama);
    //     System.out.println("Di main: " + nama);
    // }
}
