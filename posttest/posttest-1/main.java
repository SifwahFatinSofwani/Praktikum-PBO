import java.util.ArrayList;
import java.util.Scanner;

public class main { 
    void main() {
        ArrayList<Daging> listDaging = new ArrayList<Daging>();
        ArrayList<Pelanggan> listPelanggan = new ArrayList<Pelanggan>();
        Scanner input = new Scanner(System.in);

        boolean masuk = true;

        while (masuk) {
            System.out.print("\n=== SISTEM MANAJEMEN MEATLOVE ===\n" +
                             "1. Tambah Daging\n" +
                             "2. Lihat Daging\n" +
                             "3. Ubah Daging\n" +
                             "4. Hapus Daging\n" +
                             "5. Tambah Pelanggan\n" +
                             "6. Lihat Pelanggan\n" +
                             "7. Ubah Pelanggan\n" +
                             "8. Hapus Pelanggan\n" +
                             "0. Keluar\n" +
                             "Pilih menu: ");
            int pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("\nKode Daging  : "); 
                    String kode = input.nextLine();
                    
                    System.out.print("Jenis Daging : "); 
                    String jenis = input.nextLine();
                    
                    System.out.print("Harga /kg    : "); 
                    double harga = input.nextDouble();
                    
                    System.out.print("Stok (kg)    : "); 
                    int stok = input.nextInt();
                    input.nextLine(); 
                    
                    listDaging.add(new Daging(kode, jenis, harga, stok));
                    System.out.println("Daging berhasil ditambah!");
                    break;

                case 2:
                    System.out.println("\n=== DAFTAR DAGING ===");
                    if (listDaging.size() == 0) {
                        System.out.println("Data masih kosong.");
                    } else {
                        for (int i = 0; i < listDaging.size(); i++) {
                            System.out.println((i+1) + ". Kode: " + listDaging.get(i).getKodeDaging() + " | Jenis: " + listDaging.get(i).getJenisDaging() + " | Harga: Rp" + listDaging.get(i).getHarga() + " | Stok: " + listDaging.get(i).getStok() + " kg");
                        }
                    }
                    break;

                case 3:
                    if (listDaging.size() == 0) {
                        System.out.println("Data kosong!");
                    } else {
                        for (int i = 0; i < listDaging.size(); i++) {
                            System.out.println((i+1) + ". " + listDaging.get(i).getJenisDaging());
                        }
                        System.out.print("Pilih nomor daging: ");
                        int indexDaging = input.nextInt() - 1;
                        input.nextLine();

                        if (indexDaging >= 0 && indexDaging < listDaging.size()) {
                            System.out.print("Ubah:\n1. Jenis\n2. Harga\n3. Stok\nPilih: ");
                            int ubah = input.nextInt(); 
                            input.nextLine(); 

                            if (ubah == 1) { 
                                System.out.print("Jenis baru: "); 
                                String jenisBaru = input.nextLine();
                                listDaging.get(indexDaging).setJenisDaging(jenisBaru); 
                            } 
                            else if (ubah == 2) { 
                                System.out.print("Harga baru: "); 
                                double hargaBaru = input.nextDouble();
                                input.nextLine();
                                listDaging.get(indexDaging).setHarga(hargaBaru); 
                            } 
                            else if (ubah == 3) { 
                                System.out.print("Stok baru: "); 
                                int stokBaru = input.nextInt();
                                input.nextLine(); 
                                listDaging.get(indexDaging).setStok(stokBaru); 
                            }
                            System.out.println("Berhasil diubah!");
                        } else {
                            System.out.println("Nomor tidak valid!");
                        }
                    }
                    break;

                case 4:
                    if (listDaging.size() == 0) {
                        System.out.println("Data kosong!");
                    } else {
                        for (int i = 0; i < listDaging.size(); i++) {
                            System.out.println((i+1) + ". " + listDaging.get(i).getJenisDaging());
                        }
                        System.out.print("Pilih nomor daging dihapus: ");
                        int hapusDaging = input.nextInt() - 1;
                        input.nextLine(); 
                        
                        if (hapusDaging >= 0 && hapusDaging < listDaging.size()) { 
                            listDaging.remove(hapusDaging); 
                            System.out.println("Terhapus!"); 
                        } else {
                            System.out.println("Nomor tidak valid!");
                        }
                    }
                    break;

                case 5:
                    System.out.print("\nID Pelanggan  : "); 
                    String id = input.nextLine();
                    
                    System.out.print("Nama Resto    : "); 
                    String nama = input.nextLine();
                    
                    System.out.print("Alamat Lengkap: "); 
                    String alamat = input.nextLine();
                    
                    listPelanggan.add(new Pelanggan(id, nama, alamat));
                    System.out.println("Pelanggan berhasil ditambah!");
                    break;

                case 6:
                    System.out.println("\n=== DAFTAR PELANGGAN ===");
                    if (listPelanggan.size() == 0) {
                        System.out.println("Data masih kosong.");
                    } else {
                        for (int i = 0; i < listPelanggan.size(); i++) {
                            System.out.println((i+1) + ". ID: " + listPelanggan.get(i).getIdPelanggan() + " | Nama: " + listPelanggan.get(i).getNamaUsaha() + " | Alamat: " + listPelanggan.get(i).getAlamat());
                        }
                    }
                    break;

                case 7:
                    if (listPelanggan.size() == 0) {
                        System.out.println("Data kosong!");
                    } else {
                        for (int i = 0; i < listPelanggan.size(); i++) {
                            System.out.println((i+1) + ". " + listPelanggan.get(i).getNamaUsaha());
                        }
                        System.out.print("Pilih nomor pelanggan: ");
                        int indexPelanggan = input.nextInt() - 1;
                        input.nextLine();

                        if (indexPelanggan >= 0 && indexPelanggan < listPelanggan.size()) {
                            System.out.print("Ubah:\n1. Nama\n2. Alamat\nPilih: ");
                            int ubah = input.nextInt(); 
                            input.nextLine(); 

                            if (ubah == 1) { 
                                System.out.print("Nama baru: "); 
                                String namaBaru = input.nextLine();
                                listPelanggan.get(indexPelanggan).setNamaUsaha(namaBaru); 
                            } 
                            else if (ubah == 2) { 
                                System.out.print("Alamat baru: "); 
                                String alamatBaru = input.nextLine();
                                listPelanggan.get(indexPelanggan).setAlamat(alamatBaru); 
                            }
                            System.out.println("Berhasil diubah!");
                        } else {
                            System.out.println("Nomor tidak valid!");
                        }
                    }
                    break;

                case 8:
                    if (listPelanggan.size() == 0) {
                        System.out.println("Data kosong!");
                    } else {
                        for (int i = 0; i < listPelanggan.size(); i++) {
                            System.out.println((i+1) + ". " + listPelanggan.get(i).getNamaUsaha());
                        }
                        System.out.print("Pilih nomor pelanggan dihapus: ");
                        int hapusPelanggan = input.nextInt() - 1;
                        input.nextLine(); 
                        
                        if (hapusPelanggan >= 0 && hapusPelanggan < listPelanggan.size()) { 
                            listPelanggan.remove(hapusPelanggan); 
                            System.out.println("Terhapus!"); 
                        } else {
                            System.out.println("Nomor tidak valid!");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Sampai jumpa!");
                    masuk = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
            if (masuk) {
                System.out.print("\nTekan Enter untuk kembali...");
                input.nextLine(); 
            }
        }
    }
}