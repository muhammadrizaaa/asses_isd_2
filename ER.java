import java.util.Comparator;
import java.util.PriorityQueue;

class Pasien {
    String nama;
    String kode;
    int usia;
    int urutan;

    public Pasien(int urutan, String nama, String kode, int usia) {
        this.urutan = urutan;
        this.nama = nama;
        this.kode = kode;
        this.usia = usia;
    }
}

class PasienComparator implements Comparator<Pasien> {
    @Override
    public int compare(Pasien p1, Pasien p2) {
        if (p1.kode.equals(p2.kode)) {
            return p1.urutan - p2.urutan;
        } else {
            return getKodeValue(p1.kode) - getKodeValue(p2.kode);
        }
    }

    public int getKodeValue(String kode) {
        switch (kode) {
            case "Merah":
                return 0;
            case "Kuning":
                return 1;
            case "Biru":
                return 2;
            default:
                return 3;
        }
    }
}

public class ER {
    PriorityQueue<Pasien> pq = new PriorityQueue<>(new PasienComparator());

    public void antrianPasien(int urutan, String nama, String kode, int usia) {
        if (kode.equals("Hijau")) {
            System.out.println("Pasien Nama pasien: " + nama + " usia: " + usia + " diizinkan pulang");
        } else {
            pq.add(new Pasien(urutan, nama, kode, usia));
        }
    }

    public void cetakDataPasien() {
        System.out.println("Urutan penanganan pasien:");
        while (!pq.isEmpty()) {
            Pasien p = pq.poll();
            System.out.println("Nama pasien: " + p.nama + " usia: " + p.usia);
        }
    }
}
