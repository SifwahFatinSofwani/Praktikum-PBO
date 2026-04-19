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
                1. Manajemen Daging
                2. Manajemen Pelanggan
                3. Manajemen Pegawai
                0. Keluar
                Pilih menu:\s""");
        int pilihanUtama = input.nextInt();
        input.nextLine();

        switch (pilihanUtama) {
            case 1:
                boolean subDaging = true;
                while (subDaging) {
                    System.out.print("""
                            
                            --- MANAJEMEN DAGING ---
                            1. Tambah Daging
                            2. Lihat Daging
                            3. Ubah Daging
                            4. Hapus Daging
                            0. Kembali
                            Pilih menu:\s""");
                    int pilDaging = input.nextInt();
                    input.nextLine();

                    switch (pilDaging) {
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
                                        System.out.println("Berhasil diubah!");
                                    } else if (ubah == 2) {
                                        System.out.print("Harga baru: ");
                                        listDaging.get(indexDaging).setHarga(input.nextDouble());
                                        input.nextLine();
                                        System.out.println("Berhasil diubah!");
                                    } else if (ubah == 3) {
                                        System.out.print("1. Set Angka Stok Baru\n2. Tambah/Kurangi Stok Sesuai Transaksi\nPilih: ");
                                        int opsiStok = input.nextInt();
                                        input.nextLine();
                                        if (opsiStok == 1) {
                                            System.out.print("Masukkan stok baru: ");
                                            listDaging.get(indexDaging).setStok(input.nextInt());
                                            input.nextLine();
                                        } else {
                                            System.out.print("1. Daging Masuk (Tambah)\n2. Daging Terjual (Kurang)\nPilih: ");
                                            boolean isTambah = (input.nextInt() == 1);
                                            input.nextLine();
                                            System.out.print("Masukkan jumlah: ");
                                            int jumlah = input.nextInt();
                                            input.nextLine();
                                            listDaging.get(indexDaging).setStok(jumlah, isTambah);
                                        }
                                        System.out.println("Stok berhasil diperbarui!");
                                    }
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
                        case 0:
                            subDaging = false;
                            break;
                        default:
                            System.out.println("Pilihan tidak valid!");
                    }
                }
                break;

            case 2:
                boolean subPelanggan = true;
                while (subPelanggan) {
                    System.out.print("""
                            
                            --- MANAJEMEN PELANGGAN ---
                            1. Tambah Pelanggan
                            2. Lihat Pelanggan
                            3. Ubah Pelanggan
                            4. Hapus Pelanggan
                            0. Kembali
                            Pilih menu:\s""");
                    int pilPelanggan = input.nextInt();
                    input.nextLine();

                    switch (pilPelanggan) {
                        case 1:
                            System.out.print("\nID Pelanggan  : ");
                            String id = input.nextLine();
                            System.out.print("Nama Resto    : ");
                            String nama = input.nextLine();
                            System.out.print("Alamat Lengkap: ");
                            String alamat = input.nextLine();
                            listPelanggan.add(new Pelanggan(id, nama, alamat));
                            System.out.println("Pelanggan berhasil ditambah!");
                            break;
                        case 2:
                            System.out.println("\n=== DAFTAR PELANGGAN ===");
                            if (listPelanggan.isEmpty()) {
                                System.out.println("Data masih kosong.");
                            } else {
                                for (int i = 0; i < listPelanggan.size(); i++) {
                                    System.out.println((i+1) + ". ID: " + listPelanggan.get(i).getIdPelanggan() + " | Nama: " + listPelanggan.get(i).getNamaUsaha() + " | Alamat: " + listPelanggan.get(i).getAlamat());
                                }
                            }
                            break;
                        case 3:
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
                        case 4:
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
                        case 0:
                            subPelanggan = false;
                            break;
                        default:
                            System.out.println("Pilihan tidak valid!");
                    }
                }
                break;

            case 3:
                boolean subPegawai = true;
                while (subPegawai) {
                    System.out.print("""
                            
                            --- MANAJEMEN PEGAWAI ---
                            1. Tambah Pegawai
                            2. Lihat Pegawai
                            3. Ubah Pegawai (Ubah Gaji)
                            4. Hapus Pegawai
                            0. Kembali
                            Pilih menu:\s""");
                    int pilPegawai = input.nextInt();
                    input.nextLine();

                    switch (pilPegawai) {
                        case 1:
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
                            System.out.print("Gaji Awal    : Rp");
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
                        case 2:
                            System.out.println("\n=== DAFTAR PEGAWAI ===");
                            if (listPegawai.isEmpty()) {
                                System.out.println("Data masih kosong.");
                            } else {
                                for (int i = 0; i < listPegawai.size(); i++) {
                                    Pegawai p = listPegawai.get(i);
                                    System.out.print((i+1) + ". ");
                                    p.tampilkanData();
                                    System.out.print("   Aktivitas: ");
                                    p.bekerja();
                                    System.out.print("   Status Shift: ");
                                    p.mulaiShift();
                                }
                            }
                            break;
                        case 3:
                            if (listPegawai.isEmpty()) {
                                System.out.println("Data kosong!");
                            } else {
                                for (int i = 0; i < listPegawai.size(); i++) {
                                    System.out.println((i+1) + ". " + listPegawai.get(i).namaPegawai);
                                }
                                System.out.print("Pilih nomor pegawai untuk dinaikkan gajinya: ");
                                int indexPegawai = input.nextInt() - 1;
                                input.nextLine();

                                if (indexPegawai >= 0 && indexPegawai < listPegawai.size()) {
                                    System.out.print("Pilih Tipe Kenaikan:\n1. Nominal Rupiah\n2. Persentase (%)\nPilih: ");
                                    int opsiGaji = input.nextInt();
                                    input.nextLine();

                                    if (opsiGaji == 1) {
                                        System.out.print("Masukkan Tambahan Gaji: Rp");
                                        double nominal = input.nextDouble();
                                        input.nextLine();
                                        listPegawai.get(indexPegawai).naikGaji(nominal);
                                    } else if (opsiGaji == 2) {
                                        System.out.print("Masukkan Persentase Kenaikan (%): ");
                                        int persen = input.nextInt();
                                        input.nextLine();
                                        listPegawai.get(indexPegawai).naikGaji(persen);
                                    } else {
                                        System.out.println("Opsi tidak valid.");
                                    }
                                } else {
                                    System.out.println("Nomor tidak valid!");
                                }
                            }
                            break;
                        case 4:
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
                            subPegawai = false;
                            break;
                        default:
                            System.out.println("Pilihan tidak valid!");
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