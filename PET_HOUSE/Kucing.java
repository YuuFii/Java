public class Kucing extends Hewan{
    private String rasKucing;

    public Kucing(String namaHewan, String jenisHewan, int tahunKelahiran, String rasKucing) {
        super(namaHewan, jenisHewan, tahunKelahiran);
        this.rasKucing = rasKucing;
    }

    public void setRasKucing(String rasKucing) {
        this.rasKucing = rasKucing;
    }

    public String getRasKucing() {
        return rasKucing;
    }

    public void cetakInfoHewan(){
        super.cetakInfoHewan();
        System.out.printf("%-12s: %s\n", "Ras Kucing", getRasKucing());

    }
}
