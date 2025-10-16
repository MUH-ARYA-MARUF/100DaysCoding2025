import java.util.Scanner;

public class MenuMinuman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== MENU MINUMAN =====");
        System.out.println("1. Es Teh");
        System.out.println("2. Kopi Hitam");
        System.out.println("3. Jus Jeruk");
        System.out.println("4. Air Mineral");
        System.out.println("========================");
        System.out.print("Masukkan pilihan (1-4): ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.println("Anda memilih Es Teh. Harga: Rp5.000");
        } else if (pilihan == 2) {
            System.out.println("Anda memilih Kopi Hitam. Harga: Rp8.000");
        } else if (pilihan == 3) {
            System.out.println("Anda memilih Jus Jeruk. Harga: Rp10.000");
        } else if (pilihan == 4) {
            System.out.println("Anda memilih Air Mineral. Harga: Rp3.000");
        } else {
            System.out.println("Pilihan tidak valid!");
        }

        System.out.println("Terima kasih sudah memesan!");
    }
}
