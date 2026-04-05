package com.core;

public class Kurir extends Pegawai {
    private String platKendaraan;

    public Kurir(String idPegawai, String namaPegawai, double gaji, String shiftKerja, String platKendaraan) {
        super(idPegawai, namaPegawai, gaji, shiftKerja);
        this.platKendaraan = platKendaraan;
    }

    public String getPlatKendaraan() { return platKendaraan; }
    public void setPlatKendaraan(String platKendaraan) { this.platKendaraan = platKendaraan; }
}