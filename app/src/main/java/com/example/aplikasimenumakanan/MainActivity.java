package com.example.aplikasimenumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recMenu;
    private ArrayList<MenuMakanan> listMenu;
    private String menu;
    private String harga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recMenu = findViewById(R.id.rec_menu);
        initData();

        recMenu.setAdapter(new MenuAdapter(listMenu));
        recMenu.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData() {
        this.listMenu = new ArrayList<>();
        listMenu.add(new MenuMakanan (menu="Hamburger", harga="20000", R.drawable.hamburger));
        listMenu.add(new MenuMakanan (menu="Kebab", harga="10000", R.drawable.kebab));
        listMenu.add(new MenuMakanan (menu="Sosis Bakar", harga="10000", R.drawable.sosis_bakar));
    }

    public void detailHamburger(View view){
        Intent intent = new Intent(MainActivity.this, DetailHamburgerActivity.class);
        startActivity(intent);
    }

    public void detailKebab(View view){
        Intent intent = new Intent(MainActivity.this, DetailKebabActivity.class);
        startActivity(intent);
    }

    public void detailSosis(View view){
        Intent intent = new Intent(MainActivity.this, DetailSosisActivity.class);
        startActivity(intent);
    }
}