package javaapplication11;

import java.util.Scanner;

public class JavaApplication11 {
   public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       System.out.print("Masukkan umur : ");
       int umur = sc.nextInt();       
       boolean tidakDewasa = !(umur>= 18);  
       
       System.out.println("Apakah kamu belum dewasa? : "+ tidakDewasa);
    }
    
}
