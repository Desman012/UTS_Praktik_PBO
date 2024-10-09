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
<br>
## Struktur direktori file:
|- Src
|  |- controller
|  |  |- AdminController.java
|  |  |- CustomerController.java
- Nama package:
  1. model
     Berisikan file java atau kelas yang berfungsi untuk
