package com.core;

public class Pelanggan {
    private String idPelanggan;
    private String namaUsaha;
    private String alamat;

    public Pelanggan(String idPelanggan, String namaUsaha, String alamat) {
        this.idPelanggan = idPelanggan;
        this.namaUsaha = namaUsaha;
        this.alamat = alamat;
    }

    public String getIdPelanggan() { return idPelanggan; }
    public String getNamaUsaha() { return namaUsaha; }
    public String getAlamat() { return alamat; }

    public void setNamaUsaha(String namaUsaha) { this.namaUsaha = namaUsaha; }
    public void setAlamat(String alamat) { this.alamat = alamat; }
}
