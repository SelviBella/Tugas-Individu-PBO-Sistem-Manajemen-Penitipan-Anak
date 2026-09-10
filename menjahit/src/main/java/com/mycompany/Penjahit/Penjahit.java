/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Penjahit;

import model.Pelanggan;
import model.Layanan;
import model.Pesanan;
import java.util.ArrayList;
import java.util.Scanner;/**
 *
 */
public class Penjahit {
    public static void main(String[] args) {
        
        ArrayList<Pesanan> daftarPesanan = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int counterId = 1;
        int pilihan;

        // ==================== DAFTAR DATA PELANGGAN ====================
        // Pelanggan 1
        Pelanggan p1 = new Pelanggan("Bella", "081234567890", "Jl. Pramuka");
        Layanan l1 = new Layanan("Jahit Pakaian Baru", 150000, "Membuat gaun pesta");
        Pesanan pesanan1 = new Pesanan(counterId++, p1, l1, "Gaun", "M", 2);
        daftarPesanan.add(pesanan1);

        // Pelanggan 2
        Pelanggan p2 = new Pelanggan("Clara", "089876543210", "Jl. Perjuangan");
        Layanan l2 = new Layanan("Permak Pakaian", 50000, "Mengecilkan lingkar pinggang");
        Pesanan pesanan2 = new Pesanan(counterId++, p2, l2, "Kemeja", "L", 1);
        daftarPesanan.add(pesanan2);

        // Pelanggan 3
        Pelanggan p3 = new Pelanggan("Ridho", "085244332211", "Jl. M. Yamin");
        Layanan l3 = new Layanan("Permak Pakaian", 50000, "Membesarkan celana kain");
        Pesanan pesanan3 = new Pesanan(counterId++, p3, l3, "Celana", "XL", 3);
        daftarPesanan.add(pesanan3);
        // ====================================================================

     
        do {
            System.out.println("\n=== SISTEM MANAJEMEN PEMESANAN JASA MENJAHIT ===");
            System.out.println("1. Tambah Pesanan Baru");
            System.out.println("2. Tampilkan Pesanan");
            System.out.println("3. Ubah Status");
            System.out.println("4. Batalkan Pesanan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // Pembersih baris enter

            switch (pilihan) {
                case 1: // CREATE
                    System.out.print("Nama Pelanggan: ");
                    String nama = input.nextLine();
                    System.out.print("Nomor Telepon : ");
                    String telp = input.nextLine();
                    System.out.print("Alamat        : ");
                    String alamat = input.nextLine();
                    Pelanggan pBaru = new Pelanggan(nama, telp, alamat);

                    System.out.println("Pilih Layanan: 1. Jahit Baru (150rb) | 2. Permak (50rb)");
                    System.out.print("Pilihan (1/2): ");
                    int opsi = input.nextInt();
                    input.nextLine();
                    
                    Layanan lBaru;
                    if (opsi == 1) {
                        lBaru = new Layanan("Jahit Pakaian Baru", 150000, "Bikin baru");
                    } else {
                        lBaru = new Layanan("Permak Pakaian", 50000, "Mengecilkan/membesarkan");
                    }

                    System.out.print("Jenis Pakaian (Kemeja/Gaun/Celana): ");
                    String jenis = input.nextLine();
                    System.out.print("Ukuran (S/M/L/XL): ");
                    String ukuran = input.nextLine();
                    System.out.print("Jumlah (pcs): ");
                    int jumlah = input.nextInt();
                    input.nextLine();

                    // Instansiasi objek baru dengan kata kunci 'new' sesuai slide halaman 9
                    Pesanan pesananBaru = new Pesanan(counterId++, pBaru, lBaru, jenis, ukuran, jumlah);
                    daftarPesanan.add(pesananBaru); // Menggunakan method .add() ArrayList
                    System.out.println("Pesanan Berhasil Ditambahkan!");
                    break;

                case 2: // READ
                    System.out.println("\n--- DAFTAR ANTRIAN JAHITAN ---");
                    if (daftarPesanan.size() == 0) { // Menggunakan method .size()
                        System.out.println("Antrean kosong.");
                    } else {
                        // Perulangan standar untuk menampilkan isi Arraylist
                        for (int i = 0; i < daftarPesanan.size(); i++) {
                            daftarPesanan.get(i).tampilkanDetailPesanan(); // Menggunakan .get()
                        }
                    }
                    break;

                case 3: // UPDATE
                    System.out.print("Masukkan ID Pesanan yang ingin diubah statusnya: ");
                    int idUbah = input.nextInt();
                    input.nextLine();

                    boolean ditemukanUbah = false;
                    for (int i = 0; i < daftarPesanan.size(); i++) {
                        if (daftarPesanan.get(i).idPesanan == idUbah) {
                            ditemukanUbah = true;
                            System.out.print("Masukkan Status Baru (Selesai/Diambil): ");
                            String statusBaru = input.nextLine();
                            daftarPesanan.get(i).statusPesanan = statusBaru;
                            System.out.println("Status Berhasil Diperbarui!");
                        }
                    }
                    if (!ditemukanUbah) {
                        System.out.println("ID Pesanan tidak ditemukan!");
                    }
                    break;

                case 4: // DELETE
                    System.out.print("Masukkan ID Pesanan yang ingin dihapus: ");
                    int idHapus = input.nextInt();
                    input.nextLine();

                    boolean ditemukanHapus = false;
                    for (int i = 0; i < daftarPesanan.size(); i++) {
                        if (daftarPesanan.get(i).idPesanan == idHapus) {
                            ditemukanHapus = true;
                            daftarPesanan.remove(i); // Menggunakan method .remove() ArrayList
                            System.out.println("Pesanan Berhasil Dihapus!");
                            break; // Keluar dari loop setelah menghapus
                        }
                    }
                    if (!ditemukanHapus) {
                        System.out.println("ID Pesanan tidak ditemukan!");
                    }
                    break;

                case 5:
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;
                
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);
    }
}
