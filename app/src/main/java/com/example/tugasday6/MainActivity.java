package com.example.tugasday6;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AdapterItem adapterItem;
    public static ArrayList<NamaItem> namaItem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);



        recyclerView = findViewById(R.id.recycleview);
        namaItem = new ArrayList<>();
        getData();
        adapterItem = new AdapterItem(namaItem, this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapterItem);


    }
    private void getData() {
        namaItem = new ArrayList<>();
        namaItem.add(new NamaItem(1,"Varsity Ap Bren","\n•Kualitas: SUPER PREMIUM•\n•Grade original•\n•1:1 original Quality•\n•Import: Made in Philippines•\n•Material: Kain Baby Terry•","RP. 1.500.000",R.drawable.varsity1));
        namaItem.add(new NamaItem(2,"Varsity Echo","\n•Kualitas: SUPER PREMIUM•\n•Grade original•\n•1:1 original Quality•\n•Import: Made in Philippines•\n•Material: Kain Baby Terry•","RP. 1.500.000",R.drawable.varsity2));
        namaItem.add(new NamaItem(3,"Varsity RRQ","\n•Kualitas: SUPER PREMIUM•\n•Grade original•\n•1:1 original Quality•\n•Import: Made in Indonesia•\n•Material: Kain Baby Terry•","RP. 1.500.000",R.drawable.varsity3));
        namaItem.add(new NamaItem(4,"Varsity RRQ x 3Second","\n•Kualitas: SUPER PREMIUM•\n•Grade original•\n•1:1 original Quality•\n•Import: Made in Indonesia•\n•Material: Kain Baby Terry•","RP. 1.500.000",R.drawable.varsity4));
        namaItem.add(new NamaItem(5,"Varsity Onic","\n•Kualitas: SUPER PREMIUM•\n•Grade original•\n•1:1 original Quality•\n•Import: Made in Indonesia•\n•Material: Kain Baby Terry•","RP. 1.500.000",R.drawable.varsity5));
        namaItem.add(new NamaItem(6,"Sandal Gunung Pria Light Slippers Sendal Outdoor","\n•Kualitas: SUPER PREMIUM•\n•Grade original•\n•1:1 original Quality•\n•Import: Made in Indonesia•\n•Material: Webbing Fabric•","Rp. 500.000",R.drawable.sendal1));
        namaItem.add(new NamaItem(7,"Sandal jepit pria dewasa distro","\n•Kualitas: SUPER PREMIUM•\n•Grade original•\n•1:1 original Quality•\n•Import: Made in Indonesia•\n•Material: Karet•","Rp. 250.000",R.drawable.sendal2));
        namaItem.add(new NamaItem(8,"Sandal Kamar Mandi Tebal Empuk Anti Slip","\n•Kualitas: SUPER PREMIUM•\n•Grade original•\n•1:1 original Quality•\n•Import: Made in Indonesia•\n•Material: Rubber•","Rp. 75.000",R.drawable.sendal3));
        namaItem.add(new NamaItem(9,"Sandal casual New Era MB-E1253","\n•Kualitas: SUPER PREMIUM•\n•Grade original•\n•1:1 original Quality•\n•Import: Made in Indonesia•\n•Material: Ethylene Vinyl Acetate•","Rp. 50.000",R.drawable.sendal4));
        namaItem.add(new NamaItem(10,"Antarestar – Sendal Gunung Struggle","\n•Kualitas: SUPER PREMIUM•\n•Grade original•\n•1:1 original Quality•\n•Import: Made in Indonesia•\n•Material: Polivinil Clorida•","Rp. 100.000",R.drawable.sendal5));
        namaItem.add(new NamaItem(11,"Sepatu High","\n•Kualitas: SUPER PREMIUM•\n•Grade original•\n•1:1 original Quality•\n•Import: Made in Indonesia•\n•Material: Lak•","Rp. 750.000",R.drawable.sepatu1));
        namaItem.add(new NamaItem(12,"Sepatu Nahon","\n•Kualitas: SUPER PREMIUM•\n•Grade original•\n•1:1 original Quality•\n•Import: Made in Indonesia•\n•Material: Canvas•","Rp. 500.000",R.drawable.sepatu2));
        namaItem.add(new NamaItem(13,"Sepatu SkyFor","\n•Kualitas: SUPER PREMIUM•\n•Grade original•\n•1:1 original Quality•\n•Import: Made in Indonesia•\n•Material: Kulit Suede•","Rp. 1.500.000",R.drawable.sepatu3));
        namaItem.add(new NamaItem(14,"Sepatu Onic Esport","\n•Kualitas: SUPER PREMIUM•\n•Grade original•\n•1:1 original Quality•\n•Import: Made in Indonesia•\n•Material: Canvas•","RP. 1.500.000",R.drawable.sepatu4));
        namaItem.add(new NamaItem(15,"Sepatu Jujutsu Kaisen","\n•Kualitas: SUPER PREMIUM•\n•Grade original•\n•1:1 original Quality•\n•Import: Made in Indonesia•\n•Material: Kulit Suede•","RP. 1.500.000",R.drawable.sepatu5));
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public boolean onSupportNavigateUp() {
       onBackPressed();
       return true;
    }
}