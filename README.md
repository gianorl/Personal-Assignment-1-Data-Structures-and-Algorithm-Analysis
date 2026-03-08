# Personal Assignment 1 – Sistem Data Mahasiswa

Program Java untuk mengelola data mahasiswa (OOP, enkapsulasi, method).

## Soal 1 – Class dan Object

Membuat class `Mahasiswa` dan 5 objek, lalu menampilkan seluruh data menggunakan loop. Tidak ada input dari user.

- **Class Mahasiswa:** constructor, `tampilkanInfo()`  
- **Output:** data 5 mahasiswa (nama, NIM, jurusan, IPK)

```bash
javac soal1.java
java soal1
```

Atau (Java 11+):

```bash
java soal1.java
```

---

## Soal 2 – Enkapsulasi dan Update IPK

Menggunakan class `Mahasiswa` dengan field private (enkapsulasi). User memasukkan **NIM** dan **IPK baru**; program mencari mahasiswa by NIM, mengupdate IPK, lalu menampilkan data terbaru dan status kelulusan (Lulus / Belum Lulus).

- **Class Mahasiswa:** getter/setter, `updateIpk()`, `cekKelulusan()`
- **Input:** NIM (contoh: `2440002`), IPK baru (contoh: `3.25`)

```bash
javac soal2.java
java soal2
```

---

## Soal 3 – Predikat Akademik

Menampilkan data satu mahasiswa (Citra Lestari) beserta status kelulusan dan **predikat akademik**. Tidak ada input dari user; data dan perhitungan predikat dijalankan di dalam program.

- **Predikat:** Dengan Pujian (≥3.75), Sangat Memuaskan (3.50–3.74), Memuaskan (3.00–3.49), Perlu Perbaikan (&lt;3.00)
- **Class Mahasiswa:** `hitungPredikat()` selain method dari soal sebelumnya

```bash
javac soal3.java
java soal3
```
