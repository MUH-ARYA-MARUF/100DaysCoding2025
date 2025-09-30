import java.util.Scanner;

public class days23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang: ");
        int panjang = input.nextInt();
        System.out.print("Masukkan lebar: ");
        int lebar = input.nextInt();
        int luas = panjang * lebar;
                
        System.out.println("\n=== Hasil Perhitungan ===");
        System.out.println("Panjang  = " + panjang);
  
    }
}
