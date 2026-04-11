package com.core;

public class Kurir extends Pegawai {
    private String platKendaraan;

    public Kurir(String idPegawai, String namaPegawai, double gaji, String shiftKerja, String platKendaraan) {
        super(idPegawai, namaPegawai, gaji, shiftKerja);
        this.platKendaraan = platKendaraan;
    }

    public String getPlatKendaraan() { return platKendaraan; }
    public void setPlatKendaraan(String platKendaraan) { this.platKendaraan = platKendaraan; }

    @Override
    public void tampilkanData() {
        System.out.println("ID: " + getIdPegawai() + " | Nama: " + namaPegawai + " | Gaji: Rp" + getGaji() + " | Shift: " + shiftKerja + " | Jabatan: Kurir | Plat: " + platKendaraan);
    }

    @Override
    public void bekerja() {
        System.out.println(namaPegawai + " sedang mengantar pesanan daging dengan kendaraan berplat " + platKendaraan + ".");
    }
}