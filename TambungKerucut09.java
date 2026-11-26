
import java.util.Scanner;

public class TambungKerucut09 {
    static double luasLingkaran(double r) {
        double phi = 3.14;

        double lLing = phi * r * r;

        return lLing;
    }

    static double volumeTabung(double r, double t) {

        double vTab = luasLingkaran(r) * t;

        return vTab;
    }

    static double luasPermukaanTabung(double r, double t) {
        double phi = 3.14;

        double lPer = 2 * phi * r * (r + t);

        return lPer;
    }

    static double volumeKerucut(double r, double t) {
        double vKer = volumeTabung(r, t) / 3;

        return vKer;
    }

    public static void main(String[] args) {
// lanjutan void tanpa parameter
// Scanner sc = new Scanner(System.in);

//         int menu;
        
//         System.out.println("Menu Perhitungan Bangun Ruang");
//         System.out.println("1. Hitung Luas Lingkaran");
//         System.out.println("2. Hitung Volume Tabung");
//         System.out.println("3. Hitung Luas Permukaan Tabung");
//         System.out.println("4. Hitung Volume Kerucut");

//         do {

//             System.out.println("================================");
//             System.out.print("Pilih Menu (1-4), pilih (0) jika mau keluar: ");
//             menu = sc.nextInt();
    
//             if (menu == 1) {
//                 luasLingkaran();

//             } else if (menu == 2) {
//                 volumeTabung();

//             } else if (menu == 3) {
//                 luasPermukaanTabung();
                
//             } else if (menu == 4) {
//                 volumeKerucut();

//             } else if (menu == 0){
//                 System.out.println("Terimakasih Datang Kembali");
//                 break;

//             } else {
//                 System.out.println("Menu tidak valid, masukkan ulang menu");
//             }


//         } while (menu != 0);
//     }


        Scanner sc = new Scanner(System.in);

        int menu;
        
        System.out.println("Menu Perhitungan Bangun Ruang");
        System.out.println("1. Hitung Luas Lingkaran");
        System.out.println("2. Hitung Volume Tabung");
        System.out.println("3. Hitung Luas Permukaan Tabung");
        System.out.println("4. Hitung Volume Kerucut");

        do {
            double r, t;
            double lLing;
            double vTab;
            double lPer;
            double vKer;

            System.out.println("================================");
            System.out.print("Pilih Menu (1-4), pilih (0) jika mau keluar: ");
            menu = sc.nextInt();
    
            if (menu == 1) {
                System.out.println("\nHitung Luas Lingkaran");
                System.out.print("Masukkan jari-jari: ");
                r = sc.nextDouble();

                lLing = luasLingkaran(r);

                System.out.println("Luas lingkaran = " + lLing);

            } else if (menu == 2) {
                System.out.println("\nHitung Volume Tabung");
                System.out.print("Masukkan jari-jari: ");
                r = sc.nextDouble();
                
                System.out.print("Masukkan tinggi: ");
                t = sc.nextDouble();

                vTab = volumeTabung(r, t);
                System.out.println("Volume tabung = " + vTab);

            } else if (menu == 3) {
                System.out.println("\nHitung Luas Permukaan Tabung");
                System.out.print("Masukkan jari-jari: ");
                r = sc.nextDouble();
                
                System.out.print("Masukkan tinggi: ");
                t = sc.nextDouble();

                lPer = luasPermukaanTabung(r, t);
                System.out.println("Luas permukaan tabung = " + lPer);
                
            } else if (menu == 4) {
                System.out.println("\nHitung Volume Kerucut");
                System.out.print("Masukkan jari-jari: ");
                r = sc.nextDouble();
                
                System.out.print("Masukkan tinggi: ");
                t = sc.nextDouble();

                vKer = volumeKerucut(r, t);
                System.out.println("Volume kerucut = " + vKer);

            } else if (menu == 0){
                System.out.println("Terimakasih Datang Kembali");
                break;

            } else {
                System.out.println("Menu tidak valid, masukkan ulang menu");
            }


        } while (menu != 0);
    }




    // hanya fungsi main saja

    // int menu;

    // Scanner sc = new Scanner(System.in);
        
