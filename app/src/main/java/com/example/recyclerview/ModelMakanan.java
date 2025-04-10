package com.example.recyclerview;

public class ModelMakanan {

    private String namaMakanan;
    private String hargaMakanan;
    private String deskripsiMakanan;
    private int imageMakanan;

    public ModelMakanan(String namaMakanan, String deskripsiMakanan, String hargaMakanan,  int imageMakanan) {
        this.namaMakanan = namaMakanan;
        this.hargaMakanan = hargaMakanan;
        this.deskripsiMakanan = deskripsiMakanan;
        this.imageMakanan = imageMakanan;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public String getDeskripsiMakanan() {
        return deskripsiMakanan;
    }

    public String getHargaMakanan() {
        return hargaMakanan;
    }

    public int getImageMakanan() {
        return imageMakanan;
    }


}
