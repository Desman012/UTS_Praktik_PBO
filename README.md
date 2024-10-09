# Aplikasi Reservasi Hotel berbasis CLI
Aplikasi ini dibuat untuk memenuhi tugas uts praktik Mata Kuliah Pemrograman Berorientasi Objek (PBO).
Aplikasi ini dibuat dengan menggunakan bahasa pemrograman Java dengan tampilan berbasis terminal (CLI).
Adapun sudut pandang pembuatan aplikasi ini, yaitu:
- Aplikasi ini digunakan oleh repsesionis untuk mendata pemesan kamar hotel
- Aplikasi ini memiliki dua role yaitu, admin dan user. Untuk pembuatan akun sepenuhnya hanya bisa dilakukan oleh role admin, sehingga akun user sudah dibuat oleh admin.
## Fitur Aplikasi 
- Role Admin:
  - Dapat mengelola akun user/admin:
    - Menambahkan akun (Admin/User)
    - Mengubah akun (Admin/User)
    - Menghapus akun (Admin/User)
    - Melihat daftar akun
  - Dapat mengelola data kamar:
    - Menambahkan data kamar
    - Mengubah data kamar
    - Menghapus data kamar
    - Melihat daftar data kamar
- Role User:
  - Melakukan pesan kamar
  - Melihat daftar pesanan
  - Melihat kamar yang tersedia
  - Melihat detail pesanan
## Struktur direktori file:
```
📦UTS_Praktik_PBO
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
     - `UmumInterface.java` adalah interface yang berisikan variabel yang bisa digunakan untuk ke semua kelas, dalam project ini yaitu mendefinisikan panjang array dengan nama variabel maksLen
  5. main
     Berisikan file atau kelas java untuk dijalankan (main program).
  7. model
     Berisikan file java atau kelas yang berfungsi untuk menangani penyimpanan data dengan menggunakan method setter getter

