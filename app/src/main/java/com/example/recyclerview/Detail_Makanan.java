package com.example.recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Detail_Makanan extends AppCompatActivity {

    Button btnBack;
    TextView tvDetailNama;
    TextView tvDetailHarga;
    TextView tvDetailDeskripsi;
    ImageView imgDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail_makanan);

        imgDetail = findViewById(R.id.imgDetailMakanan);
        tvDetailNama = findViewById(R.id.tvDetailNama);
        tvDetailHarga = findViewById(R.id.tvDetailHarga);
        tvDetailDeskripsi = findViewById(R.id.tvDetailDeskripsi);
        btnBack=(Button)findViewById(R.id.btnBack);

        String nama = getIntent().getStringExtra("nama");
        String deskripsi = getIntent().getStringExtra("deskripsi");
        String harga = getIntent().getStringExtra("harga");
        int image = getIntent().getIntExtra("image", 0);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(Detail_Makanan.this, MainActivity.class);
                startActivity(back);

            }
        });



        tvDetailNama.setText(nama);
        tvDetailHarga.setText(harga);
        tvDetailDeskripsi.setText(deskripsi);
        imgDetail.setImageResource(image);

        };
    }
