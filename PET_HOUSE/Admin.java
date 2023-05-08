import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends Karyawan{
    private ArrayList<Hewan> daftarHewan; // Daftar hewan yang ingin dirawat
    private ArrayList<JenisPerawatan> jenisPerawatanPilihan = new ArrayList<JenisPerawatan>(); // Daftar jenis perawatan yang dipilih
    private double totalBiaya; // Total biaya akhir


    public Admin(){
        daftarHewan = new ArrayList<Hewan>();
        jenisPerawatanPilihan = new ArrayList<JenisPerawatan>();
        totalBiaya = 0;
    }

    public Admin(String nama, String nomorTelepon, String kategoriKaryawan, String jenisKelamin, String alamat){
        super(nama, nomorTelepon, kategoriKaryawan, jenisKelamin, alamat);
        daftarHewan = new ArrayList<Hewan>();
        jenisPerawatanPilihan = new ArrayList<JenisPerawatan>();
        totalBiaya = 0;
    }

    // Setter dan Getter
    @Override
    public void setNama(String nama) {
        super.setNama(nama);
    }

    @Override
    public void setNomorTelepon(String noTelepon) {
        super.setNomorTelepon(noTelepon);
    }

    @Override
    public void setKategoriKaryawan(String kategoriKaryawan) {
        super.setKategoriKaryawan(kategoriKaryawan);
    }

    @Override
    public void setJenisKelamin(String jenisKelamin) {
        super.setJenisKelamin(jenisKelamin);
    }

    @Override
    public void setAlamat(String alamat) {
        super.setAlamat(alamat);
    }
    // End Setter dan Getter

    public void tambahDaftarHewan(){ // Menambahkan hewan yang ingin dirawat ke dalam daftar
        Scanner in = new Scanner(System.in);
        System.out.printf("%-30s: ", "Masukkan nama hewan");
        String namaHewan = in.nextLine();
        System.out.printf("%-30s: ", "Masukkan jenis hewan");
        String jenisHewan = in.nextLine();
        System.out.printf("%-30s: ", "Masukkan ras hewan");
        String rasHewan = in.nextLine();
        System.out.printf("%-30s: ", "Masukkan tahun kelahiran hewan");
        int tahunKelahiran = in.nextInt();in.nextLine();

        if(jenisHewan.equalsIgnoreCase("KUCING")){
            Kucing kucing = new Kucing(namaHewan, jenisHewan, tahunKelahiran, rasHewan);
            daftarHewan.add(kucing);
        } else if(jenisHewan.equalsIgnoreCase("ANJING")){
            Anjing anjing = new Anjing(namaHewan, jenisHewan, tahunKelahiran, rasHewan);
            daftarHewan.add(anjing);
        } else if(jenisHewan.equalsIgnoreCase("KELINCI")){
            Kelinci kelinci = new Kelinci(namaHewan, jenisHewan, tahunKelahiran, rasHewan);
            daftarHewan.add(kelinci);
        }
    }

    public void pilihJenisPerawatan(JenisPerawatan pilihan){
        // Akumulasi perhitungan biaya berdasarkan perawatan yang dipilih
        switch(pilihan){
            case SUNTIK_VAKSIN:
                this.totalBiaya += JenisPerawatan.SUNTIK_VAKSIN.getHarga();
                jenisPerawatanPilihan.add(JenisPerawatan.SUNTIK_VAKSIN);
                break;
            case SUNTIK_ANTI_KUTU:
                this.totalBiaya += JenisPerawatan.SUNTIK_ANTI_KUTU.getHarga();
                jenisPerawatanPilihan.add(JenisPerawatan.SUNTIK_ANTI_KUTU);
                break;
            case SUNTIK_SCABIES:
                this.totalBiaya += JenisPerawatan.SUNTIK_SCABIES.getHarga();
                jenisPerawatanPilihan.add(JenisPerawatan.SUNTIK_SCABIES);
                break;
            case SUNTIK_ANTI_JAMUR_KULIT:
                this.totalBiaya += JenisPerawatan.SUNTIK_ANTI_JAMUR_KULIT.getHarga();
                jenisPerawatanPilihan.add(JenisPerawatan.SUNTIK_ANTI_JAMUR_KULIT);

                break;
            case PEMERIKSAAN_RAWAT_INAP:
                this.totalBiaya += JenisPerawatan.PEMERIKSAAN_RAWAT_INAP.getHarga();
                jenisPerawatanPilihan.add(JenisPerawatan.PEMERIKSAAN_RAWAT_INAP);
                break;
            case PEMERIKSAAN_RAWAT_JALAN:
                this.totalBiaya += JenisPerawatan.PEMERIKSAAN_RAWAT_JALAN.getHarga();
                jenisPerawatanPilihan.add(JenisPerawatan.PEMERIKSAAN_RAWAT_JALAN);
                break;
        }
    }

    public void cetakDataHewan(){ // Ditampilkan sebagai struk
        for (Hewan hewan : daftarHewan) {
            hewan.cetakInfoHewan();
            System.out.println("========================================");
        }

        System.out.println("Perawatan yang dipilih");
        for(JenisPerawatan perawatan : jenisPerawatanPilihan){
            System.out.printf("%-24s\tRp%.0f\n", perawatan.name(), perawatan.getHarga());
        }
        System.out.printf("\n%-24s\tRp%.0f\n", "Total biaya", totalBiaya);
    }

    public void cetakInfo(){
        super.cetakInfo();
    }


}
