package com.core;

public class Pegawai {
    private String idPegawai;
    public String namaPegawai;
    protected double gaji;
    String shiftKerja;

    public Pegawai(String idPegawai, String namaPegawai, double gaji, String shiftKerja) {
        this.idPegawai = idPegawai;
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
        this.shiftKerja = shiftKerja;
    }

    public String getIdPegawai() { return idPegawai; }
    public double getGaji() { return gaji; }
    public String getShiftKerja() { return shiftKerja; }

    public void setGaji(double gaji) { this.gaji = gaji; }
}