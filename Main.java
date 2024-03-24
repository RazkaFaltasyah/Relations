package Relation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan NIM Mahasiswa : ");
        String nim = scanner.nextLine();

        System.out.print("Masukkan Nama Mahasiswa : ");
        String nama = scanner.nextLine();

        Mahasiswa mahasiswa = new Mahasiswa(nim, nama);
        KHS khsMhsw = new KHS(mahasiswa);

        System.out.print("Masukkan Jumlah Mata Kuliah : ");
        int jumlahMK = scanner.nextInt();

        scanner.nextLine(); 

        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("Masukkan Kode Mata Kuliah : ");
            String kodeMK = scanner.nextLine();

            System.out.print("Masukkan Nama Mata Kuliah : ");
            String namaMK = scanner.nextLine();

            System.out.print("Masukkan Nilai Angka : ");
            int nilaiAngka = scanner.nextInt();

            scanner.nextLine();

            MataKuliah mk = new MataKuliah(kodeMK, namaMK, nilaiAngka);
            khsMhsw.tambahMataKuliah(mk);
        }

        khsMhsw.cetakKHS();

        scanner.close();
    }
}
