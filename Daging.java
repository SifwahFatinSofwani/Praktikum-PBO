class Daging {
    private String kodeDaging;
    private String jenisDaging;
    private double harga;
    private int stok;

    Daging(String kodeDaging, String jenisDaging, double harga, int stok) {
        this.kodeDaging = kodeDaging;
        this.jenisDaging = jenisDaging;
        this.harga = harga;
        this.stok = stok;
    }

    String getKodeDaging() { 
        return kodeDaging; 
        }
        
    String getJenisDaging() { 
        return jenisDaging; 
        }

    double getHarga() {
        return harga; 
        }

    int getStok() { 
        return stok; 
        }

    void setJenisDaging(String jenisDaging) { 
        this.jenisDaging = jenisDaging; 
        }

    void setHarga(double harga) { 
        this.harga = harga; 
        }

    void setStok(int stok) { 
        this.stok = stok; 
        }
}