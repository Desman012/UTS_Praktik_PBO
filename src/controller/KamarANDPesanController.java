package controller;
//memanggil package untuk menggunakan interface yang ada
import interfacex.*;
//memanggil library untuk fungsi input
import java.util.Scanner;
//memanggil package untuk menggunakan kelas Pesan 
import model.Pesan;

//inheritance dari kelas Pesan dan mengimplementasikan implements interface
public class KamarANDPesanController extends Pesan implements UmumInterface, KelolaKamar, KelolaPesanan {
// menginisialisasikan objek untuk fungsi input
    private final Scanner sc = new Scanner(System.in);

//    method untuk mendapatkan indeks untuk nilai array kosong Kamar
    @Override
    public int getIndexKamar() {
        int index = -1;
        for(int i = 0; i < maksLen; i++) {
            if (getNomorKamar(i) == 0) {
                index = i;
                break;
            }
        }
        return index;
    }

//    method untuk mendapatkan nilai index array dari nilai nomorKamar
    @Override
    public int getIndexKamar(int nomorKamar) {
        int index = -1;
        for(int i = 0; i < getIndexKamar(); i++) {
            if (getNomorKamar(i) == nomorKamar) {
                index = i;
                break;
            }
        }
        return index;
    }

//    method untuk mendapatkan nilai index array kosong kelas pesan
    @Override
    public int getIndexPesanan() {
        int index = -1;
        for(int i = 0; i < maksLen; i++) {
            if (getIdPemesan(i) == null) {
                index = i;
                break;
            }
        }
        return index;
    }

//    method untuk mencari index array dengan nilai idPemesan
    @Override
    public int getIndexPesanan(String idPemesan) {
        int index = -1;
        for(int i = 0; i < getIndexPesanan(); i++) {
            if (getIdPemesan(i).equals(idPemesan)) {
                index = i;
                break;
            }
        }
        return index;
    }

//    method untuk dipanggil untuk menambahkan data awal kamar
    protected void declareKamar(int nomorKamar, int hargaKamar, String deskripsiKamar, String tersediaKamar) {
        tambahKamar(nomorKamar, hargaKamar, deskripsiKamar, tersediaKamar);
    }

//    pengaturan kamar
//    method untuk menambahkan data kamar dengan parameter
    private void tambahKamar(int nomorKamar, int hargaKamar, String deskripsiKamar, String tersediaKamar) {
        int index = getIndexKamar();
        setNomorKamar(nomorKamar, index);
        setHarga(hargaKamar, index);
        setDeskripsi(deskripsiKamar, index);
        setTersedia(tersediaKamar, index);
    }

//    method untuk menghapus data kamar dengan paramter nomorKamar
    private void hapusKamar(int nomorKamar) {
        int index = getIndexKamar();
        int getIndex = getIndexKamar(nomorKamar);
        
//        menginisialisasikan variable untuk menampung nilai sementara
        int[] tempNomorKamar = new int[maksLen];
        int[] tempHargaKamar = new int[maksLen];
        String[] tempDeskripsiKamar = new String[maksLen];
        String[] tempTersediaKamar = new String[maksLen];
        int count = 0;

//      looping untuk memindahkan nilai ke variable sementara
        for(int i = 0; i <= index; ++i) {
            if (i != getIndex) {
                tempNomorKamar[count] = getNomorKamar(i);
                tempHargaKamar[count] = getHarga(i);
                tempDeskripsiKamar[count] = getDeskripsi(i);
                tempTersediaKamar[count] = getTersedia(i);
                count++;
            }
        }
//        mengembalikan nilai dari variable sementara
        for(int i = 0; i < index; ++i) {
            setNomorKamar(tempNomorKamar[i], i);
            setHarga(tempHargaKamar[i], i);
            setDeskripsi(tempDeskripsiKamar[i], i);
            setTersedia(tempTersediaKamar[i], i);
        }
        System.out.println("Data Kamar telah dihapus\n\n");
    }

//    method utnuk mengubah data kamar dengan nomorKamar
    private void ubahKamar(int nomorKamar, int nomorKamarBaru, int harga, String deskripsi) {
        int index = getIndexKamar(nomorKamar);
        setNomorKamar(nomorKamarBaru,index);
        setDeskripsi(deskripsi, index);
        setHarga(harga, index);
    }

//    method untuk menampilkan daftar data kamar
    @Override
    public void daftarKamar() {
        int index = getIndexKamar();
        System.out.println("\n\n============ Daftar Kamar =============");
        for(int i = 0; i < index; i++) {
            System.out.println("Nomor Kamar\t: " + getNomorKamar(i));
            System.out.println("Harga Kamar\t: " + getHarga(i));
            System.out.println("Deskripsi\t: " + getDeskripsi(i));
            System.out.println("Ketersediaan\t: " + getTersedia(i) + "\n");
        }
    }

//    method untuk menampilkan daftar kamar yang tersedia
    public void daftarKamar(String tersedia) {
        int index = getIndexKamar();
        System.out.println("\n\n============ Daftar Kamar =============");
        for(int i = 0; i < index; ++i) {
            if (getTersedia(i).equals(tersedia)) {
                System.out.println("Nomor Kamar\t: " + getNomorKamar(i));
                System.out.println("Harga Kamar\t: " + getHarga(i));
                System.out.println("Deskripsi\t: " + getDeskripsi(i) + "\n");
            } else {
                System.out.println("Maaf semua kamar belum tersedia\n\n");
            }
        }
    }

//    method untuk menampilkan dialog data tambah kamar
    @Override
    public void menuTambahKamar() {
        System.out.println("\n\n============= Tambah Kamar =============");
        System.out.print("Masukan Nomor Kamar\t: ");
        int nomorKamar = sc.nextInt();
        if (getIndexKamar(nomorKamar) == -1) {
            sc.nextLine();
            System.out.print("Masukan Deskripsi\t: ");
            String deskripsiKamar = sc.nextLine();
            System.out.print("Masukan Harga\t\t: ");
            int hargaKamar = sc.nextInt();
            String tersediaKamar = "tersedia";
            tambahKamar(nomorKamar, hargaKamar, deskripsiKamar, tersediaKamar);
            System.out.println("Data sudah ditambahkan\n\n");
        } else {
            System.out.println("Kamar sudah ada\n\n");
        }
    }

//    method untuk menampilkan dialog hapus kamar
    @Override
    public void menuHapusKamar() {
        System.out.println("\n\n============ Hapus Kamar ============");
        System.out.print("Masukan Nomor Kamar yang ingin dihapus\t:");
        int nomorKamar = sc.nextInt();
        if (getIndexKamar(nomorKamar) != -1) {
            hapusKamar(nomorKamar);
        } else {
            System.out.println("Nomor Kamar tidak ada\n\n");
        }
    }

//    method untuk menampilkan dialog ubah kamar
    @Override
    public void menuUbahKamar() {
        System.out.println("\n\n============== Ubah Kamar ==============");
        System.out.print("Masukan Nomor Kamar yang ingin diubah\t:");
        int nomorKamar = sc.nextInt();
        if (getIndexKamar(nomorKamar) != -1) {
            System.out.print("Masukan Nomor Kamar baru\t: ");
            int nomorKamarBaru = sc.nextInt();
            System.out.print("Masukan Deskripsi Kamar baru\t: ");
            String deskripsiKamar = sc.next();
            System.out.print("Masukan Harga Baru\t\t: ");
            int hargaKamar = sc.nextInt();
            ubahKamar(nomorKamar, nomorKamarBaru, hargaKamar, deskripsiKamar);
        }
    }
    
//    method untuk memvalidasi kamar tersebtu tersedia
    private boolean validasiKamarTersedia(int nomorKamar) {
        boolean validate = false;
        int index = getIndexKamar();
        for(int i = 0; i < index; ++i) {
            if (getTersedia(i).equals("tersedia") && getNomorKamar(i) == nomorKamar) {
                validate = true;
            }
        }
        return validate;
    }

//    pengaturan pesan
//    method untuk menghitung total harga
//    dengan menghitung harga kamar dikali jumlah malam
    private double hitungTotalHarga(int indexKamar, int jumlahMalam) {
        return (double)(getHarga(indexKamar) * jumlahMalam);
    }

//    method untuk mengenerate idpemesan
    private String hitungIdPemesan(int index) {
        return "cs" + Integer.toString(index);
    }

//    method untuk menambahkan pesan dengan parameter
    private void tambahPesanan(String akunUser, String tanggal, String namaPengguna, String noTelp, int nomorKamar, int jumlahMalam, double totalHarga) {
        int index = getIndexPesanan();
        setIdPemesan(hitungIdPemesan(index), index);
        setTanggal(tanggal, index);
        setKamarPesan(nomorKamar, index);
        setJumlahMalam(jumlahMalam, index);
        setTersedia("booking", index);
        setNamaPemesan(namaPengguna, index);
        setNoTelp(noTelp, index);
        setAkunUser(akunUser, index);
        setTotalHarga(totalHarga, index);
    }

//    method untuk menampilkan detail pesanan dengan parameter id pemesan
    private void detailPesanan(String idPemesan, String akunUser) {
        int index = getIndexPesanan(idPemesan);
        if (index == -1 || !(getAkunUser(index).equals(akunUser))) {
            System.out.println("Tidak ada pesanan dengan ID Pemesan " + idPemesan);
        } else {
            System.out.println("ID Pesanan\t: " + getIdPemesan(index));
            System.out.println("Tanggal Pesan\t: " + getTanggal(index));
            System.out.println("Nama Pemesan\t: " + getNamaPemesan(index));
            System.out.println("Nomor Telpon\t: " + getNoTelp(index));
            System.out.println("Kamar Dipesan\t: " + getKamarPesan(index));
            System.out.println("Deskripsi Kamar\t: " + getDeskripsi(index));
            System.out.println("Harga Kamar\t: " + getHarga(index) + "/malam");
            System.out.println("Jumlah Malam\t: " + getJumlahMalam(index));
            System.out.println("Total Harga\t: " + getTotalHarga(index));
        }
    }

//    method untuk menampilkan daftar pesanan kamar
    @Override
    public void daftarPesanan(String akunUser) {
        int index = getIndexPesanan();
        System.out.println("\n\n============= Daftar Pesanan ============");
        if (index == -1) {
            System.out.println("belum ada pesanan\n");
        } else {
            for(int i = 0; i < index; ++i) {
                if(getAkunUser(i).equals(akunUser)){
                    System.out.println("ID Pesanan\t: " + getIdPemesan(i));
                    System.out.println("Nama Pemesan\t: " + getNamaPemesan(i));
                    System.out.println("Tanggal Pesan\t: " + getTanggal(i));
                    System.out.println("Kamar dipesan\t: " + getKamarPesan(i));
                    System.out.println("Jumlah Malam\t: " + getJumlahMalam(i) + "\n");
                }
            }
        }
    }

//    method untuk menampilkan dialog pesan kamar
    @Override
    public void menuTambahPesanan(String akunUser) {
        System.out.println("\n\n=========== Pesan Kamar ==============");
        System.out.print("Pilih Nomor Kamar\t: ");
        int nomorKamar = sc.nextInt();
        int getIndexKamar = getIndexKamar(nomorKamar);
        if (validasiKamarTersedia(nomorKamar)) {
//            untuk mecegah agar Scanner dibawahnya ke skip (didapat dari stackoverflow)
            sc.nextLine();
            System.out.print("Tanggal Pesan\t\t: ");
            String tanggal = sc.nextLine();
            System.out.print("Masukan Nama Pemesan\t: ");
            String namaPemesan = sc.next();
            System.out.print("Masukan Nomor Telpon\t: ");
            String noTelp = sc.next();
            System.out.print("Durasi menginap\t\t: ");
            int jumlahMalam = sc.nextInt();
            double totalHarga = hitungTotalHarga(getIndexKamar, jumlahMalam);
            System.out.println("Total Harga\t\t: " + totalHarga);
            tambahPesanan(akunUser, tanggal, namaPemesan, noTelp, nomorKamar, jumlahMalam, totalHarga);
        } else {
            System.out.println("Kamar tidak tersedia.");
        }
    }

//    method untuk menampilkan dialog menu detail pesanan kamar
    @Override
    public void menuDetailPesanan(String akunUser) {
        System.out.println("\n\n============ Detail Pesanan ============");
        System.out.print("Masukkan ID Pesanan\t: ");
        String idPemesan = sc.next();
        detailPesanan(idPemesan, akunUser);
    }
}
