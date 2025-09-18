	import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine(); 
        System.out.print("Masukkan umur: ");
        int umur = input.nextInt(); 
        System.out.println("Haiiii " + nama + ", umur Anda " + umur + " tahun.");

        	
	}
}
