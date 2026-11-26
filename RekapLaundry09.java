import java.util.Scanner;

public class RekapLaundry09 {
    
    static int[][] data = new int[4][6];

    static void inputData(String[] layanan, String[] hari, int[] harga) {
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < data.length; i++) {
            System.out.println("Layanan " + layanan[i] + " (Rp" + harga[i] + " / kg): " );

            for (int j = 0; j < data[i].length; j++) {
                System.out.print("  Hari " + hari[j] + ": ");
                data[i][j] = sc.nextInt();
            }
        }

        // return data[4][6];
    }

    static void tampilData(String[] layanan, String[] hari, int[] harga) {
        for (int i = 0; i < data.length; i++) {
                System.out.print("Layanan " + layanan[i] + " (Rp" + harga[i] + " / kg): " );
    
                for (int j = 0; j < data[i].length; j++) {
                    System.out.print(" Hari " + hari[j] + ": " + data[i][j] + "kg  |");
                }
                System.out.println();
        }
    }

    static int totalPerLayanan(int[][] data, int idxLayanan) {
        int total = 0;

        for (int i = 0; i < data[idxLayanan].length; i++) {
            total += data[idxLayanan][i];
        }

        return total;
    }

    static void layananTerberat(int[][] data, String[] layanan) {
        int index = 0;
        int terberat = totalPerLayanan(data, 0);

        for (int i = 0; i < layanan.length; i++) {
            int totalSekarang = totalPerLayanan(data, i);

            if (totalSekarang > terberat) {
                terberat = totalSekarang;
                index = i;
            }
        }

        System.out.println("Layanan terberat: " + layanan[index] +", beratnya " + terberat);
    }

    static int hariTersibuk(int[][] data) {
        int index = 0;
        int terbesar = -1;

        for (int i = 0; i < data[0].length; i++) {
            int total = 0;

            for (int j = 0; j < data.length; j++) {
                total += data[j][i];
            }

            if (total > terbesar) {
                terbesar = total;
                index = i;
            }
        }

        return index;

    }

    static int totalPendapatan(int[][] data, int[] harga, String[] layanan) {
        int pendapatan = 0;

        for (int i = 0; i < layanan.length; i++) {
            int berat = totalPerLayanan(data, i);
            int pendLayanan = berat * harga[i];
            pendapatan += pendLayanan;
            System.out.println("Pendapatan " + layanan[i] + ": Rp" + pendLayanan);
        }

        return pendapatan;
    } 


    public static void main(String[] args) {
        String[] layanan = {"Cuci Kering", "Cuci Setrika", "Setrika Saja", "Ekspress"};
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu"};
        int[] harga = {6000, 8000, 5000, 12000};

        inputData(layanan, hari, harga);

        System.out.println("\n==== Tabel Keseluruhan ====");
        tampilData(layanan, hari, harga);

        System.out.println("==== Total per Layanan ====");

        for (int i = 0; i < harga.length; i++) {
            System.out.println("Layanan " + layanan[i] + ": " + totalPerLayanan(data, i));
        }

        System.out.println("==== Layanan dengan Cucian Terberat ====");
        layananTerberat(data, layanan);

        System.out.println("==== Hari tersibuk =====");
        int hariTersibuk = hariTersibuk(data);
        System.out.println("Hari tersibuk: " + hari[hariTersibuk]);

        System.out.println("==== Rekap Pendapatan ====");
        int rekapPendapatan = totalPendapatan(data, harga, layanan);
        System.out.println("Total pendapatan semua layanan: Rp" + rekapPendapatan);

        // tampilData(isiData, layanan, hari, harga);
    }
}
