Sistem Manajemen Toko Daging Meatlove Posttest 1

Deskripsi
Sistem Manajemen Meatlove adalah sebauah sistem ang ditulis menggunakan bahasa pemrograman Java dimana program ini dirancang untuk memenuhi tugas Posttest 1 Praktikum Pemrograman Berorientasi Objek (PBO). 
Sistem ini memfasilitasi pengguna untuk melakukan manajemen data inventaris daging dan data pelanggan dengan mudah.

## Fitur Program
Program ini mengimplementasikan konsep operasi dasar CRUD (Create, Read, Update, Delete) menggunakan tipe data koleksi `ArrayList` untuk menyimpan objek secara dinamis di dalam memori saat program berjalan. 

Sistem ini memiliki menu utama sebagai berikut:

**Manajemen Daging**
* `1. Tambah Daging` : Memasukkan data daging baru (Kode, Jenis, Harga per kg, dan Stok dalam kg).
* `2. Lihat Daging` : Menampilkan daftar lengkap data daging yang telah diinputkan.
* `3. Ubah Daging` : Memperbarui rincian data daging tertentu (bisa mengubah Jenis, Harga, atau Stok).
* `4. Hapus Daging` : Menghapus data daging dari dalam sistem.

**Manajemen Pelanggan**
* `5. Tambah Pelanggan` : Memasukkan data pelanggan/restoran baru (ID, Nama Usaha, dan Alamat Lengkap).
* `6. Lihat Pelanggan` : Menampilkan daftar semua pelanggan yang sudah didaftarkan.
* `7. Ubah Pelanggan` : Memperbarui informasi data pelanggan (bisa mengubah Nama Usaha atau Alamat).
* `8. Hapus Pelanggan` : Menghapus data pelanggan dari sistem.

**Lainnya**
* `0. Keluar` : Mengakhiri dan menutup program.

## Struktur File dan Penjelasan Kode
Proyek ini menerapkan konsep *Object-Oriented Programming* (OOP) dasar seperti *Encapsulation* dan dibagi menjadi 3 kelas utama:

1. **`Daging.java` (Kelas Model)**
   Berfungsi untuk merepresentasikan objek Daging. Kelas ini menyimpan properti dengan hak akses *private* (`kodeDaging`, `jenisDaging`, `harga`, `stok`) untuk menjaga keamanan data, serta menyediakan metode *getter* dan *setter* untuk mengakses dan mengubah nilai properti tersebut.
2. **`Pelanggan.java` (Kelas Model)**
   Berfungsi untuk merepresentasikan objek Pelanggan. Menyimpan properti dengan hak akses *private* (`idPelanggan`, `namaUsaha`, `alamat`) serta menyediakan metode *getter* dan *setter*.
3. **`main.java` (Kelas Utama/Driver Class)**
   Merupakan inti tempat berjalannya program. Kelas ini memuat antarmuka menu interaktif menggunakan `Scanner` untuk menerima *input* dari pengguna. Logika *looping* (while) dan percabangan (switch-case) digunakan di sini untuk mengeksekusi aksi CRUD terhadap `ArrayList<Daging>` dan `ArrayList<Pelanggan>`.

## Prasyarat
Pastikan Java Development Kit (JDK) telah terinstal pada sistem komputer Anda untuk dapat mengompilasi dan menjalankan program ini.

## Cara Menjalankan Program
1. Buka *Terminal* atau *Command Prompt*.
2. Navigasikan ke direktori folder tempat kode program ini disimpan.
3. Lakukan kompilasi seluruh file Java dengan menjalankan perintah berikut:
   ```bash
   javac main.java Daging.java Pelanggan.java
