package com.mycompany.days25;
import java.util.Scanner;
public class Days25 {

    public static void main(String[] args) {
        Scanner ar = new Scanner (System.in);
        
        System.out.print("Masukkan nilai : ");
        int nilai = ar.nextInt();
        
        System.out.println("\n===Hasil Increment===");
        System.out.println("Nilai awal      : "+nilai);
        System.out.println("nilai++ (post)  : "+(nilai++));
        System.out.println("Setelah nilai++ : "+nilai);
        System.out.println("++nilai (pre)   : "+(++nilai));
        System.out.println("Setelah ++nilai : "+nilai);
        System.out.println("\n===Hasil Decrement===");
        System.out.println("nilai-- (post)  : "+(nilai--));
        System.out.println("Setelah nilai-- : "+nilai);
        System.out.println("--nilai (pre)   : "+(--nilai));
        System.out.println("Setelah --nilai : "+nilai);
   
    }
}
