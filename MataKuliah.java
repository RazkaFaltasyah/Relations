package Relation;

public class MataKuliah {
    private String kode;
    private String namaMK;
    private int nilaiAngka;

    public MataKuliah(String kode, String namaMK, int nilaiAngka) {
        this.kode = kode;
        this.namaMK = namaMK;
        this.nilaiAngka = nilaiAngka;
    }

    public String getKode() {
        return kode;
    }

    public String getNamaMK() {
        return namaMK;
    }

    public String getNilaiHuruf() {
        if (nilaiAngka > 80) {
            return "A";
        } else if (nilaiAngka > 70) {
            return "B";
        } else if (nilaiAngka > 60) {
            return "C";
        } else if (nilaiAngka > 50) {
            return "D";
        } else {
            return "E";
        }
    }
}
