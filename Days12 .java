import java.util.Scanner;

public class Arya {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        String nama, alamat;
        int umur;
        String hobi;
        int tinggi;
        
        System.out.print("Masukkan Nama   : ");
        nama = input.nextLine();
        System.out.print("Masukkan Umur   : ");
        umur = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan Alamat : ");
        alamat = input.nextLine();
        System.out.print("Masukkan Hobi   : ");
        hobi = input.nextLine();
        System.out.print("Masukkan Tinggi :");
        tinggi = input.nextInt();
        input.nextLine();

        
        System.out.println("\n_____ BIODATA _____");
        System.out.println("Nama   : " + nama);
        System.out.println("Umur   : " + umur + " tahun");
        System.out.println("Alamat : " + alamat);
        System.out.println("Hobi   : " + hobi);
        System.out.println("Tinggi  :"+ tinggi + "cm");

        
    }
}
