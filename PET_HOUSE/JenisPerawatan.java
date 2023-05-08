public enum JenisPerawatan {
    SUNTIK_VAKSIN(170000),
    SUNTIK_ANTI_KUTU(50000),
    SUNTIK_SCABIES(60000),
    SUNTIK_ANTI_JAMUR_KULIT(40000),
    PEMERIKSAAN_RAWAT_INAP(100000),
    PEMERIKSAAN_RAWAT_JALAN(100000);

    private double hargaPerawatan;

    JenisPerawatan(double hargaPerawatan){
        this.hargaPerawatan = hargaPerawatan;
    }

    public double getHarga(){
        return hargaPerawatan;
    }

    public String get() {
        return null;
    }
}
