import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        JenisPerawatan[] jenisPerawatan = JenisPerawatan.values(); // Ambil value dari enum JenisPerawatan

        // Input jumlah karyawan
        System.out.print("Masukkan jumlah karyawan: ");
        int jumlahKaryawan = input.nextInt(); input.nextLine();

        // Inisialisasi arraylist untuk mendata karyawan yang hadir
        ArrayList<Karyawan> dataKaryawan = new ArrayList<Karyawan>();

        // Karyawan mengisi daftar hadir
        for (int i = 0; i < jumlahKaryawan; i++) {
            System.out.println("\nDAFTAR HADIR KARYAWAN AYRUS PET HOUSE");
            System.out.println("========================================");
            System.out.println("Kategori Karyawan \n1. Dokter Hewan \n2. Groomer \n3. Admin");
            System.out.print("Pilih kategori karyawan (1/2/3): ");
            int kategori = input.nextInt(); input.nextLine();
            System.out.println("========================================");
    
            Karyawan karyawan;
            switch(kategori){
                case 1:                   
                    karyawan = new DokterHewan(new JenisPerawatan[]{JenisPerawatan.SUNTIK_VAKSIN, JenisPerawatan.SUNTIK_ANTI_KUTU, JenisPerawatan.SUNTIK_SCABIES, JenisPerawatan.SUNTIK_ANTI_JAMUR_KULIT, JenisPerawatan.PEMERIKSAAN_RAWAT_INAP, JenisPerawatan.PEMERIKSAAN_RAWAT_JALAN});
                    karyawan.setKategoriKaryawan("Dokter Hewan");
                    break;
                case 2:
                    karyawan = new Groomer();
                    karyawan.setKategoriKaryawan("Groomer");
                    break;
                case 3:
                    karyawan = new Admin();
                    karyawan.setKategoriKaryawan("Admin");
                    break;
                default:
                    System.out.println("Kategori karyawan tidak valid.");
                    i--;
                    continue;
            }

            // Input identitas karyawan
            System.out.printf("%-22s: ","Masukkan nama");
            karyawan.setNama(input.nextLine());
            System.out.printf("%-22s: ", "Masukkan alamat");
            karyawan.setAlamat(input.nextLine());
            System.out.printf("%-22s: ","Masukkan nomor telepon");
            karyawan.setNomorTelepon(input.nextLine());
            System.out.printf("%-22s: ","Masukkan jenis kelamin");
            karyawan.setJenisKelamin(input.nextLine());

            dataKaryawan.add(karyawan); // Objek karyawan ditambahkan ke arraylist
        }

        Admin admin = new Admin();
        System.out.println("========================================");
        System.out.print("Masukkan jumlah hewan: ");
        int jumlahHewan = input.nextInt();input.nextLine();
        for (int i = 0; i < jumlahHewan; i++) {
            System.out.println("========================================");
            admin.tambahDaftarHewan();
            try {
                for (int j = 0; j < jenisPerawatan.length; j++) {
                    System.out.println((j+1) + ". " + jenisPerawatan[j].toString() + " - Rp " + jenisPerawatan[j].getHarga());
                }
                System.out.println((jenisPerawatan.length+1) + ". Keluar");
                System.out.print("Pilih jenis perawatan: ");
                int pilihan = input.nextInt();input.nextLine();
                if(pilihan == jenisPerawatan.length + 1){
                    break;
                }
                admin.pilihJenisPerawatan(jenisPerawatan[pilihan-1]);
            } catch (ArrayIndexOutOfBoundsException e) { // Ketika diinputkan pilihan diluar index, muncul ArrayIndexOutOfBoundsException
                System.out.println("Terjadi kesalahan: Pilihan anda tidak valid dan tidak terakumulasi.");
            }
            
        }
        System.out.println("========================================");

        // Cetak data karyawan
        System.out.println("DATA KARYAWAN AYRUS PET HOUSE\n");
        for (int index = 0; index < dataKaryawan.size(); index++) {
            dataKaryawan.get(index).cetakInfo();
            System.out.println("========================================");
        }

        // Cetak data hewan
        System.out.println("=============AYRUS PET HOUSE============");
        admin.cetakDataHewan();
        System.out.println("========================================");
        System.out.println("              TERIMA KASIH              ");
        System.out.println("       TELAH MENGGUNAKAN JASA KAMI      ");
        System.out.println("========================================");
    }
}