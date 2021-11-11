/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujilelang;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MOKLET-1
 */
public class Barang {

    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Integer> hargaAwal = new ArrayList<Integer>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();

    public Barang() {
        this.namaBarang.add("Mobil");
        this.hargaAwal.add(20000000);
        this.status.add(true);
    }

    public int getJmlBarang() {
        return this.namaBarang.size();
    }

    public void setNamaBarang(String namaBarang) {
            
        this.namaBarang.add(namaBarang);
    }

    public void setHargaAwal(int hargaAwal) {
        this.hargaAwal.add(hargaAwal);
    }

    public void setStatus(boolean status) {
        this.status.add(status);
    }

    public String getNamaBarang(int idBarang) {
        return this.namaBarang.get(idBarang);
    }

    public int getHargaAwal(int idBarang) {
        return this.hargaAwal.get(idBarang);
    }

    public boolean getStatus(int idBarang) {
        return this.status.get(idBarang);
    }

    public void editStatus(int idBarang, boolean status) {
        this.status.add(idBarang, status);
    }
}
