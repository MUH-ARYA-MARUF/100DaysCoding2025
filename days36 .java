import java.util.Scanner;

public class NestedIfSingkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = sc.nextInt();

        if (nilai >= 60) {
            if (nilai >= 85) {
                System.out.println("Lulus dengan predikat A");
            } else {
                System.out.println("Lulus dengan predikat B");
            }
        } else {
            System.out.println("Tidak lulus");
        }
    }
}
