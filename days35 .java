package javaapplication12;
import java.util.Scanner;
public class JavaApplication12 {
  public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan nilai : ");
        int nilai = sc.nextInt();
        
        if (nilai >= 75){
            System.out.println("Selamat anda lulus. ");
        }else{
            System.out.println("Maaf, anda belum lulus. ");
        }
    }
    
}
