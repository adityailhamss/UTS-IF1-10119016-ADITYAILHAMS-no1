package uts.if1.pkg10119016.adityailhams.no1;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author aditi
 * NAMA              :Aditya Ilham Subagja
 * Kelas             :IF1
 * NIM               :10119016
 * Deskripsi Program :program ini berisi program umur
 */
public class Main {

    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        Age umur = new Age(2020);
        System.out.print("Masukkan Tahun Lahir Anda : ");
        umur.setYearBirth(scanner.nextInt());
        System.out.println();
        System.out.println("======Hasil Perhitungan Umur======");
        int yearBirth = umur.getYearBirth();
        System.out.println("Tahun Lahir Anda : " + yearBirth);
        int yearNow = umur.getYearNow();
        System.out.println("Hari ini Tahun : " + yearNow);
        int usia = umur.hitungUmur();
        System.out.println("Umur kamu sampai hari ini adalah " + usia + " tahun");
        System.out.println("Tandanya Kamu " + umur.tandanyaKamu(usia));
    }
    
}
