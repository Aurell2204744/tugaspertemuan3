package pbo.pkg1;

import java.util.Scanner;

public class PBO2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menerima input untuk nilai rangking
        System.out.println("Masukkan nilai ranking:");
        int rangking = scanner.nextInt();

        // Menerima input untuk status naik kelas (ya/tidak)
        System.out.println("Apakah naik kelas? (ya/tidak):");
        String naikKelasStr = scanner.next();

        // Konversi input status naik kelas ke bentuk boolean
        boolean naikKelas;
        if (naikKelasStr.equalsIgnoreCase("ya")) {
            naikKelas = true;
        } else {
            naikKelas = false;
        }

        // Ekspresi untuk menentukan apakah seseorang akan mendapatkan hadiah atau tidak
        boolean mendapatkanHadiah = (ranking == 1) && naikKelas;

        // Menampilkan hasil
        if (mendapatkanHadiah) {
            System.out.println("Selamat! Anda akan mendapatkan hadiah.");
        } else {
            System.out.println("Maaf, Anda tidak akan mendapatkan hadiah.");
        }
        scanner.close();
    }
}
