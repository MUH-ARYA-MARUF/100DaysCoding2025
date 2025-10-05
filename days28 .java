package aryaa;
import java.util.Scanner;
public class Aryaa {
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
        System.out.print("Angka : ");
        int angka1 = sc.nextInt();
        System.out.print("Angka : ");
        int angka2 = sc.nextInt();
        
        
        System.out.println("\n >>>Perbandingan<<<");
        System.out.println("Apakah kedua angka sama? "+ (angka1 == angka2));
        System.out.println("Apakah kedua angka beda? "+ (angka1 != angka2));
        
    }
    
}
