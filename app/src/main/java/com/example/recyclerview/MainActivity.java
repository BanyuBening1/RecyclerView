package com.example.recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MakananAdapter.OnItemClickListener {

    RecyclerView rvMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        rvMakanan = (RecyclerView) findViewById(R.id.rvMakanan);
        rvMakanan.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<ModelMakanan> listMakanan = new ArrayList<>();

        listMakanan.add(new ModelMakanan("Nasi Goreng",
                "Enak",
                "Rp12.000",
                R.drawable.nasgor ));
        listMakanan.add(new ModelMakanan("Ayam Bakar",
                "Maknyus",
                "Rp26.000",
                R.drawable.ayambakar));
        listMakanan.add(new ModelMakanan("Es teh",
                "Segar",
                "Rp6.000",
                R.drawable.esteh));
        listMakanan.add(new ModelMakanan("Soto Lamongan",
                "Sedapp",
                "Rp16.000",
                R.drawable.soto));
        listMakanan.add(new ModelMakanan("Es Campur",
                "Maniss & Segar",
                "Rp10.000",
                R.drawable.escampur));
        listMakanan.add(new ModelMakanan("Mie Goreng",
                "Gurih Asin",
                "Rp8.000",
                R.drawable.mie));

        MakananAdapter adapter = new MakananAdapter(listMakanan, this);
        rvMakanan.setAdapter(adapter);


    };

    @Override
    public void onItemClick(ModelMakanan makanan) {
        Intent intent = new Intent(MainActivity.this, Detail_Makanan.class);
        intent.putExtra("nama", makanan.getNamaMakanan());
        intent.putExtra("deskripsi", makanan.getDeskripsiMakanan());
        intent.putExtra("harga", makanan.getHargaMakanan());
        intent.putExtra("image", makanan.getImageMakanan());
        startActivity(intent);
    }
}
