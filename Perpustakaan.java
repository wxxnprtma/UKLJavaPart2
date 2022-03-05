/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perpus;

/**
 *
 * @author MOKLET-2
 */
public class Perpustakaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // memanggil class
        Siswa siswa = new Siswa();
        Buku buku = new Buku();
        Petugas petugas = new Petugas();
        Peminjaman pinjam = new Peminjaman();
        Laporan laporan = new Laporan();

        laporan.laporan(buku);
        laporan.laporan(siswa);
        pinjam.prosesPeminjaman(siswa, pinjam, buku);

        laporan.laporan(buku);
        laporan.laporan(siswa);
    }
}
