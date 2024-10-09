package model;
import interfacex.UmumInterface;

public class Pesan extends Kamar implements UmumInterface {
//    menginisialisasikan variabel konstanta dengan array
//    menggunakan maksimal panjang dari variable maksLen di UmumInterface
   private final String[] idPemesan = new String[maksLen];
   private final String[] namaPemesan = new String[maksLen];
   private final String[] noTelp = new String[maksLen];
   private final int[] kamarPesan = new int[maksLen];
   private final String[] akunUser = new String[maksLen];
   private final String[] tanggal = new String[maksLen];
   private final int[] jumlahMalam = new int[maksLen];
   private final double[] totalHarga = new double[maksLen];

//   membuat method setter getter untuk setiap variabel
   protected void setIdPemesan(String idPemesan, int index) {
      this.idPemesan[index] = idPemesan;
   }
   protected String getIdPemesan(int index) {
      return this.idPemesan[index];
   }

   protected void setNamaPemesan(String namaPemesan, int index) {
      this.namaPemesan[index] = namaPemesan;
   }
   protected String getNamaPemesan(int index) {
      return this.namaPemesan[index];
   }

   protected void setNoTelp(String noTelp, int index) {
      this.noTelp[index] = noTelp;
   }
   protected String getNoTelp(int index) {
      return this.noTelp[index];
   }

   protected void setTanggal(String tanggal, int index) {
      this.tanggal[index] = tanggal;
   }
   protected String getTanggal(int index) {
      return this.tanggal[index];
   }
   
   protected void setKamarPesan(int kamarPesan, int index) {
      this.kamarPesan[index] = kamarPesan;
   }
   protected int getKamarPesan(int index) {
      return this.kamarPesan[index];
   }

   protected void setJumlahMalam(int jumlahMalam, int index) {
      this.jumlahMalam[index] = jumlahMalam;
   }
   protected int getJumlahMalam(int index) {
      return this.jumlahMalam[index];
   }

   protected void setTotalHarga(double totalHarga, int index) {
      this.totalHarga[index] = totalHarga;
   }
   protected double getTotalHarga(int index) {
      return this.totalHarga[index];
   }
   
   protected void setAkunUser(String akunUser, int index) {
      this.akunUser[index] = akunUser;
   }
   protected String getAkunUser(int index) {
      return this.akunUser[index];
   }
}
