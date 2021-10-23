package com.example.aplikasimenumakanan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {

    private ArrayList<MenuMakanan> listMenu;

    public MenuAdapter(ArrayList<MenuMakanan> listMenu) {
        this.listMenu = listMenu;
    }

    @NonNull
    @Override
    public MenuAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        ViewHolder holder = new ViewHolder (inflater.inflate(R.layout.item_menu, parent, false));

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MenuAdapter.ViewHolder holder, int position) {
        MenuMakanan menuMakanan = listMenu.get(position);
        holder.txt_nama.setText(menuMakanan.getMenu());
        holder.txt_harga.setText(menuMakanan.getHarga());
        holder.img_menu.setImageResource(menuMakanan.getGambar());

    }

    @Override
    public int getItemCount() {
        return listMenu.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView txt_nama, txt_harga;
        public ImageView img_menu;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txt_nama = (TextView) itemView.findViewById(R.id.txtNama);
            txt_harga = (TextView) itemView.findViewById(R.id.txt_harga);
            img_menu = (ImageView) itemView.findViewById(R.id.img_menu);
        }
    }
}
