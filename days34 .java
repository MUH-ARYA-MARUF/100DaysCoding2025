public class KombinasiOperator {
    public static void main(String[] args) {
        int a = 5, b = 8, c = 10;

        boolean hasil = ((a + b) > c) && (b != c) || (a % 2 == 0);

        System.out.println("Hasil : " + hasil);
    }
}
