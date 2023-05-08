public class Anjing extends Hewan{
    private String rasAnjing;

    public Anjing(String namaHewan, String jenisHewan, int tahunKelahiran, String rasAnjing) {
        super(namaHewan, jenisHewan, tahunKelahiran);
        this.rasAnjing = rasAnjing;
    }
    
    public void setRasAnjing(String rasAnjing) {
        this.rasAnjing = rasAnjing;
    }

    public String getRasAnjing() {
        return rasAnjing;
    }

    public void cetakInfoHewan(){
        super.cetakInfoHewan();
        System.out.printf("%-12s: %s\n", "Ras Anjing", getRasAnjing());

    }
}
