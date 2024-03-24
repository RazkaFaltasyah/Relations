package Relation;

import java.util.ArrayList;

public class KHS {
    private Mahasiswa mahasiswa;
    private ArrayList <MataKuliah> mataKuliahList;

    public KHS(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.mataKuliahList = new ArrayList<>();
    }

    public void tambahMataKuliah(MataKuliah mk) {
        mataKuliahList.add(mk);
    }

    public void cetakKHS() {
        System.out.println("---------------------------");
        System.out.println("Kartu Hasil Studi Mahasiswa");
        System.out.println("NIM : " + mahasiswa.getNim());
        System.out.println("Nama : " + mahasiswa.getNama());
        System.out.println("---------------------------");
        for (MataKuliah mk : mataKuliahList) {
            System.out.println("Daftar Mata Kuliah");
            System.out.println("Kode : " + mk.getKode());
            System.out.println("Nama MK : " + mk.getNamaMK());
            System.out.println("Nilai Huruf : " + mk.getNilaiHuruf());
            System.out.println("---------------------------");
        }
    }
}

