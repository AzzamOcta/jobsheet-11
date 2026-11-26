import java.util.Scanner;

public class luasLingkaranVoidParameter {
    static double  luasLingkaran() {
        Scanner sc = new Scanner(System.in);

        double r;
        double phi = 3.14;

        System.out.print("Masukkan jari: ");
        r = sc.nextDouble();

        double luas = phi * r * r;
        return luas;
    }

    public static void main(String[] args) {
        double L = luasLingkaran();

        System.out.println("Luas lingkaran: " + L);
    }
}
