package Aryaa;

import java.util.Scanner;

public class LogikaAND2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int umur = sc.nextInt();

        System.out.print("Apakah sudah terdaftar? (true/false): ");
        boolean terdaftar = sc.nextBoolean();

        boolean bolehMasuk = (umur >= 18) && terdaftar;

        System.out.println("\nBoleh ikut lomba: " + bolehMasuk);
    }
}
