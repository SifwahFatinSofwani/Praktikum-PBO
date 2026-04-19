package com.core;

public abstract class Pegawai implements TugasPegawai {
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

    public abstract void tampilkanData();

    public abstract void bekerja();

    public void naikGaji(double nominalTambahan) {
        this.gaji += nominalTambahan;
        System.out.println("Gaji naik sebesar Rp" + nominalTambahan + ". Total Gaji sekarang: Rp" + this.gaji);
    }

    public void naikGaji(int persenGaji) {
        double kenaikan = this.gaji * (persenGaji / 100.0);
        this.gaji += kenaikan;
        System.out.println("Gaji naik sebesar " + persenGaji + "% (Rp" + kenaikan + "). Total Gaji sekarang: Rp" + this.gaji);
    }

    public void mulaiShift() {
        System.out.println(namaPegawai + " telah memulai shift " + shiftKerja + ".");
    }

    public void selesaiShift() {
        System.out.println(namaPegawai + " telah menyelesaikan shift " + shiftKerja + ".");
    }
}