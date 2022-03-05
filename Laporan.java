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
public class Laporan {

    public void laporan(Buku buku) {
        int x = buku.getJmlBuku();

        System.out.println();
        System.out.println("\tTabel buku");
        System.out.println("===============================");
        System.out.println("Nama buku \tStok \tharga");
        for (int i = 0; i < x; i++) {
            System.out.println(buku.getNamaBuku(i) + "\t" + "\t" + buku.getStok(i) + "\t" + buku.getHarga(i));
        }
    }

    public void laporan(Siswa siswa) {
        int x = siswa.getJmlSiswa();

        System.out.println();
        System.out.println("\t\t\tTabel Siswa");
        System.out.println("===============================================================");
        System.out.println("Nama \t\t\tAlamat \t\tTelepon \tStatus");
        for (int i = 0; i < x; i++) {
            System.out.println(siswa.getNama(i) + "\t" + siswa.getAlamat(i) + "\t" + siswa.getTelepon(i) + "\t" + siswa.getStatus(i));
        }
    }

    public void laporan(Peminjaman pinjam, Buku buku) {
        int x = pinjam.getJmlPeminjaman();

        System.out.println();
        System.out.println("Laporan Peminjaman");
        System.out.println();
        System.out.println("Nama Buku \tQty \tHarga \tJumlah");

        int total = 0;
        for (int i = 0; i < x; i++) {
            int jumlah = pinjam.getBanyaknya(i) * buku.getHarga(pinjam.getIdBuku(i));
            total += jumlah;

            System.out.println(buku.getNamaBuku(pinjam.getIdBuku(i)) + "\t" +"\t" + pinjam.getBanyaknya(i) + "\t" + buku.getHarga(pinjam.getIdBuku(i)) + "\t" + jumlah);
        }
        System.out.println("Total Omset = " + total);
    }
}
