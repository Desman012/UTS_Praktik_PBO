package interfacex;
public interface KelolaUser{
   void menuTambahUser();
   void menuUbahUser();
   void menuHapusUser();
   void daftarUser();
   int getIndexUser();
//   menerapkan konsep overload
   int getIndexUser(String username);
}
