package controller;
//memanggil package untuk interface
import interfacex.KelolaUser;
//memanggil library untuk memanggil fungsi input
import java.util.Scanner;

//inheritance dari kelas CustomerController dan implements interface KelolaUser
public class AdminController extends CustomerController implements KelolaUser {
//    menginisialisasikan objek untuk fungsi input
   private final Scanner sc = new Scanner(System.in);
//   menginisialisasikan variabel string getUsername untuk menyimpan nilai username
   private String getUsername;

//   method untuk mendapatkan index user kosong
   @Override
    public int getIndexUser() {
        int index = -1;
        for(int i = 0; i < maksLen; ++i) {
            if (getUsername(i) == null) {
                index = i;
                break;
            }
        }
        return index;
    }


//   Method untuk mencari indexks dari username yang sama
   @Override
    public int getIndexUser(String username) {
        int index = -1;
        for(int i = 0; i < getIndexUser(); ++i) {
            if (getUsername(i).equals(username)) {
                index = i;
                break;
            }
        }
//      jika data tidak ditemukan akan mengembalikan nilai -1
        return index;
   }

// method untuk menambahkan akun user, dengan parameter
    private void tambahUser(String username, String password, String namaPengguna, String hakAkses) {
        int index = getIndexUser();
        setUsername(username, index);
        setPassword(password, index);
        setNamaPengguna(namaPengguna, index);
        setHakAkses(hakAkses, index);
    }

//   Method untuk mengubah data user dengan mencari username
    private void ubahUser(String username, String usernameBaru, String password, String namaPengguna, String hakAkses) {
        int index = getIndexUser(username);
        setUsername(usernameBaru, index);
        setPassword(password, index);
        setNamaPengguna(namaPengguna, index);
        setHakAkses(hakAkses, index);
    }

//   method untuk menghapus user berdasarkan username
    private void hapusUser(String username) {
        int index = getIndexUser();
        int getIndex = getIndexUser(username);
//      mencari username ada di array dan tidak sedang dipakai
        if (!getUsername.equals(username) && getIndex != -1) {
//          menginisialisasikan variabel sementara untuk menampung nilai sementara
            String[] tempUsername = new String[maksLen];
            String[] tempPassword = new String[maksLen];
            String[] tempNamaPengguna = new String[maksLen];
            String[] tempHakAkses = new String[maksLen];
            int count = 0;

//         looping untuk menampung nilai ke variable sementara
            for(int i = 0; i <= index; ++i) {
//             jika i sama dengan getIndex tidak akan diproses
                if (i != getIndex) {
                    tempUsername[count] = getUsername(i);
                    tempPassword[count] = getPassword(i);
                    tempNamaPengguna[count] = getNamaPengguna(i);
                    tempHakAkses[count] = getHakAkses(i);
                    count++;
                }
            }
//      menuliskan ulang kembali ke variable dari nilai varibel sementara
            for(int i = 0; i < index; ++i) {
                setUsername(tempUsername[i], i);
                setPassword(tempPassword[i], i);
                setNamaPengguna(tempNamaPengguna[i], i);
                setHakAkses(tempHakAkses[i], i);
            }
        System.out.println("Akun berhasil dihapus");
        } else {
            System.out.println("\nAkun sedang dipakai atau tidak ada\n");
        }
    }

//   konstruktoe AdminController dengan parameter, untuk menambahkan data user
    public AdminController(String username, String password, String namaPengguna, String hakAkses) {
        tambahUser(username, password, namaPengguna, hakAkses);
        tambahUser("Customer@unsika", "customer123", "Budi Raharjo", "user");
        kp.declareKamar(1, 120000, "Kasur king size, bath tube, shower", "tersedia");
    }

//    memvalidasi login, untuk username dan password ada
    public boolean validasiLogin(String username, String password) {
        getUsername = username;
        int index = getIndexUser(username);
        if (index == -1) {
            return false;
        } else {
            return getUsername(index).equals(username) && getPassword(index).equals(password);
        }
    }

//   memvalidasi apakah akun tersebut admin
    public boolean isAdmin(String username) {
        int index = getIndexUser(username);
        return getHakAkses(index).equals("admin");
    }

//   method untuk menampilkan data user
   @Override
    public void daftarUser() {
        int index = getIndexUser();
        System.out.println("\n\n========== Daftar Akun User ==========");
        for(int i = 0; i < index; ++i) {
            System.out.println("Username\t: " + getUsername(i));
            System.out.println("Nama Pengguna\t: " + getNamaPengguna(i));
            System.out.println("Hak Akses\t: " + getHakAkses(i) + "\n");
        }
    }

//   method untuk menampilkan dailog tambah akun user
   @Override
    public void menuTambahUser() {
        System.out.println("\n\n============ Tambah User ============");
        System.out.print("Masukan Username\t: ");
        String username = sc.next();
        if (getIndexUser(username) == -1) {
            System.out.print("Masukan Password\t: ");
            String password = sc.next();
            System.out.print("Masukan Nama Pengguna\t: ");
            String namaPengguna = sc.next();
            System.out.print("Masukan Hak Akses\t: ");
            String hakAkses = sc.next();
            tambahUser(username, password, namaPengguna, hakAkses);
            System.out.println("Data sudah ditambahkan\n\n");
        } else {
            System.out.println("Username sudah ada\n\n");
        }
    }

//   method untuk menampilkan dailog hapus akun user
   @Override
    public void menuHapusUser() {
        System.out.println("\n\n============= Hapus User ==============");
        System.out.print("Masukan username user yang ingin dihapus\t:");
        String username = sc.next();
        hapusUser(username);
    }

//   method untuk menampilkan dialog ubah akun user
   @Override
    public void menuUbahUser() {
        System.out.println("\n\n============== Ubah User ==============");
        System.out.print("Masukan username user yang ingin diubah\t:");
        String username = sc.next();
        if (getIndexUser(username) != -1) {
            System.out.print("Masukan username baru\t: ");
            String usernameBaru = sc.next();
            System.out.print("Masukan Passsword baru\t: ");
            String password = sc.next();
            System.out.print("Masukan Nama Pengguna\t: ");
            String namaPengguna = sc.next();
            System.out.print("Masukan Hak Akses\t: ");
            String hakAkses = sc.next();
            ubahUser(username, usernameBaru, password, namaPengguna, hakAkses);
        }
    }

//   method untuk menampilkan dialog menu pilihan akun admin
    public void tampilMenuAdmin() {
        while(true) {
            System.out.println("\n\n============ Pilihan Menu ============");
            System.out.println("1. Pengaturan User");
            System.out.println("2. Pengaturan Kamar");
            System.out.println("00. Logout");
            System.out.print("Silahkan pilih(1/2/00):");
            switch (sc.next()) {
                case "1":
                    tampilMenuUser();
                    break;
                case "2":
                    tampilMenuKamar();
                    break;
                case "00":
                    return;
                default:
                    System.out.println("Tidak ada pilihan\n");
            }
        }
    }

//   method untuk menampilkan dialog menu pilihan pengaturan akun user
    private void tampilMenuUser() {
        while(true) {
            System.out.println("\n\n============ Pilihan Menu ============");
            System.out.println("1. Tambah User");
            System.out.println("2. Ubah User");
            System.out.println("3. Hapus User");
            System.out.println("4. Daftar User");
            System.out.println("00. Kembali");
            System.out.print("Silahkan pilih(1/2/3/4/00):");
            switch (sc.next()) {
                case "1":
                    menuTambahUser();
                    break;
                case "2":
                    menuUbahUser();
                    break;
                case "3":
                    menuHapusUser();
                    break;
                case "4":
                    daftarUser();
                break;
                case "00":
                    return;
                default:
                    System.out.println("Tidak ada pilihan\n");
            }
        }
    }

//   method untuk menampilkan dialog menu pilihan pengaturan kamar
    private void tampilMenuKamar() {
        while(true) {
            System.out.println("\n\n============ Pilihan Menu ============");
            System.out.println("1. Tambah Kamar");
            System.out.println("2. Ubah Kamar");
            System.out.println("3. Hapus Kamar");
            System.out.println("4. Daftar Kamar");
            System.out.println("00. Kembali");
            System.out.print("Silahkan pilih(1/2/3/4/00):");
            switch (sc.next()) {
                case "1":
                    kp.menuTambahKamar();
                    break;
                case "2":
                    kp.menuUbahKamar();
                    break;
                case "3":
                    kp.menuHapusKamar();
                    break;
                case "4":
                    kp.daftarKamar();
                    break;
                case "00":
                    return;
                default:
                    System.out.println("Tidak ada pilihan\n");
            }
        }
    }
}
