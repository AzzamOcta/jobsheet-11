
import java.util.Scanner;

public class HitungBalok09 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int p, l, t, L, vol;

    //     System.out.print("Masukkan panjang: ");
    //     p = sc.nextInt();

    //     System.out.print("Masukkan lebar: ");
    //     l= sc.nextInt();

    //     System.out.print("Masukkan tinggi: ");
    //     t = sc.nextInt();


    //     L= p * l;
    //     System.out.println("Luas persegi panjang adalah " + L);
    //     vol = p * l * t;
    //     System.out.println("Volume balok adalah " + vol);
    // }



    static int hitungLuas (int pjg, int lbr) {
        int Luas = pjg * lbr;
        return Luas;
    }

    static int hitungVolume (int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p, l, t, L, vol, LP;

        System.out.print("Masukkan panjang: ");
        p = sc.nextInt();

        System.out.print("Masukkan lebar: ");
        l= sc.nextInt();

        System.out.print("Masukkan tinggi: ");
        t = sc.nextInt();


        L = hitungLuas(p, l);
        System.out.println("Luas persegi panjang adalah " + L);
        vol = hitungVolume(t, p, l);
        System.out.println("Volume balok adalah " + vol);
        LP = hitungLuasPermukaanBalok(p, l, t);
        System.out.println("Luas Permukaan Balok adalah " + LP);
    }

    static int hitungLuasPermukaanBalok(int p, int l, int t) {
        int LP = 2 * ((hitungLuas(p, l)) + hitungLuas(p, t) + hitungLuas(t, l));
        return LP;
    }



}
