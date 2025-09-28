	public class Days21 {
    public static void main(String[] args) {
        int ab = 100;
        int bc = 200;
        System.out.println("_____Sebelum ditukar:_____");
        System.out.println("ab = " + ab);
        System.out.println("bc = " + bc);

        int temp = ab;
        ab = bc;
        bc = temp;

        System.out.println("\n_____Setelah ditukar:_____");
        System.out.println("ab = " + ab);
        System.out.println("bc = " + bc);
	}
}
