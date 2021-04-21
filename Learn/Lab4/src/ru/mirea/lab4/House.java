package ru.mirea.lab4;

public class House implements Price {

    private int kol_vo_etazh;
    private String material;
    private int cena;

    public House(int kol_vo_etazh, String material) {
        this.kol_vo_etazh = kol_vo_etazh;
        this.material = material;
    }

    public House() {

    }

    public void setKol_vo_etazh(int kol_vo_etazh) {
        this.kol_vo_etazh = kol_vo_etazh;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public int GetPrice() {
        if (kol_vo_etazh > 1) cena = 4000000;
        if (material == "Brus" && kol_vo_etazh == 1) cena = 2000000;
        if (material == "Kirpich") cena = 100000;
        return cena;
    }
}
