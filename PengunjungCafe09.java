public class PengunjungCafe09 {
    // static void daftarPengunjung(String... namaPengunjung) {
    //     System.out.println("Daftar nama pengunjung: ");

    //     for (String nama : namaPengunjung) {
    //         System.out.println("- " + nama);
    //     }
    // }

    static int hitungTotalBelanja(int... harga) {
        int total = 0;
        for (int i = 0; i < harga.length; i++) {
            total += harga[i];
        }
        System.out.println(total);

        return total;
    }

    public static void main(String[] args) {
        // String[] tamu = {"Ali", "Budi", "Citra"};
        // daftarPengunjung(tamu);

        hitungTotalBelanja(10000);
        hitungTotalBelanja(10000, 500, 4000);
        hitungTotalBelanja(10000, 5000, 1, 2, 90);
    }
}
