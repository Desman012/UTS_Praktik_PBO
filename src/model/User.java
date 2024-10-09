package model;
import interfacex.UmumInterface;

public class User implements UmumInterface {
//    menginisialisasikan variabel konstanta dengan array
//    menggunakan maksimal panjang dari variable maksLen di UmumInterface
   private final String[] username = new String[maksLen];
   private final String[] password = new String[maksLen];
   private final String[] namaPengguna = new String[maksLen];
   private final String[] hakAkses = new String[maksLen];

//   membuat method setter getter untuk setiap variabel
   protected void setUsername(String username, int index) {
      this.username[index] = username;
   }
   protected String getUsername(int index) {
      return this.username[index];
   }

   protected void setPassword(String password, int index) {
      this.password[index] = password;
   }
   protected String getPassword(int index) {
      return this.password[index];
   }

   protected void setNamaPengguna(String namaPengguna, int index) {
      this.namaPengguna[index] = namaPengguna;
   }
   protected String getNamaPengguna(int index) {
      return this.namaPengguna[index];
   }

   protected void setHakAkses(String hakAkses, int index) {
      this.hakAkses[index] = hakAkses;
   }
   protected String getHakAkses(int index) {
      return this.hakAkses[index];
   }
}
