/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.Layanan;
import model.Pelanggan;

/**
 *
 * @author ASUS
 */
public class Pesanan {
    public int idPesanan;
    private Pelanggan pelanggan; 
    private Layanan layanan;     
    private String jenisPakaian;
    private String ukuran;
    private int jumlah;
    public String statusPesanan;
    private double totalHarga;

    public Pesanan(int idPesanan, Pelanggan pelanggan, Layanan layanan, String jenisPakaian, String ukuran, int jumlah) {
        this.idPesanan = idPesanan;
        this.pelanggan = pelanggan;
        this.layanan = layanan;
        this.jenisPakaian = jenisPakaian;
        this.ukuran = ukuran;
        this.jumlah = jumlah;
        this.statusPesanan = "Diproses"; 
        this.totalHarga = layanan.getHargaDasar() * jumlah;
    }

    // Perulangan untuk menampilkan data satuan dipanggil dari MainApp
    public void tampilkanDetailPesanan() {
        System.out.println("ID Pesanan     : " + idPesanan);
        System.out.println("Nama Pelanggan : " + pelanggan.getNama());
        System.out.println("No. Telepon    : " + pelanggan.getNomorTelepon());
        System.out.println("Alamat         : " + pelanggan.getAlamat());
        System.out.println("Jenis Pakaian  : " + jenisPakaian);
        System.out.println("Jenis Layanan  : " + layanan.getJenisJahitan() + " (" + layanan.getDeskripsi() + ")");
        System.out.println("Ukuran         : " + ukuran);
        System.out.println("Jumlah         : " + jumlah + " pcs");
        System.out.println("Total Harga    : Rp " + totalHarga);
        System.out.println("Status         : " + statusPesanan);
        System.out.println("----------------------------------------------");
    }

    // Getter dan Setter
    public int getIdPesanan() { return idPesanan; }
    public Pelanggan getPelanggan() { return pelanggan; }
    public Layanan getLayanan() { return layanan; }
    public String getJenisPakaian() { return jenisPakaian; }
    public void setJenisPakaian(String jenisPakaian) { this.jenisPakaian = jenisPakaian; }
    public String getUkuran() { return ukuran; }
    public void setUkuran(String ukuran) { this.ukuran = ukuran; }
    public int getJumlah() { return jumlah; }
    public void setJumlah(int jumlah) { 
        this.jumlah = jumlah; 
        this.totalHarga = this.layanan.getHargaDasar() * jumlah; 
    }
    public String getStatusPesanan() { return statusPesanan; }
    public void setStatusPesanan(String statusPesanan) { this.statusPesanan = statusPesanan; }
    public double getTotalHarga() { return totalHarga; }
}
