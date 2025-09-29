package com.mycompany.latihanpersegi;
import java.util.Scanner;
public class LatihanPersegi {

    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      
        System.out.print("Masukkan Panjang Persegi: ");
        
        int panjang = sc.nextInt();
        //Menghitung Luas
        int luas = panjang * panjang;
        
        //Menampilkan hasil
        System.out.println("Luas persegi adalah: "+luas);
    }
}
