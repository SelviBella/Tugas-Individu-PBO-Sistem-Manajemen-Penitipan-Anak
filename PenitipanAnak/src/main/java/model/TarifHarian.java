/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class TarifHarian extends Anak {
    private double tarifPerHari;


    public TarifHarian(String idAnak, String nama, int usia, double tarifPerHari) {
        super(idAnak, nama, usia); 
        this.tarifPerHari = tarifPerHari;
    }

    public double getTarifPerHari() {
        return tarifPerHari;
    }

    
    @Override
    public void tampilkanProfil() {
        System.out.println("[Paket: Penitipan Harian]");
        super.tampilkanProfil(); 
        System.out.println("Tarif / Hari : Rp" + tarifPerHari);
    }
}
