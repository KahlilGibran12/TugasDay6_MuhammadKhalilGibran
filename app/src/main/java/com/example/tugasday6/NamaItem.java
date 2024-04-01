package com.example.tugasday6;

public class NamaItem {
    private String Name, Deskripsi, Harga;
    private int FotoItem;
    private int id;

    public NamaItem(int id, String name, String deskripsi, String harga, int fotoItem) {
        this.id = id;
        Name = name;
        Deskripsi = deskripsi;
        Harga = harga;
        FotoItem = fotoItem;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDeskripsi() {
        return Deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        Deskripsi = deskripsi;
    }

    public String getHarga() {
        return Harga;
    }

    public void setHarga(String harga) {
        Harga = harga;
    }

    public int getFotoItem() {
        return FotoItem;
    }

    public void setFotoItem(int fotoItem) {
        FotoItem = fotoItem;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
