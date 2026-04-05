import com.core.Pelanggan;
import com.core.Daging;
import com.core.Pegawai;
import com.core.Kasir;
import com.core.PemotongDaging;
import com.core.Kurir;

import java.util.ArrayList;
import java.util.Scanner;

void main() {
    ArrayList<Daging> listDaging = new ArrayList<>();
    ArrayList<Pelanggan> listPelanggan = new ArrayList<>();
    ArrayList<Pegawai> listPegawai = new ArrayList<>();

    Scanner input = new Scanner(System.in);
    boolean masuk = true;

    while (masuk) {
        System.out.print("""
                
                === SISTEM MANAJEMEN MEATLOVE ===
                1. Tambah Daging
                2. Lihat Daging
                3. Ubah Daging
                4. Hapus Daging
                5. Tambah Pelanggan
                6. Lihat Pelanggan
                7. Ubah Pelanggan
                8. Hapus Pelanggan
                9. Tambah Pegawai
                10. Lihat Pegawai
                11. Ubah Pegawai
                12. Hapus Pegawai
                0. Keluar
                Pilih menu:\s""");
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
                if (listDaging.isEmpty()) {
                    System.out.println("Data masih kosong.");
                } else {
                    for (int i = 0; i < listDaging.size(); i++) {
                        System.out.println((i+1) + ". Kode: " + listDaging.get(i).getKodeDaging() + " | Jenis: " + listDaging.get(i).getJenisDaging() + " | Harga: Rp" + listDaging.get(i).getHarga() + " | Stok: " + listDaging.get(i).getStok() + " kg");
                    }
                }
                break;
            case 3:
                if (listDaging.isEmpty()) {
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
                            listDaging.get(indexDaging).setJenisDaging(input.nextLine());
                        } else if (ubah == 2) {
                            System.out.print("Harga baru: ");
                            listDaging.get(indexDaging).setHarga(input.nextDouble());
                            input.nextLine();
                        } else if (ubah == 3) {
                            System.out.print("Stok baru: ");
                            listDaging.get(indexDaging).setStok(input.nextInt());
                            input.nextLine();
                        }
                        System.out.println("Berhasil diubah!");
                    } else {
                        System.out.println("Nomor tidak valid!");
                    }
                }
                break;
            case 4:
                if (listDaging.isEmpty()) {
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
                if (listPelanggan.isEmpty()) {
                    System.out.println("Data masih kosong.");
                } else {
                    for (int i = 0; i < listPelanggan.size(); i++) {
                        System.out.println((i+1) + ". ID: " + listPelanggan.get(i).getIdPelanggan() + " | Nama: " + listPelanggan.get(i).getNamaUsaha() + " | Alamat: " + listPelanggan.get(i).getAlamat());
                    }
                }
                break;
            case 7:
                if (listPelanggan.isEmpty()) {
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
                            listPelanggan.get(indexPelanggan).setNamaUsaha(input.nextLine());
                        } else if (ubah == 2) {
                            System.out.print("Alamat baru: ");
                            listPelanggan.get(indexPelanggan).setAlamat(input.nextLine());
                        }
                        System.out.println("Berhasil diubah!");
                    } else {
                        System.out.println("Nomor tidak valid!");
                    }
                }
                break;
            case 8:
                if (listPelanggan.isEmpty()) {
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
            case 9:
                System.out.println("\n--- Pilih Jabatan Pegawai ---");
                System.out.println("1. Kasir\n2. Pemotong Daging\n3. Kurir");
                System.out.print("Pilih: ");
                int jabatan = input.nextInt();
                input.nextLine();
                if (jabatan < 1 || jabatan > 3) {
                    System.out.println("Pilihan jabatan tidak valid!");
                    break;
                }
                System.out.print("ID Pegawai   : ");
                String idPegawai = input.nextLine();
                System.out.print("Nama Pegawai : ");
                String namaPegawai = input.nextLine();
                System.out.print("Gaji         : ");
                double gaji = input.nextDouble();
                input.nextLine();
                System.out.print("Shift Kerja  : ");
                String shift = input.nextLine();

                if (jabatan == 1) {
                    System.out.print("Nomor Laci Kasir: ");
                    int laci = input.nextInt();
                    input.nextLine();
                    listPegawai.add(new Kasir(idPegawai, namaPegawai, gaji, shift, laci));
                } else if (jabatan == 2) {
                    System.out.print("Jenis Pisau Utama: ");
                    String pisau = input.nextLine();
                    listPegawai.add(new PemotongDaging(idPegawai, namaPegawai, gaji, shift, pisau));
                } else if (jabatan == 3) {
                    System.out.print("Plat Kendaraan Kurir: ");
                    String plat = input.nextLine();
                    listPegawai.add(new Kurir(idPegawai, namaPegawai, gaji, shift, plat));
                }
                System.out.println("Pegawai berhasil ditambah!");
                break;
            case 10:
                System.out.println("\n=== DAFTAR PEGAWAI ===");
                if (listPegawai.isEmpty()) {
                    System.out.println("Data masih kosong.");
                } else {
                    for (int i = 0; i < listPegawai.size(); i++) {
                        Pegawai p = listPegawai.get(i);
                        String infoDasar = (i+1) + ". [" + p.getIdPegawai() + "] " + p.namaPegawai + " | Gaji: Rp" + p.getGaji();
                        if (p instanceof Kasir) {
                            System.out.println(infoDasar + " | Jabatan: Kasir | Laci: " + ((Kasir) p).getNomorLaci());
                        } else if (p instanceof PemotongDaging) {
                            System.out.println(infoDasar + " | Jabatan: Pemotong | Pisau: " + ((PemotongDaging) p).getJenisPisau());
                        } else if (p instanceof Kurir) {
                            System.out.println(infoDasar + " | Jabatan: Kurir | Plat: " + ((Kurir) p).getPlatKendaraan());
                        } else {
                            System.out.println(infoDasar + " | Jabatan: Pegawai Umum");
                        }
                    }
                }
                break;
            case 11:
                if (listPegawai.isEmpty()) {
                    System.out.println("Data kosong!");
                } else {
                    for (int i = 0; i < listPegawai.size(); i++) {
                        System.out.println((i+1) + ". " + listPegawai.get(i).namaPegawai);
                    }
                    System.out.print("Pilih nomor pegawai untuk diubah gajinya: ");
                    int indexPegawai = input.nextInt() - 1;
                    input.nextLine();
                    if (indexPegawai >= 0 && indexPegawai < listPegawai.size()) {
                        System.out.print("Masukkan Gaji Baru: Rp");
                        double gajiBaru = input.nextDouble();
                        input.nextLine();
                        listPegawai.get(indexPegawai).setGaji(gajiBaru);
                        System.out.println("Gaji berhasil diperbarui!");
                    } else {
                        System.out.println("Nomor tidak valid!");
                    }
                }
                break;
            case 12:
                if (listPegawai.isEmpty()) {
                    System.out.println("Data kosong!");
                } else {
                    for (int i = 0; i < listPegawai.size(); i++) {
                        System.out.println((i+1) + ". " + listPegawai.get(i).namaPegawai);
                    }
                    System.out.print("Pilih nomor pegawai dihapus: ");
                    int hapusPegawai = input.nextInt() - 1;
                    input.nextLine();
                    if (hapusPegawai >= 0 && hapusPegawai < listPegawai.size()) {
                        listPegawai.remove(hapusPegawai);
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
    }
}