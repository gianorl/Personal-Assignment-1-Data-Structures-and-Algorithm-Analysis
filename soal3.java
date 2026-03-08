/**
 * Soal 3: Menentukan Predikat Akademik
 */
public class soal3 {
    public static void main(String[] args) {
       
        Mahasiswa citra = new Mahasiswa("Citra Lestari", "2440003", "Teknik Informatika", 3.90);

        // Tampilkan data + status + predikat
        System.out.println("=== Data Mahasiswa ===");
        citra.tampilkanInfo();
        citra.cekKelulusan();
        System.out.println("Predikat: " + citra.hitungPredikat());
    }
}

class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private double ipk;

    /**
     * Constructor untuk menginisialisasi data mahasiswa.
     */
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

    /**
     * Menampilkan data mahasiswa ke konsol.
     */
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("IPK: " + String.format("%.2f", ipk));
    }

    /**
     * Menampilkan status kelulusan: IPK >= 3.00 Lulus, < 3.00 Belum Lulus
     */
    public void cekKelulusan() {
        if (ipk >= 3.00) {
            System.out.println("Status: Lulus");
        } else {
            System.out.println("Status: Belum Lulus");
        }
    }

    /**
     * Menentukan predikat akademik berdasarkan rentang IPK:
     * IPK >= 3.75 → Dengan Pujian
     * 3.50 <= IPK < 3.75 → Sangat Memuaskan
     * 3.00 <= IPK < 3.50 → Memuaskan
     * IPK < 3.00 → Perlu Perbaikan
     */
    public String hitungPredikat() {
        if (ipk >= 3.75) {
            return "Dengan Pujian";
        } else if (ipk >= 3.50) {
            return "Sangat Memuaskan";
        } else if (ipk >= 3.00) {
            return "Memuaskan";
        } else {
            return "Perlu Perbaikan";
        }
    }
}
