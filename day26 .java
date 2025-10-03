package com.mycompany.days26;
import java.util.Scanner;
public class Days26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan nilai awal : ");
        int a = sc.nextInt();
        
        System.out.println("\nNilai awal a = "+a);
        
        //Penugasan
        a += 9;
        System.out.println("Setelah a += 9 -> "+ a);
        a -= 3;
        System.out.println("Setelah a -= 3 -> "+ a);
        a *= 2;
        System.out.println("Setelah a *= 2 -> "+ a);
        a /= 4;
        System.out.println("Setelah a /= 4 -> "+ a);
        a %= 5;
        System.out.println("Setelah a %= 5 -> "+ a);
    }
}
