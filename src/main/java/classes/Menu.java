/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author WIN 10
 */
public class Menu {
    private String namaMenu;
    private double harga;
    private String kategori;
    
    public String getNamaMenu () {
        return namaMenu;
    }
    
    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }
    
    public double getHarga () {
        return harga;
    }
    
    void setHarga (double harga) {
        this.harga = harga;
    }
    
    public String getKategori () {
        return kategori;
    }
    
    public void setKategori (String kategori) {
        this.kategori = kategori;
    }
}
