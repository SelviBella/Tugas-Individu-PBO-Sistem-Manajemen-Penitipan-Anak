/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package penitipan.main;

import java.util.Scanner;
import model.Anak;
import model.TarifHarian;
import model.TarifBulanan;
/**
 *
 * @author ASUS
 */
public class PenitipanAnak {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
         Anak[] daftarAnak = new Anak[100];
        int jumlahAnak = 0; 

        daftarAnak[jumlahAnak++] = new TarifHarian("A01", "Kaila", 3, 150000);
        daftarAnak[jumlahAnak++] = new TarifHarian("A02", "Arkan", 5, 100000);
        daftarAnak[jumlahAnak++] = new TarifBulanan("B01", "Rayyan", 2, 1500000, "Bubur Organik");

        int pilihan = 0;
        
        do {
            System.out.println("\n============================");
            System.out.println("   SISTEM PENITIPAN ANAK    ");
            System.out.println("============================");
            System.out.println("1. Lihat Daftar Anak & Paket");
            System.out.println("2. Tambah Data Anak Baru");
            System.out.println("3. Update Data Anak");
            System.out.println("4. Hapus Data Anak");
            System.out.println("5. Hitung Estimasi Biaya");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu (1-6): ");
            
            pilihan = input.nextInt();
            input.nextLine();
            
            switch (pilihan) {
                case 1:
                    System.out.println("\n--- DAFTAR ANAK YANG DITITIPKAN ---");
                    if (jumlahAnak == 0) {
                        System.out.println("Belum ada data anak.");
                    } else {
                        for (int i = 0; i < jumlahAnak; i++) {
                            System.out.println("\nNo. " + (i + 1));
                            daftarAnak[i].tampilkanProfil();
                        }
                    }
                    break;
                    
                case 2:
                    System.out.println("\n--- TAMBAH DATA ANAK BARU ---");
                    System.out.print("Masukkan ID Anak: ");
                    String id = input.nextLine();
                    System.out.print("Masukkan Nama Anak: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan Usia Anak (Tahun): ");
                    int usia = input.nextInt();
                    
                    System.out.println("Pilih Paket Jasa:");
                    System.out.println("1. Paket Harian");
                    System.out.println("2. Paket Bulanan");
                    System.out.print("Pilihan paket (1/2): ");
                    int paket = input.nextInt();
                    input.nextLine();
                    
                    if (paket == 1) {
                        System.out.print("Masukkan Tarif per Hari: Rp");
                        double tarifHarian = input.nextDouble();
                        daftarAnak[jumlahAnak++] = new TarifHarian(id, nama, usia, tarifHarian);
                        System.out.println("Data Anak Paket Harian Berhasil Ditambahkan!");
                    } else if (paket == 2) {
                        System.out.print("Masukkan Tarif per Bulan: Rp");
                        double tarifBulanan = input.nextDouble();
                        input.nextLine();
                        System.out.print("Masukkan Menu Katering Sehat: ");
                        String katering = input.nextLine();
                        daftarAnak[jumlahAnak++] = new TarifBulanan(id, nama, usia, tarifBulanan, katering);
                        System.out.println("Data Anak Paket Bulanan Berhasil Ditambahkan!");
                    } else {
                        System.out.println("Pilihan paket salah. Gagal menambahkan data.");
                    }
                    break;
                    
                case 3:
                    System.out.println("\n--- UPDATE DATA ANAK ---");
                    if (jumlahAnak == 0) {
                        System.out.println("Tidak ada data untuk di-update.");
                        break;
                    }
                    for (int i = 0; i < jumlahAnak; i++) {
                        System.out.println((i + 1) + ". " + daftarAnak[i].getNama() + " (" + daftarAnak[i].getIdAnak() + ")");
                    }
                    System.out.print("Pilih nomor urut anak yang ingin di-update: ");
                    int indeksUpdate = input.nextInt() - 1;
                    input.nextLine(); 
                    
                    if (indeksUpdate >= 0 && indeksUpdate < jumlahAnak) {
                        Anak anakUpdate = daftarAnak[indeksUpdate];
                        System.out.print("Update Usia Baru (Tahun): ");
                        int usiaBaru = input.nextInt();
                        
                        if (anakUpdate instanceof TarifHarian) {
                            System.out.print("Update Tarif Harian Baru: Rp");
                            double tarifBaru = input.nextDouble();
                            daftarAnak[indeksUpdate] = new TarifHarian(anakUpdate.getIdAnak(), anakUpdate.getNama(), usiaBaru, tarifBaru);
                        } else if (anakUpdate instanceof TarifBulanan) {
                            System.out.print("Update Tarif Bulanan Baru: Rp");
                            double tarifBaru = input.nextDouble();
                            input.nextLine();
                            System.out.print("Update Menu Katering Baru: ");
                            String kateringBaru = input.nextLine();
                            daftarAnak[indeksUpdate] = new TarifBulanan(anakUpdate.getIdAnak(), anakUpdate.getNama(), usiaBaru, tarifBaru, kateringBaru);
                        }
                        System.out.println("Data Anak Berhasil Diperbarui!");
                    } else {
                        System.out.println("Nomor urut tidak valid.");
                    }
                    break;
                    
                case 4:
                    System.out.println("\n--- HAPUS DATA ANAK ---");
                    if (jumlahAnak == 0) {
                        System.out.println("Tidak ada data untuk dihapus.");
                        break;
                    }
                    for (int i = 0; i < jumlahAnak; i++) {
                        System.out.println((i + 1) + ". " + daftarAnak[i].getNama() + " (" + daftarAnak[i].getIdAnak() + ")");
                    }
                    System.out.print("Pilih nomor urut anak yang ingin dihapus: ");
                    int indeksHapus = input.nextInt() - 1;
                    input.nextLine();
                    
                    if (indeksHapus >= 0 && indeksHapus < jumlahAnak) {
                        System.out.println("Menghapus data anak: " + daftarAnak[indeksHapus].getNama());
                        
                        
                        for (int i = indeksHapus; i < jumlahAnak - 1; i++) {
                            daftarAnak[i] = daftarAnak[i + 1];
                        }
                        daftarAnak[jumlahAnak - 1] = null; 
                        jumlahAnak--;
                        
                        System.out.println("Data Anak Berhasil Dihapus dari Sistem!");
                    } else {
                        System.out.println("Nomor urut tidak valid.");
                    }
                    break;
                    
                case 5:
                    System.out.println("\n--- HITUNG ESTIMASI BIAYA PENITIPAN ---");
                    if (jumlahAnak == 0) {
                        System.out.println("Tidak ada data anak untuk dihitung.");
                        break;
                    }
                    for (int i = 0; i < jumlahAnak; i++) {
                        System.out.println((i + 1) + ". " + daftarAnak[i].getNama() + " (" + daftarAnak[i].getIdAnak() + ")");
                    }
                    System.out.print("Pilih nomor anak: ");
                    int noAnak = input.nextInt();
                    
                    if (noAnak > 0 && noAnak <= jumlahAnak) {
                        Anak terpilih = daftarAnak[noAnak - 1];
                        
                        if (terpilih instanceof TarifHarian) {
                            System.out.print("Masukkan durasi penitipan (hari): ");
                            int hari = input.nextInt();
                            TarifHarian harian = (TarifHarian) terpilih;
                            double total = harian.getTarifPerHari() * hari;
                            
                            System.out.println("\n--- Estimasi Invoice Harian ---");
                            System.out.println("Nama Anak   : " + harian.getNama());
                            System.out.println("Total Durasi: " + hari + " Hari");
                            System.out.println("Total Biaya : Rp" + total);
                            
                        } else if (terpilih instanceof TarifBulanan) {
                            System.out.print("Masukkan durasi penitipan (bulan): ");
                            int bulan = input.nextInt();
                            TarifBulanan bulanan = (TarifBulanan) terpilih;
                            double total = bulanan.getTarifPerBulan() * bulan;
                            
                            System.out.println("\n--- Estimasi Invoice Bulanan ---");
                            System.out.println("Nama Anak   : " + bulanan.getNama());
                            System.out.println("Total Durasi: " + bulan + " Bulan");
                            System.out.println("Total Biaya : Rp" + total);
                        }
                    } else {
System.out.println("Nomor anak tidak terdaftar.");
}
break;

case 6:
System.out.println("Aplikasi ditutup. Terima kasih!");
break;

default:
System.out.println("Pilihan salah. Silakan ulangi.");
}
} while (pilihan != 6);

input.close();
}
}
