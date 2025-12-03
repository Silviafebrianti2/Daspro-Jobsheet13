import java.util.Scanner;

public class Tugas_26 {

    static int jumlahRekursif(int[] data, int index) {
        if (index < 0) {
            return 0;    
        } else {
            return data[index] + jumlahRekursif(data, index - 1);
        }
    }

    static int jumlahIteratif(int[] data) {
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            total += data[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int N = sc.nextInt();

        int[] angka = new int[N];

        for (int i = N; i >= 1; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            angka[i - 1] = sc.nextInt();
        }

        int total = jumlahRekursif(angka, N - 1);

        System.out.println("Total dari " + N + " angka yang dimasukkan adalah: " + total);
    }
}
