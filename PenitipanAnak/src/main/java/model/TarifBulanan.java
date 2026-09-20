/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class TarifBulanan extends Anak {
    private double tarifPerBulan;
    private String menuKatering;

    
    public TarifBulanan(String idAnak, String nama, int usia, double tarifPerBulan, String menuKatering) {
        super(idAnak, nama, usia);
        this.tarifPerBulan = tarifPerBulan;
        this.menuKatering = menuKatering;
    }

    public double getTarifPerBulan() {
        return tarifPerBulan;
    }

  
    @Override
    public void tampilkanProfil() {
        System.out.println("[Paket: Penitipan Bulanan]");
        super.tampilkanProfil();
        System.out.println("Tarif / Bulan: Rp" + tarifPerBulan);
        System.out.println("Fasilitas    : Katering " + menuKatering);
    }
}
