package interfacex;
public interface KelolaPesanan {
   public int getIndexPesanan();
//   menerapkan konsep overload
   public int getIndexPesanan(String idPemesan);
   public void daftarPesanan();
   public void menuTambahPesanan();
   public void menuDetailPesanan();
}
