package com.example.aplikasimenumakanan;

public class MenuMakanan {

    private String menu;
    private int gambar;
    private String harga;

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public MenuMakanan(String menu, String harga, int gambar) {
        this.menu = menu;
        this.harga = harga;
        this.gambar = gambar;


    }
}
