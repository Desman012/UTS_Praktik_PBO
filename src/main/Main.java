package main;
//memanggil packages controller untuk menggunakan kelas AdminController
import controller.AdminController;
//memanggil library untuk fungsi input
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean loop = true;
//        menginisialisasikan objek untuk fungsi input
        Scanner sc = new Scanner(System.in);
//        menginisialisasikan objek untuk kelas AdminController
//        mengisi nilai untuk konstruktor kelas AdminController
        AdminController usr = new AdminController("Admin", "admin123", "admin", "admin");
        while(loop) {
            System.out.println("\n\n======== Aplikasi Reservasi Hotel ========");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Silahkan pilih(1/2): ");
            switch (sc.nextLine()) {
                case "1":
                    while(true) {
                        System.out.println("\n\n================ Login ================");
                        System.out.print("username\t: ");
                        String username = sc.nextLine();
                        System.out.print("password\t: ");
                        String password = sc.nextLine();
                        if (usr.validasiLogin(username, password)) {
                            if (usr.isAdmin(username)) {
                                usr.tampilMenuAdmin();
                            } else {
                                usr.tampilMenuCustomer();
                            }
                            break;
                        }else{
                            System.out.println("Username atau Password salah");
                        }
                    }
                    break;
                case "2":
                    System.out.println("\n\n========== Keluar Aplikasi ==========");
                    loop = false;
                    break;
            }
        } 
    }
}
