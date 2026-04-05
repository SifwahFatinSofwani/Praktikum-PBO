package com.core;

public class Kasir extends Pegawai {
    private int nomorLaci;

    public Kasir(String idPegawai, String namaPegawai, double gaji, String shiftKerja, int nomorLaci) {
        super(idPegawai, namaPegawai, gaji, shiftKerja);
        this.nomorLaci = nomorLaci;
    }

    public int getNomorLaci() { return nomorLaci; }
    public void setNomorLaci(int nomorLaci) { this.nomorLaci = nomorLaci; }
}