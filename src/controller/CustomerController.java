package controller;
import java.util.Scanner;
import model.User;

public class CustomerController extends User {
//    menginisialisasikan objek untuk fungsi input
   private final Scanner sc = new Scanner(System.in);
//   menginisialisasikan objek untuk kelas pengaturan kamar dan pesanan hotel
   protected final KamarANDPesanController kp = new KamarANDPesanController();

//   method untuk menampilkan menu pilihan cutomer
   public void tampilMenuCustomer() {
      while(true) {
         System.out.println("\n\n============ Pilihan Menu ============");
         System.out.println("1. Pesan Kamar");
         System.out.println("2. Daftar Pesanan");
         System.out.println("3. Detail Pesanan");
         System.out.println("4. Kamar Tersedia");
         System.out.println("00. Logout");
         System.out.print("Silahkan pilih(1/2/3/00):");
         switch (sc.nextLine()) {
            case "1":
               kp.menuTambahPesanan();
               break;
            case "2":
               kp.daftarPesanan();
               break;
            case "3":
               kp.menuDetailPesanan();
               break;
            case "4":
               kp.daftarKamar("tersedia");
               break;
            case "00":
               return;
            default:
               System.out.println("Tidak ada pilihan\n");
         }
      }
   }
}
