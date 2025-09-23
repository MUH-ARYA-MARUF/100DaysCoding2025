import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);

        
        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();

        
        int hasilKali = angka1 * angka2;
        int hasilBagi = angka1 / angka2;

        
        System.out.println("\n=== Hasil ===");
        System.out.println("Perkalian: " + angka1 + " * " + angka2 + " = " + hasilKali);
        System.out.println("Pembagian: " + angka1 + " / " + angka2 + " = " + hasilBagi);

	}
}
