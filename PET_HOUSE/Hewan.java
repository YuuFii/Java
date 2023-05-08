import java.time.LocalDateTime;

public class Hewan implements CetakInfoHewan{
    public String namaHewan;
    public String jenisHewan;
    public int tahunKelahiran;
    private int usiaHewan;
    private int IDMember;
    private JenisPerawatan jenisPerawatanHewan;

    public Hewan(String namaHewan, String jenisHewan, int tahunKelahiran){
        this.namaHewan = namaHewan;
        this.jenisHewan = jenisHewan;
        this.tahunKelahiran = tahunKelahiran;
    }

    public String getNamaHewan(){
        return namaHewan;
    }

    public String getJenisHewan(){
        return jenisHewan;
    }

    public int getUsiaHewan(){
        LocalDateTime sekarang = LocalDateTime.now();
        int tahun = sekarang.getYear();
        usiaHewan = tahun - tahunKelahiran;
        return usiaHewan;
    }

    public int getIDMember(){
        int minimum = 100000;
        int maksimum = 999999;
        IDMember = (int)(Math.random() * (maksimum - minimum + 1) + minimum);
        return IDMember;
    }

    public void setJenisPerawatanHewan(JenisPerawatan jenisPerawatanHewan) {
        this.jenisPerawatanHewan = jenisPerawatanHewan;
    }

    public void cetakInfoHewan(){
        System.out.printf("%-12s: %s\n", "Nama Hewan", getNamaHewan());
        System.out.printf("%-12s: %s\n", "Jenis Hewan", getJenisHewan());
        System.out.printf("%-12s: %d\n", "Usia Hewan", getUsiaHewan());
        System.out.printf("%-12s: %d\n", "ID Member", getIDMember());
    }
}
