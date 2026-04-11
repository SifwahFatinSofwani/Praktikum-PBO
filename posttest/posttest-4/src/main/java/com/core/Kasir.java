package com.core;

public class Kasir extends Pegawai {
    private int nomorLaci;

    public Kasir(String idPegawai, String namaPegawai, double gaji, String shiftKerja, int nomorLaci) {
        super(idPegawai, namaPegawai, gaji, shiftKerja);
        this.nomorLaci = nomorLaci;
    }

    public int getNomorLaci() { return nomorLaci; }
    public void setNomorLaci(int nomorLaci) { this.nomorLaci = nomorLaci; }

    @Override
    public void tampilkanData() {
        System.out.println("ID: " + getIdPegawai() + " | Nama: " + namaPegawai + " | Gaji: Rp" + getGaji() + " | Shift: " + shiftKerja + " | Jabatan: Kasir | Laci: " + nomorLaci);
    }

    @Override
    public void bekerja() {
        System.out.println(namaPegawai + " sedang melayani pembayaran pelanggan di laci " + nomorLaci + ".");
    }
}