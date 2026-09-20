# Tugas Individu Pemrograman Berorientasi Objek

**Nama:** Selvi Bella Dwi Anita

**NIM:** 2509116053

**Kelas:** B

---

## Studi Kasus Sistem Manajemen Penitipan Anak
Program aplikasi Sistem Manajemen Penitipan Anak (Daycare) berbasis konsol (Command Line Interface) ini dirancang untuk mendata identitas anak secara dinamis menggunakan input dari pengguna, menentukan kategori paket penitipan (Harian atau Bulanan), mengelola data operasional anak (melalui fitur penambahan, pembaruan, dan penghapusan data), serta melakukan kalkulasi estimasi invoice biaya administrasi berdasarkan durasi waktu penitipan yang dimasukkan secara interaktif.

---

## Diagram Kelas (Hierarki Class)
Program ini menerapkan Inheritance (Pewarisan) dengan struktur kelas sebagai berikut:

* Anak (Super-class): Kelas utama yang memegang data dasar identitas anak seperti idAnak, nama, dan usia.
* TarifHarian (Sub-class): Mewarisi kelas Anak dengan tambahan properti tarif hitungan harian (tarifPerHari).
* TarifBulanan (Sub-class): Mewarisi kelas Anak dengan tambahan data paket bulanan (tarifPerBulan) dan fasilitas katering anak (menuKatering).

```text
       +---------------------------------------+

       |                 Anak                  |  <-- Super-class
       +---------------------------------------+

       | - idAnak : String                     |
       | - nama : String                       |
       | - usia : int                          |
       +---------------------------------------+

       | + tampilkanProfil() : void            |
       +---------------------------------------+
                           ^
                           | (Inherits / Extends)
            +--------------+--------------+

            |                             |
+-----------------------+     +-----------------------+

|      TarifHarian      |     |     TarifBulanan      |  <-- Sub-classes
+-----------------------+     +-----------------------+

| - tarifPerHari : double|     | - tarifPerBulan:double|
+-----------------------+     | - menuKatering: String|

| + tampilkanProfil()   |     +-----------------------+
+-----------------------+     | + tampilkanProfil()   |
                              +-----------------------+
```

---

## 4. Penjelasan Bagian Kode Yang Menerapkan Inheritance

### Penerapan inheritance pada kode:
```java
package penitipan;

// Penggunaaan extends
public class TarifHarian extends Anak {
    private double tarifPerHari;

//Subclass TarifHarian
    public TarifHarian(String idAnak, String nama, int usia, double tarifPerHari) {
        super(idAnak, nama, usia); //Penggunaan super
        this.tarifPerHari = tarifPerHari;
    }

//Subclass TarifBulanan
    public class TarifBulanan extends Anak {
    private double tarifPerBulan;
    private String menuKatering;

    
    public TarifBulanan(String idAnak, String nama, int usia, double tarifPerBulan, String menuKatering) {
        super(idAnak, nama, usia); //Penggunaan super
        this.tarifPerBulan = tarifPerBulan;
        this.menuKatering = menuKatering;
    }

    // Metode overriding
    @Override
    public void tampilkanProfil() {
        System.out.println("[Paket: Penitipan Harian]");
        super.tampilkanProfil(); //Penggunaan super
        System.out.println("Tarif / Hari : Rp" + tarifPerHari);
    }
}
```
## Penjelasan:
* Extends berfungsi untuk mendeklarasikan hubungan pewarisan (inheritance) antara kelas anak (TarifHarian) dan kelas induk (Anak). Melalui mekanisme ini, semua atribut data dasar yang ada pada kelas induk secara otomatis diwariskan ke kelas anak tanpa perlu ditulis ulang dari awal.

* Penggunaan super(idAnak, nama, usia) yang berada di baris pertama metode konstruktor berfungsi untuk memanggil konstruktor milik kelas induk. Tujuannya adalah untuk mengirimkan argumen data awal agar variabel identitas anak dapat diinisialisasi secara sah oleh kelas induk yang memilikinya.

* Metode override menandakan bahwa kelas anak mendefinisikan ulang fungsi tampilkanProfil() yang sebelumnya sudah ada di kelas induk. Modifikasi ini bertujuan agar keluaran teks di terminal dapat disesuaikan secara khusus demi menampilkan informasi rincian biaya yang hanya dimiliki oleh sub-class tersebut.

* Penggunaan super.tampilkanProfil() berfungsi untuk menjalankan terlebih dahulu perintah cetak standar (ID, Nama, dan Usia) milik kelas induk. Setelah data dasar tersebut berhasil ditampilkan di layar konsol, program baru akan melanjutkan eksekusi baris kode berikutnya untuk mencetak nilai variabel tarif harian.
---

## Running Program

**1. Tampilan Menu Utama**

<img width="347" height="222" alt="image" src="https://github.com/user-attachments/assets/aa4a3d02-3789-4da4-a056-4332471cf277" />

---

**2. Menampilkan Daftar Anak dan Paket**

<img width="487" height="685" alt="image" src="https://github.com/user-attachments/assets/8b845a4e-c75d-409e-991a-2ee165337124" />

---

**3. Menambahkan Data Anak**

<img width="452" height="465" alt="image" src="https://github.com/user-attachments/assets/29cba131-d5fb-4edf-8b01-94bc121f3eb8" />

---

**4. Mengubah Data Usia dan Tarif**

<img width="442" height="436" alt="image" src="https://github.com/user-attachments/assets/702f5620-025c-4979-95ee-b9f1b353823d" />

---

**5. Menghapus Data Anak**

<img width="427" height="376" alt="image" src="https://github.com/user-attachments/assets/ae690db9-c135-4cd2-8f41-3787408a3a42" />

---

**6. Membuat Invoice atau Biaya Penitipan berdasarkan Durasi Penitipan per Hari/Bulan**

<img width="405" height="492" alt="image" src="https://github.com/user-attachments/assets/80db38c6-1fcd-4e42-a319-51ab5b769802" />

---

**7. Keluar dari Program**

<img width="312" height="235" alt="image" src="https://github.com/user-attachments/assets/45de7418-041d-4600-96a9-319aee7d812e" />
