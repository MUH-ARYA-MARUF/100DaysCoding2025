package javaapplication7;
import java.util.Scanner;
public class JavaApplication7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Angka : ");
        int a = sc.nextInt();
        System.out.print("Angka : ");
        int b = sc.nextInt();
               
        System.out.println("\nPerbandingan : ");
        System.out.println(a + " <= " +b+" = "+(a<=b));
        System.out.println(a + " >= " +b+" = "+(a>=b));
    }
    
}
