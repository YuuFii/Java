public class Kelinci extends Hewan{
    private String rasKelinci;

    public Kelinci(String namaHewan, String jenisHewan, int tahunKelahiran, String rasKelinci) {
        super(namaHewan, jenisHewan, tahunKelahiran);
        this.rasKelinci = rasKelinci;
    }

    public void setRasKelinci(String rasKelinci) {
        this.rasKelinci = rasKelinci;
    }

    public String getRasKelinci() {
        return rasKelinci;
    }
    
    public void cetakInfoHewan(){
        super.cetakInfoHewan();
        System.out.printf("%-12s: %s\n", "Ras Kelinci", getRasKelinci());

    }
}
