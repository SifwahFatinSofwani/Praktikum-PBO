class Pelanggan {
    private String idPelanggan;
    private String namaUsaha;
    private String alamat;

    Pelanggan(String idPelanggan, String namaUsaha, String alamat) {
        this.idPelanggan = idPelanggan;
        this.namaUsaha = namaUsaha;
        this.alamat = alamat;
    }

    String getIdPelanggan() { 
        return idPelanggan; 
        }
    String getNamaUsaha() { 
        return namaUsaha; 
        }
    String getAlamat() { 
        return alamat; 
        }

    void setNamaUsaha(String namaUsaha) { 
        this.namaUsaha = namaUsaha; 
        }

    void setAlamat(String alamat) { 
        this.alamat = alamat; 
        }
}