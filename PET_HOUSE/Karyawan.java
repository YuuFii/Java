public class Karyawan implements CetakInfo{
    private String nama;
    private String nomorTelepon;
    private String kategoriKaryawan;
    private String jenisKelamin;
    private String alamat;

    public Karyawan(){
        
    }

    public Karyawan(String nama, String nomorTelepon, String kategoriKaryawan, String jenisKelamin, String alamat){
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
        this.kategoriKaryawan = kategoriKaryawan;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
    }

    // Setter dan Getter
    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
    public void setKategoriKaryawan(String kategoriKaryawan) {
        this.kategoriKaryawan = kategoriKaryawan;
    }

    public String getKategoriKaryawan() {
        return kategoriKaryawan;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setNomorTelepon(String noTelepon) {
        this.nomorTelepon = noTelepon;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }
    // End Setter dan Getter

    // Cetak Info Karyawan
    public void cetakInfo(){
        System.out.println("Nama          : " + getNama());
        System.out.println("Nomor Telepon : " + getNomorTelepon());
        System.out.println("Jenis Kelamin : " + getJenisKelamin());
        System.out.println("Kategori      : " + getKategoriKaryawan());
        System.out.println("Alamat        : " + getAlamat());
    }
}