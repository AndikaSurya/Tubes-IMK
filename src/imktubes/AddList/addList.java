/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imktubes.AddList;

import java.util.Vector;

/**
 *
 * @author ilham
 */
public class addList {

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the kategori
     */
    public String getKategori() {
        return kategori;
    }

    /**
     * @param kategori the kategori to set
     */
    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    /**
     * @return the harga
     */
    public String getHarga() {
        return harga;
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(String harga) {
        this.harga = harga;
    }

    /**
     * @return the jumlah
     */
    public String getJumlah() {
        return jumlah;
    }

    /**
     * @param jumlah the jumlah to set
     */
    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }
    private String nama;
    private String kategori;
    private String harga;
    private String jumlah;
    
    Vector vector = new Vector();

    public void addList(String nama, String kategori, String harga, String jumlah) {
        setNama(nama);
        setKategori(kategori);
        setHarga(harga);
        setJumlah(jumlah);
        
    }
    
    public Vector getAddList() {
        vector.add(getNama());
        vector.add(getKategori());
        vector.add(getHarga());
        vector.add(getJumlah());
        return vector;
    }
}
