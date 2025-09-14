public class Arya {
	public static void main(String[] args) {
		
        // Tipe data char
        char huruf = 'b';
        char simbol = '@';
        char angka = '9';

        // Tampilkan nilai char
        System.out.println("Huruf: " + huruf);
        System.out.println("Simbol: " + simbol);
        System.out.println("Angka dalam bentuk char: " + angka);

        // Tipe data boolean
        boolean isHurufBesar = Character.isUpperCase(huruf);
         // Mengecek apakah huruf kapital
        boolean isAngka = Character.isDigit(angka); 
        // Mengecek apakah angka

        // Tampilkan hasil boolean
        System.out.println("Apakah '" + huruf + "' huruf kapital? " + isHurufBesar);
        System.out.println("Apakah '" + angka + "' adalah angka? " + isAngka);
    
	}
}
