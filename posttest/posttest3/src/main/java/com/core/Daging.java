package com.core;

public class Daging {
    private String kodeDaging;
    private String jenisDaging;
    private double harga;
    private int stok;

    public Daging(String kodeDaging, String jenisDaging, double harga, int stok) {
        this.kodeDaging = kodeDaging;
        this.jenisDaging = jenisDaging;
        this.harga = harga;
        this.stok = stok;
    }

    public String getKodeDaging() { return kodeDaging; }
    public String getJenisDaging() { return jenisDaging; }
    public double getHarga() { return harga; }
    public int getStok() { return stok; }

    public void setJenisDaging(String jenisDaging) { this.jenisDaging = jenisDaging; }
    public void setHarga(double harga) { this.harga = harga; }
    public void setStok(int stok) { this.stok = stok; }
}