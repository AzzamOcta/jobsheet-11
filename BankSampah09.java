import java.util.Scanner;

public class BankSampah09 {
    
    static double[] inputSetoran(int n) {
        Scanner sc = new Scanner(System.in);

        double[] setoran = new double[n];

        System.out.println("Masukkan berat tiap nasabah: ");
        for (int i = 0; i < setoran.length; i++) {
            System.out.print("Nasabah ke " + (i + 1) + ": ");
            setoran[i] = sc.nextDouble();
        }

        return setoran;
    }

    static void tampilSetoran(double[] dataSetoran) {
        System.out.println("\n=== Menampilkan data seluruh nasabah ===");
        for (int i = 0; i < dataSetoran.length; i++) {
            System.out.println("Nasabah ke-" + (i + 1) + ": " + dataSetoran[i] + "kg");
        }
    }

    static double totalSetora(double[] dataSetoran) {
        double total = 0;

        for (int i = 0; i < dataSetoran.length; i++) {
            total += dataSetoran[i];
        }

        return total;
    }

    static double hitungSaldo (double[] dataSetoran, double saldo) {
        
        double totalSaldo = 0;
        for (int i = 0; i < dataSetoran.length; i++) {
            double saldoNasabah = saldo * dataSetoran[i];
            totalSaldo += saldoNasabah;
            System.out.println("Nasabah ke-" + (i + 1) + ": Rp" + (int)saldoNasabah);
        }
        return totalSaldo;
    }

    static double nasabahTerbanyak (double[] dataSetoran) {
        int index = 0;
        for (int i = 0; i < dataSetoran.length; i++) {
            if (dataSetoran[i] < dataSetoran[index]) {
                index = i;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double saldo = 3000;

        System.out.println("========== SETOR SAMPAH ==========");

        System.out.print("Masukkan jumlah nasabah: ");
        n = sc.nextInt();

        double[] dataSetoran = inputSetoran(n);

        tampilSetoran(dataSetoran);

        System.out.println("==== Berat Keseluruhan Sampah ===");
        double total = totalSetora(dataSetoran);
        System.out.println("total: " + total + "kg");

        System.out.println("==== Saldo Setelah Setor Sampah ====");
        hitungSaldo(dataSetoran, saldo);

        System.out.println("==== Nasabah yang Paling Banyak Setor Sampah ====");
        System.out.println("Nasabah ke-" + (int)nasabahTerbanyak(dataSetoran));
    }
}
