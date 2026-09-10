/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class Layanan {
    private String jenisJahitan;
    private double hargaDasar;
    private String deskripsi; // Memenuhi syarat minimal 3 atribut

    public Layanan(String jenisJahitan, double hargaDasar, String deskripsi) {
        this.jenisJahitan = jenisJahitan;
        this.hargaDasar = hargaDasar;
        this.deskripsi = deskripsi;
    }

    // Getter dan Setter
    public String getJenisJahitan() { return jenisJahitan; }
    public void setJenisJahitan(String jenisJahitan) { this.jenisJahitan = jenisJahitan; }

    public double getHargaDasar() { return hargaDasar; }
    public void setHargaDasar(double hargaDasar) { this.hargaDasar = hargaDasar; }

    public String getDeskripsi() { return deskripsi; }
    public void setDeskripsi(String deskripsi) { this.deskripsi = deskripsi; }
}
