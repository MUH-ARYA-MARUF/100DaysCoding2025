package com.mycompany.days24;
import java.util.Scanner;
public class Days24 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan jari jari lingkaran: ");   
        int rs = input.nextInt();
        
        double luas = 3.16*rs*rs;
       
        System.out.println("----Hasil----");
        System.out.println("Jari jari : "+rs);
        System.out.println("Luas lingkaran : "+luas);
        
        
        
        
    }
}
