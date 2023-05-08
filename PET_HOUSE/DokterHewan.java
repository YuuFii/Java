import java.util.ArrayList;

public class DokterHewan extends Karyawan{
    private ArrayList <JenisPerawatan> jenisPerawatan;

    public DokterHewan(JenisPerawatan[] jenisPerawatan){
        this.jenisPerawatan = new ArrayList <JenisPerawatan> ();
        for (int i = 0; i < jenisPerawatan.length; i++){
            this.jenisPerawatan.add(jenisPerawatan[i]);
        }
    }

    public DokterHewan(String nama, String nomorTelepon, String kategoriKaryawan, String jenisKelamin, String alamat, JenisPerawatan[] jenisPerawatan){
        super(nama, nomorTelepon, kategoriKaryawan, jenisKelamin, alamat);
        this.jenisPerawatan = new ArrayList <JenisPerawatan> ();
        for (int i = 0; i < jenisPerawatan.length; i++){
            this.jenisPerawatan.add(jenisPerawatan[i]);
        }
    }

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

    public void setJenisPerawatan(JenisPerawatan[] jenisPerawatan){
        for (int i = 0; i < jenisPerawatan.length; i++) {
            this.jenisPerawatan.add(jenisPerawatan[i]);
        }
    }
    
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Jenis Perawatan : ");
        for (int i = 0; i < jenisPerawatan.size(); i++){
            System.out.println(" - " + jenisPerawatan.get(i));
        }
    }
}
