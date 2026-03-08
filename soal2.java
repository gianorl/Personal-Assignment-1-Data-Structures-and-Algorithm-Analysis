import java.util.Scanner;

/**
 * Soal 2: Enkapsulasi dan Method
 */
public class soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Simpan 5 objek Mahasiswa ke dalam array
        Mahasiswa[] daftar = new Mahasiswa[5];
        daftar[0] = new Mahasiswa("Andi Pratama", "2440001", "Teknik Informatika", 3.75);
        daftar[1] = new Mahasiswa("Budi Santoso", "2440002", "Sistem Informasi", 3.40);
        daftar[2] = new Mahasiswa("Citra Lestari", "2440003", "Teknik Informatika", 3.90);
        daftar[3] = new Mahasiswa("Joni Suhartono", "2440004", "Teknik Industri", 3.00);
        daftar[4] = new Mahasiswa("Bulan Suci", "2440005", "Akuntansi", 3.20);

        System.out.print("Masukkan NIM mahasiswa yang ingin diupdate: ");
        String nimCari = input.nextLine();
        System.out.print("Masukkan IPK baru: ");
        double ipkBaru = input.nextDouble();

        Mahasiswa dipilih = null;
        for (Mahasiswa m : daftar) {
            if (m.getNim().equals(nimCari)) {
                dipilih = m;
                break;
            }
        }

        if (dipilih != null) {
            dipilih.updateIpk(ipkBaru);
            System.out.println("Data berhasil diperbarui!" + "\n");
            System.out.println("=== Data Mahasiswa ===" );
            dipilih.tampilkanInfo();
            dipilih.cekKelulusan();
        } else {
            System.out.println("Mahasiswa dengan NIM " + nimCari + " tidak ditemukan.");
        }

        input.close();
    }
}

class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private double ipk;

    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("IPK: " + String.format("%.2f", ipk));
    }

    public void cekKelulusan() {
        if (ipk >= 3.00) {
            System.out.println("Status: Lulus");
        } else {
            System.out.println("Status: Belum Lulus");
        }
    }

    public void updateIpk(double ipkBaru) {
        this.ipk = ipkBaru;
    }
}
