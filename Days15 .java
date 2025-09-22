import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();

        int tambah = a + b;
        int kurang = a - b;

        System.out.println("\nHasil Penjumlahan = " + tambah);
        System.out.println("Hasil Pengurangan = " + kurang);

	}
}