    // System.out.println("Menu Perhitungan Bangun Ruang");
    // System.out.println("1. Hitung Luas Lingkaran");
    // System.out.println("2. Hitung Volume Tabung");
    // System.out.println("3. Hitung Luas Permukaan Tabung");
    // System.out.println("4. Hitung Volume Kerucut");

    // do {
    //     double r, t;
    //     double lLing;
    //     double vTab;
    //     double lPer;
    //     double vKer;
    //     double phi = 3.14;

    //     System.out.println("================================");
    //     System.out.print("Pilih Menu (1-4), pilih (0) jika mau keluar: ");
    //     menu = sc.nextInt();
    
    //     if (menu == 1) {
    //         System.out.println("\nHitung Luas Lingkaran");
    //         System.out.print("Masukkan jari-jari: ");
    //         r = sc.nextDouble();

    //         lLing = r * r;

    //         System.out.println("Luas lingkaran = " + lLing);

    //     } else if (menu == 2) {
    //         System.out.println("\nHitung Volume Tabung");
    //         System.out.print("Masukkan jari-jari: ");
    //         r = sc.nextDouble();
                
    //         System.out.print("Masukkan tinggi: ");
    //         t = sc.nextDouble();

    //         vTab = phi * r * r * t;
    //         System.out.println("Volume tabung = " + vTab);

    //     } else if (menu == 3) {
    //         System.out.println("\nHitung Luas Permukaan Tabung");
    //         System.out.print("Masukkan jari-jari: ");
    //         r = sc.nextDouble();
                
    //         System.out.print("Masukkan tinggi: ");
    //         t = sc.nextDouble();

    //         lPer = 2 * phi * r * (r + t);
    //         System.out.println("Luas permukaan tabung = " + lPer);
                
    //     } else if (menu == 4) {
    //         System.out.println("\nHitung Volume Kerucut");
    //         System.out.print("Masukkan jari-jari: ");
    //         r = sc.nextDouble();
                
    //         System.out.print("Masukkan tinggi: ");
    //         t = sc.nextDouble();

    //         vKer = phi * r * r * t /3;
    //         System.out.println("Volume kerucut = " + vKer);

    //     } else if (menu == 0){
    //         System.out.println("Terimakasih Datang Kembali");
    //         break;

    //     } else {
    //         System.out.println("Menu tidak valid, masukkan ulang menu");
    //     }


    // } while (menu != 0);



    // void tanpa parameter

        
    

    // static void luasLingkaran() {
    //     Scanner sc = new Scanner(System.in);

    //     double r;
    //     double phi = 3.14;
    //     double lLing;

    //     System.out.print("Masukkan jari jari: ");
    //     r = sc.nextDouble();

    //     lLing = phi * r * r;
    //     System.out.println("Luas lingkaran: " + lLing);
    // }

    // static void volumeTabung() {
    //     Scanner sc = new Scanner(System.in);

    //     double r, t;
    //     double phi = 3.14;
    //     double vTab;

    //     System.out.print("Masukkan jari jari: ");
    //     r = sc.nextDouble();

    //     System.out.print("Masukkan tinggi: ");
    //     t = sc.nextDouble();

    //     vTab = phi * r * r * t;
    //     System.out.println("Luas lingkaran: " + vTab);
    // }

    // static void luasPermukaanTabung() {
    //     Scanner sc = new Scanner(System.in);

    //     double r, t;
    //     double phi = 3.14;
    //     double lP;

    //     System.out.print("Masukkan jari jari: ");
    //     r = sc.nextDouble();

    //     System.out.print("Masukkan tinggi: ");
    //     t = sc.nextDouble();

    //     lP = 2 * phi * r * (r + t);
    //     System.out.println("Luas Permukaan tabung: " + lP);
    // }

    // static void volumeKerucut() {
    //     Scanner sc = new Scanner(System.in);

    //     double r, t;
    //     double phi = 3.14;
    //     double vKer;

    //     System.out.print("Masukkan jari jari: ");
    //     r = sc.nextDouble();

    //     System.out.print("Masukkan tinggi: ");
    //     t = sc.nextDouble();

    //     vKer = phi * r * r * t / 3;
    //     System.out.println("Volume Kerucut: " + vKer);
    // }
}


