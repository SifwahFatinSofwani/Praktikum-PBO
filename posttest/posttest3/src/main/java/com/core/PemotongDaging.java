package com.core;

public class PemotongDaging extends Pegawai {
    private String jenisPisau;

    public PemotongDaging(String idPegawai, String namaPegawai, double gaji, String shiftKerja, String jenisPisau) {
        super(idPegawai, namaPegawai, gaji, shiftKerja);
        this.jenisPisau = jenisPisau;
    }

    public String getJenisPisau() { return jenisPisau; }
    public void setJenisPisau(String jenisPisau) { this.jenisPisau = jenisPisau; }
}