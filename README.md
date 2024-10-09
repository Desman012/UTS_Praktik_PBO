# Aplikasi Reservasi Hotel berbasis CLI
Aplikasi ini dibuat untuk memenuhi tugas uts praktik Mata Kuliah Pemrograman Berorientasi Objek (PBO).
Aplikasi ini dibuat dengan menggunakan bahasa pemrograman Java dengan tampilan berbasis terminal (CLI).
- Aplikasi ini memiliki dua role yaitu, admin dan customer. Untuk pembuatan akun sepenuhnya hanya bisa dilakukan oleh role admin, sehingga akun customer sudah dibuat oleh admin yang berarti akun customer tidak bisa register sendiri.
- Role admin digunakan oleh repsesionis hotel.

## Penggunaan aplikasi
- Dengan membuka folder/direktori `src > main`, lalu jalankan file `main.java`.
- Nama akun dan password:
  1. **Akun Admin:**
     - **Username : Admin**
     - **Password : admin123**

  2. **Akun Customer:**
     - **Username : Customer@unsika**
     - **Password : customer123**
    
## Fitur Aplikasi 
- Role Admin:
  - Dapat mengelola akun customer/admin:
    - Menambahkan akun (Admin/customer)
    - Mengubah akun (Admin/customer)
    - Menghapus akun (Admin/customer)
    - Melihat daftar akun
  - Dapat mengelola data kamar:
    - Menambahkan data kamar
    - Mengubah data kamar
    - Menghapus data kamar
    - Melihat daftar data kamar
- Role Customer:
  - Melakukan pesan kamar
  - Melihat histori pesanan
  - Melihat kamar yang tersedia
  - Melihat histori detail pesanan
  
## Struktur direktori file:
```
📦UTS_Praktik_PBO
 ┣ 📂build
 ┃ ┗ 📂classes
 ┣ 📂nbproject
 ┣ 📂src
 ┃ ┣ 📂controller
 ┃ ┃ ┣ 📜AdminController.java
 ┃ ┃ ┣ 📜CustomerController.java
 ┃ ┃ ┗ 📜KamarANDPesanController.java
 ┃ ┣ 📂interfacex
 ┃ ┃ ┣ 📜KelolaKamar.java
 ┃ ┃ ┣ 📜KelolaPesanan.java
 ┃ ┃ ┣ 📜KelolaUser.java
 ┃ ┃ ┗ 📜UmumInterface.java
 ┃ ┣ 📂main
 ┃ ┃ ┗ 📜Main.java
 ┃ ┗ 📂model
 ┃ ┃ ┣ 📜Kamar.java
 ┃ ┃ ┣ 📜Pesan.java
 ┃ ┃ ┗ 📜User.java
 ┣ 📂test
 ┣ 📜build.xml
 ┗ 📜manifest.mf
```
**Penjelasan:**
  1. controller
     Berisikan file java atau kelas yang berfungsi untuk mengelola dan mengatur aplikasi. Terdapat 3 file java, yaitu:
     - `AdminController.java` berfungsi untuk mengelola tampilan output dan input serta fungsi atau fitur untuk role admin
     - `CustomerController.java` berfungsi untuk mengelola tampilan output dan input serta fungsi atau fitur untuk role user
     - `KamarANDPesanController.java` berfungsi untuk mengelola tampilan output dan input serta fungsi atau fitur yang berkenaan dengan pengelolaan kamar dan pesanan.
  
  3. interfacex
     Berisikan file java atau interface yang berisikan method-method yang akan dipanggil (implements) oleh kelas lain. Terdapat beberapa file interface java, yaitu:
     - `KelolaKamar.java` adalah interface yang berisikan method abstract untuk mengelola kamar, yaitu tambah, hapus, ubah dan daftar kelas
     - `KelolaPesanan.java` adalah interface yang berisikan method abstract untuk mengelola pesanan, yaitu tambah, hapus, ubah dan daftar pesanan
     - `KelolaUser.java` adalah interface yang berisikan method abstract untuk mengelola user, yaitu tambah, hapus, ubah dan daftar user
     - `UmumInterface.java` adalah interface yang berisikan variabel dan method yang bisa digunakan untuk ke semua kelas, dalam project ini yaitu mendefinisikan panjang array dengan nama variabel `maksLen`
      
  4. main
     Berisikan file atau kelas java untuk dijalankan (main program).
     
  6. model
     Berisikan file java atau kelas yang berfungsi untuk menangani penyimpanan data dengan menggunakan method setter getter. Terdapat beberapa file kelas java, yaitu:
     - `Kamar.java` adalah file kelas java untuk menangani pemnyimpanan dan mendapatkan data kamar, dengan menggunakan method setter getter
     - `Pesan.java` adalah file kelas java untuk menangani pemnyimpanan dan mendapatkan data pesanan, dengan menggunakan method setter getter
     - `User.java` adalah file kelas java untuk menangani pemnyimpanan dan mendapatkan data user, dengan menggunakan method setter getter
       
## Teknologi yang dipakai
- Java JDK 18
- Apache Netbeans IDE 14
  
### Require list Tugas
- [x] Menggunakan class, object, variable dan method
- [x] Menggunakan tipe data, paramater, argument, dan konstruktor
- [x] Mengelompokkan ke beberapa package
- [x] Menggunakan konsep Inheritance
- [x] Menggunakan konsep enkapsulasi (public, private, protected)
- [x] Menggunakan konsep polymorphism (konsep overload, dan override)
- [x] Menggunakan konsep abstrak (interface)
- [x] Menggunakan struktur kontrol percabangan (if, if-else, switch)
- [x] Menggunakan struktur kontrol perulangan (while, for) [sudah dijelaskan oleh ibu ratna].
- [x] Menggunakan library `java.util.Scanner` untuk fungsi input

### Penambahan keyword:
Ada beberapa penambahan yang saya lakukan, yang belum diperlajari atau tidak perlajari baik itu keyword atau fungsi, yaitu:
- `.equals(val)` berfungsi untuk membanding kedua variable dengan tipe data String, dimana fungsinya sama dengan operator pembanding `==`
- Penggunaan tipe data array. di program ini saya menggunakan inisialisasi array yaitu
  `tipe_data [] nama_variable = new tipe_data [panjang_array];`
  
## Kekurangan aplikasi
- belum ada validasi input
- customer/user belum bisa membuat akunnya sendiri


