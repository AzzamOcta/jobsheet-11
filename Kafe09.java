import java.util.Scanner;

public class Kafe09 {
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo ) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian");
        }

        if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Selamat anda mendapatkan potongan 30%");
        } else if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Selamat anda mendapatkan potongan 50%");
        }

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
        double promo = 0;
        double diskon = 0;
        double potongan = 0;
        double hasil = 0;

        
        if(kodePromo.equalsIgnoreCase("DISKON50")) {
            diskon = 0.5;
            potongan = totalHarga * diskon;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            diskon = 0.3;
            potongan = totalHarga * diskon;
        }
        
        if (isMember) {
            promo = potongan * 0.1;
            hasil = totalHarga - potongan - promo;
            return  hasil;
        } else {
            return potongan;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String nama;
        String member;
        int pilihanMenu;
        int banyakItems;
        String lanjut = "y";
        String lanjutDiskon = "y";
        int i = 0;
        int totalHarga = 0;
        String kodePromo;
        double total = 0;
        

        System.out.print("Masukkan nama anda: ");
        nama = sc.nextLine();

        System.out.print("Apakah anda punya member? (y/t): ");
        member = sc.nextLine();

        do {
            System.out.print("Masukkan kode promo: ");
            kodePromo = sc.nextLine();

            if (!kodePromo.equalsIgnoreCase("DISKON50") && !kodePromo.equalsIgnoreCase("DISKON30")) {
                System.out.println("Kode promo invalid");
                System.out.print("Masukkan kode promo lagi? (y/t): ");
                lanjutDiskon = sc.nextLine();

            } else {
                break;
            }
        } while (lanjutDiskon.equalsIgnoreCase("y"));

        
        Menu(nama, member.equalsIgnoreCase("y"), kodePromo);

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

        System.out.println("Total harga untuk pesanan anda: Rp" + totalHarga);

        total = hitungDiskon(totalHarga, kodePromo, member.equalsIgnoreCase("y"));

        System.out.println("Total harga setelah diskon: Rp" + total);
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
