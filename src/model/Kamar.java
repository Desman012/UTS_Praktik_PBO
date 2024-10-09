package model;
import interfacex.UmumInterface;

public class Kamar implements UmumInterface {
//    menginisialisasikan variabel konstanta dengan array
//    menggunakan maksimal panjang dari variable maksLen di UmumInterface
   private final int[] nomorKamar = new int[maksLen];
   private final int[] hargaKamar = new int[maksLen];
   private final String[] deskripsiKamar = new String[maksLen];
   private final String[] tersediaKamar = new String[maksLen];

//   membuat method setter getter untuk setiap variabel
   protected void setNomorKamar(int nomorKamar, int index) {
      this.nomorKamar[index] = nomorKamar;
   }
   protected int getNomorKamar(int index) {
      return this.nomorKamar[index];
   }

   protected void setHarga(int hargaKamar, int index) {
      this.hargaKamar[index] = hargaKamar;
   }
   protected int getHarga(int index) {
      return this.hargaKamar[index];
   }

   protected void setDeskripsi(String deskripsiKamar, int index) {
      this.deskripsiKamar[index] = deskripsiKamar;
   }
   protected String getDeskripsi(int index) {
      return this.deskripsiKamar[index];
   }

   protected void setTersedia(String tersediaKamar, int index) {
      this.tersediaKamar[index] = tersediaKamar;
   }
   protected String getTersedia(int index) {
      return this.tersediaKamar[index];
   }
}
