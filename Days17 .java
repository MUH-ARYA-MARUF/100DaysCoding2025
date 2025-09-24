import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
	       
        Scanner input = new Scanner(System.in);
      
        System.out.print("Masukkan angka pertama: ");
        int angkaA = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int angkaB = input.nextInt();
        
        int hasil = angkaA % angkaB;

        System.out.println("Hasil sisa bagi dari " + angkaA + " % " + angkaB + " = " + hasil);

	}
}
