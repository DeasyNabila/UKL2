/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujilelang;

/**
 *
 * @author MOKLET-1
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Barang barang1 = new Barang();
        Masyarakat masyarakat1 = new Masyarakat();
        Petugas petugas1 = new Petugas();
        Lelang lelang1 = new Lelang();
        Laporan laporan1 = new Laporan();

        laporan1.laporan(petugas1);
        lelang1.prosesLelang(petugas1, masyarakat1, lelang1, barang1, laporan1
        );
        laporan1.laporan(barang1);
        laporan1.laporan(masyarakat1);
        lelang1.prosesPenawaran(masyarakat1, lelang1, barang1);
    }
}


    

