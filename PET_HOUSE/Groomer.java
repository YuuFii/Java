public class Groomer extends Karyawan{
    public Groomer(){

    }
    public Groomer(String nama, String nomorTelepon, String kategoriKaryawan, String jenisKelamin, String alamat){
        super(nama, nomorTelepon, kategoriKaryawan, jenisKelamin, alamat);
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

    public void cetakInfo(){
        super.cetakInfo();
    }
}
