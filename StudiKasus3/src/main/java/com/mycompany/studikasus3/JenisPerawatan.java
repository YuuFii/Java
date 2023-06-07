/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studikasus3;

/**
 *
 * @author victus joe
 */
public enum JenisPerawatan {
    SUNTIK_VAKSIN(170000),
    SUNTIK_ANTI_KUTU(50000),
    SUNTIK_SCABIES(60000),
    SUNTIK_ANTI_JAMUR_KULIT(40000),
    PEMERIKSAAN_RAWAT_INAP(100000),
    PEMERIKSAAN_RAWAT_JALAN(100000),
    MANDI(50000),
    POTONG_KUKU(30000),
    POTONG_BULU(70000)
    ;

    private double hargaPerawatan;

    JenisPerawatan(double hargaPerawatan){
        this.hargaPerawatan = hargaPerawatan;
    }

    public double getHarga(){
        return hargaPerawatan;
    }
}
