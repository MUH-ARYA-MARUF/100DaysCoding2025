import java.util.Scanner;
public class aryaa {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka besar (long) :");
        long angkaLong = input.nextLong();
        System.out.println("Nilai long :"+ angkaLong);
        byte angkaByte = (byte) angkaLong ;
        System.out.println("Nilai short :"+ angkaByte);
        
    }
}
