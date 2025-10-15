import java.util.Scanner;

public class PositifNegatifNol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = sc.nextInt();

        if (bilangan > 0) {
            System.out.println(bilangan + " adalah bilangan positif.");
        } else if (bilangan < 0) {
            System.out.println(bilangan + " adalah bilangan negatif.");
        } else {
            System.out.println("Bilangan tersebut adalah nol.");
        }
    }
}
