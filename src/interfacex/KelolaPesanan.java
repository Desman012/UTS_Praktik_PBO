package interfacex;
public interface KelolaPesanan {
   public int getIndexPesanan();
//   menerapkan konsep overload
   public int getIndexPesanan(String idPemesan);
   public void daftarPesanan(String akunUser);
   public void menuTambahPesanan(String akunUser);
   public void menuDetailPesanan(String akunUser);
}
