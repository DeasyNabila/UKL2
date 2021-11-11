/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujilelang;

import java.util.ArrayList;

/**
 *
 * @author MOKLET-1
 */
public class Masyarakat implements User {

    private ArrayList<String> namaMasyarakat = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();

    public Masyarakat() {
        this.namaMasyarakat.add("Deasy");
        this.alamat.add("Malang");
        this.telepon.add("081259808110");

        this.namaMasyarakat.add("Wianda");
        this.alamat.add("Probolinggo");
        this.telepon.add("082213355966");

        this.namaMasyarakat.add("Sasa");
        this.alamat.add("Kediri");
        this.telepon.add("085233214156");
    }

    public int getJmlMasyarakat() {
        return this.namaMasyarakat.size();
    }

    @Override
    public void setNama(String namaMasyarakat) {
        this.namaMasyarakat.add(namaMasyarakat);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idMasyarakat) {
        return this.namaMasyarakat.get(idMasyarakat);
    }

    @Override
    public String getAlamat(int idMasyarakat) {
        return this.alamat.get(idMasyarakat);
    }

    @Override
    public String getTelepon(int idMasyarakat) {
        return this.telepon.get(idMasyarakat);
    }

}
