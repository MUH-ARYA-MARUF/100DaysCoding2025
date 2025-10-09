package javaapplication10;

import java.util.Scanner;

public class JavaApplication10 {
   public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Total belanja : ");
        double total = sc.nextDouble();
        
        System.out.print("Apakah punya kartu member? (true/false): ");
        boolean kartu = sc.nextBoolean();
        
        boolean dapatDiskon = (total >= 100000) || kartu;
        
        System.out.println("\nDapat diskon: "+dapatDiskon);
    }
    
}
