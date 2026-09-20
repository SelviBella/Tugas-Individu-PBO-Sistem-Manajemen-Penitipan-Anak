/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class Anak {
    private String idAnak;
    private String nama;
    private int usia;

 
    public Anak(String idAnak, String nama, int usia) {
        this.idAnak = idAnak;
        this.nama = nama;
        this.usia = usia;
    }

   
    public String getIdAnak() {
        return idAnak;
    }

    public String getNama() {
        return nama;
    }

    public int getUsia() {
        return usia;
    }

    
    public void tampilkanProfil() {
        System.out.println("ID Anak      : " + idAnak);
        System.out.println("Nama Anak    : " + nama);
        System.out.println("Usia         : " + usia + " Tahun");
    }
}
