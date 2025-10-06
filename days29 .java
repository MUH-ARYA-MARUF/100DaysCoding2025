package javaapplication5;
import java.util.Scanner;
public class JavaApplication5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Masukkan angka pertama : ");
        int angka1 = sc.nextInt();
        System.out.print("Masukkan angka kedua : ");
        int angka2 = sc.nextInt();
        
        System.out.println(angka1 + " < " +angka2+ " = " +(angka1 < angka2));
        System.out.println(angka1 + " > " +angka2+ " = " +(angka1 > angka2));
    }
   
}
